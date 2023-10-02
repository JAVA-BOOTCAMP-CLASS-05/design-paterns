package estructural.bridge;

public class ControlRemotoBasico implements ControlRemoto {

    protected Dispositivo dispositivo;

    public ControlRemotoBasico() {}

    public ControlRemotoBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void power() {
        System.out.println("Control Remoto: Encendido");
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Control Remoto: Bajar Volumen");
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Control Remoto: Subir Volumen");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Control Remoto: Bajar Canal");
        dispositivo.setChannel(dispositivo.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Control Remoto: Subir Canal");
        dispositivo.setChannel(dispositivo.getChannel() + 1);
    }
}
