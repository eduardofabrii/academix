package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.pessoas.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JComboBox<String> alunoComboBox;
    private JButton atualizarButton;

    private ArrayList<Aluno> alunos = new GerenciarDadosPessoas().getAlunos();
    private Escola escola;

    public AlunoUI() {
        escola = new Escola();

        // Adiciona os alunos à escola e popula o ComboBox inicialmente
        for (Aluno a : alunos) {
            escola.adicionarAluno(a);
        }
        atualizarComboBox();

        // Ação para visualizar boletim do aluno
        visualizarBoletimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos) {
                    if (aluno.getCPF().equals(cpf)) {
                        aluno.visualizarBoletim();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
            }
        });

        // Ação para calcular média do aluno
        calcularMediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos) {
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.calcularMedia());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
            }
        });

        // Ação para consultar turma do aluno
        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos) {
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.getTurma());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
            }
        });

        // Ação para consultar frequência do aluno
        consultarFrequenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = JOptionPane.showInputDialog(painelPrincipal, "Digite o cpf do aluno:");
                for (Aluno aluno : alunos) {
                    if (aluno.getCPF().equals(cpf)) {
                        System.out.println(aluno.getFrequencia());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
            }
        });

        // Ação para atualizar o ComboBox
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarComboBox();
                JOptionPane.showMessageDialog(painelPrincipal, "Lista de alunos atualizada.");
            }
        });
    }


    private void atualizarComboBox() {
        alunoComboBox.removeAllItems();
        for (Aluno aluno : alunos) {
            alunoComboBox.addItem(aluno.getNome()); // Adiciona o nome de cada aluno no ComboBox
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela do Aluno");
        frame.setContentPane((new AlunoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
