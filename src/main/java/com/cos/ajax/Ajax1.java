package com.cos.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajax1")
public class Ajax1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Ajax1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청데이터가 key value 형태이면 이렇게 하면된다.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username : " + username);
		System.out.println("password: "+password);
		
		//응답하면
		PrintWriter out = response.getWriter();
		out.print("ok");
		out.flush();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//요청데이터가 key value 형태이면 이렇게 하면된다.
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				System.out.println("username : " + username);
				System.out.println("password: "+password);
				
				String jsonData = "{\"username\":\"ssar\",\"password\":\"1234\"}";
				
				//서버가 응답데이터의 형태를 브라우저에게 알려준다.
				response.setContentType("application/json");
				PrintWriter out = response.getWriter();
				out.print(jsonData);
				out.flush();
	}

}
