package com.shivam.mvc.controllor;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeControllor {
	
	private Book book;
	
	@Autowired
	public WelcomeControllor(Book book) {
		this.book=book;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView greetEveryOne() {
		//
		System.out.println("This is first Controllor:greetEveryOne:Method");
		System.out.println("Loading JSP file to show welcome message");
		
		ModelAndView mv=new ModelAndView();
		
		// View Name : JSP file Name
		mv.setViewName("welcome");
		
		// Data " Added : Model : Business data
		
		String messageToStudents="Welcome to our first mvc project using spring boot web module";
		
		mv.addObject("msg", messageToStudents);
		
		return mv;
		
	}
	
	@RequestMapping("/viewallbook")
	public ModelAndView viewAllBook() {
		ArrayList<Book> books=new ArrayList<>();
		books.add(new Book(1, "Java", "HariKrishna"));
		books.add(new Book(2, "Oracle", "S.Ladhha"));
		books.add(new Book(3, "Adv. Java", "Maipathii"));
		books.add(new Book(4, "Spring", "Natraz"));
		books.add(new Book(5, "C", "Kishor"));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("viewallbook");
		mv.addObject("listOFBooks", books);
		return mv;
	}
	
	
}
