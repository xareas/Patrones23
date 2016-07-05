package responsabilidad.interprete;

/**
 * Created by xareas on 7/3/16.
 */
public class Context {
    private String input;

    public Context(String input) {
        this.input = input;
    }

    public void getBinaryFrom(String input){
        int i = Integer.parseInt(input);
        String binaryString = Integer.toBinaryString(i);
        System.out.println("El valor es " + binaryString);
    }

    public void printInWords(String input){
        this.input = input ;
        System.out.println("Imprimiendo las palabras");
        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]){
                case '0': System.out.println("Cero");break;
                case '1': System.out.println("Uno");break;
                case '2': System.out.println("Dos");break;
                case '3': System.out.println("Tres");break;
                case '4': System.out.println("Cuatro");break;
                case '5': System.out.println("Cinco");break;
                case '6': System.out.println("Seis");break;
                case '7': System.out.println("Siete");break;
                case '8': System.out.println("Ocho");break;
                case '9': System.out.println("Nueve");break;
                default: System.out.println("*");break;
            }

        }
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
