/*
 * Crie uma classe patinete e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto patinete, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Patinete patinete = new Patinete("Azul", "Patinete", "Patinete", 2019,
                100);

        System.out.println("Cor: " + patinete.getCor());
        System.out.println("Marca: " + patinete.getMarca());
        System.out.println("Modelo: " + patinete.getModelo());
        System.out.println("Ano: " + patinete.getAno());
        System.out.println("Preço: " + patinete.getPreco());

    }

}