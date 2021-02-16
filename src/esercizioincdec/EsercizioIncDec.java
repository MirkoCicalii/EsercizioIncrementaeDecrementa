/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizioincdec;

/**
 *
 * @author informatica
 */
public class EsercizioIncDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Thread thr1= new Thread (new Incrementa(50));
thr1.start();
Thread thr2= new Thread (new Decrementa(50));
thr2.start();

    }

}
