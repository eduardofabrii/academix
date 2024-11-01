package escola.UI.serum.entrada;

import escola.UI.cadastro.pessoas.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFuncionariosUI {
    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JButton faxineiroButton;
    private JButton pedagogoButton;
    private JButton secretarioButton;
    private JButton merendeiroButton;
    private JButton bibliotecarioButton;
    private JButton diretorButton;
    private JButton porteiroButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;

    public CadastroFuncionariosUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        faxineiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        pedagogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        secretarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        merendeiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        bibliotecarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        diretorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        porteiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Funcionarios");
        frame.setContentPane((new escola.UI.cadastro.pessoas.CadastroFuncionariosUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 600);
        frame.setVisible(true);
    }
}

