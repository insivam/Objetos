/**
 * Crie uma classe conta bancaria e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto conta bancaria, defina
 * as instancias deste objeto e apresente as informações deste objeto no
 * console.
 */

/**
 * Bancaria
 */
public class Bancaria {

    String titular, agencia, banco, tipoConta, status;
    int numero, saldo, limite;
    String dataAbertura, dataFechamento;
    double deposito, saque, transferencia;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void imprimir() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Banco: " + this.banco);
        System.out.println("Tipo de Conta: " + this.tipoConta);
        System.out.println("Status: " + this.status);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Data de Fechamento: " + this.dataFechamento);
        System.out.println("Deposito: " + this.deposito);
        System.out.println("Saque: " + this.saque);
        System.out.println("Transferencia: " + this.transferencia);
    }

}