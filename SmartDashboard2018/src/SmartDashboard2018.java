import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SmartDashboard2018 {
	
	private int locationValue;
	private int team;
	
	private double nkP = 0;
	private double nkI = 0;
	private double nkD = 0;
	
	private String fms = "RLR";
	
	private JFrame smartDashboard = new JFrame("5822 Smart Dashboard");
	
	
	
	
	
	private JPanel mainBackground = new JPanel();
	private JPanel autoMove = new JPanel();
	private JPanel infoPanel = new JPanel();
	
	private JPanel cSwitchL = new JPanel();
	private JPanel cSwitchR = new JPanel();
	private JPanel scaleL = new JPanel();
	private JPanel scaleR = new JPanel();
	private JPanel fSwitchL = new JPanel();
	private JPanel fSwitchR = new JPanel();
	
	private JLabel locationLabel = new JLabel();
	private JLabel codeLabel = new JLabel();
	private JLabel encoderL = new JLabel();
	private JLabel encoderR = new JLabel();
	private JLabel gyro = new JLabel();
	private JLabel fieldElementsDisplay = new JLabel();
	private JLabel cSwitch = new JLabel();
	private JLabel scale = new JLabel();
	private JLabel fSwitch = new JLabel();
	
	private JTextField gyroShow = new JTextField();
	
	private JTextField locationShow = new JTextField();
	private JTextField codeShow = new JTextField();
	private JTextField eL = new JTextField();
	private JTextField eR = new JTextField();
	
	
	private JButton left = new JButton();
	private JButton center = new JButton();
	private JButton right = new JButton();
	private JButton blueSelect = new JButton();
	private JButton redSelect = new JButton();
	
	private Color wolfbyteRed = new Color(133, 6, 8);
	private Color wolfbyteGrey = new Color(150, 150, 150);
	
	public SmartDashboard2018() {
		smartDashboard.setDefaultCloseOperation(smartDashboard.EXIT_ON_CLOSE);
		smartDashboard.setSize(500, 650);
		smartDashboard.setLayout(null);
		smartDashboard.add(mainBackground);
		smartDashboard.setResizable(false);
		
		mainBackground.setBounds(0, 0, 494, 750);
		mainBackground.setBackground(wolfbyteRed);
		mainBackground.setLayout(null);
		mainBackground.add(autoMove);
		mainBackground.add(infoPanel);
		mainBackground.add(left);
		mainBackground.add(center);
		mainBackground.add(right);
		
		left.setBounds(260, 15, 220, 30);
		left.setText("Left");
		left.setBackground(new Color(244, 209, 170));
		left.setForeground(Color.BLACK);
		left.setFont(new Font("Times New Roman", Font.BOLD, 22));
		left.setBorder(BorderFactory.createRaisedBevelBorder());
		center.setBounds(260, 50, 220, 30);
		center.setText("Center");
		center.setBackground(new Color(244, 209, 170));
		center.setForeground(Color.BLACK);
		center.setFont(new Font("Times New Roman", Font.BOLD, 22));
		center.setBorder(BorderFactory.createRaisedBevelBorder());
		right.setBounds(260, 85, 220, 30);
		right.setText("Right");
		right.setBackground(new Color(244, 209, 170));
		right.setForeground(Color.BLACK);
		right.setFont(new Font("Times New Roman", Font.BOLD, 22));
		right.setBorder(BorderFactory.createRaisedBevelBorder());
		
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == left) {
		        	locationValue = 0;
		        	locationShow.setText("L-E-F-T");
		        }
		    }
		});
		center.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == center) {
		        	locationValue = 1;
		        	locationShow.setText("C-E-N-T-E-R");
		        }
		    }
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == right) {
		        	locationValue = 2;
		        	locationShow.setText("R-I-G-H-T");
		        }
		    }
		});
		
		
		infoPanel.setBounds(15, 135, 460, 460);
		infoPanel.setLayout(null);
		infoPanel.setBackground(wolfbyteGrey);
		infoPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Sensors")));
		infoPanel.add(encoderL);
		infoPanel.add(encoderR);
		infoPanel.add(eL);
		infoPanel.add(eR);
		infoPanel.add(gyro);
		infoPanel.add(gyroShow);
		infoPanel.add(fieldElementsDisplay);
		infoPanel.add(blueSelect);
		infoPanel.add(redSelect);
		infoPanel.add(cSwitchL);
		infoPanel.add(cSwitchR);
		infoPanel.add(scaleL);
		infoPanel.add(scaleR);
		infoPanel.add(fSwitchL);
		infoPanel.add(fSwitchR);
		infoPanel.add(cSwitch);
		infoPanel.add(scale);
		infoPanel.add(fSwitch);
		
		fieldElementsDisplay.setBounds(15, 240, 110, 20);
		fieldElementsDisplay.setText("Field Elements");
		fieldElementsDisplay.setBorder(BorderFactory.createRaisedBevelBorder());
		
		blueSelect.setBounds(130, 240, 55, 20);
		blueSelect.setText("B");
		blueSelect.setBorder(BorderFactory.createRaisedBevelBorder());
		blueSelect.setBackground(new Color(244, 209, 170));
		redSelect.setBounds(185, 240, 55, 20);
		redSelect.setText("R");
		redSelect.setBorder(BorderFactory.createRaisedBevelBorder());
		redSelect.setBackground(new Color(244, 209, 170));
		
		blueSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == blueSelect) {
		        	team = 0;
		        	if(fms.charAt(0) == 'L') {
		        		cSwitchL.setBackground(Color.BLUE);
		        		cSwitchR.setBackground(Color.RED);
		        	}
		        	else {
		        		cSwitchL.setBackground(Color.RED);
		        		cSwitchR.setBackground(Color.BLUE);
		        	}
		        	if(fms.charAt(1) == 'L') {
		        		scaleL.setBackground(Color.BLUE);
		        		scaleR.setBackground(Color.RED);
		        	}
		        	else {
		        		scaleL.setBackground(Color.RED);
		        		scaleR.setBackground(Color.BLUE);
		        	}
		        	if(fms.charAt(2) == 'L') {
		        		fSwitchL.setBackground(Color.BLUE);
		        		fSwitchR.setBackground(Color.RED);
		        	}
		        	else {
		        		fSwitchL.setBackground(Color.RED);
		        		fSwitchR.setBackground(Color.BLUE);
		        	}
		        }
		    }
		});
		redSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if(e.getSource() == redSelect) {
		        	team = 1;
		        	if(fms.charAt(0) == 'L') {
		        		cSwitchL.setBackground(Color.RED);
		        		cSwitchR.setBackground(Color.BLUE);
		        	}
		        	else {
		        		cSwitchL.setBackground(Color.BLUE);
		        		cSwitchR.setBackground(Color.RED);
		        	}
		        	if(fms.charAt(1) == 'L') {
		        		scaleL.setBackground(Color.RED);
		        		scaleR.setBackground(Color.BLUE);
		        	}
		        	else {
		        		scaleL.setBackground(Color.BLUE);
		        		scaleR.setBackground(Color.RED);
		        	}
		        	if(fms.charAt(2) == 'L') {
		        		fSwitchL.setBackground(Color.RED);
		        		fSwitchR.setBackground(Color.BLUE);
		        	}
		        	else {
		        		fSwitchL.setBackground(Color.BLUE);
		        		fSwitchR.setBackground(Color.RED);
		        	}
		        }
		    }
		});
		
		fSwitchL.setBounds(15, 265, 50, 50);
		fSwitchR.setBounds(75, 265, 50, 50);
		fSwitch.setBounds(130, 265, 110, 50);
		fSwitch.setBorder(BorderFactory.createRaisedBevelBorder());
		fSwitch.setText("Other Switch");
		
		cSwitchL.setBounds(15, 385, 50, 50);
		cSwitchR.setBounds(75, 385, 50, 50);
		cSwitch.setBounds(130, 385, 110, 50);
		cSwitch.setBorder(BorderFactory.createRaisedBevelBorder());
		cSwitch.setText("Your Switch");
		
		scaleL.setBounds(15, 325, 50, 50);
		scaleR.setBounds(75, 325, 50, 50);
		scale.setBounds(130, 325, 110, 50);
		scale.setBorder(BorderFactory.createRaisedBevelBorder());
		scale.setText("Scale");
		
		gyro.setBounds(15, 100, 100, 20);
		gyro.setText("Gyro");
		gyro.setBorder(BorderFactory.createRaisedBevelBorder());
		gyro.setBackground(new Color(244, 209, 170));
		
		gyroShow.setBounds(15, 120, 426, 115);
		gyroShow.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Degrees")));
		gyroShow.setBackground(new Color(244, 209, 170));
		gyroShow.setFont(new Font("Times New Roman", Font.BOLD, 48));
		gyroShow.setEditable(false);

		

		
		encoderL.setBounds(15, 20, 100, 25);
		encoderL.setText("Left Encoder");
		encoderL.setBorder(BorderFactory.createRaisedBevelBorder());
		eL.setBounds(15, 45, 100, 50);
		eL.setBackground(new Color(244, 209, 170));
		eL.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("in")));
		eL.setEditable(false);
		
		
		encoderR.setBounds(125, 20, 100, 25);
		encoderR.setText("Right Encoder");
		encoderR.setBorder(BorderFactory.createRaisedBevelBorder());
		eR.setBounds(125, 45, 100, 50);
		eR.setBackground(new Color(244, 209, 170));
		eR.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("in")));
		eR.setEditable(false);
		
		autoMove.setBounds(15, 15, 235, 100);
		autoMove.setLayout(null);
		autoMove.setBackground(wolfbyteGrey);
		autoMove.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Auto Code")));
		autoMove.add(locationLabel);
		autoMove.add(locationShow);
		autoMove.add(codeLabel);
		autoMove.add(codeShow);
		
		locationLabel.setBounds(10, 20, 60, 30);
		locationLabel.setText("Location:");
		locationLabel.setForeground(Color.BLACK);
		locationLabel.setFont(new Font("Arial", Font.BOLD, 12));
		locationLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		locationShow.setBounds(70, 20, 150, 30);
		locationShow.setBorder(BorderFactory.createRaisedBevelBorder());
		locationShow.setEditable(false);
		
		codeLabel.setBounds(10, 60, 60, 30);
		codeLabel.setText("Code:");
		codeLabel.setForeground(Color.BLACK);
		codeLabel.setFont(new Font("Arial", Font.BOLD, 12));
		codeLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		codeShow.setBounds(70, 60, 150, 30);
		codeShow.setBorder(BorderFactory.createRaisedBevelBorder());
		codeShow.setEditable(false);
		
		smartDashboard.setVisible(true);
	}
	
	//Returns the value of where the robot is located at the start of the match
	public int location() {
		return locationValue;
	}
	//Updates the value fms so that the field elements display is correct
	public void updateFMS(String fms) {
		this.fms = fms;
	}
	//Shows the smart dashboard on the computer
	public void showDashboard() {
		smartDashboard.setVisible(true);
	}
	//Updates all the components on the smart dashboard so that they are up do date
	public void update(String fms, double leftEncoder, double rightEncoder, double gyro){

		eL.setText(Double.toString(leftEncoder));
		eR.setText(Double.toString(rightEncoder));
		gyroShow.setText(Double.toString(gyro));
			
		if(team == 0) {
			if(fms.charAt(0) == 'L') {
				cSwitchL.setBackground(Color.BLUE);
				cSwitchR.setBackground(Color.RED);
			}
			else {
				cSwitchL.setBackground(Color.RED);
				cSwitchR.setBackground(Color.BLUE);
			}
			if(fms.charAt(1) == 'L') {
				scaleL.setBackground(Color.BLUE);
				scaleR.setBackground(Color.RED);
			}
			else {
				scaleL.setBackground(Color.RED);
				scaleR.setBackground(Color.BLUE);
			}
			if(fms.charAt(2) == 'L') {
				fSwitchL.setBackground(Color.BLUE);
				fSwitchR.setBackground(Color.RED);
			}
			else {
				fSwitchL.setBackground(Color.RED);
				fSwitchR.setBackground(Color.BLUE);
			}
		}
		else if(team == 1) {
			if(fms.charAt(0) == 'L') {
				cSwitchL.setBackground(Color.RED);
				cSwitchR.setBackground(Color.BLUE);
			}
			else {
				cSwitchL.setBackground(Color.BLUE);
				cSwitchR.setBackground(Color.RED);
			}
			if(fms.charAt(1) == 'L') {
				scaleL.setBackground(Color.RED);
				scaleR.setBackground(Color.BLUE);
			}
			else {
				scaleL.setBackground(Color.BLUE);
				scaleR.setBackground(Color.RED);
			}
			if(fms.charAt(2) == 'L') {
				fSwitchL.setBackground(Color.RED);
				fSwitchR.setBackground(Color.BLUE);
			}
			else {
				fSwitchL.setBackground(Color.BLUE);
				fSwitchR.setBackground(Color.RED);
			}
		}
		
	}
	//camera feedback, sensors
	//For auto pass and int showing field position based on Jack's input 
	
}
