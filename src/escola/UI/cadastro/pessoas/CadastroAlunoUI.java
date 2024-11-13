package escola.UI.cadastro.pessoas;
import escola.pessoas.Aluno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

public class CadastroAlunoUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField cpfTextField;
    private JTextField nascTextField;
    private JTextField enderecTextField;
    private JTextField nomeTextField;
    private JTextField matriculaTextField;

    public CadastroAlunoUI() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                String endereco = enderecTextField.getText();
                String matricula = matriculaTextField.getText();

                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());

                Aluno novoAluno = new Aluno(nome, cpf, dataNascimento, endereco, matricula);

                System.out.println(novoAluno.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Aluno " + nome + " cadastrado com sucesso!");

                nomeTextField.setText("");
                cpfTextField.setText("");
                nascTextField.setText("");
                enderecTextField.setText("");
                matriculaTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Aluno");
        frame.setContentPane(new CadastroAlunoUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
