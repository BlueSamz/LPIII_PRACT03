package acts;

public class Juego {
	public static void main(String[] args) {
		Jugador jugador1 = new Jugador("Jugador", new Espada(50) );
		Enemigo enemigo = new Enemigo("Mago", 200 , new DamageFuego());
		int damageInfligido = jugador1.atacar(enemigo);
		System.out.println(jugador1.getNombre() + " inflige " + damageInfligido + " de daño al " + enemigo.getNombre());
		System.out.println(enemigo.getNombre() + " tiene " + enemigo.getSalud() + " de salud restante.");
	}
}

