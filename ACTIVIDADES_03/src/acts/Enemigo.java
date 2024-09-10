package acts;

public class Enemigo {
	private String nombre;
	private int salud;
	private DamageElemental resistencia;
	public Enemigo(String nombre, int salud, DamageElemental resistencia) {
		this.nombre = nombre;
		this.salud = salud;
		this.resistencia = resistencia;
	}
	public String getNombre() {
		return nombre;
	}
	public int getSalud() {
		return salud;
	}
	public void recibirDamage(int damage) {
		this.salud -= damage;
	}
	public int resistir(int damage) {
		return resistencia.damageElemental(damage);
	}
}
