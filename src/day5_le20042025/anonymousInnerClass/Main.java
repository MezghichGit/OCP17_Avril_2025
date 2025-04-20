package day5_le20042025.anonymousInnerClass;

import java.awt.event.*;
import javax.swing.JButton;

public class Main {

	public static void main(String[] args) {
		JButton bouton = new JButton("Click");
		bouton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("Click sur le bouton");
			 }
		});

	}

}
