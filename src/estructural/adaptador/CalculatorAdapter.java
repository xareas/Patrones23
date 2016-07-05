package estructural.adaptador;

/**
 * Created by xareas on 7/2/16.
 */
public class CalculatorAdapter {
     Calculator calculator;
     Triangle triangle;

    public double getArea(Triangle t){
        calculator = new Calculator();
        triangle = t;
        //aca es donde se realiza la adaptacion
        Rectangle rec = new Rectangle(100,100);
        t.alto = rec.largo;
        t.basetriangle = rec.ancho*0.5;
       return calculator.getArea(rec);
    }
}
