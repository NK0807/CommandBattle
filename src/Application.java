
public class Application {
	public static void main(String[] args) {
		Hero hero = new Hero("勇者", 100, 10);
		Enemy enemy = new Enemy("魔王", 300, 5);
		
		ConsoleUI conUI = new ConsoleUI();
		
		System.out.println("バトル開始！");
		
		while(hero.isAlive() && enemy.isAlive()) {
			// 状況表示
			conUI.showStatus(hero, enemy);

			// 勇者のターン
			int select = conUI.heroTurn();
			switch(select) {
			case 1:
				enemy.damage(hero.getAttack());
				System.out.println(enemy.getName() + "に" + hero.getAttack() + "のダメージ！");
				if(enemy.getHp() <= 0) {
					System.out.println(enemy.getName() + "を倒した！");
					System.out.println("ゲーム終了");
					return;
				}
				break;
			case 2:
				System.out.println(hero.getName() + "は逃げ出した。");
				System.out.println("ゲーム終了");
				return;
			}
			
			// 魔王のターン
			System.out.println("【" + enemy.getName() + "】のターン");
			hero.damage(enemy.getAttack());
			System.out.println(hero.getName() + "に" + enemy.getAttack() + "のダメージ！");
			if(hero.getHp() <= 0) {
				System.out.println(hero.getName() + "は倒れた…");
				System.out.println("ゲーム終了");
				return;
			}
			
		}
	}
}
