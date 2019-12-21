package com.ustglobal.mailsimulationapp.dao;

import java.util.List;

import com.ustglobal.mailsimulationapp.dto.MailBean;
import com.ustglobal.mailsimulationapp.dto.UserBean;

public interface IUserDAO {

	public boolean register(UserBean userBean);
	public boolean login(String email, String password);
	public boolean changePassword(UserBean userBean);
	public MailBean sendEmail(MailBean bean, UserBean to, UserBean from);
	public boolean deleteEmail(int id);
	public boolean draftEmail(int id);
	public List<MailBean> viewInbox(int id);
	public List<MailBean> sentItems(int id);
	public List<MailBean> deleteItems(int id);
	public List<MailBean> draftItems(int id);
	
}
