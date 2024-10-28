package escola.interfaceSwingUI;

import javax.swing.*;

public class EscolaPrincipalUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Escolhas");
        frame.setContentPane((new EscolaPrincipalUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 600);
        frame.setVisible(true);
    }
}
