/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String claire = "https://pbs.twimg.com/media/DB1oD1jVwAAJvBH.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component a;
		// 3. use the "createImage()" method below to initialize your Component
		a = createImage(claire);
		// 4. add the image to the quiz window
		quizWindow.add(a);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String b = JOptionPane.showInputDialog("How many heads are there?");
		int bn = Integer.parseInt(b);
		// 7. print "CORRECT" if the user gave the right answer
		if (b.equals(12)) {
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(a);
		// 10. find another image and create it (might take more than one line of code)
		String ugly = "https://pbs.twimg.com/profile_images/935756401166741505/pnhb9KSg.jpg";
		Component c;
		c = createImage(ugly);
		// 11. add the second image to the quiz window
		quizWindow.add(c);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String d = JOptionPane.showInputDialog("On a scale of 1-10, how ugly is Claire?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (d.equals("10")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG");
			JOptionPane.showMessageDialog(null, "The one of the left is claire");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
