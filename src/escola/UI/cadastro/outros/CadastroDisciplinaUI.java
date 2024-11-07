package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.minibanco.disciplina.DisciplinaTxt;
import escola.pessoas.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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

    // lista de professores disponíveis
    private ArrayList<Professor> listaProfessores;

    public CadastroDisciplinaUI(ArrayList<Professor> professores) {
        this.listaProfessores = professores;

        // preenche o JComboBox com os professores
        for (Professor professor : listaProfessores) {
            professorComboBox.addItem(professor);
        }

        cadastrarDisciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                int cargaHoraria = Integer.parseInt(cargaHorariaTextField.getText());
                Professor professor = (Professor) professorComboBox.getSelectedItem();

                Disciplina novaDisciplina = new Disciplina(nome, cargaHoraria, professor);

                try{
                    DisciplinaTxt.salvarDisciplina(novaDisciplina);
                } catch (IOException i){
                    System.out.println("Erro: Disciplina não salva");
                }

                System.out.println(novaDisciplina.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Disciplina " + nome + " cadastrada com sucesso!");

                nomeTextField.setText("");
                cargaHorariaTextField.setText("");
                professorComboBox.setSelectedIndex(0);
            }
        });
    }

    public static void main(String[] args) {
        ArrayList<Professor> listaProfessores = new ArrayList<>();
        listaProfessores.add(new Professor());

        JFrame frame = new JFrame("Tela de Cadastro de Disciplina");
        frame.setContentPane(new CadastroDisciplinaUI(listaProfessores).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
