public class main {
    public static void main(String[] args) {
        Notificacion[] notificaciones = new Notificacion[3];
        notificaciones[0] = new NotificacionEmail("Bienvenido", "26/10/2026", "usuario@mail.com");
        notificaciones[1] = new NotificacionSMS("Tu codigo es 1234", "26/10/2026", "2615551234");
        notificaciones[2] = new NotificacionPush("Tienes un mensaje nuevo", "26/10/2026", "DISP001");
        for (int i = 0; i < notificaciones.length; i++) {
            notificaciones[i].enviar();
        }
    }
}