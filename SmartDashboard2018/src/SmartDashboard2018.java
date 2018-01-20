import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SmartDashboard2018 {
	
	private int[] autoCodeArray = new int[2];
	
	private JFrame smartDashboard = new JFrame("5822 Smart Dashboard");
	private JFrame location = new JFrame("Location");
	private JFrame code = new JFrame("Code Select");
	
	private JPanel mainBackground = new JPanel();
	private JPanel locationBackground = new JPanel();
	private JPanel codeBackground = new JPanel();
	private JPanel autoMove = new JPanel();
	private JPanel infoPanel = new JPanel();
	
	private JLabel locationLabel = new JLabel();
	private JLabel codeLabel = new JLabel();
	
	private JTextField locationShow = new JTextField();
	private JTextField codeShow = new JTextField();
	
	private JButton autoCodeSelect = new JButton();
	private JButton left = new JButton();
	private JButton center = new JButton();
	private JButton right = new JButton();
	private JButton scaleSelect = new JButton();
	private JButton switchSelect = new JButton();
	private JButton baseLine = new JButton();
	private JButton nothing = new JButton();
	
	private Color wolfbyteRed = new Color(133, 6, 8);
	private Color wolfbyteGrey = new Color(150, 150, 150);

	
	public SmartDashboard2018() {
		smartDashboard.setDefaultCloseOperation(smartDashboard.EXIT_ON_CLOSE);
		smartDashboard.setSize(277, 464);
		smartDashboard.setLayout(null);
		smartDashboard.add(mainBackground);
		smartDashboard.setResizable(false);
		
		location.setSize(280, 239);
		location.setLayout(null);
		location.add(locationBackground);
		location.setResizable(false);
		
		locationBackground.setBounds(0, 0, 300, 210);
		locationBackground.setBackground(wolfbyteRed);
		locationBackground.setLayout(null);
		locationBackground.add(left);
		locationBackground.add(center);
		locationBackground.add(right);
		
		left.setBounds(15, 15, 240, 50);
		left.setText("Left");
		left.setBackground(wolfbyteGrey);
		left.setForeground(Color.BLACK);
		left.setFont(new Font("Times New Roman", Font.BOLD, 22));
		left.setBorder(BorderFactory.createRaisedBevelBorder());
		center.setBounds(15, 75, 240, 50);
		center.setText("Center");
		center.setBackground(wolfbyteGrey);
		center.setForeground(Color.BLACK);
		center.setFont(new Font("Times New Roman", Font.BOLD, 22));
		center.setBorder(BorderFactory.createRaisedBevelBorder());
		right.setBounds(15, 135, 240, 50);
		right.setText("Right");
		right.setBackground(wolfbyteGrey);
		right.setForeground(Color.BLACK);
		right.setFont(new Font("Times New Roman", Font.BOLD, 22));
		right.setBorder(BorderFactory.createRaisedBevelBorder());
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == left) {
		        	autoCodeArray[0] = 0;
		        	location.setVisible(false);
		        	code.setVisible(true);
		        	locationShow.setText("L E F T");
		        }
		    }
		});
		center.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == center) {
		        	autoCodeArray[0] = 1;
		        	location.setVisible(false);
		        	code.setVisible(true);
		        	locationShow.setText("C E N T E R");
		        }
		    }
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == right) {
		        	autoCodeArray[0] = 2;
		        	location.setVisible(false);
		        	code.setVisible(true);
		        	locationShow.setText("R I G H T");
		        }
		    }
		});
		
		code.setSize(280, 290);
		code.setLayout(null);
		code.add(codeBackground);
		code.setResizable(false);
		
		codeBackground.setBounds(0, 0, 300, 400);
		codeBackground.setLayout(null);
		codeBackground.setBackground(wolfbyteRed);		
		codeBackground.add(scaleSelect);
		codeBackground.add(switchSelect);
		codeBackground.add(baseLine);
		codeBackground.add(nothing);
		
		scaleSelect.setBounds(15, 15, 240, 50);
		scaleSelect.setText("Scale");
		scaleSelect.setBackground(wolfbyteGrey);
		scaleSelect.setForeground(Color.BLACK);
		scaleSelect.setFont(new Font("Times New Roman", Font.BOLD, 22));
		scaleSelect.setBorder(BorderFactory.createRaisedBevelBorder());
		switchSelect.setBounds(15, 75, 240, 50);
		switchSelect.setText("Switch");
		switchSelect.setBackground(wolfbyteGrey);
		switchSelect.setForeground(Color.BLACK);
		switchSelect.setFont(new Font("Times New Roman", Font.BOLD, 22));
		switchSelect.setBorder(BorderFactory.createRaisedBevelBorder());
		baseLine.setBounds(15, 135, 240, 50);
		baseLine.setText("Base Line");
		baseLine.setBackground(wolfbyteGrey);
		baseLine.setForeground(Color.BLACK);
		baseLine.setFont(new Font("Times New Roman", Font.BOLD, 22));
		baseLine.setBorder(BorderFactory.createRaisedBevelBorder());
		nothing.setBounds(15, 195, 240, 50);
		nothing.setText("Nothing");
		nothing.setBackground(wolfbyteGrey);
		nothing.setForeground(Color.BLACK);
		nothing.setFont(new Font("Times New Roman", Font.BOLD, 22));
		nothing.setBorder(BorderFactory.createRaisedBevelBorder());
		
		scaleSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == scaleSelect) {
		        	autoCodeArray[1] = 1;
		        	codeShow.setText("S C A L E");
		        	code.setVisible(false);
		        }
		    }
		});
		switchSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == switchSelect) {
		        	autoCodeArray[1] = 2;
		        	codeShow.setText("S W I T C H");
		        	code.setVisible(false);
		        }
		    }
		});
		baseLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == baseLine) {
		        	autoCodeArray[1] = 3;
		        	codeShow.setText("B A S E  L I N E");
		        	code.setVisible(false);
		        }
		    }
		});
		nothing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == nothing) {
		        	autoCodeArray[1] = 0;
		        	codeShow.setText("N O T H I N G");
		        	code.setVisible(false);
		        }
		    }
		});
		
		mainBackground.setBounds(0, 0, 275, 455);
		mainBackground.setBackground(wolfbyteRed);
		mainBackground.setLayout(null);
		mainBackground.add(autoMove);
		mainBackground.add(infoPanel);
		
		infoPanel.setBounds(15, 135, 235, 280);
		infoPanel.setBackground(wolfbyteGrey);
		infoPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Info")));
		
		autoMove.setBounds(15, 15, 235, 100);
		autoMove.setLayout(null);
		autoMove.setBackground(wolfbyteGrey);
		autoMove.add(autoCodeSelect);
		autoMove.add(locationLabel);
		autoMove.add(locationShow);
		autoMove.add(codeLabel);
		autoMove.add(codeShow);
		
		locationLabel.setBounds(0, 35, 100, 50);
		locationLabel.setText("Location:");
		locationLabel.setForeground(Color.BLACK);
		locationLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		locationShow.setBounds(55, 50, 170, 25);
		locationShow.setEditable(false);
		
		codeLabel.setBounds(0, 75, 100, 25);
		codeLabel.setText("Code:");
		codeLabel.setForeground(Color.BLACK);
		codeLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		codeShow.setBounds(55, 75, 170, 25);
		codeShow.setEditable(false);
		
		autoCodeSelect.setBounds(0, 0, 235, 50);
		autoCodeSelect.setBackground(Color.WHITE);
		autoCodeSelect.setText("Select Auto Code");
		autoCodeSelect.setFont(new Font("Times New Roman", Font.BOLD, 22));
		autoCodeSelect.setBorder(BorderFactory.createRaisedBevelBorder());
		
		autoCodeSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == autoCodeSelect) {
		        	location.setVisible(true);
		        }
		    }
		});
		
		smartDashboard.setVisible(true);
	}
	
	public int[] autoCodeSelect() {
		return autoCodeArray;
	}
	public void update(int value) throws Exception{
		locationShow.setText(Integer.toString(value));
		Thread.sleep(30000);
		codeShow.setText(Integer.toString(value));
		Thread.sleep(30000);
	}
	
}
