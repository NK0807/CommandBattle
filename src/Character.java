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
	
    // 攻撃する
    public void attack(Character target){
        // ダメージが-3～3ぶれる
        int randDamage = rand.nextInt(7) - 3;
        int finalDamage = this.attack + randDamage;

        // ダメージがマイナスにならないようにする
        if(finalDamage < 0){
            finalDamage = 0;
        }

        // クリティカル判定
        int randCritical = rand.nextInt(10);
        if(randCritical == 0){
            // 二倍ダメージ
            finalDamage *= 2;
        }

        // ダメージを与える
        target.damage(finalDamage);

        System.out.println(this.name + "の攻撃");
        if(randCritical == 0){
            System.out.println("会心の一撃！！！");
        }
        System.out.println(target.name + "に" + finalDamage + "のダメージ");
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