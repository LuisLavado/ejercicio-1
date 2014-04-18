/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author Luis Lavado
 */
public class Contador extends Administrativo {

    public Contador(String nombre, String apellido, String fecha_nac, String dni, String direccion, String telefono, String id_persona) {
        super(nombre, apellido, fecha_nac, dni, direccion, telefono, id_persona);
    }

    @Override
    public void manejar() {
        System.out.println("Estoy corriendo (Contador)");
    }

    @Override
    public void correr() {
        super.correr(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void caminar() {
        super.caminar(); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    @Override
    public void funcionamiento_mantenimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tratar_personal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void docencia_investigacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entension_cultural() {
        System.out.println("Estoy en la cultura (Contador)");
    }

    public void contar_dinero() {
        System.out.println("el dinero esta completo");
    }

}
