public class Character {
	protected String name;
	protected int hp;
	protected int attack;
	
	// コンストラクタ
	public Character(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	// ダメージを受ける
	public void damage(int damage) {
		this.hp -= damage;
	}
	
    // 攻撃する
    public void attack(Character target){
        target.damage(this.attack);

        System.out.println(this.name + "の攻撃");
        System.out.println(target.name + "に" + this.attack + "のダメージ");
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