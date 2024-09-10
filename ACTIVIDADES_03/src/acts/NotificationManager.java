package acts;

public abstract class NotificationManager {
	public abstract void send(String message);
}

class notificacionEmail extends NotificationManager { 
	@Override
	public void send(String message) {
    System.out.println("Enviando correo: " + message);
 }
}

class notificacionSMS extends NotificationManager {
	@Override
	public void send(String message) {
    System.out.println("Enviando SMS: " + message);
 }
}
