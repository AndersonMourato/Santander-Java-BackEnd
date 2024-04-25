public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.statusTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.proximoCanal();

        smartTv.statusTv();

        smartTv.desligar();
        smartTv.statusTv();

    }
}
