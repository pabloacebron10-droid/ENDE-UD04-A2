package figuras;

import java.awt.Color;

public class Cuadrado extends Rectangulo {

    //Este comentario es la modificación que hay que hacer a una clase en el ejercicio 2, para después hacer el push desde la rama develop
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}