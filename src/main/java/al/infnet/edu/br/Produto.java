package al.infnet.edu.br;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos Setters (Atualização)
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
