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
public class d_cola {
     d_cola sig;

    Object info;

       public void setInfo(Object info){
    this.info=info;
    this.sig=null;

    }
 public void setSig(d_cola  sig){
    this.sig=sig;
    }
    
    public d_cola  getSig() {
        return sig;
    }

    public Object getInfo() {
        return info;
    }
}
