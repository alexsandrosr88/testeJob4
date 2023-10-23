package atividade11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Atividade11 {
    private static final String MEUARQUIVO = "c:" + File.separator + "arquivo.txt";

    public Atividade11() {
        try {
            escreveArquivo();

            double media = leituraDoArquivo().stream()
                    .flatMap(s -> Stream.of(s.split(",")))
                    .mapToDouble(Double::parseDouble)
                    .average().orElse(0.0);

            System.out.println("A media dos valore é: " + media);

        } catch (IOException e) {
            System.out.println("\nOcorreu um erro de leitura do arquivo.txt! Por favor Verifique!");
        }
    }

    public static void main(String[] args) {

        new Atividade11();
    }

    private List<String> leituraDoArquivo() throws IOException {
        return Files.readAllLines(Paths.get(MEUARQUIVO));
    }

    private void escreveArquivo() throws IOException {
        Files.writeString(Paths.get(MEUARQUIVO), "7,2,3,6,4,1,5,8");
    }
}
