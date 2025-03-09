/**
 * Clase principal que ejecuta el programa para aproximar el número pi.
 */
package aplicacion;

import dominio.Matematicas;

public class Principal {
    /**
     * Método principal que ejecuta el programa.
     *
     * @param args Argumentos de la línea de comandos. El primer argumento debe ser el número de pasos.
     */
    public static void main(String[] args) {
        Double resultado = Matematicas.generarNumeroPiFuncional(Long.parseLong(args[0]));
        System.out.println("La aproximación al número pi es: " + resultado);
    }
}
