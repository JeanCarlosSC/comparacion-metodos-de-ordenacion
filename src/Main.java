import logic.SelectionSort;

public class Main {

    public static void main(String[] args) {
        SelectionSort object = SelectionSort.getInstance();
        object.initSort(100);
        System.out.println(object.calcularOEFormula());
        System.out.println(object.calcularOEContador());
    }
}