/**
 * Crie uma classe paciente e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", "123.456.789-00", "123.456.789-0", "Rua X", "12345-6789",
                "Joaozin@gmail.com", "01/01/2000", "M", "Convenio X", "Plano X", "12345-6789", "01/01/2000",
                "01/01/2000");

        System.out.println("Nome: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("RG: " + paciente.getRg());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
        System.out.println("Sexo: " + paciente.getSexo());
        System.out.println("Convenio: " + paciente.getConvenio());
        System.out.println("Tipo de Plano: " + paciente.getTipoPlano());
        System.out.println("Número do Plano: " + paciente.getNumeroPlano());
        System.out.println("Data de Cadastro: " + paciente.getDataCadastro());
        System.out.println("Data de Atualização: " + paciente.getDataAtualizacao());
    }
}