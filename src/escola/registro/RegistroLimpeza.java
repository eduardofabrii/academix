package escola.registro;

import escola.pessoas.Faxineiro;
import escola.sala.Sala;
import java.time.LocalDate;

public class RegistroLimpeza extends Registro {
    private Sala sala;
    private Faxineiro responsavel;
    private String observacoes;

    public RegistroLimpeza(Sala sala, Faxineiro responsavel, String observacoes) {
        super();
        this.sala = sala;
        this.responsavel = responsavel;
        this.observacoes = observacoes;
        setData(LocalDate.now());
        setMotivo("Limpeza da sala " + sala.getNome());
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Registro de Limpeza: " +
                ", Sala: " + sala.getNome() +
                ", Faxineiro: " + responsavel.getNome() +
                ", Observações: " + observacoes +
                ", Data: " + getData() +
                ", Motivo: " + getMotivo();
    }
}
