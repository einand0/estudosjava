package ecommerce.domain;

public class Alimento extends Produto{
    private String dataDeValidade;
    private double peso;

    public Alimento(String nome, double preco, int quantidadeEmEstoque, String dataDeValidade, double peso) {
        super(nome, preco, quantidadeEmEstoque);
        this.dataDeValidade = dataDeValidade;
        this.peso = peso;
    }

    @Override
    public void exibirInfos(){
        super.exibirInfos();
        System.out.println("Data de validade: " + this.dataDeValidade);
        System.out.println("Peso: " + this.peso);
    }

    @Override
    double calcularDesconto() {
        return this.preco * 0.15;
    }
}
