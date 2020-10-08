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

    public void initSort(int N){
        int[] a = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }
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
