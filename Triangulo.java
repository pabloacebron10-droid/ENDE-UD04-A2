package figuras;

import java.awt.Color;

/**
 * Clase que representa un triángulo.
 * Hereda de la clase Figura e incluye información sobre
 * la longitud de sus tres lados.
 */
public class Triangulo extends Figura {

    /** Longitud del primer lado del triángulo */
    private double lado1;

    /** Longitud del segundo lado del triángulo */
    private double lado2;

    /** Longitud del tercer lado del triángulo */
    private double lado3;

    /**
     * Constructor de la clase Triangulo.
     * Inicializa un triángulo indicando su posición, color y longitud de los lados.
     * 
     * @param x Coordenada X del centro del triángulo
     * @param y Coordenada Y del centro del triángulo
     * @param color Color del triángulo
     * @param lado1 Longitud del primer lado
     * @param lado2 Longitud del segundo lado
     * @param lado3 Longitud del tercer lado
     */
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Obtiene la longitud del primer lado.
     * 
     * @return Longitud del primer lado
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Obtiene la longitud del segundo lado.
     * 
     * @return Longitud del segundo lado
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Obtiene la longitud del tercer lado.
     * 
     * @return Longitud del tercer lado
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Modifica la longitud del primer lado.
     * 
     * @param lado1 Nueva longitud del primer lado
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Modifica la longitud del segundo lado.
     * 
     * @param lado2 Nueva longitud del segundo lado
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Modifica la longitud del tercer lado.
     * 
     * @param lado3 Nueva longitud del tercer lado
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo sumando sus tres lados.
     * 
     * @return Perímetro calculado
     */
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * 
     * @return Área calculada
     */
    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}