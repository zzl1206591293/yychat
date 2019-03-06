package ClientLogin;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class FriendList extends JFrame{
    //成员变量
	
	JPanel myFriendPanel;
	
	JButton myFriendButton;
	JScrollPane myFriendJScrollpane;//滚动列表
	JPanel myFriendListJPanel;
	
	JPanel myStrangerBlackList;
	JButton myStrangerButton;
	JButton BlackListButton;
	
	public static final int MYFRIENDCOUNT=51;
	JLabel[] myFriendLabel=new JLabel[MYFRIENDCOUNT];//对象数组
	public FriendList(){
		
		myFriendPanel=new JPanel(new BorderLayout());//边界布局
		//System.out.println(myFriendPanel.getLayout());
		myFriendButton=new JButton("我的好友");
		myFriendPanel.add(myFriendButton,"North");
		
		myFriendListJPanel=new JPanel(new GridLayout(MYFRIENDCOUNT-1,1));
		for(int i=1;i<MYFRIENDCOUNT;i++){
			myFriendLabel[i]=new JLabel(i+"",new ImageIcon("images/yy2.gif"),JLabel.LEFT);
			myFriendListJPanel.add(myFriendLabel[i]);
		  }
		myFriendJScrollpane=new JScrollPane(myFriendListJPanel);
		myFriendPanel.add(myFriendJScrollpane);
		
		myStrangerButton=new JButton("陌生人");
		BlackListButton=new JButton("黑名单");
		myFriendPanel.add(myStrangerButton,"South");
		this.add(BlackListButton,"South");
		this.add(myFriendPanel);
		this.setSize(200, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		FriendList friendList=new FriendList();
	}

}
