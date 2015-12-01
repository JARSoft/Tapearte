package com.jarsoft.user.tapearte.Comunicacion;

import android.os.StrictMode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class SocketMovil {
    //	private static Socket cliente;
    private static Socket cliente;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    public static boolean realizarPeticion(Object componentes, int diferenciador) {

        //Esta movida es para evitar politicas que no nos permiten conectar
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //your codes here

            //No funciona aun, asi que return true
//            startSocket();

//            ObjectOutputStream msg;
//            boolean resultado = true;
//
//            try {
//
//                //Peticion
//                msg = new ObjectOutputStream(cliente.getOutputStream());
//                msg.writeObject(diferenciador);
//                System.out.println("Peticion realizada");
//
//                //Recepcion
//                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
//                System.out.println("entrando...");
//                int comprobante = (int) entrada.readObject();
//
//                //Fin
//                System.out.println("Recibido por el servidor: >>" + resultado + "<<");
//
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
            return true;

        }

        return false;

    }

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
}