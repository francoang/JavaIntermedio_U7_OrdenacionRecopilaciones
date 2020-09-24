/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ordenacionrecopilacion;

import java.util.Comparator;

/**
 *
 * @author fnang
 */
public class EstudiantesOrdenadosNombre implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante t1, Estudiante t2) {
        int resultado = t1.getNombre().compareTo(t2.getNombre());
        
        if(resultado != 0) return resultado;
        else return 0;
    }
    
}
