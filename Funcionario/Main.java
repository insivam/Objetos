/*
 * Crie uma classe funcionário e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto funcionário, defina as
 * instancias deste objeto e apresente as informações deste objeto no
 * console.
 */

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("123.456.789-10");
        funcionario.setCargo("Programador");
        funcionario.setSalario(1000.00);
        funcionario.imprimir();
    }
}