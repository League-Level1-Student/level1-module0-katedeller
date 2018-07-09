package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WOOHOO!!");
		int rand = new Random().nextInt(5);
		if (rand == 5) {
			JOptionPane.showConfirmDialog(null, "You have good things coming");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Avoid water unless you want to drown");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will marry soon");
		}

		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will get into your dream college");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You'll win the lottery!");
		}
	}

}
