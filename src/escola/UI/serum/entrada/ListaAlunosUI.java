package escola.UI.serum.entrada;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaAlunosUI {
    private JPanel painelPrincipal;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;
    private JList<String> listaAlunos;
    private JComboBox<String> comboBoxTurmas;

    public ListaAlunosUI(List<String> turmas, List<String> alunos) {
        // Define a cor principal azul
        Color azulClaro = new Color(173, 216, 230);
        Color azulEscuro = new Color(0, 102, 204);

        // Inicializa o painel principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout());
        painelPrincipal.setBackground(azulClaro);

        // Cria o painel do título e adiciona o JComboBox de turmas
        painelTitulo = new JPanel();
        painelTitulo.setBackground(azulEscuro);
        escolhasLabel = new JLabel("Escolha a Turma: ");
        escolhasLabel.setForeground(Color.WHITE);
        comboBoxTurmas = new JComboBox<>(turmas.toArray(new String[0]));
        comboBoxTurmas.addActionListener(e -> atualizarListaAlunos(comboBoxTurmas.getSelectedItem().toString()));

        painelTitulo.add(escolhasLabel);
        painelTitulo.add(comboBoxTurmas);

        // Cria a lista de alunos e a coloca dentro de um JScrollPane
        listaAlunos = new JList<>(alunos.toArray(new String[0]));
        listaAlunos.setBackground(azulClaro);
        listaAlunos.setForeground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(listaAlunos);
        scrollPane.getViewport().setBackground(azulClaro);

        // Adiciona os componentes ao painel principal
        painelPrincipal.add(painelTitulo, BorderLayout.NORTH);
        painelPrincipal.add(scrollPane, BorderLayout.CENTER);
    }

    // Método para atualizar a lista de alunos com base na turma selecionada
    private void atualizarListaAlunos(String turmaSelecionada) {
        // Aqui você pode buscar a lista de alunos da turma selecionada.
        // Por simplicidade, vamos apenas simular uma lista diferente para cada turma.

        List<String> alunos = new ArrayList<>();
        switch (turmaSelecionada) {
            case "Turma A":
                alunos.add("Alice");
                alunos.add("André");
                break;
            case "Turma B":
                alunos.add("Bruno");
                alunos.add("Beatriz");
                break;
            case "Turma C":
                alunos.add("Carlos");
                alunos.add("Carla");
                break;
            default:
                alunos.add("Sem alunos cadastrados");
                break;
        }

        // Atualiza o JList com os alunos da turma selecionada
        listaAlunos.setListData(alunos.toArray(new String[0]));
    }

    public static void main(String[] args) {
        // Exemplo de turmas
        List<String> turmas = List.of("Turma A", "Turma B", "Turma C");

        JFrame frame = new JFrame("Lista de Alunos");
        frame.setContentPane(new ListaAlunosUI(turmas, new ArrayList<>()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // centraliza a janela
        frame.setVisible(true);
    }
}
