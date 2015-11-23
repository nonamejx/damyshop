package com.bansach.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bansach.model.bo.KhachHangBO;

/**
 * Servlet implementation class doKhachHangXoa
 */
@WebServlet("/doKhachHangXoa")
public class doKhachHangXoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doKhachHangXoa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		String maKhachHang = request.getParameter("maKhachHang");
		
		KhachHangBO khachHangBO = new KhachHangBO();
		try{
			int maKH = Integer.parseInt(maKhachHang);
			khachHangBO.deleteKhachHang(maKH);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/admin/khach-hang");
	}

}
