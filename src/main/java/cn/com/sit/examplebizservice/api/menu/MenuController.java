package cn.com.sit.examplebizservice.api.menu;


import cn.com.sit.examplebizservice.model.menu.Menu;
import cn.com.sit.examplebizservice.repo.MenuRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by frank on 15/08/2017.
 */
@RestController
@Transactional
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"Menus"})
public class MenuController {

    @Autowired
    MenuRepo menuRepo;

    @ApiOperation(value = "List of Menus", response = Menu.class)
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List<Menu> getAllMenus() {
        return menuRepo.findAll();
    }


    @ApiOperation(value = "Add new menu", response = Menu.class)
    @RequestMapping(value = "/menu", method = RequestMethod.POST, produces = {"application/json"})
    public Menu addNewMenu(@RequestBody Menu menu, HttpServletRequest req) {

        //OperationResponse resp = new OperationResponse();



            //Product addedProduct = this.productRepo.save(product);
            return this.menuRepo.save(menu);


    }

    @ApiOperation(value = "Update menu", response = Menu.class)
    @RequestMapping(value = "/menu", method = RequestMethod.PUT, produces = {"application/json"})
    public Menu updateMenu(@RequestBody Menu menu, HttpServletRequest req) {

        //OperationResponse resp = new OperationResponse();



        //Product addedProduct = this.productRepo.save(product);
        return this.menuRepo.save(menu);


    }

}
