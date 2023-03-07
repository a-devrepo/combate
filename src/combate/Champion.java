package combate;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion() {
	}

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		int damage = other.attack - this.armor;
		if (damage < 1) {
			this.life -= 1;
		} else {
			this.life -= damage;
		}
		if (this.life < 0) {
			this.life = 0;
		}
	}

	public String status() {
		if (this.life > 0) {
			return this.name + ": " + this.life + " de vida";
		} else {
			return this.name + ": " + this.life + " de vida (morreu)";
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Champion [name=" + name + ", life=" + life + ", attack=" + attack + ", armor=" + armor + "]";
	}
}
