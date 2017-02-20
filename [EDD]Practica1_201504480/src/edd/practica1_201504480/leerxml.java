/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.practica1_201504480;

import java.awt.HeadlessException;
import org.jdom2.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
       // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |



//import org.jdom.Document;         // |
//import org.jdom.Element;          // |\ Librerías
//import org.jdom.JDOMException;    // |/ JDOM
//import org.jdom.input.SAXBuilder; 
/**
 *
 * @author HP
 */

class leerxml {
    int tam=0;
     Lista_Simple d1 = new Lista_Simple();
     Lista_Simple d2 = new Lista_Simple();
      Lista_Simple d = new Lista_Simple();
//document documentJDOM = builder.build(new FileInputStream("/ruta_a_fichero/fichero.xml")); 
    Lista_Simple datos(File tipo1) {
       
        SAXBuilder builder = new SAXBuilder();
        try {
           
        
        

 
        //Se obtiene la lista de hijos de la raiz 'tables'
        Document document =  builder.build(tipo1);
        Element rootNode = document.getRootElement(); 
         //  JOptionPane.showMessageDialog(null," e1: "+(rootNode.getChildText("dimension"))); 
           tam= Integer.parseInt(rootNode.getChildText("dimension"));
        Element dobles = rootNode.getChild("dobles");
         
           List list = dobles.getChildren("casilla");
        for ( int i = 0; i < list.size(); i++ )
        {
              Element tabla = (Element) list.get(i);
               d1.enlistar(tabla.getChildTextTrim("x"));
                d1.enlistar(tabla.getChildTextTrim("y"));
//              JOptionPane.showMessageDialog(null,""+tabla.getChildTextTrim("x").toString());
//                JOptionPane.showMessageDialog(null,""+tabla.getChildTextTrim("y").toString());
        }
        
        
         Element triples = rootNode.getChild("triples");
         
           List listt = triples.getChildren("casilla");
        for ( int i = 0; i < listt.size(); i++ )
        {
              Element tabla = (Element) listt.get(i);
                d2.enlistar(tabla.getChildTextTrim("x"));
                d2.enlistar(tabla.getChildTextTrim("y"));
//              JOptionPane.showMessageDialog(null,""+tabla.getChildTextTrim("x").toString());
//                JOptionPane.showMessageDialog(null,""+tabla.getChildTextTrim("y").toString());
        }
         Element dicc = rootNode.getChild("diccionario");
        List dic = dicc.getChildren();

           for ( int i = 0; i < dic.size(); i++ )
        {
              Element tabla = (Element) dic.get(i);
              //JOptionPane.showMessageDialog(null,""+tabla.getText().toString());
              d.enlistar(tabla.getText().toString());
        
        
           
        } 
           
        }catch (JDOMException | IOException | NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(null," error de archivo");
        }
        return d;
         
}
     Lista_Simple datosdic() {
   
        return d;
    }

    Lista_Simple datosdobles() {
   
        return d1;
    }

    Lista_Simple datostriples() {
    return d2;
    }

    int datostdimension() {
   return tam;
    }
    }
   

