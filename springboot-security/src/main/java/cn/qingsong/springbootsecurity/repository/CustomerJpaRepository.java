package cn.qingsong.springbootsecurity.repository;

import cn.qingsong.springbootsecurity.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
public interface CustomerJpaRepository extends JpaRepository<Customer,Long> {
}
