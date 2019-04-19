package yychatClient.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.*;

import yychat.model.Message;

import com.yychat.controller.ClientConnetion;

public class FriendChat1 extends JFrame implements ActionListener{

	JScrollPane jsp;
	JTextArea jta;
	
	JPanel jp;
	JTextField jtf;
	JButton jb;
	
	String sender;
	String receiver;
	
	public FriendChat1(String sender,String receiver){
	    this.sender=sender;
	    this.receiver=receiver;
	
		jta=new JTextArea();
		jta.setEditable(false);
		jta.setForeground(Color.red);
		jsp=new JScrollPane(jta);
		
		jp=new JPanel();
		jb=new JButton("����");
		jb.addActionListener(this);
		jtf=new JTextField(15);
	    jp.add(jtf);jp.add(jb);
	    
	    this.add(jsp,"Center");
	    this.add(jp,"South");
	    this.setTitle(sender+"���ں�"+receiver+"����");
		this.setLocationRelativeTo(null);
		this.setSize(350,240);
		this.setVisible(true);
		
	}
		
	
	
	public static void main(String[] args) {
		//FriendChat friendChat=new FriendChat();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==jb){
			String content=jtf.getText();
			jta.append(content+"\r\n");
			//����Message���󵽷�����
			Message mess=new Message();
			 ObjectOutputStream oos;
			 mess.setContent(content);
		     mess.setSender(sender);
			 mess.setReceiver(receiver);
		     mess.setMessageType(Message.message_common);//common
			try {
				 Socket s=(Socket)ClientConnetion.hmSocket.get(sender);
				 oos=new ObjectOutputStream(s.getOutputStream());
				 oos.writeObject(mess);
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}
	public void appendJta(String chatMessageString){
		jta.append(chatMessageString+"\r");
	}
}