import java.util.*;
import java.time.*;

public class PedidosExames {
    String CPF;
    String nome;
    LocalDate dataRealizacao;
    LocalDate dataEntrega;
    Arraylist <String> exames;

    public PedidosExames (String CPF, String nome; LocalDate dataRealizacao, LocalDate dataEntrega) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataRealizacao = dataRealizacao;
        this.dataEntrega = dataEntrega;
        exames = new ArrayList<String>();
    }
}