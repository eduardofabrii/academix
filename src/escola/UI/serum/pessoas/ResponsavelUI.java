package escola.UI.serum.pessoas;

import javax.swing.*;

public class ResponsavelUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton visualizarBoletimButton;
    private JButton adicionarAlunoButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton calcularMediaButton;
    private JComboBox responsavelComboBox;
    private JButton atualizarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Escola Principal");
        frame.setContentPane((new ResponsavelUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
