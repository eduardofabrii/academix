package escola.UI;

import escola.pessoas.Faxineiro;
import escola.pessoas.Funcionario;
import escola.pessoas.Professor;

import javax.swing.*;
import java.time.LocalDate;

public class EscolaPrincipalUI {
    Professor professor1 = new Professor("Marina de Lara", "123456789", LocalDate.of(1999, 4, 21), "Rua das Flores", 17000);
    Professor professor2 = new Professor("Emerson Paradise", "123456710", LocalDate.of(1965, 8, 13), "Rua da Jabuticaba", 20000);
    Professor professor3 = new Professor("João Pereira Silva", "98312456712", LocalDate.of(2001, 3, 6), "Rua Roberto Vichinhenski", 13000);
    Professor professor4 = new Professor("Bruno Pereira", "12347831299", LocalDate.of(1997, 4, 21), "Rua Água Verde", 17000);

    Funcionario faxineiro1 = new Faxineiro("Marluce da Silva", "12341254123", LocalDate.of(1997, 4, 30), "Rua João Negrão", 2000);

    private JPanel painelPrincipal;
    private JPanel painelBase2;
    private JPanel painelBase;
    private JButton professorButton;
    private JPanel painelTitulo;
    private JLabel escolhasLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Escolhas");
        frame.setContentPane((new EscolaPrincipalUI()).painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setSize(740, 600);
        frame.setVisible(true);
    }
}
