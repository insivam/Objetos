/*
 * Crie uma classe produto eletrônico e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto produto eletrônico,
 * defina as instancias deste objeto e apresente as informações deste objeto
 * no console.
 */

/**
 * Produto
 */
public class Produto {

    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(String nome, String descricao, double preco, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}