package com.te.mail.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.ui.ModelMap;

import com.te.mail.dao.ComposeData;
import com.te.mail.model.Drafts;
import com.te.mail.model.Register;

public interface MyController {
	public String register();
	public String save(ModelMap map,Register reg);
	public String validate(ModelMap map,String uname,String upass,HttpServletRequest req);
	public String send(ModelMap map,ComposeData compose,String button,Drafts drafts );
	public String inbox(HttpServletRequest req,ModelMap map);
	public String sent(HttpServletRequest req,ModelMap map);
	public String drafts(ModelMap map,HttpServletRequest req);
	public String forgot();
	public String change(String mailId,String newPassword);
	
	
	

}
