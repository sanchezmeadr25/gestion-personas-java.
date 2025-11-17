package modelo;

public class Persona {
	 private String nombre;
	 private int edad;
	 private String curso;

	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.curso = curso;

	    }

	    public void mostrarDatos() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Curso: " + curso);

	    }
	
}
