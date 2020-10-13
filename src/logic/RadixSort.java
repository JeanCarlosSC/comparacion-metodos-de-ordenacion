package logic;

import abstraction.Metodo;


public class RadixSort implements  Metodo {

    private static RadixSort instancia;

    private  RadixSort(){}

    public static RadixSort getInstance(){
        if(instancia == null){
            instancia = new RadixSort();
        }

        return  instancia;
    }

    @Override
    public int calcularOEFormula(int N) {
        return (85*N) + (231);
    }

    @Override
    public int calcularOEContador(int N) {
        int contador = 0;

        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = N-i;

        int maximo = a[0];
        contador += 2;

        contador+= 2;
        for (int i = 1; i < N; i++){//4(N-1)+4
            contador += 4;
            if (a[i] > maximo){
                contador += 2;
                maximo = a[i];
            }
        }

        contador += 3; //
        for (int exp = 1; maximo / exp > 0; exp *= 10) {
            contador += 4;

            int output[] = new int[N];
            int i;
            int count[] = new int[10];

            for (i = 0; i < N; i++){ //7N + 2
                count[(a[i] / exp) % 10]++;
                contador += 7;
            }
            contador += 2;

            for (i = 1; i < 10; i++){ //65
                count[i] += count[i - 1];
                contador += 7;
            }
            contador += 2;

            for (i = N - 1; i >= 0; i--) { // 15N + 3
                output[count[(a[i] / exp) % 10] - 1] = a[i];
                count[(a[i] / exp) % 10]--;
                contador += 15;
            }
            contador += 3;

            for (i = 0; i < N; i++){ //5N +2 + 4
                a[i] = output[i];
                contador += 5;
            }
            contador += 2;
        }

        return contador;
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
