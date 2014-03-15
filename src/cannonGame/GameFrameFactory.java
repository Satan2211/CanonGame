package cannonGame;

//import levels.Level1;
//import levels.Level2;
//import levels.Level3;
//import quiz.viewQuestions; 
//import quiz.InsertQuestion; 
//import quiz.CorrectAns; 
//import quiz.CreateCategory; 
import quiz.*;

public class GameFrameFactory {
	public static GameFrame createFrame (FrameType window){
		GameFrame gameFrame = null;
		
		switch(window){
		case CORRECT:
			gameFrame = new CorrectAns();
			break;
		case CREATE:
			gameFrame = new CreateCategory();
			break;
		case INCORRECT:
			gameFrame = new Incorrect();
			break;
		case INSERT:
			gameFrame = new InsertQuestion();
			break;
		case QUIZ:
			gameFrame = new Quiz();
			break;
		}
		return gameFrame;
	}
}
