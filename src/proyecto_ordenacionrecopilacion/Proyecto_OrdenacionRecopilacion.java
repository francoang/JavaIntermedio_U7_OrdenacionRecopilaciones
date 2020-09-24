/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ordenacionrecopilacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author fnang
 */
public class Proyecto_OrdenacionRecopilacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Utilizando Comparable - compareTo()        
        Set<Estudiante> listaEstudiantes = new TreeSet<>();
        listaEstudiantes.add(new Estudiante(6598, "Juan Perez",8.9f));
        listaEstudiantes.add(new Estudiante(8569, "Ana Lopez",7.5f));
        listaEstudiantes.add(new Estudiante(2546, "Marcos Dominguez",4.4f));
        
        System.out.println("||===COMPARABLE===||");
        System.out.println("\n===Ordeno por legajo===");
        for(Estudiante est : listaEstudiantes){
            System.out.println(est);
        }
        
        
        //Utilizando Comparator - compare()
        List<Estudiante> otraListaEstudiantes = new ArrayList<>();
        Comparator<Estudiante> ordenarNombre = new EstudiantesOrdenadosNombre();
        Comparator<Estudiante> ordenarPromedio = new EstudiantesOrdenadosPromedio();
        
        otraListaEstudiantes.add(new Estudiante(6598, "Juan Perez",8.9f));
        otraListaEstudiantes.add(new Estudiante(8569, "Ana Lopez",7.5f));
        otraListaEstudiantes.add(new Estudiante(2546, "Marcos Dominguez",4.4f));
        
        System.out.println("\n||===COMPARATOR===||");
        System.out.println("\n===Ordeno por nombre===");
        
        
        Collections.sort(otraListaEstudiantes, ordenarNombre);
        for(Estudiante est : otraListaEstudiantes){
            System.out.println(est);
        }
        
        System.out.println("\n===Ordeno por promedio===");
        Collections.sort(otraListaEstudiantes, ordenarPromedio);
        for(Estudiante est : otraListaEstudiantes){
            System.out.println(est);
        }
    }
    
}
