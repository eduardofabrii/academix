package escola.pessoas;

import java.time.LocalDate;
import java.util.List;

public class Secretario extends Funcionario {
    public Secretario(int codigo, double salario) {
        super(codigo, salario);
    }

    public Secretario(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public void gerenciarMatriculas(Alunos aluno){};
    public List<Documento> consultarDocumentos(int idAluno){};
    public void agendarReuniao (Pessoa pessoa, Date data){};
    public void atualizarInformacoesPessoais(Pessoa pessoa){};


}
