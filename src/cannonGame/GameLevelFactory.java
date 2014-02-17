package cannonGame;

import levels.Level1;
import levels.Level2;
import levels.Level3;

public class GameLevelFactory {
	public static GameLevel createLevel(LevelType level){
		GameLevel gameLevel = null;
		
		switch(level){
		case EASY:
			gameLevel = new Level1();
			break;
		case MEDIUM:
			gameLevel = new Level2();
			break;
		case HARD:
			gameLevel = new Level3();
			break;
		}		
		return gameLevel;
	}
}
