/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

public class Multiplicador extends Thread{
    public int N_procesos_=0;
    public int X_[]=new int[N_procesos_];

    public Multiplicador (int[] X_, int N_procesos_) {
        this.X_=X_;
        this.N_procesos_ = N_procesos_;
    }    
    
    public void run(){
        for(int i=0; i<N_procesos_; i++) {
            System.out.println("y multiplicado es: " + (X_[i]*2));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}