import java.util.ArrayList;
import java.util.Objects;

public class ItemCardapio {
    private String nome;
    private int valor;
    private String descrição;
    private ArrayList<Pedido>pedidos;

    public void exibirinformações(){

    }

    //construtor vazio.
    public ItemCardapio() {
    }

    //construtor completo

    public ItemCardapio(String nome, int valor, String descrição, ArrayList<Pedido> pedidos) {
        this.nome = nome;
        this.valor = valor;
        this.descrição = descrição;
        this.pedidos = pedidos;
    }
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    //hashcode e equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemCardapio that)) return false;
        return valor == that.valor && Objects.equals(nome, that.nome) && Objects.equals(descrição, that.descrição) && Objects.equals(pedidos, that.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor, descrição, pedidos);
    }


    //toString


    @Override
    public String toString() {
        return "ItemCardapio{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", descrição='" + descrição + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}



