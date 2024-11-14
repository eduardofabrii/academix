package escola.UI;

import escola.UI.cadastro.pessoas.CadastroFuncionariosUI;
import escola.UI.serum.entrada.CadastroUI;
import escola.UI.serum.entrada.EntrarComoUI;
import escola.administracao.Escola;

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
        frame.setSize(900, 450);
        frame.setVisible(true);
    }

    public static void cadastros() {
        JFrame frame = new JFrame("Tela de Cadastros");
        frame.setContentPane((new CadastroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(1100, 450);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Escola Principal");
        frame.setContentPane((new EscolaPrincipalUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
