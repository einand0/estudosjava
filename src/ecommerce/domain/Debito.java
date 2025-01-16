package ecommerce.domain;

public class Debito extends Pagamento{
    @Override
    double calcularPagamento() {
        return 0;
    }
}
