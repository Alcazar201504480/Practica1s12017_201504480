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
public class nodo_o {
    nodo_o sig,ant,arriba,abajo;
    Object info;

    public nodo_o() {
         this.info =null;
        this.sig = null;
        this.ant = null;
        this.arriba= null;
        this.abajo = null;
    }
    
    public void setInfo(Object info) {
        this.info = info;
    }
   

    public nodo_o getSig() {
        return sig;
    }

    public void setSig(nodo_o sig) {
        this.sig = sig;
    }

    public nodo_o getAnt() {
        return ant;
    }

    public void setAnt(nodo_o ant) {
        this.ant = ant;
    }

    public nodo_o getArriba() {
        return arriba;
    }

    public void setArriba(nodo_o arriba) {
        this.arriba = arriba;
    }

    public nodo_o getAbajo() {
        return abajo;
    }

    public void setAbajo(nodo_o abajo) {
        this.abajo = abajo;
    }

    public Object getInfo() {
        return info;
    }

    
}
