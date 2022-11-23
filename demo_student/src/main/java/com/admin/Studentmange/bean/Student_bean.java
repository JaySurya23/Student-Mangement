package com.admin.Studentmange.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.admin.Studentmange.dao.StudentDao;
import com.admin.Studentmange.web.Student_model;

@Controller
@RequestMapping("/")
public class Student_bean {

	@RequestMapping("/addStudent")
	public ModelAndView addStudent(HttpServletRequest req) throws SQLException
	
	{
		StudentDao sd = new StudentDao();
		ModelAndView mv= new ModelAndView();
		Student_model s = new Student_model();
		s.setFullname(req.getParameter("fullname"));
		s.setGender(req.getParameter("gender"));
		s.setEmail(req.getParameter("email"));
		s.setDOB(req.getParameter("DOB"));
		s.setContact(req.getParameter("contact"));
		s.setCity(req.getParameter("city"));			
		sd.addStduent(s);
		mv.setViewName("redirect:/getAll");
		return mv;
	
	}
	
	@RequestMapping("/getAll")
	public ModelAndView showAllStudnet() throws SQLException
	{
		ModelAndView mv= new ModelAndView();
		StudentDao dao=new StudentDao();
		ArrayList<Student_model> list=dao.showAllStudent();
	    mv.addObject("studentdata",list);
	    mv.setViewName("showdata");
		return mv;   
	}
	
	@RequestMapping("/deletedata")
	public ModelAndView deletedata(HttpServletRequest req) throws SQLException
	{
		ModelAndView mv= new ModelAndView();
		StudentDao dao=new StudentDao();
		int id = Integer.parseInt(req.getParameter("id"));
		dao.deletedata(id);
		mv.addObject("studentdata",dao.showAllStudent());
		mv.setViewName("showdata");
		return mv;
	}
	
	@RequestMapping("/getdata")
	public ModelAndView getdata(HttpServletRequest req) throws SQLException
	{
		ModelAndView mv= new ModelAndView();
		StudentDao dao=new StudentDao();
		int id = Integer.parseInt(req.getParameter("id"));
		mv.addObject("data",dao.getdataById(id));
		mv.setViewName("updatedata");
		return mv;
	}
	
	@RequestMapping("/updatedata")
	public ModelAndView updatedata(HttpServletRequest req) throws SQLException 
	{
		ModelAndView mv= new ModelAndView();
		StudentDao dao=new StudentDao();
		Student_model s = new Student_model();
		s.setId(Integer.parseInt(req.getParameter("id")));
		s.setFullname(req.getParameter("fullname"));
		s.setGender(req.getParameter("gender"));
		s.setEmail(req.getParameter("email"));
		s.setDOB(req.getParameter("DOB"));
		s.setContact(req.getParameter("contact"));
		s.setCity(req.getParameter("city"));	
		dao. updatedata(s);
		mv.addObject("studentdata",dao.showAllStudent());
		mv.setViewName("showdata");
		return mv;
	}
//		@RequestMapping("/DuplicateEmail")
//	public ModelAndView checkDuplicateEmail(HttpServletRequest req)
//	{
//		ModelAndView mv= new ModelAndView();
//		Student_model s = new Student_model();
//		s.setEmail(req.getParameter("email"));
//		return mv;		
//	}
	
	}
	
	

