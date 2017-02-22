/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201504480;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public class matriz_ortogonal {
        nodo_o sig,ant,arriba,abajo,cabeza,nodostart;
        Lista_Simple listtemp = new Lista_Simple();
   int tam;
     public matriz_ortogonal(){
     cabeza=null;
     sig=null;
     ant=null;
     arriba=null;
     abajo=null;
     nodostart=null;
     tam=0;
     
     }
        
     public void crear(int valor){
    
//         for (int i=0;i<valor;i++)
//         {     
//           //doble();
//         }
         // nodostart=(nodo_o) listtemp.itemnodo(0);
//            //listtemp.cambiar(0,0);

         tam=valor;
         
          for(int xx = 0; xx<(valor-1);xx++){
              cabeza=null;
              for (int yy =0;yy<(valor-1);yy++){
              if (xx==0){   
                    nodo_o c= new nodo_o();
                    if (cabeza ==null){
                    c.setSig(cabeza);
                    cabeza=c;
                        nodostart= c;
                    }else {
                    c.setSig(cabeza);
                    cabeza.setAnt(c);
                    cabeza=c;  
                   }
                    listtemp.enlistar(c);
      
              }else{
                    nodo_o c= new nodo_o();
                    if (cabeza ==null){
                    c.setSig(cabeza);
                    c.setArriba((nodo_o) listtemp.itemnodo(yy));
                    ((nodo_o) listtemp.itemnodo(yy)).setAbajo(c);
                    listtemp.cambiar(yy, c);
                    cabeza=c;
            
                    }else {
                     
                    c.setArriba((nodo_o) listtemp.itemnodo(yy));
                    ((nodo_o) listtemp.itemnodo(yy)).setAbajo(c);
                    listtemp.cambiar(yy, c);
                    c.setSig(cabeza);
                    cabeza.setAnt(c);
                    
                    cabeza=c;  
                   }
                  }
              }
          
          }
//          
//        nodo_o f = (nodo_o) listtemp.itemnodo(0);
//        System.out.println(f.getInfo());
//        
//         ((nodo_o) listtemp.itemnodo(3)).setInfo("que");
//         
//         nodo_s  dd= listtemp.getcabeza();
//        nodo_o f =(nodo_o) dd.getInfo();
//        
//        System.out.println(f.getInfo());
        nodo_o inif= nodostart;
          nodo_o inic= nodostart;
        nodo_o temp5 = cabeza;
          for (int y=0; y<tam-1;y++){
       
   
        
         for (int y1=0; y1<tam-1;y1++){
           inif.setInfo((y+1)+"."+(y1+1));
           inif =inif.getAnt();
           System.out.print((y+1)+"."+(y1+1)+" ");
         }
          System.out.println();
            inic = inic.getAbajo();
            inif=inic;
     }
   
          //
                    System.out.println();
                              System.out.println();
                                        System.out.println();
           
          //
         // mostrar();
     }
       public void darvalor(int x1, int x2,int valor){
        nodo_o inif= nodostart;
          nodo_o inic= nodostart;
          
          for (int y=0; y<tam-1;y++){

         for (int y1=0; y1<tam-1;y1++){
             if(y==x1-1 && y1==x2-1){
                inif.setInfo(valor);  
              
             }
          
           inif =inif.getAnt();

         }

            inic = inic.getAbajo();
            inif=inic;
     }
         // mostrar();
       }

    public void mostrar() {
    nodo_o  inif= nodostart;
    nodo_o      inic= nodostart;
    nodo_o    temp5 = cabeza;
    
         for (int y=0; y<tam-1;y++){
       
   
        
         for (int y1=0; y1<tam-1;y1++){


            System.out.print(inif.getInfo()+" ");
           inif =inif.getAnt();
         }
          System.out.println();
            inic = inic.getAbajo();
            inif=inic;
     }
    }

    }
    
    

