import java.util.Vector;

public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player=new player(100,300,0,0);
		addKeyListener(GameWorld.player);
		GameWorld.playerBullets=new Vector<playerBullet>();
		while(true) {
			clear();
		GameWorld.player.draw(this);
		GameWorld.player.move();
		moveplayerBullets();
		int i=0;
		while (i<GameWorld.playerBullets.size()) {
			playerBullet b=GameWorld.playerBullets.get(i);
			b.draw(this);
			b.move();
			
			if (b.y<0) {
				GameWorld.playerBullets.remove(i);
			} else {
				i++;
			}
			
		}
		sleep(0.03);
		}
	}

	private void moveplayerBullets() {
		int i=0;
		while (i<GameWorld.playerBullets.size()) {
			playerBullet b=GameWorld.playerBullets.get(i);
			b.draw(this);
			b.move();
			if (b.y<0) {
				GameWorld.playerBullets.remove(i);
			}else {
				i++;
			}
			
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}
}

