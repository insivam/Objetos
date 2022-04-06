/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto avião, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 * mostrar altitude, velocidade, combustível, combustível restante,
 */

public class Aviao {

    private int altitude;
    private int velocidade;
    private int combustivel;
    private int combustivelRestante;

    public Aviao(int altitude, int velocidade, int combustivel, int combustivelRestante) {
        this.altitude = altitude;
        this.velocidade = velocidade;
        this.combustivel = combustivel;
        this.combustivelRestante = combustivelRestante;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public int getCombustivelRestante() {
        return combustivelRestante;
    }

    public void setCombustivelRestante(int combustivelRestante) {
        this.combustivelRestante = combustivelRestante;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void desacelerar() {
        this.velocidade -= 10;
    }

    public void abastecer() {
        this.combustivel += 10;
    }

    public void descarregar() {
        this.combustivel -= 10;
    }

    public void subir() {
        this.altitude += 10;
    }

    public void descer() {
        this.altitude -= 10;
    }

    public void mostrar() {
        System.out.println("Altitude: " + this.altitude);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Combustível: " + this.combustivel);
        System.out.println("Combustível Restante: " + this.combustivelRestante);
    }

}