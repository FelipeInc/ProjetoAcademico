package desconto;

public class SemDesconto implements Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor;
    }
}
