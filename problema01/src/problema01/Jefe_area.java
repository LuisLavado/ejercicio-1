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
public class Jefe_area extends Administrativo{

    public Jefe_area(String nombre, String apellido, String fecha_nac, String dni, String direccion, String telefono, String id_persona) {
        super(nombre, apellido, fecha_nac, dni, direccion, telefono, id_persona);
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
        System.out.println("Estoy en la cultura (Jefe de area)");
    }
    public void seprvision(){System.out.println("Estoy supervisando que todos cumplan  con su labor");}

   
    
}
