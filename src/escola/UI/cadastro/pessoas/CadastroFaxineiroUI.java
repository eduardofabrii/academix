package escola.UI.cadastro.pessoas;

import escola.pessoas.Faxineiro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

public class CadastroFaxineiroUI {
    public JPanel painelPrincipal;
    private JButton cadastrarProfessor;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField cpfTextField;
    private JTextField nascTextField;
    private JTextField enderecTextField;
    private JTextField salarioTextField;
    private JTextField nomeTextField;

    public CadastroFaxineiroUI() {
        cadastrarProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());
                String endereco = enderecTextField.getText();
                double salario = Double.parseDouble(salarioTextField.getText());

                Faxineiro novoFaxineiro = new Faxineiro(nome, cpf, dataNascimento, endereco, 0, salario);

                System.out.println(novoFaxineiro.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Faxinineiro " + nome + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Faxineiro");
        frame.setContentPane((new CadastroFaxineiroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
