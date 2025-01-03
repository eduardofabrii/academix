package escola.UI.cadastro.pessoas;

import escola.pessoas.Professor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

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

    public CadastroProfessorUI() {
        cadastrarProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Coleta e validação dos dados
                    String nome = nomeTextField.getText();
                    String cpf = cpfTextField.getText();
                    LocalDate dataNascimento;
                    String endereco = enderecTextField.getText();
                    double salario;

                    // Validações básicas
                    if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.");
                        return;
                    }

                    // Conversão e validação da data
                    try {
                        dataNascimento = LocalDate.parse(nascTextField.getText());
                    } catch (DateTimeParseException ex) {
                        JOptionPane.showMessageDialog(null, "Data de nascimento inválida. Use o formato AAAA-MM-DD.");
                        return;
                    }

                    // Conversão e validação do salário
                    try {
                        salario = Double.parseDouble(salarioTextField.getText());
                        if (salario < 0) {
                            JOptionPane.showMessageDialog(null, "O salário deve ser positivo.");
                            return;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Salário inválido.");
                        return;
                    }

                    // Cria o novo professor
                    Professor novoProfessor = new Professor(nome, cpf, dataNascimento, endereco, salario);

                    // Exibe mensagem de sucesso e limpa os campos
                    JOptionPane.showMessageDialog(null, "Professor " + nome + " cadastrado com sucesso!");
                    nomeTextField.setText("");
                    cpfTextField.setText("");
                    nascTextField.setText("");
                    enderecTextField.setText("");
                    salarioTextField.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar o professor: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Cadastro Professor");
        frame.setContentPane(new CadastroProfessorUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
