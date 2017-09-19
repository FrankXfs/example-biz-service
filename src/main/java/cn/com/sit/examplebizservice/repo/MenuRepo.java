package cn.com.sit.examplebizservice.repo;


import cn.com.sit.examplebizservice.model.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by frank on 15/08/2017.
 */
public interface MenuRepo extends JpaRepository<Menu, Integer> {
     Menu findByKey(String key);
}
