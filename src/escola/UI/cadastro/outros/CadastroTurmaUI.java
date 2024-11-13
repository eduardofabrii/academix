package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
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
    private JComboBox<Disciplina> disciplinaComboBox;  // Novo JComboBox para as disciplinas

    public CadastroTurmaUI() {
        // Inicializa o JComboBox com as turmas existentes
        turmaComboBox = new JComboBox<>(); // Inicializa o JComboBox de turmas
        disciplinaComboBox = new JComboBox<>(); // Inicializa o JComboBox de disciplinas

        // Verifica se o JComboBox foi inicializado corretamente
        if (turmaComboBox == null) {
            System.out.println("Erro: turmaComboBox não foi inicializado.");
        } else {
            // Atualiza as turmas quando a interface é inicializada
            atualizarComboBoxTurmas();
        }

        // Adicionando listener no JComboBox para exibir as disciplinas da turma selecionada
        turmaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Turma turmaSelecionada = (Turma) turmaComboBox.getSelectedItem();
                if (turmaSelecionada != null) {
                    System.out.println("Turma selecionada: " + turmaSelecionada.getNome());
                    // Atualiza o JComboBox de disciplinas com as disciplinas da turma selecionada
                    atualizarComboBoxDisciplinas(turmaSelecionada);
                }
            }
        });

        // ActionListener para o botão de cadastro de turma
        cadastrarTurmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Valida e cria a nova turma
                String nome = nomeTurmaTextField.getText();
                int ano = Integer.parseInt(anoTurmaTextField.getText()); // Certifique-se de que o campo de ano não está vazio

                Turma turma = new Turma(nome, ano); // Cria nova turma com o nome e ano informados

                // Adiciona a turma ao Gerenciador
                GerenciadorTurmas.getInstance().adicionarTurma(turma);

                // Atualiza o JComboBox com a nova turma
                atualizarComboBoxTurmas();

                // Exibe uma mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Turma " + nome + " cadastrada com sucesso!");
                nomeTurmaTextField.setText("");
                anoTurmaTextField.setText("");
            }
        });
    }

    // Atualiza o JComboBox com as turmas do Gerenciador
    private void atualizarComboBoxTurmas() {
        turmaComboBox.removeAllItems();  // Remove todos os itens atuais
        if (GerenciadorTurmas.getInstance().getListaTurmas().isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
        } else {
            for (Turma turma : GerenciadorTurmas.getInstance().getListaTurmas()) {
                System.out.println("Turma adicionada ao comboBox: " + turma.getNome());
                turmaComboBox.addItem(turma);  // Adiciona as turmas no JComboBox
            }
        }
    }

    // Atualiza o JComboBox de disciplinas com as disciplinas da turma selecionada
    private void atualizarComboBoxDisciplinas(Turma turma) {
        disciplinaComboBox.removeAllItems(); // Remove todas as disciplinas antigas
        if (turma != null) {
            if (turma.getListaDisciplinas().isEmpty()) {
                System.out.println("A turma selecionada não tem disciplinas.");
            } else {
                System.out.println("Adicionando disciplinas da turma selecionada.");
                for (Disciplina disciplina : turma.getListaDisciplinas()) {
                    System.out.println("Adicionando disciplina ao comboBox: " + disciplina.getNome());
                    disciplinaComboBox.addItem(disciplina); // Adiciona as disciplinas da turma
                }
            }
        }
    }

    public static void main(String[] args) {
        // Configura o JFrame e a interface gráfica
        JFrame frame = new JFrame("Cadastro de Turma");
        frame.setContentPane(new CadastroTurmaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
