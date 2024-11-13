package escola.UI.cadastro.outros;

import escola.sala.SalaAula;
import escola.UI.gerenciadores.GerenciadorSalas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroSalaUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarSalaButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField nomeSalaTextField;
    private JTextField capacidadeSalaTextField;
    private JTextField idSalaTextField;

    public CadastroSalaUI() {
        // Atualiza o campo de ID com o próximo ID disponível
        atualizarIdSala();

        // Adicionando funcionalidade ao botão de cadastro de sala
        cadastrarSalaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Pega os dados inseridos nos campos de texto
                    String nomeSala = nomeSalaTextField.getText();
                    int capacidade = Integer.parseInt(capacidadeSalaTextField.getText());

                    if (nomeSala.isEmpty() || capacidade <= 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira um nome válido e uma capacidade positiva.");
                        return;
                    }

                    // Cria uma nova SalaAula com o ID incrementado automaticamente
                    SalaAula novaSala = new SalaAula(
                            GerenciadorSalas.getInstance().getListaSalas().size() + 1,
                            nomeSala,
                            capacidade
                    );

                    // Exibe o nome da sala criada para debug
                    System.out.println("Sala criada: " + novaSala.getNome());

                    // Adiciona a nova sala ao GerenciadorSalas
                    GerenciadorSalas.getInstance().adicionarSala(novaSala);

                    // Exibe uma mensagem de sucesso
                    JOptionPane.showMessageDialog(null, "Sala " + nomeSala + " cadastrada com sucesso!");

                    // Limpa os campos de texto
                    nomeSalaTextField.setText("");
                    capacidadeSalaTextField.setText("");
                    atualizarIdSala(); // Atualiza o ID após cada cadastro
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Capacidade deve ser um número válido.");
                }
            }
        });
    }

    // Método para atualizar o campo ID da sala
    private void atualizarIdSala() {
        // Garantir que o ID está correto
        idSalaTextField.setText(String.valueOf(GerenciadorSalas.getInstance().getListaSalas().size() + 1));
        idSalaTextField.setEditable(false); // Torna o campo de ID não editável
    }

    public static void main(String[] args) {
        // Cria a tela de cadastro de sala
        CadastroSalaUI cadastroSalaUI = new CadastroSalaUI();

        JFrame frame = new JFrame("Cadastro de Sala");
        frame.setContentPane(cadastroSalaUI.painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
