/*
 * Crie uma classe produto eletrônico e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto produto eletrônico,
 * defina as instancias deste objeto e apresente as informações deste objeto
 * no console.
 */

/**
 * TesteProduto
 */
public class TesteProduto {

    public static void main(String[] args) {
        Produto produto = new Produto("Monitor", "Monitor de 28 polegadas",
                1500.00, 10);
        produto.imprimir();
        System.out.println("Valor total: R$" + produto.getPreco() * produto.getQuantidade());
    }
}