package JerarquiaBasket;

/**
 * Representa al entrenador del equipo, encargado de la gestión táctica.
 * @author ArturoDAM
 * @version 1.0
 */
public class Entrenador extends IntegrantesEquipo{
    private int idFederacion;

    /**
     * Constructor para el entrenador.
     * @param id Identificador.
     * @param nombre Nombre del entrenador.
     * @param apellidos Apellidos del entrenador.
     * @param edad Edad.
     * @param idFederacion Código de licencia de la federación de baloncesto.
     */
    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    /**
     * @return String que incluye los datos de base y el ID de federación.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Entrenador{" +
                "idFederacion=" + idFederacion +
                '}';
    }

    /** @return ID de la federación. */
    public int getIdFederacion() { return idFederacion; }

    /** @param idFederacion Nuevo ID de federación. */
    public void setIdFederacion(int idFederacion) { this.idFederacion = idFederacion; }

    /**
     * Realiza la gestión táctica durante un partido.
     */
    public void dirigirPartido(){
        System.out.println("El entrenador dirige el partido");
    }

    /**
     * Organiza y supervisa una sesión de entrenamiento.
     */
    public void dirigirEntreno(){
        System.out.println("El entrenador dirige el entrenamiento");
    }
}