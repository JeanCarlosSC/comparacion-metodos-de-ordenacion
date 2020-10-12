package logic;

import abstraction.Metodo;

public class SelectionSort implements Metodo {

    private static SelectionSort instancia;

    private SelectionSort(){}

    public static SelectionSort getInstance(){
        if(instancia == null){
            instancia = new SelectionSort();
        }
        return instancia;

    }

    @Override
    public int calcularOEFormula(int N) {
        return 6*(((N*N)/4)) + (15*(N/2)) + 3;
    }

    @Override
    public int calcularOEContador(int N) {
        int[] a = new int[N];
        int contador;

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }
        contador = 3;
        for(int i = 0; i < N/2; i++){ // 3 OE
            contador += 4;
            int minimo = i;// 1 OE
            for(int j = i+1; j < N-i; j++){ // 2 OE
                contador += 5;
                if(a[j] < a[minimo]){ // 3 OE
                    minimo = j; // 1 OE
                    contador += 1;
                }
            }
            contador += 4;
            if(i != minimo){ // 1 OE
                int temp = a[i]; // 2 OE
                a[i] = a[minimo]; // 3 OE
                a[minimo] = temp; // 2 OE
                contador += 7;
            }
        }
        return contador;
    }

    @Override
    public String getFormula() {
        return "<html><body><p>3N<sup>2</sup>/2  + 15N/2 + 3</p></body></html>";
    }

    @Override
    public String getComplejidad() {
        return "<html>O(N<sup>2</sup>)</html>";
    }

    @Override
    public String getMethodName() {
        return "Selection Sort";
    }
}
