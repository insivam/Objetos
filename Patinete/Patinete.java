/**
 * Crie uma classe patinete e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto patinete, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

/**
 * Patinete
 */
public class Patinete {

    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private int preco;

    public Patinete(String cor, String marca, String modelo, int ano, int preco) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Patinete{" + "cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", preco="
                + preco + '}';
    }

}