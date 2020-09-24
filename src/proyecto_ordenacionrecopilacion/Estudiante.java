package proyecto_ordenacionrecopilacion;

/**
 * Utilizo la interfaz Comparable para ordenar por legajo
 * @author fnang
 */
public class Estudiante implements Comparable<Estudiante>{
    private Integer legajo;
    private String nombre;
    private Float promedioNotas;

    public Estudiante(int legajo, String nombre, float promedioNotas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.promedioNotas = promedioNotas;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(float promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + 
                ",\tNombre: " + nombre + 
                ",\tPromedio de notas: " + promedioNotas;
    }

    @Override
    public int compareTo(Estudiante t) {
        int resultado = this.nombre.compareTo(t.getNombre());
        
        if(resultado <  0) return 1;
        else if (resultado > 0) return -1;
        else return 0;
    }
  
}
