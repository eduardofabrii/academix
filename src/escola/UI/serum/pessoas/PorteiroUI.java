package escola.UI.serum.pessoas;

import escola.administracao.Escola;
import escola.minibanco.pessoa.GerenciarDadosPessoas;
import escola.pessoas.Merendeiro;
import escola.pessoas.Pessoa;
import escola.pessoas.Porteiro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PorteiroUI {
    public JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton registrarEntradaButton;
    private JButton registrarSaidaButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JLabel professorLabel;
    private JButton consultarRegistroEntradaButton;
    private JButton consultarRegistroSaidaButton;
    private JButton reportarOcorrenciaButton;
    private ArrayList<Porteiro> porteiros = new GerenciarDadosPessoas().getPorteiros();
    private JComboBox porteiroComboBox;
    private JButton atualizarButton;

    Porteiro porteiro = new Porteiro();
    Escola escola = new Escola();

    public PorteiroUI() {
        registrarEntradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar dados de entrada (exemplo: nome da pessoa)
                String nomePessoa = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome da pessoa que entrou:");
                if (nomePessoa != null && !nomePessoa.trim().isEmpty()) {
                    Pessoa pessoa = new Pessoa(nomePessoa); // Criando uma nova Pessoa (assumindo que o construtor de Pessoa aceita o nome)
                    porteiro.registrarEntrada(pessoa); // Registra a entrada
                    JOptionPane.showMessageDialog(painelPrincipal, "Entrada registrada para: " + nomePessoa);
                }
            }
        });

        registrarSaidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar dados de saída (exemplo: nome da pessoa)
                String nomePessoa = JOptionPane.showInputDialog(painelPrincipal, "Informe o nome da pessoa que saiu:");
                if (nomePessoa != null && !nomePessoa.trim().isEmpty()) {
                    Pessoa pessoa = new Pessoa(nomePessoa); // Criando uma nova Pessoa
                    porteiro.registrarSaida(pessoa); // Registra a saída
                    JOptionPane.showMessageDialog(painelPrincipal, "Saída registrada para: " + nomePessoa);
                }
            }
        });

        consultarRegistroEntradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Consultar registros de entrada
                List<Pessoa> entradas = porteiro.consultarRegistroEntrada();
                StringBuilder registro = new StringBuilder("Registros de entrada:\n");
                for (Pessoa pessoa : entradas) {
                    registro.append(pessoa.getNome()).append("\n");
                }
                JOptionPane.showMessageDialog(painelPrincipal, registro.toString());
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarComboBox();
                JOptionPane.showMessageDialog(painelPrincipal, "Lista de Porteiro atualizada.");
            }
        });

        // Adiciona os alunos à escola e popula o ComboBox inicialmente
        for (Porteiro p : porteiros) {
            escola.adicionarPorteiro(p);
        }
        atualizarComboBox();

        consultarRegistroSaidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Consultar registros de saída
                List<Pessoa> saidas = porteiro.consultarRegistroSaida();
                StringBuilder registro = new StringBuilder("Registros de saída:\n");
                for (Pessoa pessoa : saidas) {
                    registro.append(pessoa.getNome()).append("\n");
                }
                JOptionPane.showMessageDialog(painelPrincipal, registro.toString());
            }
        });

        reportarOcorrenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar descrição da ocorrência
                String ocorrencia = JOptionPane.showInputDialog(painelPrincipal, "Informe a descrição da ocorrência:");
                if (ocorrencia != null && !ocorrencia.trim().isEmpty()) {
                    porteiro.reportarOcorrencia(ocorrencia); // Registra a ocorrência
                    JOptionPane.showMessageDialog(painelPrincipal, "Ocorrência registrada.");
                }
            }
        });
    }

    private void atualizarComboBox() {
        porteiroComboBox.removeAllItems();
        for (Porteiro porteiro: porteiros) {
            porteiroComboBox.addItem(porteiro.getNome());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Porteiro");
        frame. setContentPane(new PorteiroUI().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(500, 325);
        frame.setVisible(true);
    }
}
