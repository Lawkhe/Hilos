/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

public class Generador extends Thread{
    public int N_procesos=1000;
    public int X[]=new int [N_procesos];

    public Generador (int N_procesos) {
        this.N_procesos = N_procesos;
    }
    
    public void run(){
        for (int i= 0; i<N_procesos; i++) {
            X[i] = (int)Math.floor(Math. random()*(100));
            System.out.println("El numero aleatorio fue:" + X[i]);

            try {
                Thread.sleep(900);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
