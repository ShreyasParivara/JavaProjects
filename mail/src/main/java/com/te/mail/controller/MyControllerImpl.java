package com.te.mail.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.mail.dao.ComposeData;
import com.te.mail.model.Drafts;
import com.te.mail.model.Register;
import com.te.mail.service.Services;

@Controller
public class MyControllerImpl implements MyController {
	@Autowired
	Services service;

	@GetMapping("/compose")
	public String compose() {
		return "compose";
	}

	@Override
	@GetMapping("/register")
	public String register() {
		return "register";

	}

	@Override
	@PostMapping("/store")
	public String save(ModelMap map, Register reg) {

		if (service.store(reg)) {
			return "success";
		}
		return "error";
	}

	@Override
	@PostMapping("/validate")
	public String validate(ModelMap map, String mailid, String upass, HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("email", mailid);
		String name = service.validate(mailid, upass);
		session.setAttribute("name", name);

		if (name != null) {
			map.addAttribute("name", name);
			return "home";
		}
		return "invalid";
	}

	@Override
	@PostMapping("/send")
	public String send(ModelMap map, ComposeData compose, String button, Drafts drafts) {
		switch (button) {
		case "Send": {
			Boolean save = service.save(compose);
			if(save==true) {
			return "sent";
			}
			else
				return "notsent";
		}
		case "Draft": {
			saveDrafts(drafts);
			return "savedraft";
		}
		}
		return "notsent";
	}

	@Override
	@GetMapping("/inbox")
	public String inbox(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		Object emailId = session.getAttribute("email");
		List<ComposeData> inbox = service.getInbox(emailId);
		map.addAttribute("inbox", inbox);
		return "inbox";
	}

	@Override
	@GetMapping("/sent")
	public String sent(HttpServletRequest req, ModelMap map) {
		HttpSession session = req.getSession(false);
		Object emailId = session.getAttribute("email");
		List<ComposeData> sent = service.getSent(emailId);
		map.addAttribute("sentitem", sent);
		return "sentitems";

	}

	@Override
	@GetMapping("/draft")
	public String drafts(ModelMap map,HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		Object attribute = session.getAttribute("email");
		System.out.println(attribute);
		List<Drafts> drafts = service.getdrafts(attribute);
		map.addAttribute("drafts",drafts);
		return "drafts";
	}

	public void saveDrafts(Drafts drafts) {
		service.saveDraft(drafts);
		
	}

	@Override
	@GetMapping("/forgot")
	public String forgot() {
		return "changepassword";
	}

	@Override
	@PostMapping("/change")
	public String change(String mailId, String newPassword) {
		if(service.change(mailId, newPassword)) {
			return "changesuccess";
		}
		return "changeerror";
	}

}
