package ClientLogin;

import java.awt.*;

import javax.swing.*;

public class ClientLogin extends JFrame {//�������̳�
    JLabel jbl1;
	
    JTabbedPane jtp1;//ѡ��齨
    JPanel jp2,jp3,jp4;
    JLabel jbl2,jbl3,jbl4,jbl5;
    JTextField jtf1;
    JPasswordField jpf1;
    JButton jb4;
    JCheckBox jcb1,jcb2;//��ѡ��
    
	JButton jb1,jb2,jb3;
	JPanel jpl1;
    public ClientLogin(){//���췽��
		jbl1=new JLabel(new ImageIcon("images/tou.gif"));
		this.add(jbl1,"North");
		
		jtp1=new JTabbedPane();
		jp2=new JPanel(new GridLayout(3,3));
		jp3=new JPanel();jtf1=new JTextField();
		jp4=new JPanel();jpf1=new JPasswordField();
		jbl2=new JLabel("YY����",JLabel.CENTER);jbl3=new JLabel("YY����",JLabel.CENTER);
		jbl4=new JLabel("��������",JLabel.CENTER);jbl5=new JLabel("�������뱣��",JLabel.CENTER);
        jcb1=new JCheckBox("������½");jcb2=new JCheckBox("��ס����");
		jbl4.setForeground(Color.BLUE);jb4=new JButton(new ImageIcon("images/clear.gif"));
        
		
		jp2.add(jbl2);jp2.add(jtf1);jp2.add(jb4);
		jp2.add(jbl3);jp2.add(jpf1);jp2.add(jbl4);
		jp2.add(jcb1);jp2.add(jcb2);jp2.add(jbl5);
		jtp1.add(jp2,"YY����");jtp1.add(jp3,"�ֻ�����");jtp1.add(jp4,"��������");
		this.add(jtp1);
		
		
		jb1=new JButton(new ImageIcon("images/denglu.gif"));
		jb2=new JButton(new ImageIcon("images/zhuce.gif"));
		jb3=new JButton(new ImageIcon("images/quxiao.gif"));
		jpl1=new JPanel();
		jpl1.add(jb1);jpl1.add(jb2);jpl1.add(jb3);
		this.add(jpl1,"South");
		
		
		this.setSize(350, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		ClientLogin clientLogin=new ClientLogin();

	}

}
