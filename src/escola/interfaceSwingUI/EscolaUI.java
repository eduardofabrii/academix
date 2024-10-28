package escola.interfaceSwingUI;

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

    private void abrirProfessorUI() {
        JFrame professorFrame = new JFrame("Tela de Professor");
        professorFrame.setContentPane(new ProfessorUI().painelPrincipal);
        professorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        professorFrame.pack();
        professorFrame.setResizable(false);
        professorFrame.setSize(500, 300);
        professorFrame.setVisible(true);
    }

    private void abrirAlunoUI() {
        JFrame alunoFrame = new JFrame("Tela de Aluno");
        alunoFrame.setContentPane(new AlunoUI().painelPrincipal);
        alunoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        alunoFrame.pack();
        alunoFrame.setResizable(false);
        alunoFrame.setSize(500, 300);
        alunoFrame.setVisible(true);
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
