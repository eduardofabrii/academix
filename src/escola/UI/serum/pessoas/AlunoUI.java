package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
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

    private ArrayList<Aluno> alunos = new GerenciarDadosPessoas().getAlunos();
    private Escola escola;

    public AlunoUI() {
        escola = new Escola();
        for (Aluno a : alunos) {
            escola.adicionarAluno(a); // Adiciona os alunos à escola
        }

        visualizarBoletimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos){
                    if (aluno.getCPF().equals(cpf)) {
                        aluno.visualizarBoletim();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");

            }
        });

        calcularMediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos){
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.calcularMedia());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
            }
        });

        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos){
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.getTurma());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");

            }
        });

        consultarFrequenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos){
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.getFrequencia());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");

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
