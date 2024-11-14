package escola.UI;

import escola.UI.serum.entrada.CadastroUI;
import escola.UI.serum.entrada.EntrarComoUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscolaPrincipalUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JButton cadastroButton;
    private JButton entrarComoButton;

    public EscolaPrincipalUI() {
        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastros();
            }
        });

        entrarComoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComo();
            }
        });
    }

    public static void entrarComo() {
        JFrame frame = new JFrame("Tela de Entrar Como");
        frame.setContentPane((new EntrarComoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(750, 500);
        frame.setVisible(true);
    }

    public static void cadastros() {
        JFrame frame = new JFrame("Tela de Cadastros");
        frame.setContentPane((new CadastroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(550, 450);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Escola Principal");
        frame.setContentPane((new EscolaPrincipalUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(600, 350);
        frame.setVisible(true);
    }
}
