package escola.UI.cadastro.pessoas;

import escola.UI.cadastro.outros.CadastroDisciplinaUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFuncionariosUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JButton diretorButton;
    private JButton pedagogoButton;
    private JButton secretarioButton;
    private JButton merendeiroButton;
    private JButton porteiroButton;
    private JButton bibliotecarioButton;
    private JButton faxineiroButton;

    public CadastroFuncionariosUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroProfessor();
            }
        });

        faxineiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroFaxineiro();
            }
        });

        pedagogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                abrirCadastroPedagogo();
            }
        });

        secretarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroSecretario();
            }
        });

        merendeiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroMerendeiro();
            }
        });

        bibliotecarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroBibliotecario();
            }
        });

        diretorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroDiretor();
            }
        });

        porteiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroPorteiro();
            }
        });

    }

    public static void abrirCadastroProfessor() {
        JFrame frame = new JFrame("Tela de Cadastro Professor");
        frame.setContentPane(new CadastroProfessorUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroFaxineiro() {
        JFrame frame = new JFrame("Tela de Cadastro Faxineiro");
        frame.setContentPane((new CadastroFaxineiroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroPedagogo() {
        JFrame frame = new JFrame("Tela de Cadastro Pedagogo");
        frame.setContentPane((new CadastroPedagogoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroSecretario() {
        JFrame frame = new JFrame("Tela de Cadastro Secretario");
        frame.setContentPane((new CadastroSecretarioUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroMerendeiro() {
        JFrame frame = new JFrame("Tela de Cadastro Merendeiro");
        frame.setContentPane((new CadastroMerendeiroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroDiretor() {
        JFrame frame = new JFrame("Tela de Cadastro Diretor");
        frame.setContentPane((new CadastroDiretorUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroBibliotecario() {
        JFrame frame = new JFrame("Tela de Cadastro Bibliotecario");
        frame.setContentPane((new CadatroBibliotecarioUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroPorteiro() {
        JFrame frame = new JFrame("Tela de Cadastro Porteiro");
        frame.setContentPane((new CadastroPorteiroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Funcionarios");
        frame.setContentPane((new CadastroFuncionariosUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 600);
        frame.setVisible(true);
    }
}
