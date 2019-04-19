package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import yychat.model.Message;
import yychat.model.User;

public class StartServer {
    ServerSocket ss;
	Socket s;
	
	public static HashMap hmSocket=new HashMap<String,Socket>();//���ͣ�ͨ���࣬��ֵ��
	String userName;
	public StartServer(){
		try {
			ss=new ServerSocket(3456);
            System.out.println("�������������ڼ���3456�˿�...");
			while(true){ 
			s=ss.accept();
			System.out.println(s);
			ObjectInputStream ois;
			//������
			ois=new ObjectInputStream(s.getInputStream());
			User user=(User)ois.readObject();
			this.userName=user.getUserName();
			System.out.println(user.getUserName());
			System.out.println(user.getPassWord());
			
			//Server����֤�����Ƿ�123456��
			Message mess=new Message();
			mess.setSender("sender");
			mess.setReceiver(user.getUserName());
			//mess.setContent(content);
			if(user.getPassWord().equals("123456")){//�����á�==��������Ƚ�
				//��Ϣ���ݣ�����һ��Message����
				mess.setMessageType("1");//��֤ͨ��
				
				//����ÿһ���û���Ӧ��Socket
				hmSocket .put(userName, s);
				
				//��ν��ܿͻ���������Ϣ����һ���߳�������
				new ServerReceiverThread(s,hmSocket).start();
			}
			else{
			    mess.setMessageType("0");//��֤��ͨ��
			}
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(mess);
			
		
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
    
	public static void main(String[] args) {
	
}
}
