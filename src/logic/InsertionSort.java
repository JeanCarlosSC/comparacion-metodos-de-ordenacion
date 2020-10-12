package logic;

import abstraction.Metodo;

public class InsertionSort implements Metodo {

    private  static InsertionSort instancia;

    private InsertionSort(){}

    public static InsertionSort getInstance(){
        if( instancia == null){
            instancia = new InsertionSort();
        }

        return instancia;
    }

    @Override
    public int calcularOEFormula(int N) {
        return (9)*((((N*N)-(N))/2)) + (10*(N-1))+(2);
    }

    @Override
    public int calcularOEContador(int N) {
        int[] a = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }

        int contador = 2;
        int j = 0;
        for (int i = 1; i < N; i++){ // 2 OE
            int aux = a[i]; // 2oe
            j = i - 1; // 2oe
            contador += 7;
            while ((j >= 0) && (aux < a[j])){ //4 oe
                a[j + 1] = a[j]; //4 oe
                j--; // 1 oe
                contador += 9;
            }
            contador+=3;
            a[j+1] = aux;//3oe
        }

        return contador;
    }

    @Override
    public String getFormula() {
        return "<html><body><p>9(N<sup>2</sup>-N)/2 + 10N - 8 <p></body></html>";
    }

    @Override
    public String getComplejidad() {
        return "<html>O(N<sup>2</sup>)</html>";
    }
}
