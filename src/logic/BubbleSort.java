package logic;

import abstraction.Metodo;

public class BubbleSort implements Metodo {

    private static BubbleSort instancia;

    private BubbleSort(){}

    public static BubbleSort getInstance(){
        if(instancia == null){
            instancia = new BubbleSort();
        }
        return instancia;
    }



    @Override
    public int calcularOEFormula(int N) {
        return 12*((N*N) - (((N-1)*N)/(2)) - N ) + 6*(N-1) + 3;
    }

    @Override
    public int calcularOEContador(int N) {
        int[] a = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }
        int contador = 3;
        for(int i = 0; i < N-1; i++){
            contador += 6;
            for(int j = i+1; j < N; j++){
                contador += 2;
                if(a[i] > a[j]){
                    contador += 10;
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        return contador;
    }

    @Override
    public String getFormula() {
        return "<html>6N<sup>2</sup> - 3</html>";
    }

    @Override
    public String getComplejidad() {
        return "<html>O(N<sup>2</sup>)</html>";
    }
}
