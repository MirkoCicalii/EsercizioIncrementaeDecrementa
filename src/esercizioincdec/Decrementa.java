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
public class Decrementa implements Runnable{
private Integer c;
public Decrementa (Integer c){
this.c=c;
}

@Override
public void run(){
while(1==1){

    if (c>0){
    c--;
    }
    System.out.println(c);
}
}
}
