package escola.UI.cadastro.pessoas;

import escola.minibanco.ArquivoTxt;
import escola.minibanco.pessoas.PessoaTxt;
import escola.pessoas.Diretor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;

public class CadastroDiretorUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarProfessor;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField cpfTextField;
    private JTextField nascTextField;
    private JTextField enderecTextField;
    private JTextField salarioTextField;
    private JTextField nomeTextField;

    public CadastroDiretorUI() {
        cadastrarProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());
                String endereco = enderecTextField.getText();
                double salario = Double.parseDouble(salarioTextField.getText());

                Diretor novoDiretor = new Diretor(nome, cpf, dataNascimento, endereco, 0, salario);
                try{
                    PessoaTxt.salvarPessoa(novoDiretor);
                } catch(IOException i){
                    System.out.println("Erro: Diretor não salvo");
                }
                System.out.println(novoDiretor.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Diretor " + nome + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Diretor");
        frame.setContentPane((new CadastroDiretorUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
