package ecommerce.domain;

import java.util.List;

public class Pedido {
    private String cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(String cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
        valorDoPedido();
    }

    public void valorDoPedido(){
        for(Produto produto : produtos){
            valorTotal += produto.preco - produto.calcularDesconto();
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirInfos(){
        System.out.println("# Detalhes do pedido #");
        System.out.println("Nome do cliente: " + this.cliente);
        System.out.println("Produtos: ");
        for(Produto produto : produtos){
            System.out.println("Nome do produto: " + produto.nome);
            System.out.println("Preço do produto: " + (produto.preco - produto.calcularDesconto()));
        }
        System.out.println("Valor total do pedido: " + this.valorTotal);
    }
}
