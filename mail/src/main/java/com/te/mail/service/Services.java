package com.te.mail.service;

import java.util.List;

import com.te.mail.dao.ComposeData;
import com.te.mail.model.Drafts;
import com.te.mail.model.Register;

public interface Services {
	public Boolean store(Register reg);
	public String validate(String uname,String upass);
	public Boolean save(ComposeData compose);
	public List<ComposeData> getInbox(Object emailId);
	public List<ComposeData> getSent(Object emailId);
	public List<Drafts> getdrafts(Object emailId);
	public Boolean saveDraft(Drafts drafts);
	public Boolean change(String mailId,String newPassword);
	

}
