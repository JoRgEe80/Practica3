/**
 * Clase de utilidades matemáticas para generar una aproximación del número pi.
 */
package dominio;

import java.util.stream.Stream;

public class Matematicas {

    /**
     * Genera una aproximación del número pi utilizando el método de Monte Carlo.
     *
     * @param pasos El número de pasos o dardos a lanzar para la aproximación.
     * @return La aproximación del número pi.
     */
    public static double generarNumeroPiFuncional(long pasos) {
        long dardosCirculo = Stream.iterate(new Dardo(), x -> new Dardo())
                .limit(pasos)
                .filter(x -> Math.pow(x.coordenadax, 2) + Math.pow(x.coordenaday, 2) <= 1)
                .count();

        return 4.0 * dardosCirculo / pasos;
    }
}
