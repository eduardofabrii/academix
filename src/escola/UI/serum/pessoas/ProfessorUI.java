package escola.UI.serum.pessoas;

import escola.UI.serum.entrada.ListaAlunosUI;
import escola.administracao.Disciplina;
import escola.administracao.Escola;
import escola.administracao.Turma;
import escola.boletim.Nota;
import escola.minibanco.administracao.GerenciarDadosAdministracao;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.pessoas.Aluno;
import escola.pessoas.Porteiro;
import escola.pessoas.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JButton atualizarButton;
    private ArrayList<Professor> professores = new GerenciarDadosPessoas().getProfessores();
    private JComboBox professorsComboBox;
    ArrayList<Aluno> alunos = new GerenciarDadosPessoas().getAlunos();
    ArrayList<Disciplina> disciplinas = new GerenciarDadosAdministracao().getDisciplinas();
    ArrayList<Turma> turmas = new GerenciarDadosAdministracao().getTurmas();

    Escola escola = new Escola();

    Professor p = new Professor();
    private ArrayList<Professor> professoresCadastrados = new GerenciarDadosPessoas().getProfessores();

    public ProfessorUI() {
        inicializarProfessores();

        for (Professor professor : professoresCadastrados) {
            professorsComboBox.addItem(professor);
        }

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

                    // Obtém o professor selecionado no ComboBox
                    Professor professorSelecionado = (Professor) professorsComboBox.getSelectedItem();

                    if (professorSelecionado != null) {
                        professorSelecionado.atribuirNota(aluno, disciplina, nota);
                        System.out.println("Nota atribuída com sucesso!");
                    } else {
                        System.out.println("Nenhum professor selecionado.");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor, insira uma nota válida!");
                } catch (Exception ex) {
                    System.out.println("Erro ao atribuir nota: " + ex.getMessage());
                }
            }
        });





        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarComboBox();
                JOptionPane.showMessageDialog(painelPrincipal, "Lista de professor atualizada.");
            }
        });

        professorsComboBox.removeAllItems();
        for (Professor professor : professores) {
            professorsComboBox.addItem(professor);
        }

        lecionarDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");

                try {
                    Disciplina disciplina = new Disciplina(nomeDisciplina);

                    Professor professorSelecionado = (Professor) professorsComboBox.getSelectedItem();
                    if (professorSelecionado != null) {
                        professorSelecionado.lecionarDisciplina(disciplina);
                        System.out.println("Disciplina lecionada com sucesso!");
                    }
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
                    for (Turma t : turmas) {
                        if (t.getNome() == null) {
                            continue; // fazer jqotption pane
                        }

                        if (t.getNome().equalsIgnoreCase(nomeTurma)) {
                            for (Disciplina d : disciplinas) {
                                if (d.getNome().equalsIgnoreCase(nomeDisciplina)) {
                                    p.gerarRelatorioDesempenho(t, d);
                                } else {
                                    System.out.println("Disciplina inexistente"); //jqpotion
                                }
                            }
                        } else {
                            // jqoptionpane
                        }
                    }
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
                    for (Aluno a : alunos) {
                        if (a.getNome() == null) {
                            continue;
                        }
                        if (a.getNome().equalsIgnoreCase(nomeAluno)) {
                            for (Disciplina d : disciplinas) {
                                if (d.getNome().equalsIgnoreCase(nomeDisciplina)) {
                                    ArrayList<Nota> notas = p.consultarNotas(a, d);
                                } else {
                                    System.out.println("Disciplina inexistente");
                                }
                            }
                        }
                    }
                } catch (Exception ex) {
                    System.out.println("Erro ao consultar as notas: " + ex.getMessage());
                }
            }
        });

        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirLista();
            }
        });
    }

    private void inicializarProfessores() {
        new GerenciarDadosPessoas().lerProfessores();
    }

    public static void abrirLista() {
        // Exemplo de turmas
        List<String> turmas = List.of("Turma A", "Turma B", "Turma C");

        JFrame frame = new JFrame("Lista de Alunos");
        frame.setContentPane(new ListaAlunosUI(turmas, new ArrayList<>()).getPainelPrincipal());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // centraliza a janela
        frame.setVisible(true);
    }

    public void atualizarComboBox() {
        professorsComboBox.removeAllItems();
        for (Professor professor : professores) {
            professorsComboBox.addItem(professor.getNome());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Professor");
        frame.setContentPane((new ProfessorUI().painelPrincipal));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
