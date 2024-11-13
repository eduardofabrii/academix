package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.pessoas.Professor;
import escola.sala.SalaAula;
import escola.UI.gerenciadores.GerenciadorProfessores;
import escola.UI.gerenciadores.GerenciadorSalas;

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

                // Verifica se professor ou sala são nulos
                if (professor == null) {
                    JOptionPane.showMessageDialog(null, "Selecione um professor válido.");
                    return;
                }
                if (sala == null) {
                    JOptionPane.showMessageDialog(null, "Selecione uma sala válida.");
                    return;
                }

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
        // Atualiza os JComboBox com os professores e salas
        atualizarComboBoxProfessores();
        atualizarComboBoxSalas();
    }

    public void atualizarComboBoxSalas() {
        salaComboBox.removeAllItems();
        var salas = GerenciadorSalas.getInstance().getListaSalas();
        if (salas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há salas cadastradas. Por favor, cadastre uma sala primeiro.");
            return;
        }
        for (SalaAula sala : salas) {
            salaComboBox.addItem(sala);
        }
    }

    public void atualizarComboBoxProfessores() {
        professorComboBox.removeAllItems();
        var professores = GerenciadorProfessores.getInstance().getListaProfessores();
        if (professores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há professores cadastrados. Por favor, cadastre um professor primeiro.");
            return;
        }
        for (Professor professor : professores) {
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
