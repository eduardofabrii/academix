package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.pessoas.Aluno;
import escola.pessoas.Pedagogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedagogoUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton consultarDesempenhoButton;
    private JComboBox pedagogoComboBox;
    private JButton atualizarButton;

    Pedagogo pedagogo = new Pedagogo();
    Escola escola = new Escola();

    public PedagogoUI() {
        consultarDesempenhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar o nome do aluno para consultar o desempenho
                String nomeAluno = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do aluno:");
                if (nomeAluno != null && !nomeAluno.trim().isEmpty()) {
                    // Usar o método da Escola para buscar o aluno pelo nome
                    Aluno aluno = escola.buscarAlunoPorNome(nomeAluno); // Método de busca na Escola
                    if (aluno != null) {
                        pedagogo.consultarDesempenhoAluno(aluno); // Chama o método da classe Pedagogo
                        JOptionPane.showMessageDialog(painelPrincipal, "Desempenho do aluno " + aluno.getNome() + " exibido no console.");
                    } else {
                        JOptionPane.showMessageDialog(painelPrincipal, "Aluno não encontrado.");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pedagogo");
        frame.setContentPane(new PedagogoUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 325);
        frame.setVisible(true);
    }
}
