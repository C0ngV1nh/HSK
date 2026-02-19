
	import java.awt.BorderLayout;
import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	import javax.swing.BorderFactory;
	import javax.swing.Box;
	import javax.swing.BoxLayout;
	import javax.swing.DefaultListModel;
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollBar;
	import javax.swing.JScrollPane;
	import javax.swing.JTextField;
	import javax.swing.ListModel;
	import javax.swing.ListSelectionModel;

		public class JListPractice extends JFrame implements ActionListener{
			
			private JPanel pNorth;
			private JLabel lNorth;
			private JPanel pSouth;
			private JButton sButton;
			private JButton wButton1;
			private JPanel pWest;
			private JButton wButton2;
			private JButton wButton3;
			private JButton wButton4;
			private JButton wButton5;
			private JButton wButton6;
			private JPanel pCenter;
			private JPanel pCenter1;
			private JPanel pCenter2;
			private JCheckBox cbox;
			private JButton cButton;
			private JTextField tx;
			private JList listNum;
			private JScrollPane srob;
			private DefaultListModel<Integer> lsmd;
			private JList<Integer> ListNum;
			
			public static void main(String[] args) {
				new JListPractice();
				
				
			}

			public JListPractice(){
				// NORTH AREA
				pNorth = new JPanel();
				lNorth = new JLabel("Thao tác trên JList - CheckBox");
				lNorth.setForeground(Color.BLUE);;
				pNorth.add(lNorth);
				
				// WEST
				pWest = new JPanel();
				pWest.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
				pWest.setLayout(new BoxLayout(pWest,BoxLayout.Y_AXIS));
				
				wButton1 = new JButton("Tô đen số chẵn");
				wButton2 = new JButton("Tô đen số lẻ");
				wButton3 = new JButton("Tô đen số nguyên tố");
				wButton4 = new JButton("Bỏ tô đen");
				wButton5 = new JButton("Xóa các giá trị đang tô đen");
				wButton6 = new JButton("Tổng giá trị trong JList");
				
				pWest.add(wButton1);
				pWest.add(Box.createVerticalStrut(3));
				wButton1.addActionListener(this);
				pWest.add(wButton2);
				pWest.add(Box.createVerticalStrut(3));
				wButton2.addActionListener(this);
				pWest.add(wButton3);
				pWest.add(Box.createVerticalStrut(3));
				wButton3.addActionListener(this);
				pWest.add(wButton4);
				pWest.add(Box.createVerticalStrut(3));
				wButton4.addActionListener(this);
				pWest.add(wButton5);
				pWest.add(Box.createVerticalStrut(3));
				wButton5.addActionListener(this);
				pWest.add(wButton6);
				pWest.add(Box.createVerticalStrut(3));
				wButton6.addActionListener(this);
				
				// CENTER
				
				pCenter = new JPanel();
				pCenter.setLayout(new BorderLayout());
				
				
				pCenter1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
				cbox = new JCheckBox("Cho nhập số âm");
				cButton = new JButton("Nhập");
				cButton.addActionListener(this);
				tx = new JTextField(7);
				
				pCenter1.add(cButton);
				pCenter1.add(tx);
				pCenter1.add(cbox);
				
				
				
				
				lsmd = new DefaultListModel<Integer>();
				ListNum = new JList<Integer>(lsmd);
				ListNum.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
				
				ListNum.setSelectedIndex(0);
				srob = new JScrollPane(ListNum);
				
				
				
				
				
				pCenter.add(pCenter1,BorderLayout.NORTH);
				pCenter.add(srob,BorderLayout.CENTER);
				
				
				
				
				
				
				// SOUTH AREA
				pSouth = new JPanel();
				sButton = new JButton("Close The Program");
				pSouth.add(sButton);
				
				
				
				
				
				
				setSize(500,300);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				add(pNorth,BorderLayout.NORTH);
				add(pWest,BorderLayout.WEST);
				add(pCenter,BorderLayout.CENTER);
				add(pSouth,BorderLayout.SOUTH);
				
			
			
				
				
			}
			
			
			
			public boolean stt (int a) {
				int i;
				for(i = 2 ; i < Math.sqrt(a) ; i++) {
					if(a%i==0) return false;
				}
				return true;
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				String input;
				List<Integer> t1;
				int[] t2;
				if(e.getSource()==cButton) {
						input = tx.getText();
					
					
					try{
						int temp;
						temp = Integer.parseInt(input);
						lsmd.addElement(temp);
						tx.selectAll();
						tx.requestFocus();
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(this,"Dữ liệu nhập phải là số nguyên");
						tx.selectAll();
						tx.requestFocus();
						
					}
				
				}else if(e.getSource()==wButton1){
					ListNum.clearSelection();
					 t1 = new ArrayList<>();
					for(int i = 0 ; i < lsmd.getSize(); i++) {
						if(lsmd.get(i)%2==0) {
							t1.add(i);
						}
						
					}
					 t2 = new int[t1.size()];
					 
					 for(int j = 0 ; j < t1.size(); j++) {
						 t2[j] = t1.get(j);
					 }
					ListNum.setSelectedIndices(t2);;		
				}else if(e.getSource()==wButton2){
					ListNum.clearSelection();
					 t1 = new ArrayList<>();
					for(int i = 0 ; i < lsmd.getSize(); i++) {
						if(lsmd.get(i)%2!=0) {
							t1.add(i);
						}
						
					}
					 t2 = new int[t1.size()];
					 
					 for(int j = 0 ; j < t1.size(); j++) {
						 t2[j] = t1.get(j);
					 }
					ListNum.setSelectedIndices(t2);;		
				}
				else if(e.getSource()==wButton3){
					ListNum.clearSelection();
					 t1 = new ArrayList<>();
					for(int i = 0 ; i < lsmd.getSize(); i++) {
						if(stt(lsmd.get(i))) {
							t1.add(i);
						}
						
					}
					 t2 = new int[t1.size()];
					 
					 for(int j = 0 ; j < t1.size(); j++) {
						 t2[j] = t1.get(j);
					 }
					ListNum.setSelectedIndices(t2);;		
				}else if(e.getSource()==wButton4) {
					ListNum.clearSelection();
				}
				else if(e.getSource()==wButton5){
					t1 = new ArrayList<>();
					for(int i = 0 ; i < lsmd.getSize(); i++) {
						if(ListNum.isSelectedIndex(i)) {
							t1.add(i);
						}
						
					}
					for(int j = t1.size()-1 ; j >=0 ; j--) {
						lsmd.remove(t1.get(j));
					}
				}else if(e.getSource()==wButton6) {
					ListNum.clearSelection();
					 t1 = new ArrayList<>();
					for(int i = 0 ; i < lsmd.getSize(); i++) {
						
							t1.add(lsmd.get(i));
						
						
					}
					 int result = t1.stream()
							 .mapToInt(t->t)
							 .sum();
					 
					 JOptionPane.showMessageDialog(this, result);
				}
				
				
				
				
				
				
				
				
				
				
				
				else if(e.getSource()==sButton) {
					System.exit(0);
				}
			}
		}



