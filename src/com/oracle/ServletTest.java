package com.oracle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.controller.UserController;
import com.oracle.entry.User;



public class ServletTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		User u=new User();
		PrintWriter wr=resp.getWriter();
		try {
			String username=req.getParameter("username");
			u.setUserName(username);
			String name=req.getParameter("name");
			u.setName(name);
			String password=req.getParameter("password");
			u.setPassWord(password);
			String brithday=req.getParameter("brithday");
			u.setBrithday(brithday);
			String sex=req.getParameter("sex");
			u.setSex(sex);
			String[] str=req.getParameterValues("hobby");
			String like = "";
			for (String str1 : str) {
				like=like+str1+",";
			}
			u.setHobby(like);
			String tel=req.getParameter("tel");
			u.setTel(tel);
			String idcard=req.getParameter("idcard");
			u.setIdcard(idcard);
			String email=req.getParameter("email");
			u.setEmail(email);
			String adressload=req.getParameter("adressload");
			u.setAdressload(adressload);
			
			UserController userc=new UserController();
			userc.register(u);
			if (userc.st.equals("×¢²á³É¹¦")){
				resp.sendRedirect("DengLu.html");
			}else{
				resp.sendRedirect("ZhuCeShiBai.html");
			}
			//wr.println("</body>");
			//wr.print("</html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
