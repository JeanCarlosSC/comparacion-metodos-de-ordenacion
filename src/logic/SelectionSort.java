package logic;

import abstraction.Metodo;

public class SelectionSort implements Metodo {

    private int formula,contador;
    private static SelectionSort instancia;

    private SelectionSort(){}

    public static SelectionSort getInstance(){
        if(instancia == null){
            instancia = new SelectionSort();
        }
        return instancia;

    }

    @Override
    public void initSort(int N){
        int[] a = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }

        contador = 1;
        for(int i = 0; i < N-1; i++){
            contador += 6;
            int minimo = i;
            for(int j = i+1; j < N; j++){ // 2OE
                contador += 5;
                if(a[j] < a[minimo]){ // 3OE
                    minimo = j; // 1 OE
                    contador += 1;
                }
            }
            contador += 1;
            contador += 1;
            if(i != minimo){
                contador += 7;
                int temp = a[i];
                a[i] = a[minimo];
                a[minimo] = temp;
            }
        }
        contador += 2;

        formula = 6*((N*N) - (((N-1)*N)/(2)) - N ) + 9*(N-1) + 3;
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
        return "<html>O(N<sup>2</sup>)</html>";
    }
}
