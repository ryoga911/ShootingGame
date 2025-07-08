
public class Enemy extends Character {
	int life=1; //変更:通常の敵は耐久力１にする
	int score=1;
	public Enemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}

}
