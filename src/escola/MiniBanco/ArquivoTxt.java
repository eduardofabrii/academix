package escola.MiniBanco;

import escola.pessoas.Funcionario;
import java.io.*;
import java.time.format.DateTimeFormatter;

public class ArquivoTxt {

    private String caminhoArquivo;

    public ArquivoTxt(String nomeArquivo) {
        this.caminhoArquivo = "src/escola/MiniBanco/" + nomeArquivo;  // Define o caminho dentro da pasta src/escola/MiniBanco
    }

    // Método para formatar dados de um funcionário
    private String formatarFuncionario(Funcionario funcionario) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + funcionario.getNome() + "\n" +
                "CPF: " + funcionario.getCPF() + "\n" +
                "Data de Nascimento: " + funcionario.getDataNascimento().format(formatter) + "\n" +
                "Endereço: " + funcionario.getEndereco() + "\n" +
                "Salário: " + funcionario.getSalario() + "\n" +
                "----";
    }

    // Método para salvar um funcionário no arquivo
    public void salvarFuncionario(Funcionario funcionario) throws IOException {
        String funcionarioFormatado = formatarFuncionario(funcionario);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.write(funcionarioFormatado);
            writer.newLine();
        }
    }
}
