import logic.*;

public class Main {

    public static void main(String[] args) {
        InsertionSort object = InsertionSort.getInstance();
        object.initSort(100);
        System.out.println(object.calcularOEFormula());
        System.out.println(object.calcularOEContador());
    }
}