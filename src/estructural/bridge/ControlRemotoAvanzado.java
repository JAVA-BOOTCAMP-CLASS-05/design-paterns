package estructural.bridge;

public class ControlRemotoAvanzado extends ControlRemotoBasico {
    
	public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super.dispositivo = dispositivo;
    }

    public void mute() {
        System.out.println("Control Remoto: mute");
        dispositivo.setVolume(0);
    }
}
