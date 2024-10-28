package escola.interfaceSwingUI;

import javax.swing.*;

public class CadastroMerendeiroUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarProfessor;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Merendeiro");
        frame.setContentPane((new CadastroMerendeiroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
