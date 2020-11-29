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
	 JPanel p_logo; //로고를 넣을 패널
		JPanel p_input; //아이디 패스워드 로그인버튼 넣을 패널
		JPanel p_signfind; //회원가입 아이디/비밀번호찾기 넣을 패널
		JPanel p_exit; //종료 넣을 패널
		
		JPanel p_idpass; //아이디 패스워드 패널 붙일 패널
		JPanel p_id;//아이디입력창 넣을 패널
		JPanel p_pass;//패스워드 입력창 넣을 패널
		JPanel p_loginbt;//로그인버튼 넣을 패널
		
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
			bt_login = new JButton("로그인");
			
			signup = new JLabel("회원가입");
			find_id = new JLabel("아이디");
			find_pass = new JLabel("/비밀번호 찾기");
			exit = new JLabel("종료");
			
			logo=new JLabel(icon);
			//패널에 로고 넣기 @
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
			
			//아이디 패널
			p_id.add(t_id);
			p_id.setBackground(Color.white);
			
			//패스워드 패널
			p_pass.add(t_pass);
			p_pass.setBackground(Color.white);
			
			//그리드패널에 아이디 패스워드 부착
			p_idpass.setLayout(new GridLayout(2,1));
			p_idpass.add(p_id);
			p_idpass.add(p_pass);
			p_idpass.setBackground(Color.white);
			
			//로그인 버튼 패널
			p_loginbt.add(bt_login);
			p_loginbt.setBackground(Color.white);
			
			//아이디 패스워드 로그인버튼 부착 @
			p_input.add(p_idpass, BorderLayout.WEST);
			p_input.add(p_loginbt, BorderLayout.EAST);
			p_input.setPreferredSize(new Dimension(1200,100));
			p_input.setBackground(Color.white);
			
			
			//패널에 회원가입 부착
			p_signup.add(signup);
			p_signup.setBackground(Color.white);
			
			//패널에 아이디/비밀번호 찾기 부착
			p_find.add(find_id);
			p_find.add(find_pass);
			p_find.setBackground(Color.white);
			
			//패널에 회원가입, 아이디/비밀번호 찾기  부착 @
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
			
			//패널에 종료 부착 @
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
						System.out.println("아이디,비밀번호를 입력해");
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
