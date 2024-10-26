package escola.registro;

import escola.pessoas.Porteiro;

import java.time.LocalDate;

public abstract class Registro {
    private static int contador = 0;
    private int codigo;
    private LocalDate data;
    private String motivo;
    private Porteiro responsavel;

    public Registro() {
        this.codigo = ++contador;
        this.data = LocalDate.now();
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Registro.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
