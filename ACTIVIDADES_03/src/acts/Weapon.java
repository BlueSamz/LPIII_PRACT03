package acts;

public class Weapon {
	private int baseDamage;
	public Weapon (int baseDamage) {
		this.baseDamage = baseDamage;
	}
	public int damageCalculator() {
		return baseDamage;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	
}
class Espada extends Weapon {
	public Espada(int baseDamage) {
		super(baseDamage);
	}
	@Override
	public int damageCalculator() {
		return getBaseDamage() * 5;
	}
}
class Arco extends Weapon {
	public Arco(int baseDamage) {
		super(baseDamage);
	}
	@Override
	public int damageCalculator() {
		return getBaseDamage() * 3;
	}
}
class Hacha extends Weapon {
	public Hacha(int baseDamage) {
		super(baseDamage);
	}
	@Override
	public int damageCalculator() {
		return getBaseDamage()* 4;
	}
}
