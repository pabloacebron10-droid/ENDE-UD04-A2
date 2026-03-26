package figuras;

import java.awt.Color;

/**
 * Clase que representa un cuadrado.
 * Hereda de la clase Rectangulo, ya que un cuadrado es un caso particular
 * de rectángulo donde todos los lados son iguales.
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor de la clase Cuadrado.
     * Inicializa un cuadrado indicando su posición, color y longitud del lado.
     * 
     * @param x Coordenada X de la posición del cuadrado
     * @param y Coordenada Y de la posición del cuadrado
     * @param color Color del cuadrado
     * @param lado Longitud del lado del cuadrado
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}