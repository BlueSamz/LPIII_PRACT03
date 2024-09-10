package acts;

public class Jugador {
	private String nombre;
	private Weapon weapon;
	private DamageCritico damageCritico;
	public Jugador(String nombre, Weapon weapon) {
		this.nombre = nombre;
		this.weapon = weapon;
		this.damageCritico = new DamageCritico();
	}
	public String getNombre() {
		return nombre;
	}
	public int atacar(Enemigo enemigo) {
		int baseDamage = weapon.damageCalculator();
		baseDamage = damageCritico.damageCritico(baseDamage);
		int damageFinal = enemigo.resistir(baseDamage);
		enemigo.recibirDamage(damageFinal);
		return damageFinal;
	}
}
