package com.itgaoshu.controller;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.service.SelectEmpListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Empcontroller1 {
    @Resource
    private SelectEmpListService selectEmpListService;
    @RequestMapping("selectEmpList.do")
//    public List<Emp> selectEmpList(){
////
////        return selectEmpListService.selectEmpList();
////    }
    public String selectEmpList(Model model){
        List<Emp> emps = selectEmpListService.selectEmpList();
        model.addAttribute("emps",emps);
        return "List";
    }
}
