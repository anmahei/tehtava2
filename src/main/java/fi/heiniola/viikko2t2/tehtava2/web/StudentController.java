package fi.heiniola.viikko2t2.tehtava2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.heiniola.viikko2t2.tehtava2.domain.Student;


@Controller
public class StudentController {

	@RequestMapping("/hello")
	public String showStudents(Model model) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Toni", "Virtanen"));
		studentList.add(new Student("Sie", "Opiskelija"));
		studentList.add(new Student("Onni", "Omena"));
		System.out.println(studentList);
		
		model.addAttribute("students", studentList);
		return "students";
	}
}
