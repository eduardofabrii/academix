package escola.pessoas;

import java.time.LocalDate;
import java.util.List;

public class Diretor extends Funcionario{

    public Diretor() {
    }

    public Diretor(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public Diretor(int codigo, double salario) {
        super(codigo, salario);
    }


    public void gerenciarProfessores(List<Professor> professores){};
    public void gerenciarAlunos(List<Aluno>alunos){};
    public void avaliarDesempenho(Turma turma){};
    public void realizarReuniao(List<Pessoa>participantes){};
    public void gerarRaltorioGeral(){};

}
