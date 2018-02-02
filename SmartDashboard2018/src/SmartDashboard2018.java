import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SmartDashboard2018 {
	
	private int locationValue;
	private final String[] ALLIANCE = {"BLUE", "RED"};
	private String fms = "RLR";
	
	private double nkP = 0;
	private double nkI = 0;
	private double nkD = 0;
	
	private JFrame smartDashboard = new JFrame("5822 Smart Dashboard");
	
	
	
	JComboBox<String> alliance = new JComboBox<String>(ALLIANCE);
	
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
	private JLabel pidLabel = new JLabel();
	private JLabel fieldElementsDisplay = new JLabel();
	private JLabel cSwitch = new JLabel();
	private JLabel scale = new JLabel();
	private JLabel fSwitch = new JLabel();
	
	private JTextField gyroShow = new JTextField();
	
	private JTextField locationShow = new JTextField();
	private JTextField codeShow = new JTextField();
	private JTextField kP = new JTextField();
	private JTextField kI = new JTextField();
	private JTextField kD = new JTextField();
	
	private JTextField eL = new JTextField();
	private JTextField eR = new JTextField();
	
	
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
		infoPanel.add(encoderL);
		infoPanel.add(encoderR);
		infoPanel.add(eL);
		infoPanel.add(eR);
		infoPanel.add(kP);
		infoPanel.add(kI);
		infoPanel.add(kD);
		infoPanel.add(gyro);
		infoPanel.add(gyroShow);
		infoPanel.add(pidLabel);
		infoPanel.add(fieldElementsDisplay);
		infoPanel.add(alliance);
		infoPanel.add(cSwitchL);
		infoPanel.add(cSwitchR);
		infoPanel.add(scaleL);
		infoPanel.add(scaleR);
		infoPanel.add(fSwitchL);
		infoPanel.add(fSwitchR);
		infoPanel.add(cSwitch);
		infoPanel.add(scale);
		infoPanel.add(fSwitch);
		
		fieldElementsDisplay.setBounds(15, 335, 110, 20);
		fieldElementsDisplay.setText("Field Elements");
		fieldElementsDisplay.setBorder(BorderFactory.createRaisedBevelBorder());
		
		alliance.setBounds(130, 335, 110, 20);
		
		fSwitchL.setBounds(15, 360, 50, 50);
		fSwitchR.setBounds(75, 360, 50, 50);
		fSwitch.setBounds(130, 360, 110, 50);
		fSwitch.setBorder(BorderFactory.createRaisedBevelBorder());
		fSwitch.setText("Other Switch");
		
		cSwitchL.setBounds(15, 480, 50, 50);
		cSwitchR.setBounds(75, 480, 50, 50);
		cSwitch.setBounds(130, 480, 110, 50);
		cSwitch.setBorder(BorderFactory.createRaisedBevelBorder());
		cSwitch.setText("Your Switch");
		
		scaleL.setBounds(15, 420, 50, 50);
		scaleR.setBounds(75, 420, 50, 50);
		scale.setBounds(130, 420, 110, 50);
		scale.setBorder(BorderFactory.createRaisedBevelBorder());
		scale.setText("Scale");
		
		gyro.setBounds(15, 185, 100, 20);
		gyro.setText("Gyro");
		gyro.setBorder(BorderFactory.createRaisedBevelBorder());
		gyro.setBackground(new Color(244, 209, 170));
		
		gyroShow.setBounds(15, 205, 426, 115);
		gyroShow.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("Degrees")));
		gyroShow.setBackground(new Color(244, 209, 170));
		gyroShow.setFont(new Font("Times New Roman", Font.BOLD, 48));
		gyroShow.setEditable(false);

		
		pidLabel.setBounds(15, 105, 100, 20);
		pidLabel.setText("PID");
		pidLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		pidLabel.setBackground(new Color(244, 209, 170));
		
		kP.setBounds(15, 125, 100, 50);
		kP.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KP")));
		kP.setBackground(new Color(244, 209, 170));
		
		kI.setBounds(125, 125, 100, 50);
		kI.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KI")));
		kI.setBackground(new Color(244, 209, 170));
		
		kD.setBounds(235, 125, 100, 50);
		kD.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(), BorderFactory.createTitledBorder("KD")));
		kD.setBackground(new Color(244, 209, 170));
		
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
	
	public int location() {
		return locationValue;
	}
	public double kPreturn() {
		try {
			nkP = Double.valueOf(kP.getText());
			return nkP;
		}
		catch(Exception e) {
			return 0;
		}
	}
	public double kIreturn() {
		try {
			nkI = Double.valueOf(kI.getText());
			return nkI;
		}
		catch(Exception e) {
			return 0;
		}
	}
	public double kDreturn() {
		try {
			nkD = Double.valueOf(kD.getText());
			return nkD;
		}
		catch(Exception e) {
			return 0;
		}
	}
	public void setFieldDataDisplay(String fmsData) {
		
		fms = fmsData;
		
	}
	public void update(){

		String allianceSelect = (String) alliance.getSelectedItem();
		
		if(allianceSelect.equals("BLUE")) {
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
		else if(allianceSelect.equals("RED")) {
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
