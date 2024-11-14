package escola.UI.serum.entrada;

import escola.UI.cadastro.outros.CadastroDisciplinaUI;
import escola.UI.cadastro.outros.CadastroLivroUI;
import escola.UI.cadastro.outros.CadastroSalaUI;
import escola.UI.cadastro.outros.CadastroTurmaUI;
import escola.UI.cadastro.pessoas.CadastroAlunoUI;
import escola.UI.cadastro.pessoas.CadastroFuncionariosUI;
import escola.pessoas.Professor;
import escola.sala.SalaAula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JLabel professorLabel;
    private JButton alunoButton;
    private JLabel alunoLabel;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JButton disciplinaButton;
    private JButton salaButton;
    private JButton livroButton;
    private JButton turmaButton;

    public CadastroUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroFuncionariosUI();
            }
        });

        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroAluno();
            }
        });

        disciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroDisciplinas();
            }
        });

        salaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroSala();
            }
        });

        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroLivro();
            }
        });

        turmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               abrirCadastroTurma();
            }
        });
    }

    public static void abrirCadastroFuncionariosUI() {
        JFrame frame = new JFrame("Tela de Cadastro Funcionarios");
        frame.setContentPane((new CadastroFuncionariosUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(450, 550);
        frame.setVisible(true);
    }

    public static void abrirCadastroSala() {
        JFrame frame = new JFrame("Cadastro de Sala");
        frame.setContentPane(new CadastroSalaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroAluno() {
        JFrame frame = new JFrame("Tela de Cadastro Aluno");
        frame.setContentPane(new CadastroAlunoUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroDisciplinas() {
        JFrame frame = new JFrame("Tela de Cadastro de Disciplina");
        frame.setContentPane(new CadastroDisciplinaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroTurma() {
        JFrame frame = new JFrame("Cadastro de Turma");
        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void abrirCadastroLivro() {
        JFrame frame = new JFrame("Cadastro de Livro");
        frame.setContentPane(new CadastroLivroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastros");
        frame.setContentPane((new CadastroUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 450);
        frame.setVisible(true);
    }
}
