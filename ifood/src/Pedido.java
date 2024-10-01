import java.util.ArrayList;
import java.util.Objects;

public class Pedido {
    private String nome;
    private int valor;
    private String descrição;
    private ArrayList<ItemCardapio>itemCardapios;

   public void adicionarItem(ItemCardapio item){
     itemCardapios.add(item);
   }
   public void removerItem(ItemCardapio item){
     itemCardapios.remove(item);
   }
    public void calcularTotal(){

    }
    public void atualizarStatus(String novoStatus){

    }
    public void exibirDetalhes(){

    }
    //contrutor vazio
    public Pedido() {
    }

    //construtor completo
    public Pedido(String nome, int valor, String descrição, ArrayList<ItemCardapio> itemCardapios) {
        this.nome = nome;
        this.valor = valor;
        this.descrição = descrição;
        this.itemCardapios = itemCardapios;
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

    public ArrayList<ItemCardapio> getItemCardapios() {
        return itemCardapios;
    }

    public void setItemCardapios(ArrayList<ItemCardapio> itemCardapios) {
        this.itemCardapios = itemCardapios;
    }

    //hascode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido pedido)) return false;
        return valor == pedido.valor && Objects.equals(nome, pedido.nome) && Objects.equals(descrição, pedido.descrição) && Objects.equals(itemCardapios, pedido.itemCardapios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor, descrição, itemCardapios);
    }

    //toString
    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", descrição='" + descrição + '\'' +
                ", itemCardapios=" + itemCardapios +
                '}';
    }
}
