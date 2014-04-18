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
public class Docente extends Academico {

    public Docente(String nombre, String apellido, String fecha_nac, String dni, String direccion, String telefono, String id_persona) {
        super(nombre, apellido, fecha_nac, dni, direccion, telefono, id_persona);
    }

    @Override
    public void docencia_investigacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entension_cultural() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void caminar() {System.out.println("EStoy caminando (Docente)");
     }

    @Override
    public void correr() {
        System.out.println("Estoy corriendo");}

    @Override
    public void manejar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void dictar_clase() {
        System.out.println("Estoy dictando clase");
    }

}
