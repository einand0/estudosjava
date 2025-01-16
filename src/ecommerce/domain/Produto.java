package ecommerce.domain;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    abstract double calcularDesconto();

    public void exibirInfos(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
    }
}
