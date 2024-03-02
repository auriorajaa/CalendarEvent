package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar extends JPanel {

    private static final long serialVersionUID = 1L;

    public Calendar() {

        setBackground(Color.decode("#F6F6F6"));
        setLayout(new BorderLayout(30, 30));
        setBorder(BorderFactory.createEmptyBorder(40, 30, 20, 20));

        JPanel top = new JPanel(new BorderLayout(10, 10));
        top.setBackground(null);

        JLabel date = new JLabel("March 2024");
        date.setHorizontalAlignment(JLabel.CENTER);
        date.setFont(new Font("Helvetica", Font.BOLD, 30));
        date.setForeground(Color.decode("#0ECF78"));
        top.add(date, BorderLayout.CENTER);

        int arrowSize = 25;

        ImageIcon rightArrowIcon = new ImageIcon("res/right.png");
        rightArrowIcon.setImage(rightArrowIcon.getImage().getScaledInstance(arrowSize, arrowSize, 								java.awt.Image.SCALE_SMOOTH));
        JLabel left = new JLabel(rightArrowIcon);
        left.setCursor(new Cursor(Cursor.HAND_CURSOR));
        top.add(left, BorderLayout.EAST);

        ImageIcon leftArrowIcon = new ImageIcon("res/left.png");
        leftArrowIcon.setImage(leftArrowIcon.getImage().getScaledInstance(arrowSize, arrowSize, java.awt.Image.SCALE_SMOOTH));
        JLabel right = new JLabel(leftArrowIcon);
        right.setCursor(new Cursor(Cursor.HAND_CURSOR));
        top.add(right, BorderLayout.WEST);

        add(top, BorderLayout.NORTH);
        
        JPanel days = new JPanel(new GridLayout(7, 7));
        days.setBackground(null);
        
        for (int i = 0; i < 49; i++) {
        	days.add(new DayLabel(i + "", Color.decode("#F0F0F0"), Color.black, true));
        }
        
        add(days, BorderLayout.CENTER);
    }
}
