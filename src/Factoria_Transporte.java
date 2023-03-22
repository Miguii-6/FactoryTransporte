public class Factoria_Transporte {

    public static final int CAMION = 1;

    public static final int BICI = 2;



    /**
     * Método que devolve o tipo de transporte usado
     *
     * @param opcion un int que se usará para escoger o tipo de transporte cun Switch case
     * @return un obxecto de tipo do transporte elegido
     */
    public static ITranportable getProducto(int opcion) {

        switch (opcion) {

            case CAMION:

                return new Camion();

            case BICI:

                return new Bici();




            default:
                return null;

        }

    }
}
