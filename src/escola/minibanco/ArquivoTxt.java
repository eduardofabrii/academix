package escola.minibanco;

import escola.pessoas.Funcionario;
import escola.pessoas.Pessoa;

import java.io.*;
import java.util.List;

public class ArquivoTxt {

    private String caminhoArquivo;

    public ArquivoTxt(String nomeArquivo) {
        this.caminhoArquivo = "src/escola/minibanco/" + nomeArquivo;
    }

    public void salvarFuncionario(Funcionario funcionario) throws IOException {
        try (FileWriter writer = new FileWriter(caminhoArquivo, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {


            bufferedWriter.write(formatarCabecalho());
            bufferedWriter.newLine();
            bufferedWriter.write(formatarDivisoria());
            bufferedWriter.newLine();


            bufferedWriter.write(formatarFuncionario(funcionario));
            bufferedWriter.newLine();
            bufferedWriter.write(formatarDivisoria());
            bufferedWriter.newLine();

        }
    }

   
    private String formatarCabecalho() {
        return "+---------------------------+-----------------+-----------------------+---------------------------+-----------------+------------+-----------------+" +
                "\n| Nome                      | CPF             | Data de Nascimento    | Endereço                  | Tipo            | Código     | Salário         |";
    }

   
    private String formatarFuncionario(Funcionario funcionario) {
        return String.format("| %-25s | %-15s | %-21s | %-25s | %-15s | %-10d | %-15.2f |",
                funcionario.getNome(),
                funcionario.getCPF(),
                funcionario.getDataNascimento(),
                funcionario.getEndereco(),
                funcionario.getTipo(),
                funcionario.getCodigo(),
                funcionario.getSalario());
    }


    private String formatarDivisoria() {
        return "+---------------------------+-----------------+-----------------------+---------------------------+-----------------+------------+-----------------+";
    }


    public List<Pessoa> carregarPessoas() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            return (List<Pessoa>) in.readObject();
        }
    }
}
