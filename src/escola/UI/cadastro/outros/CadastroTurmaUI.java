package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.administracao.Turma;
import escola.UI.gerenciadores.GerenciadorTurmas;
import escola.minibanco.administracao.GerenciarDadosAdministracao;

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
    private JComboBox<Disciplina> disciplinaComboBox;

    public CadastroTurmaUI() {
        for (Disciplina d: new GerenciarDadosAdministracao().getDisciplinas()){
            disciplinaComboBox.addItem(d);
        }

        // ActionListener para o botão de cadastro de turma
        cadastrarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Valida e cria a nova turma
                String nome = nomeTurmaTextField.getText();
                int ano = Integer.parseInt(anoTurmaTextField.getText()); // Certifique-se de que o campo de ano não está vazio

                Turma turma = new Turma(nome, ano); // Cria nova turma com o nome e ano informados

                JOptionPane.showMessageDialog(null, "Turma " + nome + " cadastrada com sucesso!");
                nomeTurmaTextField.setText("");
                anoTurmaTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Configura o JFrame e a interface gráfica
        JFrame frame = new JFrame("Cadastro de Turma");
        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
