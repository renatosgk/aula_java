import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var pedido1=new PratoPrincipal("x-salada",10,"pão com hamburguer e salada","2",10);
        var pedido2=new PratoPrincipal("pizza de frango",30,"massa com frango","1",30);
        var bebida1=new Bebida("coca-cola",7,"refrigerante de cola","1","frio");
        var bebida2=new Bebida("Soda",7,"refrigerante de limão","2","frio");
        var prato=new PratoPrincipal("macarrão",30,"massa com molho de tomate",10,30);

        var pedido = new Pedido("meu pedido",
                new ArrayList<>());
        pedido.adicionarItem(pedido1);
        pedido.adicionarItem(bebida2);

    }
}



