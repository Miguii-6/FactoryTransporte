public class Camion implements ITranportable{

    public static final int PALET = 0;

    public static final int ENVOLTORIO_CARTON = 1;

    public static final int CAJA_MADERA = 2;

    /**
     * Metodo que recibe un codigo postal @param cp (codigo postal)
     * Lo compara con otro @param codigoPostal
     * @return Float reference al coste total del envio
     */
    public Float costeTotal(Integer cp) {

        Float precio;

        if (cp < codigoPostal) {

            precio = 40.0F;

        } else {

            precio = 70.0F;

        }

        return precio;
    }

    /**
     * Metodo que recibe as dimensions dun paquete e o seu peso
     *
     * @param dimension está formado pola multiplicacion de 3 parametros:
     * @param dX longitud do paquete
     * @param dY altura do paquete
     * @param dZ ancho do paquete
     *
     * @param peso peso do paquete
     *
     * @return Integer que indicará o tipo de embalaje do paquete
     */
    @Override
    public Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso) {

        Float dimension = (dX * dY * dZ);

        if (dimension < 10000 && peso < 5) {

            System.out.println("El embalaje es: PALET");
            return 0;

        } else if (dimension > 10000 && dimension < 30000 && peso > 15) {

            System.out.println("El embalaje es: ENVOLTORIO DE CARTON");
            return 1;

        } else {

            System.out.println("El embalaje es: CADA DE MADERA");
            return 2;

        }

    }
}
