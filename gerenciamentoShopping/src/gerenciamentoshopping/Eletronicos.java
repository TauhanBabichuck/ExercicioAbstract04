
package gerenciamentoshopping;

public class Eletronicos extends Produto{

    public Eletronicos(int preco, String nome, int peso, Tipos tipo) {
        super(preco, nome, peso, tipo);
    }

    @Override
    public String toString() {
        return "Eletronicos{" + '}';
    }

    @Override
    public double calcularDesconto() {
        return super.getPreco()*0.95;
    }
    
}
