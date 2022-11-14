public class Main {
    public static void main(String[] args) {
        // Cliente
        Cliente cliente = new Cliente();

        cliente.setNombre("Luis");
        cliente.setEdad(23);
        cliente.setTelefono("+573178342355");
        cliente.setCredito(1000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito() + "\n");

        // Trabajador
        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Luis");
        trabajador.setEdad(23);
        trabajador.setTelefono("+573178342355");
        trabajador.setSalario(1000);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}

/**
 * Persona
 */
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

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

/**
 * Cliente
 */
class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

/**
 * Trabajador
 */
class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
