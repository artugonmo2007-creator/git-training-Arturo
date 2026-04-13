package JerarquiaBasket;

/**
 * Representa a un jugador de baloncesto dentro del equipo.
 * @author ArturoDAM
 * @version 1.0
 * @since 2024-03-20
 */
public class Jugador extends IntegrantesEquipo{
    private int dorsalJug;
    private String demarcacionJug;

    /**
     * Constructor para instanciar un jugador con sus datos personales y deportivos.
     * @param id Identificador único.
     * @param nombre Nombre del jugador.
     * @param apellidos Apellidos del jugador.
     * @param edad Edad del jugador.
     * @param dorsalJug Número de camiseta del jugador.
     * @param demarcacionJug Posición en la que juega (ej. Alero, Base).
     */
    public Jugador(int id, String nombre, String apellidos, int edad, int dorsalJug, String demarcacionJug) {
        super(id, nombre, apellidos, edad);
        this.dorsalJug = dorsalJug;
        this.demarcacionJug = demarcacionJug;
    }

    /**
     * Concatena la  información básica del integrante con los datos específicos del jugador.
     * @return String con la información completa del jugador.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Jugador{" +
                "dorsalJug=" + dorsalJug +
                ", demarcacionJug='" + demarcacionJug + '\'' +
                '}';
    }

    /** @return El número de dorsal. */
    public int getDorsalJug() { return dorsalJug; }

    /** @param dorsalJug Nuevo número de dorsal. */
    public void setDorsalJug(int dorsalJug) { this.dorsalJug = dorsalJug; }

    /** @return La posición o demarcación en el campo. */
    public String getDemarcacionJug() { return demarcacionJug; }

    /** @param demarcacionJug Nueva demarcación. */
    public void setDemarcacionJug(String demarcacionJug) { this.demarcacionJug = demarcacionJug; }

    /**
     * Simula la acción de disputar un partido oficial.
     */
    public void jugarPartido(){
        System.out.println("Jugamos el partido");
    }

    /**
     * Simula la actividad física de entrenamiento.
     */
    public void realizarEntreno(){
        System.out.println("Vamos a entrenar");
    }
}