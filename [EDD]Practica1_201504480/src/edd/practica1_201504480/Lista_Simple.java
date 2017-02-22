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

    Object itemnodo(int i) {
        try{
         nodo_s temp2= cabeza;
       int  c=0;
 System.out.println("c:"+i+"tam"+tam);
     while((c<(tam -i-1))){
     System.out.println("c:"+c+"tam:"+tam+"i:"+i);
         c++;
       temp2 = temp2.getSig();
     }
   return  temp2.getInfo();
   
        }catch (Exception e){
            System.out.println("error_tamaño"+e.getCause());
          return null;
        }
  
  
    }

//    void enlistarnodos(nodo_o c) {
//        nodo_s cc= new nodo_s(); 
//         cc.setInfo(nodo_o c);
//         if(cabeza==null){
//             tam=0;
//            cc.setSig(cabeza);
//            cabeza=cc;
//            tam++;
//            }else {
//            cc.setSig(cabeza);
//            cabeza=cc;  
//            tam++;
//            }
//    }


    void cambiar(int i, Object nval){
     try{


        nodo_s temp2= cabeza;
       int  c=0;
 // System.out.println("c:"+i);
     while((c<(tam-i-1))){
   //        System.out.println("c:"+c+"tam:"+tam+"i:"+i);
         c++;
       temp2 = temp2.getSig();
     }
     temp2.info=nval;
      
   
    }catch (Exception e){
      
     System.out.println("error_de_rango");
    }
    }


    
    
    
    
    
}

