package al.infnet.edu.br;

public class AppProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 20.75, 50);

        produto.exibirInformacoes();

        produto.setPreco(22.00);
        produto.setQuantidadeEmEstoque(40);

        System.out.println("\nInformações após atualização:");
        produto.exibirInformacoes();
    }
}
