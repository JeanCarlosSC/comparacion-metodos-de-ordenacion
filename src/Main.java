import logic.*;

public class Main {

    public static void main(String[] args) {
        RadixSort object = RadixSort.getInstance();
        System.out.println(object.calcularOEFormula(345));
        System.out.println(object.calcularOEContador(345));
    }
}