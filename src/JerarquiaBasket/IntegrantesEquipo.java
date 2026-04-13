package JerarquiaBasket;

/**
 * Representa a cualquier integrante que forma parte del equipo de baloncesto.
 * Funciona como la clase base de la jerarquía para evitar duplicidad de código.
 * @author ArturoDAM
 * @version 1.0
 * @since 2024-03-20
 */
public class IntegrantesEquipo {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Constructor para crear un nuevo integrante del equipo.
     * @param id Identificador único del integrante.
     * @param nombre Nombre de pila del integrante.
     * @param apellidos Apellidos del integrante.
     * @param edad Edad actual en años.
     */
    public IntegrantesEquipo(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * Devuelve una representación en cadena de los datos del integrante.
     * @return String con los detalles de: id, nombre, apellidos y edad.
     */
    @Override
    public String toString() {
        return "IntegrantesEquipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    /** @return El identificador del integrante. */
    public int getId() { return id; }

    /** @param id Nuevo identificador a asignar. */
    public void setId(int id) { this.id = id; }

    /** @return El nombre del integrante. */
    public String getNombre() { return nombre; }

    /** @param nombre Nuevo nombre a asignar. */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Los apellidos del integrante. */
    public String getApellidos() { return apellidos; }

    /** @param apellidos Nuevos apellidos a asignar. */
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    /** @return La edad del integrante. */
    public int getEdad() { return edad; }

    /** @param edad Nueva edad a asignar. */
    public void setEdad(int edad) { this.edad = edad; }

    /**
     * Simula la acción de concentración previa a un partido.
     */
    public void concentrarse(){
        System.out.println("Concentracion pre-partido");
    }

    /**
     * Simula el desplazamiento del integrante hacia el lugar del partido.
     */
    public void viajarPartido(){
        System.out.println("De viaje al partido");
    }
}