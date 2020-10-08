package logic;

import abstraction.Metodo;

public class InsertionSort implements Metodo {

    private int formula,contador;
    private  static InsertionSort instancia;

    private InsertionSort(){}

    public static InsertionSort getInstance(){
        if( instancia == null){
            instancia = new InsertionSort();
        }

        return instancia;
    }

    @Override
    public void initSort(int N) {
        int[] a = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }

        contador = 3;
        int j = 0;
        for (int i = 1; i < N; i++){ //(9j - 9)N + 9N + 2
            int aux = a[i]; // 2oe
            j = i - 1; // 2oe
            while ((j >= 0) && (aux < a[j])){ //4 oe 9(j-1)
                a[j + 1] = a[j]; //4 oe
                j--; // 1 oe
            }
            a[j + 1] = aux;//3oe
        }

        formula = 0;
    }

    @Override
    public int calcularOEFormula() {
        return this.formula;
    }

    @Override
    public int calcularOEContador() {
        return this.contador;
    }

    @Override
    public String getFormula() {
        return null;
    }

    @Override
    public String getComplejidad() {
        return null;
    }
}
