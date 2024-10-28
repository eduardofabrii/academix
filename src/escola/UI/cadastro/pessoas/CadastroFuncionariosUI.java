package escola.UI.cadastro.pessoas;

import javax.swing.*;

public class CadastroFuncionariosUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro dos Funcionarios");
        frame.setContentPane((new CadastroFuncionariosUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 450);
        frame.setVisible(true);
    }
}
