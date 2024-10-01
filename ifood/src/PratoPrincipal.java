import java.util.ArrayList;
import java.util.Objects;

public class PratoPrincipal extends ItemCardapio {
    private int TempoDePreparação;

    public PratoPrincipal() {
    }

    public PratoPrincipal(String nome, int valor, String descrição, ArrayList<Pedido> pedidos, int tempoDePreparação) {
        super(nome, valor, descrição, pedidos);
        TempoDePreparação = tempoDePreparação;
    }

    public int getTempoDePreparação() {
        return TempoDePreparação;
    }

    public void setTempoDePreparação(int tempoDePreparação) {
        TempoDePreparação = tempoDePreparação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PratoPrincipal that)) return false;
        if (!super.equals(o)) return false;
        return TempoDePreparação == that.TempoDePreparação;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), TempoDePreparação);
    }

    @Override
    public String toString() {
        return "PratoPrincipal{" +
                "TempoDePreparação=" + TempoDePreparação +
                "} " + super.toString();
    }
}
