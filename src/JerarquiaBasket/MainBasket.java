package JerarquiaBasket;

/**
 * Clase principal que contiene el punto de entrada del programa.
 * Gestiona una lista de integrantes y ejecuta acciones polimórficas.
 * @author ArturoDAM
 * @version 1.1
 */
public class MainBasket {
    /**
     * Método principal que arranca la aplicación.
     * Crea un array de {@link IntegrantesEquipo} y utiliza <i>downcasting</i>
     * para ejecutar métodos específicos según el tipo de objeto.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Inicialización del array con polimorfismo
        IntegrantesEquipo[] integrantes = new IntegrantesEquipo[4];
        IntegrantesEquipo jugador = new Jugador(1, "Juan", "Dominguez Perez", 23, 12, "Alero");
        IntegrantesEquipo jugador1 = new Jugador(2, "Stephen", "Curry", 26, 32, "Base");
        IntegrantesEquipo entrenador = new Entrenador(1, "Pedro", "Aguado Padilla", 45, 1);
        IntegrantesEquipo masajista = new Masajista(1, "Raul", "Albiol Garcia", 31, "1231312", 5);

        integrantes[0]=jugador;
        integrantes[1]=entrenador;
        integrantes[2]=masajista;
        integrantes[3]=jugador1;

        // Recorrido de la lista y ejecución de métodos
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println(integrantes[i].toString());
            integrantes[i].concentrarse();
            integrantes[i].viajarPartido();

            // Verificación de tipo para acciones específicas
            if (integrantes[i] instanceof Jugador) {
                ((Jugador) integrantes[i]).jugarPartido();
                ((Jugador) integrantes[i]).realizarEntreno();
            } else if (integrantes[i] instanceof Entrenador) {
                ((Entrenador) integrantes[i]).dirigirEntreno();
                ((Entrenador) integrantes[i]).dirigirPartido();
            } else {
                ((Masajista) integrantes[i]).darMasaje();
            }
        }
    }
}