/**
 * Crie uma classe conta bancaria e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto conta bancaria, defina
 * as instancias deste objeto e apresente as informações deste objeto no
 * console.
 */
public class Main {

    public static void main(String[] args) {
        Bancaria bancaria = new Bancaria();
        bancaria.titular = "João";
        bancaria.agencia = "1234";
        bancaria.banco = "Banco do Brasil";
        bancaria.tipoConta = "Conta Corrente";
        bancaria.status = "Ativa";
        bancaria.numero = 12345;
        bancaria.saldo = 1000;
        bancaria.limite = 500;
        bancaria.dataAbertura = "01/01/2019";
        bancaria.dataFechamento = "01/01/2020";
        bancaria.deposito = 1000;
        bancaria.saque = 500;
        bancaria.transferencia = 500;

        bancaria.imprimir();

    }

}
