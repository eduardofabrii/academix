package escola.interfaceSwingUI;

import javax.swing.*;

public class CadastroUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JButton alunoButton;
    private JLabel alunoLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastros");
        frame.setContentPane((new CadastroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(900, 450);
        frame.setVisible(true);
    }
}
