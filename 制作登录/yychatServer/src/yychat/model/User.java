package yychat.model;

import java.io.Serializable;

public class User implements Serializable{
    private String UserName;
    private String PassWord;
	
    public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;//�ֲ���������Ա������ֵ
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		this.PassWord = passWord;
	}
    
}
