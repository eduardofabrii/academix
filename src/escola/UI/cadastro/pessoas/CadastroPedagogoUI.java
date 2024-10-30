package escola.UI.cadastro.pessoas;

import javax.swing.*;

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
