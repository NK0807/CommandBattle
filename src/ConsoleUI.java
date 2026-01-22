import java.util.Scanner;

public class ConsoleUI {
	
	private Scanner scan;
	
	// コンストラクタ
	public ConsoleUI() {
		this.scan = new Scanner(System.in);
	}
	
	// 状況表示
	public void showStatus(Hero hero, Enemy enemy) {
		System.out.println("【状況表示】");
		System.out.println(hero.getName() + "HP：" + hero.getHp() + 
							"/" + enemy.getName() + "HP：" + enemy.getHp());
		System.out.println("【" + hero.getName() + "】のターン");
		System.out.println("1 を入力 → 魔王を攻撃する。");
		System.out.println("2 を入力 → 逃げ出す。");
	}
	
	// 勇者のターン
	public int heroTurn() {
			int select = Integer.parseInt(this.scan.nextLine());
			return select;
	}
}

