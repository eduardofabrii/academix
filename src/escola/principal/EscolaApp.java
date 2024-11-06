package escola.principal;

import escola.administracao.Disciplina;
import escola.administracao.Turma;
import escola.boletim.Boletim;
import escola.excecoes.BoletimNaoRegistradoException;
import escola.excecoes.DisciplinaInvalidaException;
import escola.excecoes.TurmaSemAlunosException;
import escola.minibanco.ArquivoTxt;
import escola.pessoas.*;

import java.io.IOException;
import java.time.LocalDate;

public class EscolaApp {
    public static void main(String[] args) throws DisciplinaInvalidaException, TurmaSemAlunosException, BoletimNaoRegistradoException {

//        Professor marina = new Professor("Marina de Lara", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores", 1, 14900.0D);
//        Faxineiro carlos = new Faxineiro("Carlos Oliveira", "12345678900", LocalDate.of(1985, 5, 10), "Rua das Flores, 100", 1,1500.0D);
//
//        ArquivoTxt arquivo = new ArquivoTxt("funcionarios.txt");
//
//        try {
//            arquivo.salvarFuncionario(marina);
//            arquivo.salvarFuncionario(carlos);
//            System.out.println("Funcionários salvos com sucesso!");
//        } catch (IOException e) {
//            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
//        }


        // TESTE DAS EXCECOES
        Professor marina = new Professor("Marina de Lara", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores", 1, 14900.0D);
        Professor paradise = new Professor("Ermelino Paradise", "098765432112", LocalDate.of(1970, 3, 30), "Rua das Armelinas", 1, 16000.0D);
        Aluno eduardo = new Aluno("Eduardo Henrique Fabri", "12345678911", LocalDate.of(2006,8,23), "Roberto Teste");

        Disciplina poo = new Disciplina("POO", 120, marina);
        marina.lecionarDisciplina(poo);

        Boletim boletimEduardo = new Boletim(eduardo);
        eduardo.setBoletim(boletimEduardo);

        marina.atribuirNota(eduardo, poo, 10);

        Turma turmaA = new Turma("A");
        turmaA.adicionarAluno(eduardo);

        marina.gerarRelatorioDesempenho(turmaA, poo);

    }
}