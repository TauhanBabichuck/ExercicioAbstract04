/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentoshopping;

/**
 *
 * @author Escola
 */
public class Alimenticios extends Produto{

    public Alimenticios(int preco, String nome, int peso, Tipos tipo) {
        super(preco, nome, peso, tipo);
    }

    @Override
    public String toString() {
        return "Alimenticios{" + '}';
    }

    @Override
    public double calcularDesconto() {
        return super.getPreco()*0.45;
    }
    
}
