package escola.pessoas;

import java.time.LocalDate;
import java.util.Date;
import escola.pessoas.Aluno;
import java.util.List;

public class Secretario extends Funcionario {

    public Secretario(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
    }

    public void gerenciarMatriculas(Aluno aluno) {
        if (aluno.isMatriculado()) {
            System.out.println("Aluno já está matriculado.");
        } else {
            aluno.setMatriculado(true); // Corrigido para setMatriculado
            System.out.println("Matrícula realizada com sucesso para o aluno: " + aluno.getNome());
        }
    }

//    // Método para consultar documentos de um aluno específico/ não sei implementar
//    public List<Documento> consultarDocumentos(List<Documento> documentos, int idAluno) {
//        return documentos.stream()
//                .filter(doc -> doc.getIdAluno() == idAluno)
//                .toList();
//    }

    // Método para agendar reunião com uma pessoa em uma data específica
    public void agendarReuniao(Pessoa pessoa, Date data) {
        System.out.println("Reunião agendada com " + pessoa.getNome() + " para a data: " + data);
    }

    // Método para atualizar informações pessoais de uma pessoa
    public void atualizarInformacoesPessoais(Pessoa pessoa) {
        pessoa.setEndereco("Novo Endereço Exemplo"); // Exemplo de atualização do endereço
        System.out.println("Informações pessoais atualizadas para " + pessoa.getNome());
    }

}
