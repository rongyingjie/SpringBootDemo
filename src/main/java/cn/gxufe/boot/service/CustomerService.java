package cn.gxufe.boot.service;

import cn.gxufe.boot.mapper.CustomerMapper;
import cn.gxufe.boot.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 燕赤侠 2016-10-16
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public List<String> getCitys(){
        List<String> list = new ArrayList<String>();
        list.add("beijing");
        list.add("shanghai");
        list.add("guangzhou");
        System.out.println("----------------------");
      //  List<Customer> customers = customerMapper.selectAll();
      //  System.out.println(customers);
        List<Customer> select = customerMapper.select(null);
        System.out.println(select);

        Customer byId = customerMapper.getById(1);
        System.out.println(byId);

        return list;
    }

}
