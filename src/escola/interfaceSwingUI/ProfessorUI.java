package escola.interfaceSwingUI;

import escola.pessoas.Aluno; // Importe a classe Aluno
import escola.pessoas.Professor;
import escola.administracao.Disciplina; // Importe a classe Disciplina

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfessorUI {
    Professor professor = new Professor();

    JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JLabel professorLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JButton atribuirNotaButton;
    private JButton buscarBoletimButton;
    private JButton consultarNotaButton;

    public ProfessorUI() {
        atribuirNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atribuirNota();
            }
        });
    }

    private void atribuirNota() {
        String alunoNome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String disciplinaNome = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String notaString = JOptionPane.showInputDialog("Digite a nota:");
    }

    private Aluno buscarAluno(String nome) {
        return null;
    }

    private Disciplina buscarDisciplina(String nome) {
        return null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Professor");
        frame.setContentPane((new ProfessorUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
