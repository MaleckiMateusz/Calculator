
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class Core extends JFrame {
	
	JButton but1, but2, but3, but4, but5, but6, 
	but7, but8, but9, but0, butPlus, butMinus, 
	buto,butz,butDivide,butMultiply,butCalculate,
	butUndo,clearAll;

	String stringResult = "";
	JTextField textResult;

	
	public Core() {
		this.setTitle("My Calculator");
		this.setLocationRelativeTo(null);
		this.setSize(270, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Panel();
		this.setVisible(true);
	}
	
	private void Panel() {
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new GridBagLayout());	
		GridBagConstraints gridConstraints = new GridBagConstraints();
		GridBagConstraints gridEnter = new GridBagConstraints();
		
		gridEnter.insets = new Insets(5,5,5,5);
		gridEnter.fill = GridBagConstraints.BOTH;	
		gridConstraints.gridy = 1;
		gridConstraints.gridx = 1;
		gridConstraints.weightx = 50;
		gridConstraints.weighty = 100;
		gridConstraints.insets = new Insets(5,5,5,5);
		gridConstraints.anchor = GridBagConstraints.CENTER;
		gridConstraints.fill = GridBagConstraints.BOTH;
		
		textResult = new JTextField();
		textResult.setHorizontalAlignment(SwingConstants.RIGHT);
		Font font = new Font("Helvetica", Font.PLAIN, 18);
		textResult.setFont(font);
		
		ListenForButton lForBut = new ListenForButton();
		but1 = new JButton("1");
		but1.addActionListener(lForBut);
		but2 = new JButton("2");
		but2.addActionListener(lForBut);
		but3 = new JButton("3");
		but3.addActionListener(lForBut);
		but4 = new JButton("4");
		but4.addActionListener(lForBut);
		but5 = new JButton("5");
		but5.addActionListener(lForBut);
		but6 = new JButton("6");
		but6.addActionListener(lForBut);
		but7 = new JButton("7");
		but7.addActionListener(lForBut);
		but8 = new JButton("8");
		but8.addActionListener(lForBut);
		but9 = new JButton("9");
		but9.addActionListener(lForBut);
		butPlus = new JButton("+");
		butPlus.addActionListener(lForBut);
		but0 = new JButton("0");
		but0.addActionListener(lForBut);
		butMinus = new JButton("-");
		butMinus.addActionListener(lForBut);
		buto = new JButton("(");
		buto.addActionListener(lForBut);
		butz = new JButton(")");
		butz.addActionListener(lForBut);
		butDivide = new JButton("/");
		butDivide.addActionListener(lForBut);
		butMultiply = new JButton("*");
		butMultiply.addActionListener(lForBut);
		butCalculate = new JButton("=");
		butCalculate.addActionListener(lForBut);
		butUndo = new JButton("<");
		butUndo.addActionListener(lForBut);
		clearAll = new JButton("C");
		clearAll.addActionListener(lForBut);
		
		gridConstraints.gridwidth = 20;
		gridConstraints.gridx = 1;
		thePanel.add(textResult,gridConstraints);
		gridConstraints.gridwidth = 1;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		thePanel.add(but1,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but2,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but3,gridConstraints);
		gridConstraints.gridx = 13;
		thePanel.add(butDivide,gridConstraints);	
		gridConstraints.gridx = 17;
		thePanel.add(butUndo,gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		thePanel.add(but4,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but5,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but6,gridConstraints);
		gridConstraints.gridx = 13;
		thePanel.add(butMultiply,gridConstraints);
		gridConstraints.gridx = 17;
		thePanel.add(clearAll,gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		thePanel.add(but7,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but8,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but9,gridConstraints);
		gridConstraints.gridx = 13;
		thePanel.add(butMinus,gridConstraints);
		gridEnter.gridx = 17;
		gridEnter.gridy = 4;
		gridEnter.gridheight = 2;
		thePanel.add(butCalculate,gridEnter);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		thePanel.add(buto,gridConstraints);
		gridConstraints.gridx = 5;
		thePanel.add(but0,gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(butz,gridConstraints);
		gridConstraints.gridx = 13;
		thePanel.add(butPlus,gridConstraints);
	
		this.add(thePanel);	
	}
	
	private class ListenForButton implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			stringResult = textResult.getText();
			
			if(e.getSource() == but1) 
				textResult.setText(stringResult += "1");
			else if(e.getSource() == but2) 
				textResult.setText(stringResult += "2");
			else if(e.getSource() == but3) 
				textResult.setText(stringResult += "3");
			else if(e.getSource() == but4) 
				textResult.setText(stringResult += "4");
			else if(e.getSource() == but5) 
				textResult.setText(stringResult += "5");
			else if(e.getSource() == but6) 
				textResult.setText(stringResult += "6");
			else if(e.getSource() == but7) 
				textResult.setText(stringResult += "7");
			else if(e.getSource() == but8) 
				textResult.setText(stringResult += "8");
			else if(e.getSource() == but9) 
				textResult.setText(stringResult += "9");
			else if(e.getSource() == but0) 
				textResult.setText(stringResult += "0");
			else if(e.getSource() == butPlus) 
				textResult.setText(stringResult += "+");
			else if(e.getSource() == butMinus) 
				textResult.setText(stringResult += "-");
			else if(e.getSource() == butDivide) 
				textResult.setText(stringResult += "/");
			else if(e.getSource() == butMultiply) 
				textResult.setText(stringResult += "*");
			else if(e.getSource() == buto) 
				textResult.setText(stringResult += "(");
			else if(e.getSource() == butz) 
				textResult.setText(stringResult += ")");
			else if(e.getSource() == butUndo) 
			{	
				String stringR = "";
				for(int i=0 ;i<stringResult.length()-1; i++)
					stringR += stringResult.charAt(i);		
				stringResult = stringR;
				textResult.setText(stringResult);
			}
			else if(e.getSource() == clearAll) 
			{
				stringResult = "";
				textResult.setText(stringResult);
			}
			else if(e.getSource() == butCalculate) 
			{
				ONP licz =  new ONP(stringResult);
				Count li = new Count(licz.toString());
				textResult.setText(li.toString());
			}
		}
	}
}
