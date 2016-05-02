package list1_9;

public class Hero {

	private String name;
	private String job;
	private int hp;
	private int mp;
	private int gold;

	Hero(String name, String job, int gold) {

		this.name = name;
		this.job = job;
		this.hp = 100;
		this.mp = 100;
		this.gold = gold;

	}

	public String getName() {
		return this.name;
	}
	public String getJob() {
		return this.job;
	}
	public int gethp() {
		return this.hp;
	}
	public int getmp() {
		return this.mp;
	}
	public int getGold() {
		return this.gold;
	}

}
