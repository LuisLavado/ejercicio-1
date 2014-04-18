/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1_problema02;

/**
 *
 * @author Luis Lavado
 */
public class LP1_problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cl= new Cliente();
        cl.setNombre("Luis");
        cl.setApellido("Lavado    ");
           
        ClsCliente c = new ClsCliente(cl);
        c.viajar_establecimiento();
        c.realizar_compra();
        c.pagar();
        c.recibir_vuelto();
    }
    
}
