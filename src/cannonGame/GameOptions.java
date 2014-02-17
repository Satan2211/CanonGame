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

public class GameOptions extends JPanel implements ActionListener {	
	private static final long serialVersionUID = 5986304059488866474L;
	
	JButton easyButton   = easyButton();
	JButton mediumButton = mediumButton();
	JButton hardButton   = hardButton();
	public GameOptions(){		
		easyButton.addActionListener(this);		
		mediumButton.addActionListener(this);
		hardButton.addActionListener(this);
		
        JPanel center = new JPanel(new GridLayout(4,1,10,10));
        center.add(new JLabel("Chose Difficulty Level"));
        center.add(easyButton);
        center.add(mediumButton);
        center.add(hardButton);
        
        this.add(center, BorderLayout.CENTER);
        this.setPreferredSize(this.getPreferredSize());	
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
		else{
			// do nothing
		}
	}
}
