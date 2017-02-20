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
public class nodo_s {
    nodo_s sig;
    Object info;

       public void setInfo(Object info){
    this.info=info;
    this.sig=null;
    }
 public void setSig(nodo_s sig){
    this.sig=sig;
    }
    
    public nodo_s getSig() {
        return sig;
    }

    public Object getInfo() {
        return info;
    }


  

}
