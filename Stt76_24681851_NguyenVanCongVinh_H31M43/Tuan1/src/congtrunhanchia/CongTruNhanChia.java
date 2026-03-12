package congtrunhanchia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CongTruNhanChia extends JFrame implements ActionListener{
	
	
	private JLabel lcenter1;
	private JPanel pcenter1;
	private JPanel pcenter2;
	private JPanel pcenter3;
	private JLabel lcenter2;
	private JLabel lcenter3;
	private JRadioButton cbutton1;
	private JRadioButton cbutton2;
	private JRadioButton cbutton3;
	private JRadioButton cbutton4;
	private JPanel psouth;
	private JPanel psouth1;
	private JPanel psouth2;
	private JPanel psouth3;
	private JPanel pcenter4;
	private JPanel pnorth;
	private JLabel lnorth;
	private JPanel pwest;
	private JLabel lwest1;
	private JButton wb1;
	private JButton wb2;
	private JButton wb3;
	private JTextField ctextField3;
	private JTextField ctextField1;
	private JTextField ctextField2;

	public CongTruNhanChia() {
		super("Cộng - Trừ - Nhân - Chia");
		Box boxContainer = Box.createVerticalBox();
		//NORTH
		 pnorth = new JPanel();
		  lnorth = new JLabel("Cộng Trừ Nhân Chia");
		  lnorth.setForeground(Color.BLUE);
		 pnorth.add(lnorth);
		 lnorth.setFont(new Font("Arial",Font.BOLD,30));
		 
		 
		 
		 //West
		  pwest = new JPanel();
		 pwest.setLayout(new BoxLayout(pwest,BoxLayout.Y_AXIS));
		 
		  lwest1 = new JLabel("Chọn Tác Vụ");
		  wb1 = new JButton("Giải ");
		  wb1.addActionListener(this);
		  wb1.setMaximumSize(new Dimension(100,30));
		  wb2 = new JButton(" Xóa ");
		  wb2.addActionListener(this);
		  wb2.setMaximumSize(new Dimension(100,30));
		 wb3 = new JButton("Thoát");
		 wb3.addActionListener(this);
		 wb1.setAlignmentX(JLabel.CENTER);
		 wb2.setAlignmentX(JLabel.CENTER);
		 wb3.setAlignmentX(JLabel.CENTER);
		 boxContainer.add(Box.createVerticalGlue());
		 
		 pwest.add(lwest1);
		 pwest.add(wb1);
		 pwest.add(wb2);
		 pwest.add(wb3);
		 
		 // Center
		 
		 JPanel pcenter = new JPanel();
		 pcenter.setBorder(BorderFactory.createTitledBorder("Tính Toán"));
		 pcenter.setLayout(new BoxLayout(pcenter, BoxLayout.Y_AXIS));
		 
		 
		  pcenter1 = new JPanel();
		  pcenter2 = new JPanel();
		  pcenter3 = new JPanel();
		  pcenter4 = new JPanel();
		 
		  lcenter1 = new JLabel("Nhập a: ");
		  lcenter2 = new JLabel("Nhập b: ");
		  lcenter3 = new JLabel("Kết quả: ");
		 
		  cbutton1 = new JRadioButton("Cộng");
		  cbutton1.addActionListener(this);
		  cbutton1.setSelected(true);
		  cbutton2 = new JRadioButton("Trừ");
		  cbutton2.addActionListener(this);
		  cbutton3 = new JRadioButton("Nhân");
		  cbutton3.addActionListener(this);
		  cbutton4 = new JRadioButton("Chia");
		  cbutton4.addActionListener(this);
		 
		 pcenter1.add((Component) lcenter1);
		 ctextField1 = new JTextField(40);
		 pcenter1.add(ctextField1 );
		 
		 pcenter2.add(lcenter2);
		  ctextField2 = new JTextField(40);
		 pcenter2.add(ctextField2 );
		 
//		 pcenter3.setPreferredSize(new Dimension(90,90));
		 pcenter3.setBorder(BorderFactory.createTitledBorder("Phép Toán"));
		 pcenter3.setLayout(new GridLayout(2,2));
		 
		 pcenter3.add(cbutton1);
		 pcenter3.add(cbutton2 );
		 pcenter3.add(cbutton3 );
		 pcenter3.add(cbutton4 );
		 
		 pcenter4.add(lcenter3);
		 ctextField3 = new JTextField(40);
		 ctextField3.setEditable(false);
		 pcenter4.add(ctextField3 );
		 

		 pcenter.add(pcenter1);
		 pcenter.add(pcenter2);
		 pcenter.add(pcenter3);
		 pcenter.add(pcenter4);
		 
		 
		 // SOUTH
		  psouth = new JPanel();
		  psouth1 = new JPanel(); psouth1.setBackground(Color.blue);
		  psouth2 = new JPanel(); psouth2.setBackground(Color.red);		 
		  psouth3 = new JPanel(); psouth3.setBackground(Color.yellow);
		 
		 psouth.setBackground(Color.red);
		 psouth.add(psouth1);
		 psouth.add(psouth2);
		 psouth.add(psouth3);
		 
		 
		 
		 
		 add(pnorth,BorderLayout.NORTH);
		 add(pwest,BorderLayout.WEST);
		 add(pcenter,BorderLayout.CENTER);
		 add(psouth,BorderLayout.SOUTH);
		 setSize(600,600);
		 setVisible(true);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 
		 
	}
	
	public static void main(String[] args) {
		new CongTruNhanChia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==wb1) {
			double a=0,b=0;
			String a1,b1 = null;
			String res = "";
			a = Integer.parseInt(ctextField1.getText());
			b = Integer.parseInt(ctextField2.getText());
			
			if(cbutton1.isSelected()) {
				
				res = String.valueOf(a+b);
				
				
			}else if(cbutton2.isSelected()){
				
				res = String.valueOf(a-b);
				
			}else if(cbutton3.isSelected()) {
				
				
				res = String.valueOf(a*b);
			}else if(cbutton4.isSelected()) {
				
				res = String.valueOf(a/b);
			}
			ctextField3.setText(res);
		}else if(e.getSource()==wb2) {
			ctextField3.setText("");
			ctextField2.setText("");
			ctextField1.setText("");
				
		}else if(e.getSource()==wb3) {
			System.exit(0);
		}
		
	}
}
