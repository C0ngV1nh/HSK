package phuongtrinhbac2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ptbac2 extends JFrame implements ActionListener{
	
	private JPanel pnort;
	private JLabel lnorth;
	private JPanel pcen;
	private JPanel pcen1;
	private JPanel pcen2;
	private JPanel pcen3;
	private JPanel pcen4;
	private JLabel lcen1;
	private JLabel lcen2;
	private JLabel lcen3;
	private JLabel lcen4;
	private JTextField texcen1;
	private JTextField texcen2;
	private JTextField texcen3;
	private JTextField texcen4;
	private JPanel psouth;
	private JButton but1;
	private JButton but2;
	private JButton but3;


	public ptbac2(){
		pnort = new JPanel();
		lnorth = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2");
		pnort.setBackground(Color.CYAN);
		lnorth.setFont(new Font("Arial",Font.BOLD,40));
		pnort.add(lnorth);
		
		
		
		pcen = new JPanel();
		pcen.setLayout(new BoxLayout(pcen,BoxLayout.Y_AXIS));
		pcen1 = new JPanel();
		pcen2 = new JPanel();
		pcen3 = new JPanel();
		pcen4 = new JPanel();
		
		lcen1 = new JLabel("Nhập a: ");
		lcen2 = new JLabel("Nhập b: ");
		lcen3 = new JLabel("Nhập c: ");
		lcen4 = new JLabel("Kết quả: ");
		
		texcen1 = new JTextField(20);	
		texcen2 = new JTextField(20);		
		texcen3 = new JTextField(20);		
		texcen4 = new JTextField(20);		
		
		
		pcen1.setLayout(new BoxLayout(pcen1, BoxLayout.X_AXIS));
		pcen1.add(lcen1);
		pcen1.add(Box.createHorizontalStrut(10));
		texcen1.setMaximumSize(new Dimension(Integer.MAX_VALUE,texcen1.getPreferredSize().height));
		pcen1.add(texcen1);
		
		pcen2.setLayout(new BoxLayout(pcen2, BoxLayout.X_AXIS));
		pcen2.add(lcen2);
		pcen2.add(Box.createHorizontalStrut(10));
		texcen2.setMaximumSize(new Dimension(Integer.MAX_VALUE,texcen2.getPreferredSize().height));
		pcen2.add(texcen2);
		
		pcen3.setLayout(new BoxLayout(pcen3, BoxLayout.X_AXIS));
		pcen3.add(lcen3);
		pcen3.add(Box.createHorizontalStrut(10));
		texcen3.setMaximumSize(new Dimension(Integer.MAX_VALUE,texcen3.getPreferredSize().height));
		pcen3.add(texcen3);
		
		pcen4.setLayout(new BoxLayout(pcen4, BoxLayout.X_AXIS));
		pcen4.add(lcen4);
		pcen4.add(Box.createHorizontalStrut(10));
		texcen4.setMaximumSize(new Dimension(Integer.MAX_VALUE,texcen4.getPreferredSize().height));
		pcen4.add(texcen4);
		texcen4.setEditable(false);
		
		
		
		pcen.add(pcen1);
		pcen.add(Box.createVerticalStrut(10));
		pcen.add(pcen2);
		pcen.add(Box.createVerticalStrut(10));
		pcen.add(pcen3);
		pcen.add(Box.createVerticalStrut(10));
		pcen.add(pcen4);
		
		
		
		
		
		psouth = new JPanel();
		psouth.setPreferredSize(new Dimension(100,100));
		
		psouth.setBorder(BorderFactory.createTitledBorder("Chọn Tác Vụ"));
		
		but1 = new JButton("Giải");
		but2 = new JButton("Xóa Rỗng");
		but3 = new JButton("Thoát");
		
		psouth.add(but1);
		psouth.add(but2);
		psouth.add(but3);
		
			
		
		//action
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		
		texcen1.addActionListener(this);
		texcen2.addActionListener(this);
		texcen3.addActionListener(this);
		
		
	
		
		setSize(600,500);
		add(pcen,BorderLayout.CENTER);
		add(pnort,BorderLayout.NORTH);
		add(psouth,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
				
	}
	
	
	public static void main(String[] args) {
		new ptbac2();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src==but1) {
			double delta;
		
			int a = 0;
			int b = 0;
			int c = 0;
			
			if((texcen1.getText().isBlank() || texcen1.getText().isEmpty()) || (texcen2.getText().isBlank() || texcen2.getText().isEmpty()) || (texcen3.getText().isBlank() || texcen3.getText().isEmpty()) ) {
				System.out.println("Khong duoc phep rong!");
			}
			
			try {
				 a = Integer.parseInt(texcen1.getText());
				 b = Integer.parseInt(texcen2.getText());
				 c = Integer.parseInt(texcen3.getText());
				
			}catch(Exception e1){
				System.out.println("cannot parse " + e1.getMessage());
				return;
			}
			
			delta = Math.pow(b,2)-4*a*c;
			
			if(delta<0) {
				texcen4.setText("Khong co nghiem!");
			}else if(delta>0) {
				texcen4.setText("co 2 nghiem!");
			}else {
				texcen4.setText("Co Nghiem kep!");
			}
			
			
			
			
		}else if(src==but2) {
			texcen1.setText("");
			texcen2.setText("");
			texcen3.setText("");
			texcen4.setText("");
		}else if(src==but3) {
			System.exit(0);
		}
		
		
	}


}
