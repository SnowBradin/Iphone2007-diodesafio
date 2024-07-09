package Aparelho.main.telefone;

public class TelefoneFunctions implements Telefone{
    @Override
    public void conectar() {
        System.out.println("Conectando número à lista de contatos");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");

    }
}
