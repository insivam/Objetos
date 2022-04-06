/*
 * Crie uma classe paciente e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

/**
 * Paciente
 */
public class Paciente {

    String nome;
    String cpf;
    String rg;
    String endereco;
    String telefone;
    String email;
    String dataNascimento;
    String sexo;
    String convenio;
    String tipoPlano;
    String numeroPlano;
    String dataCadastro;
    String dataAtualizacao;

    public Paciente(String nome, String cpf, String rg, String endereco, String telefone, String email,
            String dataNascimento, String sexo, String convenio, String tipoPlano, String numeroPlano,
            String dataCadastro, String dataAtualizacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.convenio = convenio;
        this.tipoPlano = tipoPlano;
        this.numeroPlano = numeroPlano;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getNumeroPlano() {
        return numeroPlano;
    }

    public void setNumeroPlano(String numeroPlano) {
        this.numeroPlano = numeroPlano;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}