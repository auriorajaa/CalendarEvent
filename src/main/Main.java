package main;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalDate;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
		
		// MAIN METHOD
				
		JFrame frame = new JFrame("Calendar Event");
		frame.setSize(900, 500);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.white);
		
		JPanel mainPanel = new JPanel(new GridLayout(1, 2, 0, 0));
		
		LocalDate date = LocalDate.now();
		
		mainPanel.add(new Calendar(date.getYear(), date.getMonthValue(), date, mainPanel));
		mainPanel.add(new Events());
		
		frame.getContentPane().add(mainPanel);
		frame.setVisible(true);
	}
	
}
