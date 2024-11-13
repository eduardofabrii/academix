package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.pessoas.Professor;
import escola.minibanco.GerenciadorProfessores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroDisciplinaUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarDisciplinaButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JTextField nomeTextField;
    private JTextField cargaHorariaTextField;
    private JComboBox<Professor> professorComboBox;
    private JTextField salaAulaTextField;
    private JLabel professorLabel1;
    private JLabel salaDeAulaNullLabel;
    private JLabel cargaHoráriaLabel;
    private JLabel nomeLabel;

    public CadastroDisciplinaUI() {
        // Atualiza o JComboBox com a lista de professores inicial
        atualizarComboBox();

        cadastrarDisciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                int cargaHoraria = Integer.parseInt(cargaHorariaTextField.getText());
                Professor professor = (Professor) professorComboBox.getSelectedItem();

                Disciplina novaDisciplina = new Disciplina(nome, cargaHoraria, professor);

                System.out.println(novaDisciplina.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Disciplina " + nome + " cadastrada com sucesso!");

                nomeTextField.setText("");
                cargaHorariaTextField.setText("");
                professorComboBox.setSelectedIndex(0);
            }
        });
    }

    // Método que atualiza o JComboBox com os professores
    public void atualizarComboBox() {
        // Limpa os itens existentes no combo box
        professorComboBox.removeAllItems();

        // Preenche o combo box com os professores da lista
        for (Professor professor : GerenciadorProfessores.getInstance().getListaProfessores()) {
            professorComboBox.addItem(professor);
        }
    }

    public static void main(String[] args) {
        // Cria a tela de cadastro de disciplina
        CadastroDisciplinaUI cadastroDisciplinaUI = new CadastroDisciplinaUI();

        JFrame frame = new JFrame("Tela de Cadastro de Disciplina");
        frame.setContentPane(cadastroDisciplinaUI.painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
