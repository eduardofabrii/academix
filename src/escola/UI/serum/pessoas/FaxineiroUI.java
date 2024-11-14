package escola.UI.serum.pessoas;

import escola.pessoas.Faxineiro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaxineiroUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JButton reportarButton;
    private JButton relatorioGeralButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JComboBox faxineiroComboBox;
    private JButton atualizarButton;

    Faxineiro faxineiro = new Faxineiro();

    public FaxineiroUI() {
        reportarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String problema = JOptionPane.showInputDialog(painelPrincipal, "Descreva o problema de manutenção:");
                if (problema != null && !problema.trim().isEmpty()) {
                    faxineiro.reportarProblemasDeManutencao(problema); // Reporta o problema
                    JOptionPane.showMessageDialog(painelPrincipal, "Problema reportado: " + problema, "Problema Reportado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Por favor, descreva um problema válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Ação para gerar o relatório geral dos problemas reportados
        relatorioGeralButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder relatorio = new StringBuilder();
                if (faxineiro.getProblemasReportados().isEmpty()) {
                    relatorio.append("Nenhum problema reportado até o momento.");
                } else {
                    relatorio.append("Problemas reportados pelo Faxineiro: \n");
                    for (String problema : faxineiro.getProblemasReportados()) {
                        relatorio.append("- ").append(problema).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(painelPrincipal, relatorio.toString(), "Relatório de Problemas", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Faxineiro");
        frame.setContentPane(new FaxineiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(650, 300);
        frame.setVisible(true);
    }
}
