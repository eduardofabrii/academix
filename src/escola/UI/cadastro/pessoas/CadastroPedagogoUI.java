package escola.UI.cadastro.pessoas;

import escola.pessoas.Pedagogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CadastroPedagogoUI {
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
    private JTextField salarioTextField;
    private JTextField nomeTextField;
    private JButton cadastrarProfessor;
    private JTextField textField1;

//    public CadastroPedagogoUI() {
//        cadastrarButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nome = nomeTextField.getText();
//                String cpf = cpfTextField.getText();
//                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());
//                String endereco = enderecTextField.getText();
//                double salario = Double.parseDouble(salarioTextField.getText());
//
//                Pedagogo novoPedagogo = new Pedagogo(nome, cpf, dataNascimento, endereco, 0, salario);
//                try{
//                    PessoaTxt.salvarPessoa(novoPedagogo);
//                } catch(IOException i){
//                    System.out.println("Erro: Pedagogo não salvo");
//                }
//
//                System.out.println(novoPedagogo.exibirInformacoes());
//
//                JOptionPane.showMessageDialog(null, "Pedagogo " + nome + " cadastrado com sucesso!");
//            }
//        });
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Pedagogo");
        frame.setContentPane((new CadastroPedagogoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
