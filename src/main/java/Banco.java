import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    @Getter @Setter
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }
}
