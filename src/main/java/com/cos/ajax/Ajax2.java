package com.cos.ajax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/ajax2")
public class Ajax2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Ajax2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//JSON 요청데이터는 request getparameter로 못받는다 버퍼로 받아야함
		BufferedReader br = request.getReader();//http body 데이터 읽기
		String requestData = br.readLine();//한번에 읽기 큰데이터가 아니므로
		System.out.println(requestData);
		
		//요청 받은 JSON데이터를 자바오브젝트로 바꾸기
		Gson gson = new Gson();
		//gson.fromJson() =>json을 자바 오브젝트로
		//gson.toJson()=>자바 오브젝트를 json으로
		
		UserDto userDto = gson.fromJson(requestData, UserDto.class);
		
		
		//응답을 JSON으로 하기
		User user = new User();
		user.setId(1);
		user.setUsername("love");
		user.setPassword("1234");
		user.setPhone("0102222");
		
		String userJson  = gson.toJson(user);
		PrintWriter out = response.getWriter();
		out.print(userJson);
		
	}

}
