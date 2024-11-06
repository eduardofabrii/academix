package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.pessoas.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class AlunoUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton calcularMediaButton;
    private JButton consultarFrequenciaButton;
    private JButton visualizarBoletimButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel alunoLabel;
    private JButton consultarTurmaButton;

    private Aluno aluno;
    private Escola escola;
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    static {
        alunos.add(new Aluno("João", "123.456.789-00", LocalDate.now(), "Rua A, 123", "2023-001"));
        alunos.add(new Aluno("Maria", "987.654.321-00", LocalDate.now(), "Rua B, 456", "2023-002"));
    }

    public AlunoUI() {
        escola = new Escola();
        for (Aluno a : alunos) {
            escola.adicionarAluno(a); // Adiciona os alunos à escola
        }

        visualizarBoletimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(painelPrincipal, "Digite o nome do aluno:");
                aluno = escola.buscarAlunoPorNome(nome);
                if (aluno != null) {
                    aluno.visualizarBoletim();
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
                }
            }
        });

        calcularMediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(painelPrincipal, "Digite o nome do aluno:");
                aluno = escola.buscarAlunoPorNome(nome);
                if (aluno != null) {
                    double media = aluno.calcularMedia();
                    JOptionPane.showMessageDialog(painelPrincipal, "Média: " + media);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
                }
            }
        });

        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(painelPrincipal, "Digite o nome do aluno:");
                aluno = escola.buscarAlunoPorNome(nome);
                if (aluno != null) {
                    aluno.verTurma();
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
                }
            }
        });

        consultarFrequenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(painelPrincipal, "Digite o nome do aluno:");
                aluno = escola.buscarAlunoPorNome(nome);
                if (aluno != null) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Frequência: " + aluno.getFrequencia());
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela do Aluno");
        frame.setContentPane((new AlunoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
