public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto(
                "Coca-Cola", 5.0, "Refrigerante de Cola",10);
        var produto2 = new Produto(
                "Guaraná", 4.0, "Regrigerante de guaraná", 5);
        var produto3 = new Produto("Fanta Kiw", 0, null, 0);

        produto3.setNome("Fanta Kiwi");
        produto3.setDescricao("Refrigerante de Kiwi");

        var produto4 = new Produto();
        produto4.setNome("Sprite");
        produto4.AdicionarEstoque(10);

        System.out.println(produto3.getNome());

        produto1.RemoverEstoque(-5);
        System.out.println(produto1);

        var numero = 10;
        if(numero == 10)
            System.out.println("Numero é igual a 10");

        var texto = "teste";
        if(texto.equals("teste"))
            System.out.println("Texto é igual a teste");

        var produto5 = new Produto();

        if(produto5.equals(produto4))
            System.out.println("Produtos são iguais");
        else
            System.out.println("Produtos são diferentes");

        var produtoFisico1 = new ProdutoFisico();
        produtoFisico1.setNome(
                "Elden Ring - Midia Fisica - PS4");
        produtoFisico1.setPreco(200.0);
        produtoFisico1.setDescricao(
                "Midia fisica do jogo Elden Ring para PS4");

        produtoFisico1.setDimensao(new Dimensao(20,20,20));
        produtoFisico1.getCaracteristicas().add(new caracteristica("plataforma", "ps4");
        produtoFisico1.getCaracteristicas().add(new caracteristica("distribuidora", "from software"));
        System.out.println(produtoFisico1);
    }
}