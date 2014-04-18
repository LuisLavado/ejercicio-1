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
public abstract class Administrativo extends Academico{

    public Administrativo(String nombre, String apellido, String fecha_nac, String dni, String direccion, String telefono, String id_persona) {
        super(nombre, apellido, fecha_nac, dni, direccion, telefono, id_persona);
    }
    
    Contador con;
    Tesorero te;
    Gerente ge;
    Jefe_area ja;

    public Administrativo(Contador con, Tesorero te, Gerente ge, Jefe_area ja, String nombre, String apellido, String fecha_nac, String dni, String direccion, String telefono, String id_persona) {
        super(nombre, apellido, fecha_nac, dni, direccion, telefono, id_persona);
        this.con = con;
        this.te = te;
        this.ge = ge;
        this.ja = ja;
    }
    
    
    

    

    @Override
    public void caminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void correr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void manejar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Se encarga del funcionamiento y mantenimiento de un centro educativo. 
    //Comprende al personal de oficina, intendentes, prefectos, encargados de biblioteca, laboratoristas, 
    //almacenistas, choferes, jardineros y vigilantes.
    
    public abstract void funcionamiento_mantenimiento();
    public abstract void tratar_personal();

    /*@Override
    public void docencia_investigacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void entension_cultural() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
