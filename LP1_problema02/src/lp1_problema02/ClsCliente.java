/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1_problema02;

import java.util.Scanner;

/**
 *
 * @author Luis Lavado
 */
public class ClsCliente {
    
    Cliente cl;

    public ClsCliente(Cliente cl) {
        this.cl = cl;
    }
    
    
    public void viajar_establecimiento(){
    
        System.out.println(cl.getNombre()+"\t"+cl.getApellido()+"******Estoy viajando al establecimiento********");
    }
    
    void realizar_compra(){
        System.out.println(cl.getNombre()+"\t"+cl.getApellido()+"*********Estoy comprando !");
    }
    void pagar(){ 
        System.out.println(cl.getNombre()+"\t"+cl.getApellido()+"**********Estoy pagando la compra");
    }
    public String recibir_vuelto(){
    return cl.getNombre()+"\t"+cl.getApellido()+"***********Estoy recibiendo mi vuelto";
    }
    
}
