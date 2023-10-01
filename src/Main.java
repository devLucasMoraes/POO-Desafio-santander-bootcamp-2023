public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Navegador na Internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        //Aparelho Telefônico
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        iphone.ligar();

        //Repodutor Musicial
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();
    }
}