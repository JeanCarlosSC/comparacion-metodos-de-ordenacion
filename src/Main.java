import logic.*;

public class Main {

    public static void main(String[] args) {
        SelectionSort object = SelectionSort.getInstance();
        System.out.println(object.calcularOEFormula(100));
        System.out.println(object.calcularOEContador(100));
    }
}