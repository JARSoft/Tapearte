//package com.jarsoft.user.tapearte.Comunicacion;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.io.OptionalDataException;
//import java.io.StreamCorruptedException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * Created by user on 01/12/2015.
// */
//public class SocketServidor {
//    private static ServerSocket servidor;
//    private static Socket clienteNuevo;
//
//    void conectarServdiro() {
//        try {
//            while (true) {
//                servidor = new ServerSocket(4500);
//                System.out.println(clienteNuevo = servidor.accept());
//                System.out.println("\nSocket establecido...");
//
//                //Recibir
//                ObjectInputStream entrada = new ObjectInputStream(clienteNuevo.getInputStream());
//                int msg_server = (int) entrada.readObject();
//
//                switch (msg_server) {
//                    case 0://login
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
//
////                        ObjectOutputStream respKey0 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.login(null);
////                        respKey0.writeObject(1);
//
//                        break;
//
//                    case 1://registrar
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey1 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.registrar(null);
////                        respKey1.writeObject(1);
//
//                        break;
//
//                    case 2://mostrar cintacto
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey2 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.mostrarContactos();
////                        respKey2.writeObject(1);
//
//                        break;
//
//                    case 3://buscar contacto
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey3 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.buscarContacto(null);
////                        respKey3.writeObject(1);
//
//                        break;
//
//                    case 4://modificar nombre
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey4 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.modificarNombre(null);
////                        respKey4.writeObject(1);
//
//                        break;
//                    case 5://modificar telefono
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey5 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.modifcarTelefono(null);
////                        respKey5.writeObject(1);
//
//                        break;
//                    case 6://modificar email
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey6 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.modificarEmail(null);
////                        respKey6.writeObject(1);
//
//                        break;
//                    case 7://eliminar contacto
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey7 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.eliminarContacto(null);
////                        respKey7.writeObject(1);
//
//                        break;
//                    case 8://anadir contacto
//                        //deberia recibir el objeto del cliente, pero esta en null porque es un prototipo
////                        ObjectOutputStream respKey8 = new ObjectOutputStream(clienteNuevo.getOutputStream());
////                        Gestor_agenda_servidor.anadirContacto(null);
////                        respKey8.writeObject(1);
//
//                        break;
//
//                    default:
//                        System.out.println("Not any registered parameter: " + msg_server);
//                        break;
//                }
//
//                clienteNuevo.close();
//                servidor.close();
//                System.out.println("Fin de la operacion");
//            }
//
//        } catch (IOException e) {
//            System.err.println("Server Error: " + e.getMessage());
//            System.err.println("Localized: " + e.getLocalizedMessage());
//            System.err.println("Stack Trace: " + e.getStackTrace());
//            System.err.println("To String: " + e.toString());
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    public void close(){
//        try {
//            clienteNuevo.close();
//            servidor.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//}