public class Enemy extends Character{

	// コンストラクタ
	public Enemy(String name, int hp, int attack) {
		super(name, hp, attack);
	}

	// 攻撃
	@Override
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
}