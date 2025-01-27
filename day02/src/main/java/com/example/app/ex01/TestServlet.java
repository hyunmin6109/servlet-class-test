package com.example.app.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET/day02/test....");
		
//		getRequestDispatcher : 요청을 다른 파일에게 전달할 수 있는 객체
//		forward() : 요청과응답 객체를 다른 파일에게 전달하는 기능
//		요청과 응답을 전달하는 과정을 포워딩 이라 한다.
		req.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(req, resp);
	}

}
