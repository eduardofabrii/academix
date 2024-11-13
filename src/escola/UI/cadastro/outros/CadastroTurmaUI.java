package escola.UI.cadastro.outros;

import escola.administracao.Turma;
import escola.UI.gerenciadores.GerenciadorTurmas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTurmaUI {
    public JPanel painelPrincipal;
    private JButton cadastrarTurmaButton;
    private JTextField nomeTurmaTextField;
    private JTextField anoTurmaTextField;
    private JPanel painelTitulo;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JComboBox<Turma> turmaComboBox;

    public CadastroTurmaUI() {
        // Inicializa o JComboBox com as turmas existentes
        if (turmaComboBox == null) {
            System.out.println("Erro: turmaComboBox não foi inicializado.");
        } else {
            atualizarComboBoxTurmas();
        }

        cadastrarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTurmaTextField.getText();
                Turma turma = new Turma(nome); // Cria nova turma com o nome informado

                if (!anoTurmaTextField.getText().isEmpty()) {
                    int ano = Integer.parseInt(anoTurmaTextField.getText());
                    turma.setAno(ano);
                }

                // Adiciona a turma ao Gerenciador
                GerenciadorTurmas.getInstance().adicionarTurma(turma);

                // Atualiza o JComboBox com a nova turma
                atualizarComboBoxTurmas();

                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Turma " + nome + " cadastrada com sucesso!");
                nomeTurmaTextField.setText("");
                anoTurmaTextField.setText("");

                System.out.println(turma.toString());
            }
        });
    }

    // Atualiza o JComboBox com as turmas do Gerenciador
    private void atualizarComboBoxTurmas() {
        turmaComboBox.removeAllItems();
        for (Turma turma : GerenciadorTurmas.getInstance().getListaTurmas()) {
            turmaComboBox.addItem(turma);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Turma");
        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
