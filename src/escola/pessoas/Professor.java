package escola.pessoas;

import escola.administracao.Turma;
import escola.boletim.Nota;
import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.excecoes.BoletimNaoRegistradoException;
import escola.excecoes.DisciplinaInvalidaException;
import escola.excecoes.TurmaSemAlunosException;
import escola.minibanco.pessoa.GerenciarDadosPessoas;


import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Funcionario {
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario) {
        super(nome, CPF, dataNascimento, endereco, salario);
        this.disciplinas = new ArrayList<>();
        new GerenciarDadosPessoas().gravarProfessor(this);
    }

    public Professor() {
        this.disciplinas = new ArrayList<>();
    }

    public Professor(String nome, String CPF, LocalDate dataNascimento, String endereco, double salario, ArrayList<Disciplina> disciplinas) {
        super(nome, CPF, dataNascimento, endereco, salario);
        this.disciplinas = new ArrayList<>();
        new GerenciarDadosPessoas().gravarProfessor(this);
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public void atribuirNota(Aluno aluno, Disciplina disciplina, double valor) throws BoletimNaoRegistradoException, DisciplinaInvalidaException {
        if (!disciplinas.contains(disciplina)) {
            throw new DisciplinaInvalidaException("O professor não leciona a disciplina: " + disciplina.getNome());
        }
        if (aluno.getBoletim() == null) {
            throw new BoletimNaoRegistradoException("O aluno " + aluno.getNome() + " não possui boletim registrado.");
        }

        Nota nota = new Nota(aluno, disciplina, valor);
        aluno.getBoletim().registrarNota(nota);
//        colocando nota no arraylist do boletim
    }

    public ArrayList<Nota> consultarNotas(Aluno aluno, Disciplina disciplina) {
        ArrayList<Nota> notasDisciplina = new ArrayList<>(); //ArrayList para armazenar notas em relação a disciplina do professor
        for (Nota nota : aluno.getBoletim().getNotas()) { // varrendo ArrayList das notas do aluno
            if (nota.getDisciplina() == disciplina) {
                notasDisciplina.add(nota);
            }
        }
        return notasDisciplina;
    }

    public ArrayList<Aluno> consultarTurma(String nomeTurma) {
        Escola escola = new Escola();
        for (Turma turma : escola.getTurmas()){
            if (turma.getNome().equals(nomeTurma)){
                return turma.getListaAlunos();
            }
        }
        return null; //analisar depois
    }

    public void gerarRelatorioDesempenho(Turma turma, Disciplina disciplina) throws TurmaSemAlunosException {
        double somaNota = 0;
        int quantidadeNota = 0;
        for (Aluno aluno : turma.getListaAlunos()) {
            if (turma.getListaAlunos().isEmpty()) {
                throw new TurmaSemAlunosException("Não há alunos na turma " + turma.getNome() + " para gerar o relatório.");
            } else {
                for (Nota nota : consultarNotas(aluno, disciplina)) {
                    somaNota = nota.getValor();
                    quantidadeNota ++;
                }
            }
        }
        System.out.println("Nota total da turma: " + somaNota + "\nNota média da turma: " + somaNota/quantidadeNota);
    }

    public void lecionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            System.out.println("Disciplina " + disciplina.getNome() + " adicionada ao professor " + this.getNome());
        } else {
            System.out.println("O professor já leciona a disciplina " + disciplina.getNome());
        }
    }
}
