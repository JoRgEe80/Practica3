/**
 * Clase que representa un dardo con coordenadas aleatorias.
 */
package dominio;

public class Dardo {
    /**
     * Coordenada x del dardo.
     */
    double coordenadax;

    /**
     * Coordenada y del dardo.
     */
    double coordenaday;

    /**
     * Constructor que genera un dardo con coordenadas aleatorias.
     */
    public Dardo() {
        coordenadax = Math.random();
        coordenaday = Math.random();
    }
}
