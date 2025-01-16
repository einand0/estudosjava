package ecommerce.domain;

public class Roupa extends Produto{
    private String cor;
    private char tamanho;

    public Roupa(String nome, double preco, int quantidadeEmEstoque, String cor, char tamanho) {
        super(nome, preco, quantidadeEmEstoque);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInfos(){
        super.exibirInfos();
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
    }

    @Override
    double calcularDesconto() {
        return this.preco * 0.05;
    }
}
