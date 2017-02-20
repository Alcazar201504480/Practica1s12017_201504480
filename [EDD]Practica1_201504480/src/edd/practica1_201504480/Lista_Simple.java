/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201504480;

/**
 *
 * @author HP
 */
public class Lista_Simple {
 nodo_s cabeza, sig;
     int tam;
     public Lista_Simple(){
     cabeza=null;
     sig=null;
     tam=0;
     
     }
     
     public void enlistar(Object info){
         nodo_s c= new nodo_s(); 
         c.setInfo(info);
         if(cabeza==null){
             tam=0;
            c.setSig(cabeza);
            cabeza=c;
            tam++;
            }else {
            c.setSig(cabeza);
            cabeza=c;  
            tam++;
            }
             
          
     }
     public int tamaño(int tam){
     return tam;
     }
     public nodo_s getcabeza(){
     return cabeza;
     }
     public void mostrar(){
     nodo_s temp= cabeza;
     while(!(temp==null)){
     
     System.out.println(temp.getInfo()+" ");
     temp = temp.getSig();
     }
}
    
    
    
    
    
    
    
}

