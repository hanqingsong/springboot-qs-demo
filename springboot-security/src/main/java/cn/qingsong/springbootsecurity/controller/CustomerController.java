package cn.qingsong.springbootsecurity.controller;

import cn.qingsong.springbootsecurity.model.Customer;
import cn.qingsong.springbootsecurity.repository.CustomerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hanqingsong on 18/9/29.
 *
 * @author hanqingsong
 * @date 18/9/29
 */
@Controller
public class CustomerController {
    @Autowired
    CustomerJpaRepository customerJpaRepository;

    @RequestMapping(value = "/listCustomers.html", method = RequestMethod.GET)
    public ModelAndView customer() {
        List<Customer> allCustomer = customerJpaRepository.findAll();
        return new ModelAndView("allCustomerss", "customers", allCustomer);
        // return new ModelAndView("allCustomerss");
    }

    @RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
    public String newEmployee(Customer employee) {

        customerJpaRepository.save(employee);
        return ("redirect:/list.html");

    }

    @RequestMapping(value = "/newCustomer.html", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public ModelAndView addNewEmployee() {

        Customer emp = new Customer();

        return new ModelAndView("newCustomer", "form", emp);

    }
}
