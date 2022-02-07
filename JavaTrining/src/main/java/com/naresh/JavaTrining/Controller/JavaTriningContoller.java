package com.naresh.JavaTrining.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naresh.JavaTrining.Dao.JavaTriningRepository;
import com.naresh.JavaTrining.Model.JavaTriningModel;
import com.naresh.JavaTrining.Service.*;

@Controller
//@RequestMapping(value="/StudentHome")
public class JavaTriningContoller {
	@Autowired
	JavaTriningService javaTriningService;
	@GetMapping
	public String studentViewPage() {
		return "StudentHome";
	}
    @GetMapping("/showStudentPage")
	public String studentsViewHomePage(Model model) {
    	model.addAttribute("ListStudents", javaTriningService.getAllStudentsDetails());
    	return "index";
    }
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
    	JavaTriningModel javaTriningModel=new JavaTriningModel();
    	model.addAttribute("javaTriningModel", javaTriningModel);
    	
    	return "new_student";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("javaTriningModel")  JavaTriningModel javaTriningModel) {
    	javaTriningService.saveStudent(javaTriningModel);
    	return "redirect:/";
    }
    @GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id,Model model) {
		JavaTriningModel javaTriningModel=javaTriningService.getStudentById(id);
		model.addAttribute("javaTriningModel", javaTriningModel);
		
		return "update_student";
    }
    
    
    @GetMapping("/studentDeleteById/{id}")
    public String deleteStudent(@PathVariable(value = "id") long id) {
    	
    	this.javaTriningService.deleteStudentById(id);
    	return "redirect:/";
    }
	/*
	 * @PutMapping("/StudentUpdate") public JavaTriningModel
	 * update(@ModelAttribute("javaTriningModel") JavaTriningModel javaTriningModel)
	 * { return javaTriningService.saveStudent(javaTriningModel); }
	 */

}
