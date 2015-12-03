package com.jarsoft.user.tapearte.Comunicacion;

import com.jarsoft.user.tapearte.Dominio.Cliente.Bar;
import com.jarsoft.user.tapearte.Dominio.Cliente.Tapa;
import com.jarsoft.user.tapearte.Dominio.Cliente.Usuario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

public class SocketMovil {
    //	private static Socket cliente;
    private static Socket cliente;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    private static Bar bar1,bar2,bar3;
    private static Tapa tapa1= new Tapa("tortilla", 0001,001,"Esta rica",0, 1234);
    private static Tapa tapa2 = new Tapa("hamburguesa", 0002,001,"Esta rica",0, 32984239);
    private static Tapa  tapa3  = new Tapa("pizza", 0003,001,"Esta rica",0, 84348493);
    private static Tapa  tapa4 = new Tapa("gachas", 0004,001,"Esta rica",0, 1290219090);

    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>(Arrays.<Usuario>asList(
            new Usuario("Jhuanaldo","123456","jagg@hotmail.com"),
            new Usuario("a","a","oyoyoyoy"),
            new Usuario("5666","1sssa23456","gsagsg@hotmail.com")
    ));



//    public static boolean realizarPeticion(Object componentes, int diferenciador) {
//
//        //Esta movida es para evitar politicas que no nos permiten conectar
//        int SDK_INT = android.os.Build.VERSION.SDK_INT;
//        if (SDK_INT > 8) {
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//                    .permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//            //your codes here
//
//            //No funciona aun, asi que return true
////            startSocket();
//
////            ObjectOutputStream msg;
////            boolean resultado = true;
////
////            try {
////
////                //Peticion
////                msg = new ObjectOutputStream(cliente.getOutputStream());
////                msg.writeObject(diferenciador);
////                System.out.println("Peticion realizada");
////
////                //Recepcion
////                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
////                System.out.println("entrando...");
////                int comprobante = (int) entrada.readObject();
////
////                //Fin
////                System.out.println("Recibido por el servidor: >>" + resultado + "<<");
////
////            } catch (IOException e) {
////                // TODO Auto-generated catch block
////                e.printStackTrace();
////            } catch (ClassNotFoundException e) {
////                // TODO Auto-generated catch block
////                e.printStackTrace();
////            }
//            return true;
//
//        }
//
//        return false;
//
//    }

    private static void startSocket() {
        try {
            //Este es porque para los emuladores se usa este host
            cliente = new Socket("10.0.2.2", 4500);
            System.out.println("bueno esta");
        } catch (Exception e) {
            System.err.println("Client Error: " + e.getMessage());
            System.err.println("Localized: " + e.getLocalizedMessage());
            System.err.println("Stack Trace: " + e.getStackTrace());
        }
    }

    public void close() {
        try {
            cliente.close();
            System.out.println("Conexion cerrada");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Object realizarPeticion(Object components, int controller){

        switch(controller){
            case 0: //login
                Usuario user1 = (Usuario)components;
                //llamar al servidor para que compruebe que existe
                for(int i =0; i<usuarios.size();i++){
                    if(user1.getUsuario().equals(usuarios.get(i).getUsuario()) &&
                            user1.getPassword().equals(usuarios.get(i).getPassword()))
                        return true;

                }

                return false;

            case 4: //consultar tapas
                Bar bar = (Bar)components;
                return bar.getTapas();

            case 5: //registrarse
                Usuario user2 = (Usuario)components;
                //llamar al servidor para que lo registre en la base de datos
                return usuarios.add(user2);
            case 7: //consultar tapa por codigo
                int codigo = (int)components;
                Tapa[] tapas = {tapa1,tapa2,tapa3,tapa4};
                for(int i=0;i<tapas.length;i++) {
                    System.out.println("codigo mio " + codigo + " codigo registrado " + tapas[i].getCodigo());
                    if (codigo == tapas[i].getCodigo())
                        return tapas[i];
                }
                return null;
                //SELECT item FROM Tapas WHERE codigo==components
        }
        return null;
    }

    public static Object realizarPeticion(int controller) {

        bar1= new Bar("Primer bar",000,1,2,new ArrayList<Tapa>(Arrays.asList(tapa1, tapa3)),"Esta bien enverda");
        bar2= new Bar("Segundo bar",001,1,2,new ArrayList<Tapa>(Arrays.asList(tapa2, tapa1, tapa3)),"Esta bien enverda");
        bar3= new Bar("Ultimo bar",002,1,2,new ArrayList<Tapa>(Arrays.asList(tapa1, tapa4,tapa2,tapa1, tapa3,tapa2, tapa1, tapa3,
                tapa2,tapa1, tapa3,tapa2, tapa1, tapa3,tapa2,tapa1, tapa3,tapa2,
                tapa1, tapa3,tapa2, tapa1, tapa3)),"Esta bien enverda");

        switch (controller){
            case 4:
                return new Bar[]{bar1,bar2,bar3} ;
            default:
                return null;
        }
    }

    public static Object realizarPeticion(Tapa t, float puntuacion, int staticPuntuarTapa) {

        Tapa[] tapas = {tapa1,tapa2,tapa3,tapa4};
        for(int i=0;i<tapas.length;i++)
            if(t.getCodigo()==tapas[i].getCodigo()){
                float overall = tapas[i].getOverall();
                tapas[i].setOverall((overall+puntuacion)/2);
                return true;
            }

        return false;
    }
}