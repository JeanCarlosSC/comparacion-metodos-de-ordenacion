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
        //Implementacion
        int[][] matriz = new int[N][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k = 0 ; k<4; k++){
            for(i=0;i<(matriz.length-1);i++)
                matriz[i][1] = i+1;
            matriz[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<a.length;i++){
                j = ((0xFF<<(k<<3))&a[i])>>(k<<3);
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(matriz[l][1] != -1)
                        l = matriz[l][1];
                    matriz[l][1] = f;
                    l = matriz[l][1];
                }
                f = matriz[f][1];
                matriz[l][0] = a[i];
                matriz[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=matriz[l][1])
                    a[j++] = matriz[l][0];
        }
        //Fin de la implementacion
        for(int element:a){
            System.out.print(element+", ");
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
