package acts;

interface DamageElemental {
	int damageElemental(int dañoBase);
}
class DamageFuego implements DamageElemental {
	@Override
	public int damageElemental(int baseDamage) {
		return baseDamage + 10;
	}
}
class DamageHielo implements DamageElemental {
	@Override
	public int damageElemental(int baseDamage) {
		return baseDamage + 5;
	}
}
class DamageCritico {
	public int damageCritico(int baseDamage) {
		return baseDamage + baseDamage/2;
	}
}
