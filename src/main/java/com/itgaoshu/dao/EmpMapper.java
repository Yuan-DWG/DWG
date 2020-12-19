package com.itgaoshu.dao;




import com.itgaoshu.bean.Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
//@Mapper
//@Repository
public interface EmpMapper extends Mapper<Emp>{
//    @Select("select * from emp")
//    public List<Emp> selectEmpList();
}
