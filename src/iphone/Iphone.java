package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.tocar();

    }

    @Override
    public void tocar() {
        System.out.println("tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado música");
    }

    @Override
    public void ligar() {
        System.out.println("efetuando ligação");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página");
    }
}
