import logic.*;

public class Main {

    public static void main(String[] args) {
        InsertionSort object = InsertionSort.getInstance();
        System.out.println(object.calcularOEFormula(100));
        System.out.println(object.calcularOEContador(100));
    }
}