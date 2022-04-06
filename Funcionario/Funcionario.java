/*
 * Crie uma classe funcionário e apresente os atributos e métodos
 * referentes esta classe, em seguida crie um objeto funcionário, defina as
 * instancias deste objeto e apresente as informações deste objeto no
 * console.
 */

public class Funcionario {
    private String nome;
    private String cpf;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Cargo: " + this.getCargo());
    }
}