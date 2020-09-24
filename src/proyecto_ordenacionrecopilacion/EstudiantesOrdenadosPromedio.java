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
public class EstudiantesOrdenadosPromedio implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante t1, Estudiante t2) {
        if(t1.getPromedioNotas() < t2.getPromedioNotas()) return 1;
        else if(t1.getPromedioNotas() > t2.getPromedioNotas()) return -1;
        else return 0;
    }
    
//    @Override
//    public int compare(Estudiante t1, Estudiante t2) {
//        int result = t1.getPromedioNotas().compareTo(t2.getPromedioNotas());
//        
//        if(result != 0) return result;
//        else return 0;
//        
//    }
    
}
