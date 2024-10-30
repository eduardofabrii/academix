package escola.UI;

import escola.pessoas.Aluno; // Importe a classe Aluno
import escola.pessoas.Professor;
import escola.administracao.Disciplina; // Importe a classe Disciplina
import escola.boletim.Nota; // Importe a classe Nota
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProfessorUI {
    private Professor p;
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
//                p.atribuirNota();
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
//                p.consultarNotas();
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
