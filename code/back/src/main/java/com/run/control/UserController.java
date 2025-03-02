package com.run.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.run.entity.User;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/user")
public class UserController {
	private void setRHeader(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Methods", "*");
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Credentials","true");
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public JSONObject handlelogin(@RequestBody String liString,HttpServletRequest request, HttpServletResponse response) {
		setRHeader(request, response);
		JSONObject userinfo = JSONObject.fromObject(liString);
		JSONObject feedback = new JSONObject();
		User user = new User();
		user.setUsername(userinfo.getString("username"));
		user.setPassword(userinfo.getString("password"));
		if (user.getUsername()=="SF") {
			feedback.put("response", "S");
			feedback.put("body", "");
		}
		return feedback;
	}
	
}
