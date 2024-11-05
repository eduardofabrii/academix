package escola.UI.serum.pessoas;

import escola.UI.cadastro.outros.CadastroLivroUI;
import escola.administracao.Escola;
import escola.biblioteca.Biblioteca;
import escola.biblioteca.Livro;
import escola.pessoas.Bibliotecario;
import escola.pessoas.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BibliotecarioUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton adicionarLivroButton;
    private JButton atualizarLivroButton;
    private JButton realizarEmprestimoButton;
    private JButton removerLivroButton;
    private JButton buscarLivroButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton receberDevolucaoButton;
    private JButton consultarEmprestimoButton;
    private JButton gerarRelatorioButton;

    Biblioteca biblioteca = new Biblioteca();
    Bibliotecario bibliotecario = new Bibliotecario();
    Escola escola = new Escola();

    public BibliotecarioUI() {
        adicionarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém informações do livro
                String titulo = JOptionPane.showInputDialog(painelPrincipal, "Digite o título do livro:");
                String autor = JOptionPane.showInputDialog(painelPrincipal, "Digite o autor do livro:");
                int anoPublicado;

                try {
                    anoPublicado = Integer.parseInt(JOptionPane.showInputDialog(painelPrincipal, "Digite o ano de publicação:"));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Ano de publicação inválido.");
                    return; // Sai do método se o ano for inválido
                }

                // Cria uma nova instância do livro
                Livro livroExistente = new Livro(titulo, autor, anoPublicado);

                // Adiciona o livro à biblioteca
                biblioteca.adicionarLivro(livroExistente);

                System.out.println(livroExistente.toString());

                JOptionPane.showMessageDialog(painelPrincipal, "Livro adicionado com sucesso!");
            }
        });

        // Implementação do botão para remover livro
        removerLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tituloRemover = JOptionPane.showInputDialog(painelPrincipal, "Digite o título do livro a ser removido:");

                Livro livroRemover = biblioteca.buscarLivroPorTitulo(tituloRemover);
                if (livroRemover != null) {
                    biblioteca.removerLivro(livroRemover);
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro \"" + tituloRemover + "\" removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro não encontrado!");
                }
            }
        });

        atualizarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tituloAntigo = JOptionPane.showInputDialog(painelPrincipal, "Digite o título do livro a ser atualizado:");

                Livro livro = biblioteca.buscarLivroPorTitulo(tituloAntigo);
                if (livro != null) {
                    // Solicita novas informações
                    String novoTitulo = JOptionPane.showInputDialog(painelPrincipal, "Digite o novo título (ou deixe vazio para não alterar):");
                    String novoAutor = JOptionPane.showInputDialog(painelPrincipal, "Digite o novo autor (ou deixe vazio para não alterar):");
                    String anoPublicacaoStr = JOptionPane.showInputDialog(painelPrincipal, "Digite o novo ano de publicação (ou deixe vazio para não alterar):");

                    // Atualiza as informações do livro
                    if (!novoTitulo.trim().isEmpty()) {
                        livro.setTitulo(novoTitulo);
                    }
                    if (!novoAutor.trim().isEmpty()) {
                        livro.setAutor(novoAutor);
                    }
                    if (!anoPublicacaoStr.trim().isEmpty()) {
                        try {
                            int novoAno = Integer.parseInt(anoPublicacaoStr);
                            livro.setAnoPublicado(novoAno);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(painelPrincipal, "Ano de publicação inválido.");
                        }
                    }

                    JOptionPane.showMessageDialog(painelPrincipal, "Livro atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro não encontrado!");
                }
            }
        });

        consultarEmprestimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém a lista de livros emprestados da biblioteca
                ArrayList<Livro> livrosEmprestados = biblioteca.getLivrosEmprestados();

                // Verifica se existem livros emprestados
                if (livrosEmprestados.isEmpty()) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Não há livros emprestados.");
                    return;
                }

                // Cria uma StringBuilder para armazenar a lista de livros emprestados
                StringBuilder emprestimos = new StringBuilder("Livros emprestados:\n");

                // Adiciona informações de cada livro emprestado à StringBuilder
                for (Livro livro : livrosEmprestados) {
                    emprestimos.append(livro.toString()).append("\n"); // Certifique-se que o método toString() está definido na classe Livro
                }

                // Mostra a lista de livros emprestados em um JOptionPane
                JOptionPane.showMessageDialog(painelPrincipal, emprestimos.toString());
            }
        });


        buscarLivroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicita ao usuário o título do livro que deseja buscar
                String titulo = JOptionPane.showInputDialog(painelPrincipal, "Digite o título do livro que deseja buscar:");

                // Busca o livro na biblioteca pelo título
                Livro livroEncontrado = biblioteca.buscarLivroPorTitulo(titulo);

                // Verifica se o livro foi encontrado
                if (livroEncontrado != null) {
                    // Exibe as informações do livro encontrado
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro encontrado:\n" + livroEncontrado.toString());
                } else {
                    // Informa que o livro não foi encontrado
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro não encontrado.");
                }
            }
        });

        gerarRelatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cria um StringBuilder para construir o relatório
                StringBuilder relatorio = new StringBuilder("Relatório de Livros:\n\n");

                // Adiciona os livros do catálogo da biblioteca ao relatório
                for (Livro livro : biblioteca.getCatalogo()) {
                    relatorio.append("Título: ").append(livro.getTitulo())
                            .append("\nAutor: ").append(livro.getAutor())
                            .append("\nAno de Publicação: ").append(livro.getAnoPublicado())
                            .append("\n\n");
                }

                // Mostra o relatório em um JOptionPane
                JOptionPane.showMessageDialog(painelPrincipal, relatorio.toString(), "Relatório de Livros", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        realizarEmprestimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicita o título do livro que será emprestado
                String titulo = JOptionPane.showInputDialog(painelPrincipal, "Digite o título do livro a ser emprestado:");
                // Solicita o nome do usuário que está pegando o livro emprestado
                String nomeUsuario = JOptionPane.showInputDialog(painelPrincipal, "Digite o nome do usuário:");

                // Busca o livro pelo título
                Livro livro = biblioteca.buscarLivroPorTitulo(titulo);
                if (livro == null) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Livro não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return; // Sai do método se o livro não for encontrado
                }

                // Aqui você pode ter um método para encontrar o usuário pela sua identificação (nome, CPF, etc.)
                // Supondo que você tenha uma classe Pessoa que representa o usuário
                Pessoa usuario = escola.buscarPessoaPorNome(nomeUsuario); // Implemente esse método conforme necessário

                if (usuario == null) {
                    JOptionPane.showMessageDialog(painelPrincipal, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return; // Sai do método se o usuário não for encontrado
                }

                // Realiza o empréstimo
                bibliotecario.realizarEmprestimo(titulo, usuario);
                JOptionPane.showMessageDialog(painelPrincipal, "Empréstimo realizado com sucesso!");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bibliotecário");
        frame.setContentPane(new BibliotecarioUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}