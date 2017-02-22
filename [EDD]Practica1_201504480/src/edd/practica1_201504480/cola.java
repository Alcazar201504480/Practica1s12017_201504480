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
public class cola {
     d_cola cabeza, sig;
           d_cola first;
     int tam;
     public cola(){
     cabeza=null;
     sig=null;
     first=null;
     tam=0;
     
     }
     
     public void push(Object info){
         d_cola c= new d_cola(); 
         c.setInfo(info);
         if(cabeza==null){
             tam=0;
            first=c;
            cabeza=c;
            tam++;
            }else {
             cabeza.setSig(c);
            cabeza=c;  
            tam++;
            } 
     }
     public int tam(){
     return tam;
     }
     public Object pop(){
         if (first==null){
         return "vacia";
         }else{
             tam=tam-1;
         if (first == cabeza){
             cabeza= null;
             first = null;
                       d_cola c =first;    
        first= first.getSig();
          return c.getInfo();  
         }else {
         d_cola c =first;    
        first= first.getSig();
          return c.getInfo();
         }
        
         
         }
     }
     public void mostrar (){
     //solo es de prueba
         //nodo 
         d_cola c = first;
         System.out.println(c.getInfo());
         for (int y =0; y<tam-1;y++){
         c= c.getSig();
             System.out.println(c.getInfo());
         }
             
         
     }

}
