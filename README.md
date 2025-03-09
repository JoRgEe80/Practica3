# Proyecto de Aproximación al Número Pi

Este proyecto tiene como objetivo aproximar el valor del número pi utilizando el método de Monte Carlo mediante la simulación de lanzamientos de dardos en un cuadrado unitario.

## Estructura del Proyecto

El proyecto está organizado en tres paquetes principales:

1. **dominio**: Contiene la clase `Dardo` que representa un dardo con coordenadas aleatorias.
2. **aplicacion**: Contiene la clase `Principal` que ejecuta el programa y muestra la aproximación del número pi.
3. **utilidad**: Contiene la clase `Matematicas` con el método para generar la aproximación del número pi.

## Clases

### Dardo

La clase `Dardo` genera dardos con coordenadas aleatorias dentro del cuadrado unitario.

### Matematicas

La clase `Matematicas` contiene el método `generarNumeroPiFuncional` que utiliza un Stream para generar dardos y calcular la fracción que cae dentro del círculo unitario, aproximando así el valor de pi.

### Principal

La clase `Principal` ejecuta el programa y muestra la aproximación del número pi basado en el número de pasos proporcionado como argumento.

## Ejecución del Proyecto

Para ejecutar este proyecto, necesitas compilar las clases y pasar el número de pasos como argumento en la línea de comandos. Aquí hay un ejemplo de cómo hacerlo:

1. Compilar las clases:
    ```sh
    javac dominio/Dardo.java
    javac dominio/Matematicas.java
    javac aplicacion/Principal.java
    ```

2. Ejecutar el programa:
    ```sh
    java aplicacion.Principal (Cualquier numero, Ej.1000000)
    ```

En este ejemplo, el programa utilizará 1,000,000 pasos para aproximar el valor de pi.


## Licencia

Este proyecto está licenciado bajo la Licencia Apache 2.0. Consulta el archivo LICENSE para más detalles.

