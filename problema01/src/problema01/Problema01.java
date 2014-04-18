/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.ArrayList;

/**
 *
 * @author Luis Lavado
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Academico> personass = new ArrayList();
    public static ArrayList<Administrativo> pers = new ArrayList();

    public static void main(String[] args) {

        Academico ac = new Docente("Joel", "Jhopes", "aaa", "bbb", "ccc", "ddd", "eeee");
        Academico co= new Coordinador("Saul", "Peres", null, null, null, null, null);
        Academico da = new Director_academico("Paul", "Paredes", null, null, null, null, null);

        Administrativo ja = new Jefe_area("Jorge", "Polo", null, null, null, null, null);
        Administrativo ge = new Gerente("Efrain", "Montero", null, null, null, null, null);
        Administrativo con = new Contador("Jorge ", "Manya", null, null, null, null, null);
        Administrativo te = new Tesorero("Wilder", "Vazques", null, null, null, null, null);

        personass.add(ac);
        personass.add(da);
        personass.add(co);

        pers.add(ja);
        pers.add(ge);
        pers.add(con);
        pers.add(te);

        for (Academico obj : personass) {
            System.out.print("\n \n"+obj.getNombre() + " " + obj.getApellido() + " -> ");
           obj.caminar();

        }
        for (Academico obj : personass) {
            System.out.print("\n \n"+obj.getNombre() + " " + obj.getApellido() + " -> ");
            obj.caminar();
            

        }
        for (Academico obj : personass) {
            System.out.print("\n \n"+obj.getNombre() + " " + obj.getApellido() + " -> ");
            obj.correr();

        }
        
        for (Administrativo ob : pers) {
        System.out.print("\n \n"+ob.getNombre() + " " + ob.getApellido() + " -> " );
        ob.entension_cultural();
        
        }
        for (Administrativo ob : pers) {
        System.out.print("\n \n"+ob.getNombre() + " " + ob.getApellido() + " -> ");
        ob.entension_cultural();
        
        }
        for (Administrativo ob : pers) {
        System.out.print("\n \n"+ob.getNombre() + " " + ob.getApellido() + " -> ");
        ob.entension_cultural();
        
        }
        for (Administrativo ob : pers) {
        System.out.print("\n \n"+ob.getNombre() + " " + ob.getApellido() + " -> ");
        ob.entension_cultural();
        
        }

    }

}
