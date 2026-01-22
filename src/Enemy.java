public class Enemy {
	private String name;
	private int hp;
	private int attack;
	
	// コンストラクタ
	public Enemy(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	// ダメージを受ける
	public void damage(int damage) {
		this.hp -= damage;
	}
	
	// ゲッター
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public boolean isAlive() {
		if(this.hp > 0) {
			return true;
		}else {
			return false;	
		}
	}
}