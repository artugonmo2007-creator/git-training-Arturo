package JerarquiaBasket;

/**
 * Representa al masajista o fisioterapeuta del equipo.
 * * @author ArturoDAM
 * @version 1.0
 */
public class Masajista extends IntegrantesEquipo{
    private String titulacion;
    private int aniosExp;

    /**
     * Constructor para el masajista.
     * @param id Identificador.
     * @param nombre Nombre.
     * @param apellidos Apellidos.
     * @param edad Edad.
     * @param titulacion Título académico o profesional obtenido.
     * @param aniosExp Años de experiencia en el sector.
     */
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExp) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExp = aniosExp;
    }

    /**
     * @return String con los detalles académicos y de experiencia del masajista.
     */
    @Override
    public String toString() {
        return super.toString() +
                "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", aniosExp=" + aniosExp +
                '}';
    }

    /** @return La titulación del profesional. */
    public String getTitulacion() {
        return titulacion;
    }

    /** @param titulacion Nueva titulación. */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /** @return Años de experiencia acumulados. */
    public int getAniosExp() {
        return aniosExp;
    }

    /** @param aniosExp Nuevos años de experiencia. */
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    /**
     * Realiza un tratamiento físico a un integrante del equipo.
     */
    public void darMasaje(){
        System.out.println("El masajista masajea");
    }
}
