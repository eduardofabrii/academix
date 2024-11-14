package escola.UI.cadastro.outros;

import escola.biblioteca.Biblioteca;
import escola.biblioteca.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CadastroLivroUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton cadastrarLivroButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JTextField tituloTextField;
    private JTextField autorTextField;
    private JTextField anoPublicacaoTextField;

    private Biblioteca biblioteca = new Biblioteca();

    public CadastroLivroUI() {
        cadastrarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = tituloTextField.getText();
                String autor = autorTextField.getText();
                int anoPublicacao;

                try {
                    anoPublicacao = Integer.parseInt(anoPublicacaoTextField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ano de publicação deve ser um número.");
                    return;
                }

                Livro novoLivro = new Livro(titulo, autor, anoPublicacao);

                biblioteca.adicionarLivro(novoLivro);

                System.out.println(novoLivro.toString());

                JOptionPane.showMessageDialog(null, "Livro \"" + titulo + "\" cadastrado com sucesso!");

                tituloTextField.setText("");
                autorTextField.setText("");
                anoPublicacaoTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Livro");
        frame.setContentPane(new CadastroLivroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
