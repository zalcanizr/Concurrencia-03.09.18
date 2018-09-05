package com.cice.hilos;

public class HiloPropio extends Thread  {


    //extnder de Thread
    //sobrscribir el metodo run

    @Override
    public void run() {

        for (int i = 0; i < 10000; i++){
            System.out.println("Vuelta del hilo propio: " + i);
        }
    }
}
