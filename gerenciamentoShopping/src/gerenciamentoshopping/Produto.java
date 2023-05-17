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
public abstract class Produto {
    //Sem metodo de exibir detalhes
    private int preco;
    private String nome;
    private int peso;
    private Tipos tipo;
    
    public abstract double calcularDesconto();

    public Produto(int preco, String nome, int peso, Tipos tipo) {
        this.preco = preco;
        this.nome = nome;
        this.peso = peso;
        this.tipo = tipo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto{" + "preco=" + preco + ", nome=" + nome + ", peso=" + peso + ", tipo=" + tipo + '}';
    }

    
    
    
}
