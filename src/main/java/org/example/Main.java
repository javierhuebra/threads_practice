package org.example;


import com.google.zxing.WriterException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();// Si instancio un nuevo objeto ya corre en otro hilo
        Proceso2 proc2 = new Proceso2();
        Thread hilo2 = new Thread(proc2);

        // hilo1.start();
        // hilo2.start();
        // hilo3.start(); //Estos tres hilos corren en paralelo

        // ------------------- Ejemplo de uso de prueba con parametros multithread -------------------

        Proceso hilo4 = new Proceso("Hilo 1");
        Proceso hilo5 = new Proceso("Hilo 2");

        hilo4.setNumEntero(5);
        hilo5.setNumEntero(10);

        hilo4.start();
        hilo5.start();

        // -------------- Aca voy a generar una imagen con un codigo qr --------------

        try {
            QRCodeGenerator.generateQRCodeImage("https://www.example.com", 350, 350, "QRCode.png");
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }


    }
}