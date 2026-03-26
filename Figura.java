package figuras;

import java.awt.Color;

/**
 * Clase abstracta que representa una figura geométrica.
 * Contiene información común a todas las figuras como el centro y el color.
 * Define métodos abstractos para calcular el área y el perímetro.
 */
public abstract class Figura {
    
    /** Punto que representa el centro de la figura */
    private Punto centro;
    
    /** Color de la figura */
    private Color color;

    /**
     * Constructor de la clase Figura.
     * Inicializa el centro y el color de la figura.
     * 
     * @param x Coordenada X del centro
     * @param y Coordenada Y del centro
     * @param color Color de la figura
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /**
     * Obtiene la coordenada X del centro.
     * 
     * @return Coordenada X
     */
    public double getXCentro() {
        return centro.getX();
    }

    /**
     * Obtiene la coordenada Y del centro.
     * 
     * @return Coordenada Y
     */
    public double getYCentro() {
        return centro.getY();
    }

    /**
     * Obtiene el color de la figura.
     * 
     * @return Color de la figura
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifica la coordenada X del centro.
     * 
     * @param x Nueva coordenada X
     */
    public void setXCentro(double x) {
        centro.setX(x);
    }

    /**
     * Modifica la coordenada Y del centro.
     * 
     * @param y Nueva coordenada Y
     */
    public void setYCentro(double y) {
        centro.setY(y);
    }

    /**
     * Modifica el color de la figura.
     * 
     * @param color Nuevo color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Calcula el perímetro de la figura.
     * 
     * @return Perímetro de la figura
     */
    public abstract double perimetro();

    /**
     * Calcula el área de la figura.
     * 
     * @return Área de la figura
     */
    public abstract double area();

    /**
     * Compara el área de esta figura con otra figura.
     * 
     * @param otraFigura Figura con la que se compara
     * @return 1 si esta figura es mayor, -1 si es menor, 0 si son iguales
     */
    public int esMayorQue(Figura otraFigura) {
        int codigo;
        if (this.area() > otraFigura.area())
            codigo = 1;
        else if (this.area() < otraFigura.area())
            codigo = -1;
        else
            codigo = 0;
        return codigo;
    }
}