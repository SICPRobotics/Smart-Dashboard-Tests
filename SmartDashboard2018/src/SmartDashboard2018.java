import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SmartDashboard2018 {
	
	private int locationValue;
	
	private JFrame smartDashboard = new JFrame("5822 Smart Dashboard");
	
	private JPanel mainBackground = new JPanel();
	private JPanel autoMove = new JPanel();
	private JPanel infoPanel = new JPanel();
	
	private JLabel locationLabel = new JLabel();
	private JLabel codeLabel = new JLabel();
	private JLabel encoderLA = new JLabel();
	private JLabel encoderLB = new JLabel();
	private JLabel encoderRA = new JLabel();
	private JLabel encoderRB = new JLabel();
	private JLabel pidLabel = new JLabel();
	private JLabel gyro = new JLabel();
	
	private JTextField gyroShow = new JTextField();
	
	private JTextField locationShow = new JTextField();
	private JTextField codeShow = new JTextField();
	private JTextField kP = new JTextField();
	private JTextField kI = new JTextField();
	private JTextField kD = new JTextField();
	
	private JTextField eLACount = new JTextField();
	private JTextField eLARawCount = new JTextField();
	private JTextField eLADistance = new JTextField();
	private JTextField eLAPeriod = new JTextField();
	private JTextField eLARate = new JTextField();
	private JTextField eLADirection = new JTextField();
	private JTextField eLAStopped = new JTextField();
	
	private JTextField eLBCount = new JTextField();
	private JTextField eLBRawCount = new JTextField();
	private JTextField eLBDistance = new JTextField();
	private JTextField eLBPeriod = new JTextField();
	private JTextField eLBRate = new JTextField();
	private JTextField eLBDirection = new JTextField();
	private JTextField eLBStopped = new JTextField();
	
	private JTextField eRACount = new JTextField();
	private JTextField eRARawCount = new JTextField();
	private JTextField eRADistance = new JTextField();
	private JTextField eRAPeriod = new JTextField();
	private JTextField eRARate = new JTextField();
	private JTextField eRADirection = new JTextField();
	private JTextField eRAStopped = new JTextField();
	
	private JTextField eRBCount = new JTextField();
	private JTextField eRBRawCount = new JTextField();
	private JTextField eRBDistance = new JTextField();
	private JTextField eRBPeriod = new JTextField();
	private JTextField eRBRate = new JTextField();
	private JTextField eRBDirection = new JTextField();
	private JTextField eRBStopped = new JTextField();
	
	
	private JButton left = new JButton();
	private JButton center = new JButton();
	private JButton right = new JButton();
	
	private Color wolfbyteRed = new Color(133, 6, 8);
	private Color wolfbyteGrey = new Color(150, 150, 150);
	
	public SmartDashboard2018() {
		smartDashboard.setDefaultCloseOperation(smartDashboard.EXIT_ON_CLOSE);
		smartDashboard.setSize(500, 750);
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
		
		infoPanel.setBounds(15, 135, 460, 560);
		infoPanel.setLayout(null);
		infoPanel.setBackground(wolfbyteGrey);
		infoPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Sensors")));
		infoPanel.add(encoderLA);
		infoPanel.add(encoderLB);
		infoPanel.add(encoderRA);
		infoPanel.add(encoderRB);
		infoPanel.add(eLACount);
		infoPanel.add(eLADirection);
		infoPanel.add(eLADistance);
		infoPanel.add(eLAPeriod);
		infoPanel.add(eLARate);
		infoPanel.add(eLARawCount);
		infoPanel.add(eLAStopped);
		infoPanel.add(eLBCount);
		infoPanel.add(eLBDirection);
		infoPanel.add(eLBDistance);
		infoPanel.add(eLBPeriod);
		infoPanel.add(eLBRate);
		infoPanel.add(eLBRawCount);
		infoPanel.add(eLBStopped);
		infoPanel.add(eRACount);
		infoPanel.add(eRADirection);
		infoPanel.add(eRADistance);
		infoPanel.add(eRAPeriod);
		infoPanel.add(eRARate);
		infoPanel.add(eRARawCount);
		infoPanel.add(eRAStopped);
		infoPanel.add(eRBCount);
		infoPanel.add(eRBDirection);
		infoPanel.add(eRBDistance);
		infoPanel.add(eRBPeriod);
		infoPanel.add(eRBRate);
		infoPanel.add(eRBRawCount);
		infoPanel.add(eRBStopped);
		infoPanel.add(pidLabel);
		infoPanel.add(kP);
		infoPanel.add(kI);
		infoPanel.add(kD);
		infoPanel.add(gyro);
		infoPanel.add(gyroShow);
		
		gyro.setBounds(15, 405, 100, 20);
		gyro.setText("Gyro");
		gyro.setBorder(BorderFactory.createRaisedBevelBorder());
		gyro.setBackground(new Color(244, 209, 170));
		
		gyroShow.setBounds(15, 425, 426, 115);
		gyroShow.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Degrees")));
		gyroShow.setBackground(new Color(244, 209, 170));
		gyroShow.setFont(new Font("Times New Roman", Font.BOLD, 48));
		gyroShow.setEditable(false);

		
		pidLabel.setBounds(15, 335, 100, 20);
		pidLabel.setText("PID");
		pidLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		pidLabel.setBackground(new Color(244, 209, 170));
		
		kP.setBounds(15, 355, 100, 40);
		kP.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KP")));
		kP.setBackground(new Color(244, 209, 170));
		kP.setEditable(false);
		
		kI.setBounds(125, 355, 100, 40);
		kI.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KI")));
		kI.setBackground(new Color(244, 209, 170));
		kI.setEditable(false);
		
		kD.setBounds(235, 355, 100, 40);
		kD.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KD")));
		kD.setBackground(new Color(244, 209, 170));
		kD.setEditable(false);
		
		encoderLA.setBounds(15, 20, 100, 25);
		encoderLA.setText("Encoder Left A");
		encoderLA.setBorder(BorderFactory.createRaisedBevelBorder());
		eLACount.setBounds(15, 45, 100, 40);
		eLACount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Count")));
		eLACount.setBackground(new Color(244, 209, 170));
		eLACount.setEditable(false);
		eLADirection.setBounds(15, 85, 100, 40);
		eLADirection.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Direction")));
		eLADirection.setBackground(new Color(244, 209, 170));
		eLADirection.setEditable(false);
		eLADistance.setBounds(15, 125, 100, 40);
		eLADistance.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Distance")));
		eLADistance.setBackground(new Color(244, 209, 170));
		eLADistance.setEditable(false);
		eLAPeriod.setBounds(15, 165, 100, 40);
		eLAPeriod.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Period")));
		eLAPeriod.setBackground(new Color(244, 209, 170));
		eLAPeriod.setEditable(false);
		eLARate.setBounds(15, 205, 100, 40);
		eLARate.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Rate")));
		eLARate.setBackground(new Color(244, 209, 170));
		eLARate.setEditable(false);
		eLARawCount.setBounds(15, 245, 100, 40);
		eLARawCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Raw Count")));
		eLARawCount.setBackground(new Color(244, 209, 170));
		eLARawCount.setEditable(false);
		eLAStopped.setBounds(15, 285, 100, 40);
		eLAStopped.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Stopped")));
		eLAStopped.setBackground(new Color(244, 209, 170));
		eLAStopped.setEditable(false);
		
		encoderLB.setBounds(125, 20, 100, 25);
		encoderLB.setText("Encoder Left B");
		encoderLB.setBorder(BorderFactory.createRaisedBevelBorder());
		eLBCount.setBounds(125, 45, 100, 40);
		eLBCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Count")));
		eLBCount.setBackground(new Color(244, 209, 170));
		eLBCount.setEditable(false);
		eLBDirection.setBounds(125, 85, 100, 40);
		eLBDirection.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Direction")));
		eLBDirection.setBackground(new Color(244, 209, 170));
		eLBDirection.setEditable(false);
		eLBDistance.setBounds(125, 125, 100, 40);
		eLBDistance.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Distance")));
		eLBDistance.setBackground(new Color(244, 209, 170));
		eLBDistance.setEditable(false);
		eLBPeriod.setBounds(125, 165, 100, 40);
		eLBPeriod.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Period")));
		eLBPeriod.setBackground(new Color(244, 209, 170));
		eLBPeriod.setEditable(false);
		eLBRate.setBounds(125, 205, 100, 40);
		eLBRate.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Rate")));
		eLBRate.setBackground(new Color(244, 209, 170));
		eLBRate.setEditable(false);
		eLBRawCount.setBounds(125, 245, 100, 40);
		eLBRawCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Raw Count")));
		eLBRawCount.setBackground(new Color(244, 209, 170));
		eLBRawCount.setEditable(false);
		eLBStopped.setBounds(125, 285, 100, 40);
		eLBStopped.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Stopped")));
		eLBStopped.setBackground(new Color(244, 209, 170));
		eLBStopped.setEditable(false);
		
		encoderRA.setBounds(235, 20, 100, 25);
		encoderRA.setText("Encoder Right A");
		encoderRA.setBorder(BorderFactory.createRaisedBevelBorder());
		eRACount.setBounds(235, 45, 100, 40);
		eRACount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Count")));
		eRACount.setBackground(new Color(244, 209, 170));
		eRACount.setEditable(false);
		eRADirection.setBounds(235, 85, 100, 40);
		eRADirection.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Direction")));
		eRADirection.setBackground(new Color(244, 209, 170));
		eRADirection.setEditable(false);
		eRADistance.setBounds(235, 125, 100, 40);
		eRADistance.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Distance")));
		eRADistance.setBackground(new Color(244, 209, 170));
		eRADistance.setEditable(false);
		eRAPeriod.setBounds(235, 165, 100, 40);
		eRAPeriod.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Period")));
		eRAPeriod.setBackground(new Color(244, 209, 170));
		eRAPeriod.setEditable(false);
		eRARate.setBounds(235, 205, 100, 40);
		eRARate.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Rate")));
		eRARate.setBackground(new Color(244, 209, 170));
		eRARate.setEditable(false);
		eRARawCount.setBounds(235, 245, 100, 40);
		eRARawCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Raw Count")));
		eRARawCount.setBackground(new Color(244, 209, 170));
		eRARawCount.setEditable(false);
		eRAStopped.setBounds(235, 285, 100, 40);
		eRAStopped.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Stopped")));
		eRAStopped.setBackground(new Color(244, 209, 170));
		eRAStopped.setEditable(false);
		
		encoderRB.setBounds(345, 20, 100, 25);
		encoderRB.setText("Encoder Left B");
		encoderRB.setBorder(BorderFactory.createRaisedBevelBorder());
		eRBCount.setBounds(345, 45, 100, 40);
		eRBCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Count")));
		eRBCount.setBackground(new Color(244, 209, 170));
		eRBCount.setEditable(false);
		eRBDirection.setBounds(345, 85, 100, 40);
		eRBDirection.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Direction")));
		eRBDirection.setBackground(new Color(244, 209, 170));
		eRBDirection.setEditable(false);
		eRBDistance.setBounds(345, 125, 100, 40);
		eRBDistance.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Distance")));
		eRBDistance.setBackground(new Color(244, 209, 170));
		eRBDistance.setEditable(false);
		eRBPeriod.setBounds(345, 165, 100, 40);
		eRBPeriod.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Period")));
		eRBPeriod.setBackground(new Color(244, 209, 170));
		eRBPeriod.setEditable(false);
		eRBRate.setBounds(345, 205, 100, 40);
		eRBRate.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Rate")));
		eRBRate.setBackground(new Color(244, 209, 170));
		eRBRate.setEditable(false);
		eRBRawCount.setBounds(345, 245, 100, 40);
		eRBRawCount.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Raw Count")));
		eRBRawCount.setBackground(new Color(244, 209, 170));
		eRBRawCount.setEditable(false);
		eRBStopped.setBounds(345, 285, 100, 40);
		eRBStopped.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Stopped")));
		eRBStopped.setBackground(new Color(244, 209, 170));
		eRBStopped.setEditable(false);
		
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
	
	public int location() {
		return locationValue;
	}
	public void update(){

		
	}
	//camera feedback, sensors
	//For auto pass and int showing field position based on Jack's input 
	
}
