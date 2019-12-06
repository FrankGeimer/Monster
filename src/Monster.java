public abstract class Monster {

	private String name;
	private int damage;
	private int life;
	private String type;

	public Monster(String name, int damage, int life) {
		super();
		this.name = name;
		this.damage = damage;
		this.life = life;
		this.type = "normal";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void takeHit(Monster fighter) {
		
		
		int fighterDamage = fighter.getDamage();
		if (this.getType().equals("fire") && fighter.getType().equals("grass")) fighterDamage *=2;
		if (this.getType().equals("grass") && fighter.getType().equals("water")) fighterDamage *=2;
		if (this.getType().equals("water") && fighter.getType().equals("fire")) fighterDamage *=2;
		
		if (this.getType().equals("grass") && fighter.getType().equals("fire")) fighterDamage /=2;
		if (this.getType().equals("water") && fighter.getType().equals("grass")) fighterDamage /=2;
		if (this.getType().equals("fire") && fighter.getType().equals("water")) fighterDamage /=2;
		
		this.setLife(this.getLife() - fighterDamage);
		
		
		if (this.getLife() > 0) {
			
			System.out.println(name + " has " + life + " points remaining");
		} 
		else{ System.out.println(name + " is KO!");
		}

	}
}