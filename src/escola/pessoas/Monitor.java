package escola.pessoas;

import escola.administracao.Disciplina;

import java.time.LocalDate;

public class Monitor extends Aluno {

    Disciplina disciplinaMonitorada;

    public Monitor(String nome, String CPF, LocalDate dataNascimento, String endereco, Disciplina disciplinaMonitorada) {
        super(nome, CPF, dataNascimento, endereco, "Monitor(a)");
        this.disciplinaMonitorada = disciplinaMonitorada;
    }

}
