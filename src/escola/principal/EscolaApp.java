package escola.principal;

import escola.minibanco.ArquivoTxt;
import escola.pessoas.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EscolaApp {
    public static void main(String[] args) {

        Professor marina = new Professor("Marina de Lara", "1234567890", LocalDate.of(1998, 4, 12), "Rua das Flores, 45", 1, 14900.0);
        Faxineiro carlos = new Faxineiro("Carlos Oliveira", "12345678900", LocalDate.of(1985, 5, 10), "Rua das Flores, 100", 2, 1500.0);


        ArquivoTxt arquivo = new ArquivoTxt("funcionarios.txt");


        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(marina);
        funcionarios.add(carlos);

        try {
            arquivo.salvarFuncionario(funcionarios);
            System.out.println("Funcionários salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionários: " + e.getMessage());
        }
    }
}
