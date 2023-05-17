
package gerenciamentoshopping;


public class GerenciamentoShopping {

    public static void main(String[] args) {
        Produto carne = new Alimenticios(14, "Carne de frango temperada", 1000, Tipos.FRIOS);
        Produto polishop = new Eletronicos(450, "Fritadeira sem óleo", 5, Tipos.GERAL);
        
        System.out.println(carne.calcularDesconto());
        System.out.println(polishop.calcularDesconto());
        
    }
    
}
