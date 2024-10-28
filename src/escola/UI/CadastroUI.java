package escola.UI;

import escola.UI.cadastro.outros.CadastroDisciplinaUI;
import escola.UI.cadastro.outros.CadastroLivroUI;
import escola.UI.cadastro.outros.CadastroTurmaUI;
import escola.UI.cadastro.pessoas.CadastroAlunoUI;
import escola.UI.cadastro.pessoas.CadastroFuncionariosUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton disciplinaButton;
    private JButton turmaButton;
    private JButton livroButton;

    public CadastroUI() {
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroFuncionarios();
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
                abrirCadastroDisciplina();
            }
        });

        turmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirCadastroLivro();
            }
        });
    }

    public static void abrirCadastroFuncionarios() {
        JFrame frame = new JFrame("Tela de Cadastro Funcionarios");
        frame.setContentPane((new CadastroFuncionariosUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(900, 450);
        frame.setVisible(true);
    }

    public static void abrirCadastroAluno() {
        JFrame frame = new JFrame("Tela de Cadastro Aluno");
        frame.setContentPane(new CadastroAlunoUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(550, 450);
        frame.setVisible(true);
    }

    public static void abrirCadastroDisciplina() {
        JFrame frame = new JFrame("Tela de Cadastro Disciplina");
        frame.setContentPane(new CadastroDisciplinaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(550, 350);
        frame.setVisible(true);
    }

//    public static void abrirCadastroTurma() {
//        JFrame frame = new JFrame("Tela de Cadastro Turma");
//        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setResizable(false);
//        frame.setSize(900, 450);
//        frame.setVisible(true);
//    }

    public static void abrirCadastroLivro() {
        JFrame frame = new JFrame("Tela de Cadastro Livro");
        frame.setContentPane(new CadastroLivroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(550, 350);
        frame.setVisible(true);
    }

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
