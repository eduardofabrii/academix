package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.pessoas.Professor;
import escola.sala.SalaAula;
import escola.minibanco.GerenciadorProfessores;
import escola.minibanco.GerenciadorSalas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JComboBox<SalaAula> salaComboBox;
    private JLabel cargaHorariaLabel;
    private JLabel nomeLabel;

    public CadastroDisciplinaUI() {
        // Inicializa os JComboBox com as listas de professores e salas
        atualizarComboBoxProfessores();
        atualizarComboBoxSalas();

        cadastrarDisciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                int cargaHoraria;

                // Tenta converter a carga horária para int
                try {
                    cargaHoraria = Integer.parseInt(cargaHorariaTextField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Insira um número válido para a carga horária.");
                    return;
                }

                Professor professor = (Professor) professorComboBox.getSelectedItem();
                SalaAula sala = (SalaAula) salaComboBox.getSelectedItem();

                // Cria a nova disciplina com os dados informados
                Disciplina novaDisciplina = new Disciplina(nome, cargaHoraria, sala, professor);

                System.out.println(novaDisciplina.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Disciplina " + nome + " cadastrada com sucesso!");

                // Limpa os campos de entrada após o cadastro
                nomeTextField.setText("");
                cargaHorariaTextField.setText("");
                professorComboBox.setSelectedIndex(0);
                salaComboBox.setSelectedIndex(0);
            }
        });
    }

    public void atualizarComboBox() {
        professorComboBox.removeAllItems();

        for (Professor professor : GerenciadorProfessores.getInstance().getListaProfessores()) {
            professorComboBox.addItem(professor);
        }
    }

    // Atualiza o JComboBox com os professores do Gerenciador
    private void atualizarComboBoxProfessores() {
        professorComboBox.removeAllItems();
        for (Professor professor : GerenciadorProfessores.getInstance().getListaProfessores()) {
            professorComboBox.addItem(professor);
        }
    }

    // Atualiza o JComboBox com as salas do Gerenciador
    private void atualizarComboBoxSalas() {
        salaComboBox.removeAllItems();
        for (SalaAula sala : GerenciadorSalas.getInstance().getListaSalas()) {
            salaComboBox.addItem(sala);
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
