package calendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import common.image.ImageUtil;

public class LoginApp extends JPanel{
	LoginApp login;
	 JPanel p_logo; //�ΰ� ���� �г�
		JPanel p_input; //���̵� �н����� �α��ι�ư ���� �г�
		JPanel p_signfind; //ȸ������ ���̵�/��й�ȣã�� ���� �г�
		JPanel p_exit; //���� ���� �г�
		
		JPanel p_idpass; //���̵� �н����� �г� ���� �г�
		JPanel p_id;//���̵��Է�â ���� �г�
		JPanel p_pass;//�н����� �Է�â ���� �г�
		JPanel p_loginbt;//�α��ι�ư ���� �г�
		
		JPanel p_signup;
		JPanel p_find;
		
		JTextField t_id;
		JPasswordField t_pass;
		JButton bt_login;
		
		JLabel signup;
		JLabel find_id;
		JLabel find_pass;
		
		JPanel p_loginfind;
		JPanel p_all;
		
		
		JLabel exit;
		
		JLabel logo;
		ImageIcon icon;
		
		public LoginApp() {
			icon = new ImageIcon("C:/Users/pc/eclipse-workspace/SeProject/src/res/heart.png");
			
			p_logo = new JPanel();
			p_input = new JPanel();
			p_signfind = new JPanel();
			p_exit = new JPanel();
			p_idpass = new JPanel();
			p_id = new JPanel();
			p_pass = new JPanel();
			p_loginbt = new JPanel();
			p_signup = new JPanel();
			p_find = new JPanel();
			p_loginfind = new JPanel();
			p_all = new JPanel();
				
			t_id = new JTextField(30);
			t_pass = new JPasswordField(30);
			bt_login = new JButton("�α���");
			
			signup = new JLabel("ȸ������");
			find_id = new JLabel("���̵�");
			find_pass = new JLabel("/��й�ȣ ã��");
			exit = new JLabel("����");
			
			logo=new JLabel(icon);
			//�гο� �ΰ� �ֱ� @
//			Image img = icon.getImage();
//			img = img.getScaledInstance(100, 45, Image.SCALE_SMOOTH);
//			icon.setImage(img);
//			p_logo.add(icon);
			Image img = icon.getImage();
			img = img.getScaledInstance(100, 45, Image.SCALE_SMOOTH);
			icon.setImage(img);
			
			logo.setPreferredSize(new Dimension(100,150));
			p_logo.add(logo);
			p_logo.setBackground(Color.white);
			p_logo.setPreferredSize(new Dimension(1200,200));
			
			//���̵� �г�
			p_id.add(t_id);
			p_id.setBackground(Color.white);
			
			//�н����� �г�
			p_pass.add(t_pass);
			p_pass.setBackground(Color.white);
			
			//�׸����гο� ���̵� �н����� ����
			p_idpass.setLayout(new GridLayout(2,1));
			p_idpass.add(p_id);
			p_idpass.add(p_pass);
			p_idpass.setBackground(Color.white);
			
			//�α��� ��ư �г�
			p_loginbt.add(bt_login);
			p_loginbt.setBackground(Color.white);
			
			//���̵� �н����� �α��ι�ư ���� @
			p_input.add(p_idpass, BorderLayout.WEST);
			p_input.add(p_loginbt, BorderLayout.EAST);
			p_input.setPreferredSize(new Dimension(1200,100));
			p_input.setBackground(Color.white);
			
			
			//�гο� ȸ������ ����
			p_signup.add(signup);
			p_signup.setBackground(Color.white);
			
			//�гο� ���̵�/��й�ȣ ã�� ����
			p_find.add(find_id);
			p_find.add(find_pass);
			p_find.setBackground(Color.white);
			
			//�гο� ȸ������, ���̵�/��й�ȣ ã��  ���� @
			p_signfind.add(p_signup, BorderLayout.WEST);
			p_signfind.add(p_find, BorderLayout.EAST);
			p_signfind.setBackground(Color.white);
			p_signfind.setPreferredSize(new Dimension(1200,200));
			
			
//			p_loginfind.add(p_input, BorderLayout.NORTH);
//			p_loginfind.add(p_signfind, BorderLayout.NORTH);
		//	p_input.add(p_signfind, BorderLayout.SOUTH);
//			
//			p_loginfind.setLayout(new GridLayout(2,1));
//			p_loginfind.add(p_input);
//			p_loginfind.add(p_signfind);
			
			//�гο� ���� ���� @
			exit.setBackground(Color.white);
			p_exit.add(exit);
			p_exit.setBackground(Color.white);
			p_exit.setPreferredSize(new Dimension(1200,100));
			
			p_all.add(p_logo);
			p_all.add(p_input);
			p_all.add(p_find);
			p_all.add(p_exit);
			p_all.setBackground(Color.white);
			p_all.setPreferredSize(new Dimension(1200,1000));
			
			setBackground(Color.white);
			add(p_all);
			setVisible(true);
			setSize(1200,1000);
			
//			setDefaultCloseOperation(EXIT_ON_CLOSE);
//			setLocationRelativeTo(null);
			
			bt_login.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					if((t_id.getText().toString()==null)) {
						System.out.println("���̵�,��й�ȣ�� �Է���");
					}
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
		}
		
	
	public static void main(String[] args) {
		new LoginApp();
	}

}
