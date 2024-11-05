package escola.registro;

import escola.pessoas.Pessoa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroEntrada extends Registro {
    private List<String> registros = new ArrayList<>();

    public RegistroEntrada() {
        super();
    }

    public String registrarEntrada(Pessoa pessoa) {
        String mascara = "dd 'de' MMMM 'de' yyyy ' | Horário:' HH:mm";
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);

        String registro = pessoa.getNome() + " entrou na escola em " + sdf.format(new java.util.Date());

        registros.add(registro);

        setData(LocalDate.now());
        setMotivo("Entrada na escola");

        return registro;
    }

    public List<String> getRegistros() {
        return registros;
    }
}