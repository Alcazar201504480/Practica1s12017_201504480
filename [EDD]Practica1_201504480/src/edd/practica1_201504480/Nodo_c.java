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
public class Nodo_c {
        nodo_s sig;
    Object info;
    Object fichas;

       public void setInfo(Object info){
    this.info=info;
    this.fichas=null;
    this.sig=null;
    }
        public void setfichas(Object fichas){
        this.fichas=fichas;
        }
        
//   public void setfichas(Object fichas){
//        this.fichas=fichas;
//        }
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
