package escola.UI.cadastro.outros;

import escola.administracao.Turma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTurmaUI {
    public JPanel painelPrincipal;
    private JButton cadastrarTurmaButton;
    private JTextField nomeTurmaTextField;
    private JTextField anoTurmaTextField;
    private JPanel painelTitulo;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private Turma turma;

    public CadastroTurmaUI() {
        turma = null;

        cadastrarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTurmaTextField.getText();
                turma = new Turma(nome); // Cria nova turma com o nome informado

                if (!anoTurmaTextField.getText().isEmpty()) {
                    int ano = Integer.parseInt(anoTurmaTextField.getText());
                    turma.setAno(ano);
                }

                JOptionPane.showMessageDialog(null, "Turma " + nome + " cadastrada com sucesso!");
                nomeTurmaTextField.setText("");
                anoTurmaTextField.setText("");

                System.out.println(turma.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Turma");
        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
