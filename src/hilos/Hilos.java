/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Scanner;

public class Hilos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Procesos?");
        int Nprocesos = sc.nextInt();
        Generador g = new Generador(Nprocesos);
        Thread t1 = new Thread(g);
        try {
            t1.start();
            Thread t2 = new Thread(new Multiplicador(g.X, Nprocesos));
            t2.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

