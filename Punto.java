package figuras;

/**
 * Clase que representa un punto en un plano 2D.
 * Contiene coordenadas X e Y y métodos para manipularlas
 * y calcular relaciones entre puntos.
 */
public class Punto {
    private double x;
    
    /** Coordenada Y del punto */
    private double y;

    /**
     * Constructor por defecto.
     * Inicializa el punto en el origen (0,0).
     */
    public Punto() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor con coordenadas.
     * 
     * @param x Coordenada X del punto
     * @param y Coordenada Y del punto
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor copia.
     * Crea un nuevo punto con las mismas coordenadas que otro punto.
     * 
     * @param p Punto a copiar
     */
    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    /**
     * Obtiene la coordenada X del punto.
     * 
     * @return Coordenada X
     */
    public double getX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y del punto.
     * 
     * @return Coordenada Y
     */
    public double getY() {
        return y;
    }

    /**
     * Modifica la coordenada X del punto.
     * 
     * @param x Nueva coordenada X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Modifica la coordenada Y del punto.
     * 
     * @param y Nueva coordenada Y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcula la distancia entre este punto y otro punto.
     * 
     * @param p Otro punto
     * @return Distancia entre los dos puntos
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Devuelve el punto simétrico respecto al eje Y.
     * 
     * @return Nuevo punto simétrico
     */
    public Punto simetrico() {
        return new Punto(this.x * -1, this.y);
    }

    /**
     * Compara si este punto es igual a otro punto.
     * 
     * @param p Punto a comparar
     * @return true si ambos puntos tienen la misma coordenada X e Y, false en caso contrario
     */
    public boolean compara(Punto p) {
        return p.x == x && p.y == y;
    }

    /**
     * Devuelve la representación en cadena del punto.
     * 
     * @return Cadena con el formato "(x,y)"
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}