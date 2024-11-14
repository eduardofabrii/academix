package escola.UI.serum.entrada;

import escola.UI.cadastro.pessoas.CadastroPedagogoUI;
import escola.UI.serum.pessoas.*;
import escola.administracao.Escola;
import escola.pessoas.Porteiro;
import escola.pessoas.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class EntrarComoUI {
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
    private JButton alunoButton;

    public EntrarComoUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoProfessor();
            }
        });

        faxineiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoFaxineiro();
            }
        });

        pedagogoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoPedagogo();
            }
        });

        secretarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoSecretario();
            }
        });

        merendeiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoMerendeiro();
            }
        });

        bibliotecarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoBibliotecario();
            }
        });

        diretorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoDiretor();
            }
        });

        porteiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoPorteiro();
            }
        });

        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrarComoAluno();
            }
        });

    }

    public static void entrarComoProfessor() {
        JFrame frame = new JFrame("Professor");
        frame.setContentPane((new ProfessorUI().painelPrincipal));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void entrarComoBibliotecario() {
        JFrame frame = new JFrame("Bibliotecário");
        frame.setContentPane(new BibliotecarioUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }

    public static void entrarComoPedagogo() {
        JFrame frame = new JFrame("Pedagogo");
        frame.setContentPane(new PedagogoUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 225);
        frame.setVisible(true);
    }

    public static void entrarComoPorteiro() {
        JFrame frame = new JFrame("Porteiro");
        frame.setContentPane(new PorteiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 225);
        frame.setVisible(true);
    }

    public static void entrarComoFaxineiro() {
        JFrame frame = new JFrame("Faxineiro");
        frame.setContentPane(new FaxineiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void entrarComoSecretario() {
        JFrame frame = new JFrame("Secretário");
        frame.setContentPane(new SecretarioUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void entrarComoMerendeiro() {
        JFrame frame = new JFrame("Merendeiro");
        frame.setContentPane(new MerendeiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(600, 230);
        frame.setVisible(true);
    }

    public static void entrarComoDiretor() {
        JFrame frame = new JFrame("Tela do Diretor");
        frame.setContentPane(new DiretorUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void entrarComoAluno() {
        JFrame frame = new JFrame("Aluno");
        frame.setContentPane((new AlunoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Funcionarios");
        frame.setContentPane((new EntrarComoUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 600);
        frame.setVisible(true);
    }
}

