package cannonGame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Dimension;

import quiz.InsertQuestion;
import quiz.viewQuestions;

public class GameOptions extends JPanel implements ActionListener {	
	private static final long serialVersionUID = 5986304059488866474L;
	
	JButton easyButton   = easyButton();
	JButton mediumButton = mediumButton();
	JButton hardButton   = hardButton();
	JButton manageButton = manageButton();
	JButton viewButton	 = viewButton();
	public GameOptions(){		
		easyButton.addActionListener(this);		
		mediumButton.addActionListener(this);
		hardButton.addActionListener(this);
		manageButton.addActionListener(this);
		viewButton.addActionListener(this);
		setLayout(null);
		
        JPanel center = new JPanel(new GridLayout(6,1,10,10));
        center.setBounds(10, 0, 140, 165);
        center.add(new JLabel("Chose Difficulty Level"));
        center.add(easyButton);
        center.add(mediumButton);
        center.add(hardButton);
        center.add(manageButton);
        center.add(viewButton);
        
        this.add(center);
        this.setPreferredSize(new Dimension(158, 150));	
		this.setFocusable(true);
		this.requestFocusInWindow();
	}
	private JButton easyButton(){
		JButton levelEasy = new JButton("Easy");
		return levelEasy;
	}
	private JButton mediumButton(){
		JButton levelMedium = new JButton("Medium");
		return levelMedium;
	}
	private JButton hardButton(){
		JButton levelHard = new JButton("Hard");
		return levelHard;
	}
	private JButton manageButton() {
		JButton insertQuestion = new JButton("Manage Questions");
		return insertQuestion;
	}
	private JButton viewButton(){
		JButton viewQuestions = new JButton("View Questions");
		return viewQuestions;
	}
	private void disposeParentFrame(){
		JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
		parentFrame.dispose();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == easyButton){		
			System.out.println("Easy Level");
			new GameWindow(LevelType.EASY);
			disposeParentFrame();
		}
		else if(src == mediumButton){
			System.out.println("Medium Level");
			new GameWindow(LevelType.MEDIUM);
			disposeParentFrame();
		}
		else if(src == hardButton){
			System.out.println("Hard Level");
			new GameWindow(LevelType.HARD);
			disposeParentFrame();
		}
		else if(src == manageButton){
			System.out.println("Managing Questions");
			InsertQuestion manageButton = new quiz.InsertQuestion();
			setVisible(true);
			disposeParentFrame();
		}
		else if (src == viewButton){
			System.out.println("Available questions");
			viewQuestions viewButton = new quiz.viewQuestions();
			disposeParentFrame();
		}
		else{
			//nothing
		}
	}
	
	
}
