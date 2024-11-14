package escola.UI.serum.pessoas;

import escola.cantina.Produto;
import escola.pessoas.Merendeiro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class MerendeiroUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton criarMerendaButton;
    private JButton registrarEntradaDeProdutoButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton imprimirEstoqueButton;
    private JButton registrarSaidaDeProdutoButton;
    private JComboBox merendeiroComboBox;

    public MerendeiroUI() {
        criarMerendaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar o nome e a descrição do novo produto
                String nomeProduto = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do produto:");
                String descricaoProduto = JOptionPane.showInputDialog(painelPrincipal, "Informe a descrição do produto:");

//                if (nomeProduto != null && !nomeProduto.trim().isEmpty() && descricaoProduto != null && !descricaoProduto.trim().isEmpty()) {
//                    // Criar um novo produto e adicionar ao estoque
//                    Produto novoProduto = new Produto(nomeProduto, descricaoProduto, 0);
//                    Merendeiro merendeiro = new Merendeiro("Nome do Merendeiro", "CPF", LocalDate.now(), "Endereço", 123, 1500);
//                    merendeiro.criarNovoProduto(nomeProduto, descricaoProduto); // Adiciona o novo produto ao estoque
//                    JOptionPane.showMessageDialog(painelPrincipal, "Produto criado: " + nomeProduto);
//                } else {
//                    JOptionPane.showMessageDialog(painelPrincipal, "Dados inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
//                }
            }
        });

        imprimirEstoqueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exibir o estoque de produtos
//                Merendeiro merendeiro = new Merendeiro("Nome do Merendeiro", "CPF", LocalDate.now(), "Endereço", 123, 1500);
//                merendeiro.imprimirEstoque(); // Imprime o estoque de produtos no console
//                JOptionPane.showMessageDialog(painelPrincipal, "Estoque impresso no console.");
            }
        });

        registrarSaidaDeProdutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar o nome do produto para registrar a saída
                String nomeProduto = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do produto para registrar a saída:");

//                if (nomeProduto != null && !nomeProduto.trim().isEmpty()) {
//                    Produto produto = buscarProdutoPorNome(nomeProduto);
//                    if (produto != null) {
//                        Merendeiro merendeiro = new Merendeiro("Nome do Merendeiro", "CPF", LocalDate.now(), "Endereço", 123, 1500);
//                        merendeiro.registrarSaidaProduto(produto); // Registra a saída do produto
//                        JOptionPane.showMessageDialog(painelPrincipal, "Saída registrada para o produto: " + nomeProduto);
//                    } else {
//                        JOptionPane.showMessageDialog(painelPrincipal, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
            }
        });

        registrarEntradaDeProdutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar o nome do produto para registrar a entrada
                String nomeProduto = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome do produto para registrar a entrada:");

//                if (nomeProduto != null && !nomeProduto.trim().isEmpty()) {
//                    Produto produto = buscarProdutoPorNome(nomeProduto);
//                    if (produto != null) {
//                        Merendeiro merendeiro = new Merendeiro("Nome do Merendeiro", "CPF", LocalDate.now(), "Endereço", 123, 1500);
//                        merendeiro.registrarEntradaProduto(produto); // Registra a entrada do produto
//                        JOptionPane.showMessageDialog(painelPrincipal, "Entrada registrada para o produto: " + nomeProduto);
//                    } else {
//                        JOptionPane.showMessageDialog(painelPrincipal, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
            }
        });
    }

    // Método para buscar produto por nome
    private Produto buscarProdutoPorNome(String nomeProduto) {
        for (Produto p : Merendeiro.getEstoque()) {
            if (p.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Merendeiro");
        frame.setContentPane(new MerendeiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(600, 230);
        frame.setVisible(true);
    }
}

