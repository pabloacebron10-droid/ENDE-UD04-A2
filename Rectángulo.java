package figuras;

import java.awt.Color;

/**
 * Clase que representa un rectángulo.
 * Hereda de la clase Figura e incluye información sobre
 * la base y la altura del rectángulo.
 */
public class Rectangulo extends Figura {

    /** Longitud de la base del rectángulo */
    private double base;

    /** Longitud de la altura del rectángulo */
    private double altura;

    /**
     * Constructor de la clase Rectangulo.
     * Inicializa un rectángulo indicando su posición, color, base y altura.
     * 
     * @param x Coordenada X del centro del rectángulo
     * @param y Coordenada Y del centro del rectángulo
     * @param color Color del rectángulo
     * @param base Longitud de la base
     * @param altura Longitud de la altura
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la longitud de la base.
     * 
     * @return Base del rectángulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Obtiene la longitud de la altura.
     * 
     * @return Altura del rectángulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Modifica la longitud de la base.
     * 
     * @param base Nueva base del rectángulo
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Modifica la longitud de la altura.
     * 
     * @param altura Nueva altura del rectángulo
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return Perímetro calculado
     */
    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

    /**
     * Calcula el área del rectángulo.
     * 
     * @return Área calculada
     */
    @Override
    public double area() {
        return base * altura;
    }
}