public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

    smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
    smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
    smartTv.mudarCanal(13);
        System.out.print("Canal Atual: " + smartTv.canal);
    smartTv.diminuirCanal();
    smartTv.diminuirCanal();
        
    }
}
