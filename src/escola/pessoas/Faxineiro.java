package escola.pessoas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Faxineiro extends Funcionario {
    private List<String> problemasReportados;

    public Faxineiro(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario, "Faxineiro(a)");
        this.problemasReportados = new ArrayList<>();
    }
    
      public Faxineiro(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public void reportarProblemasDeManutencao(String problema) {
        problemasReportados.add(problema);
        System.out.println("Problema reportado: " + problema);
    }

    public void consultarRegistroLimpeza() {
        if (problemasReportados.isEmpty()) {
            System.out.println("Nenhum problema de manutenção reportado até o momento.");
        } else {
            System.out.println("Problemas reportados:");
            for (String problema : problemasReportados) {
                System.out.println("- " + problema);
            }
        }
    }
}


