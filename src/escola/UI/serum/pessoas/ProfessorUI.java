package escola.UI.serum.pessoas;

import escola.administracao.Disciplina;
import escola.administracao.Turma;
import escola.boletim.Nota;
import escola.excecoes.BoletimNaoRegistradoException;
import escola.excecoes.DisciplinaInvalidaException;
import escola.excecoes.TurmaSemAlunosException;
import escola.pessoas.Aluno;
import escola.pessoas.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProfessorUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JLabel professorLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JButton atribuirNotaButton;
    private JButton gerarRelatorioDesempenhoButton;
    private JButton consultarNotaButton;
    private JButton consultarTurmaButton;
    private JButton lecionarDisciplina;

    private Professor p = new Professor();

    public ProfessorUI() {
        atribuirNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
                String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno:");

                try {
                    double nota = Double.parseDouble(notaStr);
                    Aluno aluno = new Aluno(nomeAluno);
                    Disciplina disciplina = new Disciplina(nomeDisciplina);

                    p.atribuirNota(aluno, disciplina, nota);
                    System.out.println("Nota atribuída com sucesso!");
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor, insira uma nota válida!");
                } catch (Exception ex) {
                    System.out.println("Erro ao atribuir nota: " + ex.getMessage());
                }
            }
        });

        lecionarDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");

                try {
                    Disciplina disciplina = new Disciplina(nomeDisciplina);
                    p.lecionarDisciplina(disciplina);
                    System.out.println("Disciplina lecionada com sucesso!");
                } catch (Exception ex) {
                    System.out.println("Erro ao lecionar disciplina: " + ex.getMessage());
                }
            }
        });

        gerarRelatorioDesempenhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeTurma = JOptionPane.showInputDialog("Digite o nome da turma:");
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");

                try {
                    Turma turma = new Turma(nomeTurma); // Aqui seria necessário um método para buscar a turma na escola
                    Disciplina disciplina = new Disciplina(nomeDisciplina);

                    p.gerarRelatorioDesempenho(turma, disciplina);
                } catch (Exception ex) {
                    System.out.println("Erro ao gerar o relatório de desempenho: " + ex.getMessage());
                }
            }
        });

        consultarNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");

                try {
                    Aluno aluno = new Aluno(nomeAluno); // Aqui seria necessário um método para buscar o aluno
                    Disciplina disciplina = new Disciplina(nomeDisciplina); // E a disciplina
                    ArrayList<Nota> notas = p.consultarNotas(aluno, disciplina);

                    if (notas != null && !notas.isEmpty()) {
                        System.out.println("Notas do aluno " + nomeAluno + " na disciplina " + nomeDisciplina + ":");
                        for (Nota nota : notas) {
                            System.out.println("Nota: " + nota.getValor());
                        }
                    } else {
                        System.out.println("Não há notas registradas para o aluno " + nomeAluno + " na disciplina " + nomeDisciplina + ".");
                    }
                } catch (Exception ex) {
                    System.out.println("Erro ao consultar as notas: " + ex.getMessage());
                }
            }
        });

        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeTurma = JOptionPane.showInputDialog("Digite o nome da turma:");

                try {
                    List<Aluno> alunos = p.consultarTurma(nomeTurma);

                    if (alunos != null && !alunos.isEmpty()) {
                        System.out.println("Alunos da turma " + nomeTurma + ":");
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno.getNome());
                        }
                    } else {
                        System.out.println("Não há alunos na turma " + nomeTurma + " ou turma não encontrada.");
                    }
                } catch (Exception ex) {
                    System.out.println("Erro ao consultar a turma: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Professor");
        frame.setContentPane((new ProfessorUI().painelPrincipal));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}