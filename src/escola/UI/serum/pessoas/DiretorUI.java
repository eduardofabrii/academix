package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.pessoas.Bibliotecario;
import escola.pessoas.Diretor;
import escola.pessoas.Funcionario;
import escola.pessoas.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiretorUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton gerenciarProfsButton;
    private JButton avaliarDesTurmaButton;
    private JButton reuniaoButton;
    private JButton gerenciarAlunosButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton relatorioGeralButton;
    private JComboBox  diretorComboBox;
    private JButton atualizarButton;
    private ArrayList<Diretor> diretores = new GerenciarDadosPessoas().getDiretores();

    Escola escola = new Escola();

    public DiretorUI() {

        gerenciarProfsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibindo lista de funcionários (professores)
                StringBuilder listaFuncionarios = new StringBuilder();
                for (Funcionario f : escola.getFuncionarios()) {
                    listaFuncionarios.append(f.getNome()).append("\n");
                }
                JOptionPane.showMessageDialog(painelPrincipal, listaFuncionarios.toString(), "Funcionários", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        gerenciarAlunosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibindo lista de alunos
                StringBuilder listaAlunos = new StringBuilder();
                for (Pessoa p : escola.getAlunos()) {
                    listaAlunos.append(p.getNome()).append("\n");
                }
                JOptionPane.showMessageDialog(painelPrincipal, listaAlunos.toString(), "Alunos", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarComboBox();
                JOptionPane.showMessageDialog(painelPrincipal, "Lista de Diretor atualizada.");
            }
        });

        // Adiciona os alunos à escola e popula o ComboBox inicialmente
        for (Diretor d : diretores) {
            escola.adicionarDiretor(d);
        }
        atualizarComboBox();

        avaliarDesTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqui você pode implementar a lógica de avaliação de desempenho da turma
                JOptionPane.showMessageDialog(painelPrincipal, "Avaliação de desempenho da turma", "Avaliar Desempenho", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        reuniaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exemplo de reunião, você pode adaptar conforme necessário
                JOptionPane.showMessageDialog(painelPrincipal, "Reunião agendada", "Reunião", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        relatorioGeralButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Gerando relatório geral simples
                String relatorio = "Relatório Geral da Escola:\n";
                relatorio += "Total de Funcionários: " + escola.getFuncionarios().size() + "\n";
                relatorio += "Total de Alunos: " + escola.getAlunos().size() + "\n";
                JOptionPane.showMessageDialog(painelPrincipal, relatorio, "Relatório Geral", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }


    private void atualizarComboBox() {
        diretorComboBox.removeAllItems();
        for (Diretor diretor: diretores) {
            diretorComboBox.addItem(diretor.getNome());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela do Diretor");
        frame.setContentPane(new DiretorUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
