public interface ITranportable {
    /**
     * Método abstracto 'costeTotal' para que calcule, según el código postal enviado, el precio del envío
     *
     * @param cp (código postal)
     * @return costeTotal (precio por el envío)
     */
    Float costeTotal(Integer cp);

    /**
     * Metodo que recibe as dimensiones un paquete e o seu peso
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
    Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso);

    /**
     * Variable @param codigoPostal usada para asignar un precio en base al codigo postal
     */
    int codigoPostal = 15000;
}
