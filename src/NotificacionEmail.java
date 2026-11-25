public class NotificacionEmail extends Notificacion {
    private String direccionCorreo;

    public NotificacionEmail(String mensaje, String fechaEnvio, String direccionCorreo) {
        super(mensaje, fechaEnvio);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado a " + direccionCorreo + ": " + mensaje + " - " + fechaEnvio);
    }
}