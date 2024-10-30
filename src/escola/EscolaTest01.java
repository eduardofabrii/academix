package escola;

import escola.administracao.Escola;
import escola.pessoas.Funcionario;
import escola.pessoas.Professor;

import java.time.LocalDate;

public class EscolaTest01 {
    public static void main(String[] args) {
        Escola escola = new Escola();
//        Funcionario marina = new Professor("Marina de Lara", "12345678900", LocalDate.of(1999, 4, 8), "Rua das Flores", );
//        escola.adicionarFuncionario();
//        escola.adicionarDisciplina();
//        escola.adicionarAluno();
        escola.listarFuncionarios();
    }
}
