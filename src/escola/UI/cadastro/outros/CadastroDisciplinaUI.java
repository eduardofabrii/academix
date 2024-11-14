package escola.UI.cadastro.outros;

import escola.administracao.Disciplina;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.minibanco.salas.GerenciarDadosSalas;
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
    private JButton atualizarButton;

    public CadastroDisciplinaUI() {
        // Inicializa os JComboBox com as listas de professores e salas
        for (Professor p: new GerenciarDadosPessoas().getProfessores())
            professorComboBox.addItem(p);

        for (SalaAula sa: new GerenciarDadosSalas().getSalasAula())
            salaComboBox.addItem(sa);

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

                // Verifica se professor, sala ou turma são nulos
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

                // Adiciona a disciplina à turma selecionada

                JOptionPane.showMessageDialog(null, "Disciplina " + nome + " cadastrada com sucesso!");

                // Limpa os campos de entrada após o cadastro
                nomeTextField.setText("");
                cargaHorariaTextField.setText("");
                professorComboBox.setSelectedIndex(0);
                salaComboBox.setSelectedIndex(0);

                System.out.println("Disciplina cadastrada!" + novaDisciplina.exibirInformacoes());
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tela de Cadastro de Disciplina");
        frame.setContentPane(new CadastroDisciplinaUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
