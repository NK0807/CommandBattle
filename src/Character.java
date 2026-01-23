import java.util.Random;

public abstract class Character {
	protected String name;
	protected int hp;
	protected int attack;
    Random rand;

	// コンストラクタ
	public Character(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
        this.rand = new Random();
	}
	
	// ダメージを受ける
	public void damage(int damage) {
		this.hp -= damage;
	}
	
    // 攻撃する（抽象メソッド）
    // ※抽象メソッドにする理由は、子がそれぞれattackの中身を考えるため
    public abstract void attack(Character target);

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