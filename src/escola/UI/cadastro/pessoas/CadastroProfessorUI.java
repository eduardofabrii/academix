package escola.UI.cadastro.pessoas;

import escola.pessoas.Professor;
import escola.minibanco.GerenciadorProfessores;
import escola.UI.cadastro.outros.CadastroDisciplinaUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CadastroProfessorUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton cadastrarProfessor;
    private JTextField nomeTextField;
    private JTextField cpfTextField;
    private JTextField nascTextField;
    private JTextField enderecTextField;
    private JTextField salarioTextField;

    private CadastroDisciplinaUI cadastroDisciplinaUI; // Referência ao CadastroDisciplinaUI

    public CadastroProfessorUI(CadastroDisciplinaUI cadastroDisciplinaUI) {
        this.cadastroDisciplinaUI = cadastroDisciplinaUI;  // Agora o cadastroDisciplinaUI é inicializado corretamente

        cadastrarProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                LocalDate dataNascimento = LocalDate.parse(nascTextField.getText());
                String endereco = enderecTextField.getText();
                double salario = Double.parseDouble(salarioTextField.getText());

                Professor novoProfessor = new Professor(nome, cpf, dataNascimento, endereco, 0, salario);

                // Adiciona o novo professor à lista de professores
                GerenciadorProfessores.getInstance().adicionarProfessor(novoProfessor);

                // Atualiza o JComboBox na CadastroDisciplinaUI
                cadastroDisciplinaUI.atualizarComboBox();  // Aqui o método já vai ser chamado corretamente

                System.out.println(novoProfessor.exibirInformacoes());

                JOptionPane.showMessageDialog(null, "Professor " + nome + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        // Cria a tela de cadastro de disciplina
        CadastroDisciplinaUI cadastroDisciplinaUI = new CadastroDisciplinaUI();

        // Passa a instância do CadastroDisciplinaUI para o CadastroProfessorUI
        CadastroProfessorUI cadastroProfessorUI = new CadastroProfessorUI(cadastroDisciplinaUI);

        JFrame frame = new JFrame("Tela de Cadastro Professor");
        frame.setContentPane(cadastroProfessorUI.painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}