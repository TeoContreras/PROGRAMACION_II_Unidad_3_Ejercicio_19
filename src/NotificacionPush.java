public class NotificacionPush extends Notificacion {
    private String identificadorDispositivo;

    public NotificacionPush(String mensaje, String fechaEnvio, String identificadorDispositivo) {
        super(mensaje, fechaEnvio);
        this.identificadorDispositivo = identificadorDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("Notificacion push enviada al dispositivo " + identificadorDispositivo + ": " + mensaje);
    }
}