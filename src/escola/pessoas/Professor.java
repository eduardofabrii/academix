package escola.pessoas;

import escola.boletim.Nota;
import escola.administracao.Disciplina;
import escola.administracao.Escola;
import java.time.LocalDate;
import java.util.ArrayList;

public class Professor extends Funcionario{
    private String registro;
    private double salario;
    private ArrayList<Disciplina> disciplinas;

    public Professor(int codigo, double salario, String registro, ArrayList<Disciplina> disciplinas, double salario1) {
        super(codigo, salario);
        this.registro = registro;
        this.disciplinas = disciplinas;
        this.salario = salario1;
    }

    public Professor(String nome, String CPF, LocalDate dataNascimento, String endereco, int codigo, double salario, String registro, ArrayList<Disciplina> disciplinas, double salario1) {
        super(nome, CPF, dataNascimento, endereco, codigo, salario);
        this.registro = registro;
        this.disciplinas = disciplinas;
        this.salario = salario1;
    }

    public void atribuirNota(Aluno aluno, Disciplina disciplina, double valor){
        Nota nota = new Nota(aluno, disciplina, valor);
        aluno.getBoletim().registrarNota(nota);
//        colocando nota no arraylist do boletim
    }

    public ArrayList<Nota> consultarNotas(Aluno aluno, Disciplina disciplina) {
        ArrayList<Nota> notasDisciplina = new ArrayList<>();
        for (Nota nota : aluno.getBoletim().notas) {
            if (nota.getDisciplina == disciplina) {
                notasDisciplina.add(nota);
            }
        }
        return notasDisciplina;
    }

    public ArrayList<Aluno> consultarTurma(Escola escola, String nomeTurma){
        for (Turma turma : escola.getListaTurma()){
            if (turma.getNome.equals(nomeTurma)){
                return turma.getListaAlunos();
            }
        }
        return null; //analisar depois
    }

    public void gerarRelatorioDesempenho(Turma turma, Disciplina disciplina){
        double somaNota = 0;
        int quantidadeNota = 0;
        for (Aluno aluno : turma.getListaAlunos()){
            for (Nota nota : consultarNotas(aluno, disciplina)) {
                somaNota = nota.getValor();
                quantidadeNota ++;
            }
        }
        System.out.println("Nota total da turma: " + somaNota + "\n Nota média da turma: " + somaNota/quantidadeNota);
    }
}
