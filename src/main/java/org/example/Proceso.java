package org.example;

public class Proceso extends Thread{
    private int num_entero;

    public Proceso(String nombreHilo){ //Este constructor es necesario para poder pasar el nombre del hilo
        super(nombreHilo);
    }

    @Override
    public void run(){
        for(int i = 0; i < num_entero; i++){
            System.out.println("Proceso en ejecución: " + i + " " + this.getName());
        }
        System.out.println();
    }

    public void setNumEntero(int num_entero){
        this.num_entero = num_entero;
    }
}
