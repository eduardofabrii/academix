package escola.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscolaUI {
    private JPanel painelPrincipal;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JLabel alunoLabel;
    private JPanel painelBase2;
    private JLabel escolhasLabel;
    private JPanel painelTitulo;
    private JButton alunoButton;

    public EscolaUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirProfessorUI();
            }
        });

        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirAlunoUI();
            }
        });
    }

    public static void abrirProfessorUI() {
        JFrame frame = new JFrame("Tela de Professor");
        frame.setContentPane((new ProfessorUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirAlunoUI() {
        JFrame frame = new JFrame("Tela de Aluno");
        frame.setContentPane((new AlunoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Escolhas");
        frame.setContentPane((new EscolaUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
