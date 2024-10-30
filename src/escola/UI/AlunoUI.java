package escola.UI;

import javax.swing.*;

public class AlunoUI {
    JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton calcularMediaButton;
    private JButton consultarFrequenciaButton;
    private JButton visualizarBoletimButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel alunoLabel;
    private JButton consultarTurmaButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela do Aluno");
        frame.setContentPane((new AlunoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
