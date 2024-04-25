public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void baixarVolume() {
        volume--;
    }

    public void proximoCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void statusTv() {
        System.out.println("---------------------------------");
        System.out.println("TV ligada? " + ligado);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

}
