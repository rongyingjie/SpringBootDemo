package cn.gxufe.boot.mapper;

import cn.gxufe.boot.pojo.Customer;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 燕赤侠 2016-10-16
 */
public interface CustomerMapper extends com.github.abel533.mapper.Mapper<Customer>{

    @Select("select * from customer where id = #{id}")
    public Customer getById(@Param("id") Integer id);

}
