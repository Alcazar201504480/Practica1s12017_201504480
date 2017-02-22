/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201504480;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Lista_Circular {
    nodo_s cabeza, sig;
    nodo_s primernodo;
     int tam;
     public Lista_Circular (){
     cabeza=null;
     sig=null;
     primernodo=null;
   
     tam=0;
     
     }
     
     public void enlistar(Object info){
         nodo_s c= new nodo_s(); 
         c.setInfo(info);
         if(cabeza==null){
             tam=0;
            
            c.setSig(c);
            
            cabeza=c;
            primernodo=cabeza;
            tam++;
            
            }else {
              JOptionPane.showMessageDialog(null,"entro");
            c.setSig(cabeza);
            cabeza=c;  
            primernodo.setSig(cabeza);
            tam++;
            }
             
          
     }
     
     public int tamaño(){
     return tam;
     }
     public nodo_s getcabeza(){
     return cabeza;
     }
     public void mostrar(){
     nodo_s temp= cabeza;
     int c =0;
     while(!(c==tam)){
     c++;
     System.out.println(temp.getInfo()+" valor t:");
     temp = temp.getSig();
     
     }
}
}
