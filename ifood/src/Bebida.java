import java.util.ArrayList;
import java.util.Objects;

public class Bebida extends ItemCardapio {
    private String temperatura;


    public Bebida() {
    }

    public Bebida(String nome, int valor, String descrição, ArrayList<Pedido> pedidos, String temperatura) {
        super(nome, valor, descrição, pedidos);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bebida bebida)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(temperatura, bebida.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperatura);
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "temperatura='" + temperatura + '\'' +
                "} " + super.toString();
    }
}
