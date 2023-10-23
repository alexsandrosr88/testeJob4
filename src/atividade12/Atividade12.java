package atividade12;

public class Atividade12 {

    public static void main(String[] args) {
        int[] vetorInteiros = {7, 2, 3, 6, 4, 1, 5, 8};

        ordenaVetor(vetorInteiros);

        for (Integer i : vetorInteiros) {
            System.out.print(i + " ");
        }

        int valorBuscado = 9;
        int posicao = buscaBinaria(vetorInteiros, valorBuscado);

        if (posicao != -1) {
            System.out.println("\n\nValor " + valorBuscado + " foi encontrado na posição : "+ (posicao+1)+" do vetor.");
        } else
            System.out.println("\n\nO valor não foi encontrado!");

    }

    public static int buscaBinaria(int[] v, int valorBuscado) {
        int inicio = 0;
        int fim = v.length - 1;

        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valorBuscado == v[meio]) {
                return meio;
            } else if (valorBuscado < v[meio])
                fim = meio -1 ;
            else
                inicio = meio +1;
        }
        return -1;
    }

    //O algoritmo utilizado na ordenação do vetor foi o insertionSort
    public static void ordenaVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int k = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > k) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = k;
        }
    }

}