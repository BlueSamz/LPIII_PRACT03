package acts;

public class Main {
	public static void main(String[] args){
		notificacionEmail enviarEmail = new notificacionEmail();
		enviarEmail.send("Hola");
		notificacionSMS enviarSMS = new notificacionSMS();
		enviarSMS.send("Hola mundo");
	}
}
