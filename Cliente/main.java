package cliente;

public class main {
    public static void main(String[] args) throws InterruptedException {
        cliente c = new cliente();
        c.nome = "João";
        c.cpf = 123456789;
        c.endereco = "Rua A";
        c.telefone = "123456789";
        c.idade = 18;
        c.numero = 123;

        c.comprar();
        Thread.sleep(1000);
        // adiciona items na cesta
        c.cesta = new String[3];
        c.cesta[0] = "PS5";
        c.cesta[1] = "Cortador de unha";
        c.cesta[2] = "Cadeira";

        // shows the items
        System.out.println("Itens da cesta: ");
        for (int i = 0; i < c.cesta.length; i++) {
            System.out.println(c.cesta[i]);
            Thread.sleep(500);
        }

        System.out.println("\n");

        c.pagar();
        // print slowly the client info slowly
        System.out.println("Nome: " + c.nome);
        Thread.sleep(500);
        System.out.println("Idade: " + c.idade);
        Thread.sleep(500);
        System.out.println("CPF: " + c.cpf);
        Thread.sleep(500);
        System.out.println("Endereço: " + c.endereco);
        Thread.sleep(500);
        System.out.println("Telefone: " + c.telefone);
        Thread.sleep(500);
        System.out.println("Numero: " + c.numero);
        Thread.sleep(500);

    }
}
