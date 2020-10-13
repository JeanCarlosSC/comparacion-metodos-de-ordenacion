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

    public int getMax(int arr[], int n)
    {
        int maximo = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > maximo)
                maximo = arr[i];
        return maximo;
    }

    public void countSort(int arr[], int n, int exp)
    {

    }


    @Override
    public int calcularOEFormula(int N) {
        return 0;
    }

    @Override
    public int calcularOEContador(int N) {
        int contador = 0;
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = N-i;
        }
        for(int element:a){
            System.out.print(element+", ");
        }
        System.out.println("\n");
        int m = getMax(a, N);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            int output[] = new int[N];
            int i;
            int count[] = new int[10];

            for (i = 0; i < N; i++)
                count[(a[i] / exp) % 10]++;

            for (i = 1; i < 10; i++)
                count[i] += count[i - 1];


            for (i = N - 1; i >= 0; i--) {
                output[count[(a[i] / exp) % 10] - 1] = a[i];
                count[(a[i] / exp) % 10]--;
            }

            for (i = 0; i < N; i++)
                a[i] = output[i];
        }
        //Fin de la implementacion

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
