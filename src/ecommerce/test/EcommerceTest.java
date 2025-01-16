package ecommerce.test;

import ecommerce.domain.*;

import java.util.ArrayList;
import java.util.List;

public class EcommerceTest {
    public static void main(String[] args) {
        //Instanciando os produtos
        Eletronico eletronico = new Eletronico("Computador", 3000, 10, "Acer", 12);
        Roupa roupa = new Roupa("Camisa", 50, 5, "preta", 'M');
        Alimento alimento = new Alimento("Pizza", 100, 20, "01/01/2026", 1);

        //Criando a lista de produtos que é necessária passar no pedido
        List<Produto> produtos = new ArrayList<>();
        produtos.add(roupa);
        produtos.add(eletronico);
        produtos.add(alimento);

        //Instanciando o pedido com a lista de produtos que foi criada anteriormente
        Pedido pedido01 = new Pedido("Fernando", produtos);
        pedido01.exibirInfos();
    }
}
