package atividade4;

public class BuscaBinaria {

    public static int buscaBinaria(int[] v, int valorBuscado) {
        int inicio = 0;
        int fim = v.length - 1;

        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valorBuscado == v[meio]) {
                return meio;
            } else if (valorBuscado < v[meio])
                fim = meio -1;
            else
                inicio = meio +1;
        }
        return -1;
    }
}
