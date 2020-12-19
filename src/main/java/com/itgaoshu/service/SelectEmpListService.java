package com.itgaoshu.service;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SelectEmpListService {
    public List<Emp> selectEmpList();

}
