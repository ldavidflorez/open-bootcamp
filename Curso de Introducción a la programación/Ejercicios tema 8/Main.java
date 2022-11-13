public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(23);
        persona.setNombre("Luis");
        persona.setTelefono("+573178342355");

        System.out.println("Edad de la persona: " + persona.getEdad());
        System.out.println("Nombre de la persona: " + persona.getNombre());
        System.out.println("Telefono de la persona: " + persona.getTelefono());
    }
}

/**
 * Persona
 */
class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    // public Persona(int edad, String nombre, String telefono) {
    // System.out.println("Se inicializa un objeto de clase persona");
    // this.edad = edad;
    // this.nombre = nombre;
    // this.telefono = telefono;
    // }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}