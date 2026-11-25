public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;

    public NotificacionSMS(String mensaje, String fechaEnvio, String numeroTelefono) {
        super(mensaje, fechaEnvio);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("SMS enviado al " + numeroTelefono + ": " + mensaje + " - " + fechaEnvio);
    }
}