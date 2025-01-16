package ecommerce.domain;

public class Eletronico extends Produto{
    private String marca;
    private int garantia;

    public Eletronico(String nome, double preco, int quantidadeEmEstoque, String marca, int garantia) {
        super(nome, preco, quantidadeEmEstoque);
        this.marca = marca;
        this.garantia = garantia;
    }

    @Override
    public void exibirInfos(){
        super.exibirInfos();
        System.out.println("Marca: " + this.marca);
        System.out.println("Garantia: " + this.garantia + " meses.");
    }


    @Override
    double calcularDesconto() {
        return this.preco * 0.10;
    }
}
