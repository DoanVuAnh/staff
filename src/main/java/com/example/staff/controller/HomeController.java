package com.example.staff.controller;

import com.example.staff.model.Staff;
import com.example.staff.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class HomeController {
    StaffService staffService;

    public void HomeController(){
        staffService = new StaffService();
    }


    @GetMapping("/display")
    public String listEmployee(Model model) {
        model.addAttribute("list", staffService.findAll());
        return "display";
    }

    @GetMapping("/create")
    public String showCreate() {
        return "create";
    }
    @PostMapping("/create")
    public String create(HttpServletRequest request, HttpServletResponse response, Model model) {
        //đối tượng Model: dùng để gắn kèm dữ liệu gửi đi cho view
        //đối tượng Request: dùng để nhận giá trị từ đường dẫn tương ứng của JSP
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        staffService.save(new Staff(id, name));
        model.addAttribute("staff", staffService.findAll()); //phương thức thêm giá trị cho đối tượng Model
        return "display";
    }
    @GetMapping("/edit")
    public String showEdit(HttpServletRequest request, Model model, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Staff staff = null;
        for (Staff staff1 :
                staffService.findAll()) {
            if (staff1.getId() == id) {
                staff = staff1;
                break;
            }
        }
        model.addAttribute("staff", staff);
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(HttpServletRequest request, Model model, HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = request.getParameter("address");
        Staff staff = staffService.findById(id);
        staffService.update(staffService.findAll().indexOf(staff), new Staff(id, name));
        model.addAttribute("list", staffService.findAll());
        return "display";
    }

    @GetMapping("/delete")
    public String showDelete(HttpServletRequest request, Model model, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Staff staff = null;
        for (Staff staff1 :
                staffService.findAll()) {
            if (staff1.getId() == id) {
                staff = staff1;
                break;
            }
        }
        model.addAttribute("staff", staff);
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(HttpServletRequest request, Model model, HttpServletResponse response)  {

        int id = Integer.parseInt(request.getParameter("id"));
        staffService.delete(staffService.findById(id));
        model.addAttribute("list", staffService.findAll());
        return "display";
    }

}
