public class Enemy extends Character{

	// コンストラクタ
	public Enemy(String name, int hp, int attack) {
		super(name, hp, attack);
	}

	// 攻撃
	@Override
    public void attack(Character target){
        // ダメージを与える
        target.damage(this.attack);

        System.out.println(this.name + "は業火を放った！");
        System.out.println(target.name + "は燃え上がり、" + this.attack + "のダメージ");
    }	
}