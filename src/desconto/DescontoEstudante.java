package desconto;

public class DescontoEstudante implements Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.90;
    }
}
