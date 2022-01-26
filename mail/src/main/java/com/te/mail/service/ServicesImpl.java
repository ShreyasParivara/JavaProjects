package com.te.mail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.mail.dao.ComposeData;
import com.te.mail.dao.Database;
import com.te.mail.model.Drafts;
import com.te.mail.model.Register;
@Service
public class ServicesImpl implements Services {
	@Autowired
	Database dao;

	@Override
	public Boolean store(Register reg) {
		
		if(dao.store(reg)) {
			return true;
		}
		return false;
	}

	@Override
	public String validate(String mailid, String upass) {
		String name=dao.fetch(mailid,upass);
		if(name==null) {
			return null;
		}
		return name;
	}

	@Override
	public Boolean save(ComposeData compose) {
		if(dao.save(compose)) {
			return true;
		}
		return false;
	}

	@Override
	public List<ComposeData> getInbox(Object emailId) {
		List<ComposeData> inbox = dao.getInbox(emailId);
		return inbox;
	}

	@Override
	public List<ComposeData> getSent(Object emailId) {
		List<ComposeData> sent = dao.getSent(emailId);
		return sent;
		
	}

	@Override
	public List<Drafts> getdrafts(Object emailId) {
		return dao.getDrafts(emailId);
		
	}

	@Override
	public Boolean saveDraft(Drafts drafts) {
		return dao.saveDraft(drafts);
	}

	@Override
	public Boolean change(String mailId, String newPassword) {
		
		return dao.change(mailId, newPassword);
	}
	

}
