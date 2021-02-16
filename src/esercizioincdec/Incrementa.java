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
public class Incrementa implements Runnable {
private Integer c;
public Incrementa(int c){

}

@Override
public void run(){
   while(1==1){
    if (c<100){
    c++;}
    System.out.println(c);
}
}
}
