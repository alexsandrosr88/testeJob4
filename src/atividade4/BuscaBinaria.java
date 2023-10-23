package atividade4;

public class BuscaBinaria {

    private static BuscaBinaria instancia;

    private BuscaBinaria() {
        super();
    }

    public static BuscaBinaria getInstance() {
        if (instancia == null) {
            instancia = new BuscaBinaria();
        }
        return instancia;
    }

    public static int BuscaBinaria(int[] v, int valorBuscado) {
        int inicio = 0;
        int fim = v.length - 1;

        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (valorBuscado == v[meio]) {
                return meio;
            } else if (valorBuscado < v[meio])
                fim = meio--;
            else
                inicio = meio++;
        }
        return -1;
    }
}
