package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.pessoas.Professor;
import escola.pessoas.Secretario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SecretarioUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton gerenciarMatriculaButton;
    private JButton agendarReuniaoButton;
    private JButton consultarDocumentoButton;
    private JButton atualizarInformacoesPessoaisButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton atualizarButton;
    private ArrayList<Secretario> secretarios = new GerenciarDadosPessoas().getSecretarios();
    private JComboBox secretarioCombox;

    Escola escola = new Escola();

    public SecretarioUI() {
        gerenciarMatriculaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar ao usuário o nome do aluno para gerenciar a matrícula
                String nomeAluno = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do aluno para gerenciar matrícula:");
                if (nomeAluno != null && !nomeAluno.trim().isEmpty()) {
                    // Lógica para gerenciar matrícula (exemplo simples)
                    JOptionPane.showMessageDialog(painelPrincipal, "Matrícula gerenciada para: " + nomeAluno);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Nome inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarComboBox();
                JOptionPane.showMessageDialog(painelPrincipal, "Lista de secretarios atualizada.");
            }
        });

        // Adiciona os alunos à escola e popula o ComboBox inicialmente
        for (Secretario s : secretarios) {
            escola.adicionarSecretario(s);
        }
        atualizarComboBox();

        agendarReuniaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar ao usuário o nome do participante e a data da reunião
                String nomeParticipante = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do participante:");
                String dataReuniao = JOptionPane.showInputDialog(painelPrincipal, "Informe a data da reunião (formato: DD/MM/AAAA):");

                if (nomeParticipante != null && !nomeParticipante.trim().isEmpty() && dataReuniao != null && !dataReuniao.trim().isEmpty()) {
                    // Lógica para agendar a reunião (exemplo simples)
                    JOptionPane.showMessageDialog(painelPrincipal, "Reunião agendada com " + nomeParticipante + " para o dia " + dataReuniao);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Dados inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        consultarDocumentoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar ao usuário o nome do documento a ser consultado
                String documento = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do documento a ser consultado:");

                if (documento != null && !documento.trim().isEmpty()) {
                    // Lógica para consultar o documento (exemplo simples)
                    JOptionPane.showMessageDialog(painelPrincipal, "Documento encontrado: " + documento);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Documento inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        atualizarInformacoesPessoaisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar ao usuário qual informação pessoal será atualizada
                String informacao = JOptionPane.showInputDialog(painelPrincipal, "Informe qual informação pessoal deseja atualizar (nome, endereço, etc.):");

                if (informacao != null && !informacao.trim().isEmpty()) {
                    // Lógica para atualizar a informação pessoal (exemplo simples)
                    JOptionPane.showMessageDialog(painelPrincipal, "Informação pessoal atualizada: " + informacao);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Informação inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }

    private void atualizarComboBox() {
        secretarioCombox.removeAllItems();
        for (Secretario secretario: secretarios) {
            secretarioCombox.addItem(secretario.getNome());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Secretario");
        frame.setContentPane(new SecretarioUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
