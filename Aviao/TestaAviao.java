public class TestaAviao {

    public static void main(String[] args) throws InterruptedException {
        Aviao aviao = new Aviao(0, 0, 0, 0);

        aviao.setAltitude(100);
        aviao.setVelocidade(100);
        aviao.setCombustivel(100);
        aviao.setCombustivelRestante(100);
        for (int i = 0; i < 20; i++) {
            aviao.mostrar();

            if (i % 3 == 0) {
                aviao.acelerar();
                aviao.descarregar();
                aviao.subir();
            } else {
                aviao.desacelerar();
                aviao.abastecer();
                aviao.descer();
            }

            System.out.println();
            Thread.sleep(1000);
        }
    }
}
