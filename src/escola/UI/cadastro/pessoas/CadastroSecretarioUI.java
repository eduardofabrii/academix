package escola.UI.cadastro.pessoas;

import escola.minibanco.pessoas.PessoaTxt;
import escola.pessoas.Secretario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

public class CadastroSecretarioUI {
    public JPanel painelPrincipal;
    private JButton cadastrarButton;
    private JTextField cpfTextField;
    private JTextField nascTextField;
    private JTextField enderecTextField;
    private JTextField salarioTextField;
    private JTextField nomeTextField;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;

    public CadastroSecretarioUI() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());
                String endereco = enderecTextField.getText();
                double salario = Double.parseDouble(salarioTextField.getText());

                Secretario novoSecretario = new Secretario(nome, cpf, dataNascimento, endereco, 0, salario);

                try{
                    PessoaTxt.salvarPessoa(novoSecretario);
                } catch(IOException i){
                    System.out.println("Erro: Secretario não salvo");
                }

                System.out.println(novoSecretario.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Secretário " + nome + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Secretario");
        frame.setContentPane((new CadastroSecretarioUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
