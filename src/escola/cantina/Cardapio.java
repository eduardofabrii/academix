package escola.cantina;

import java.util.ArrayList;

public class Cardapio {
    private diaSemanaCardapio diaSemana;
    private ArrayList<Refeicao> refeicoes;

    public void adicionarRefeicao(Refeicao refeicao){
        refeicoes.add(refeicao);
    }

    public void removerRefeicao(Refeicao refeicao){
        refeicoes.remove(refeicao);
    }

    public void listarRefeicoes(){
//        organizar por data
    }
}
