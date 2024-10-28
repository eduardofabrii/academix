package escola.UI;

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
    private JButton consultarTurmaButton;

    public ProfessorUI() {
        atribuirNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buscarBoletimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        consultarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        consultarNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
