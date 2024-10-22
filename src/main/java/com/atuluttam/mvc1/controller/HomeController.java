package com.atuluttam.mvc1.controller;
import com.atuluttam.mvc1.Model.Student;
import com.atuluttam.mvc1.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class HomeController {
        @RequestMapping("/")
        public String indexpage()
        {
             return "index";
        }
         @RequestMapping ("/greet")
         public String welcome( Model m)
         {
            String myname= "Atul Kumar Uttam";
            m.addAttribute("name", myname);
            return "home";
        }
        @GetMapping("/add")
        public String calculatorform()
        {
            return "calculator" ;
        }
        @PostMapping ("/addition")
        public  String addition(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b, Model m)
        {
          m.addAttribute("num1", a);
          m.addAttribute("num2", b);
            Integer c= a+b;
            m.addAttribute("total", c);
            return "sum";
        }
        @GetMapping("/addemp")
        public String addempform()
        {
            return "EmployeeForm";
        }
        @PostMapping("/displayemp")
        public String emp(@RequestParam("username") String name, @RequestParam("password") String pass, Model m)
        {
            m.addAttribute("username", name);
            m.addAttribute("password", pass);
           return "EmployeeData";
        }


    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/student")
    public String StudentForm()
    {
        return "studentform";
    }
    @RequestMapping("/savestudent")
    public String SaveStudent(@ModelAttribute Student student, Model m)
    {      studentRepo.save(student);
            m.addAttribute("msg", "Student Saved!!!!");
        return "savesuccess";
    }


    @RequestMapping("/getall")
    public String getallStudents(Model model)
    {
        List<Student> studentList = studentRepo.findAll();


        model.addAttribute("students", studentList);
        return "all";
    }




}