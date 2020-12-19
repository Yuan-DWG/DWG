package com.itgaoshu.service.impl;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.dao.EmpMapper;
import com.itgaoshu.service.SelectEmpListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class selectEmpListServiceImpl implements SelectEmpListService {
    @Resource
    private EmpMapper empMapper;
    //映射缓存注解
    @Cacheable("selectEmpList")
    public List<Emp> selectEmpList(){
        String a="lol";
        String b="Lol";
        String c="lol";
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(b));
        System.out.println("^(*￣(oo)￣)^");
        return empMapper.selectAll();
    }
}
