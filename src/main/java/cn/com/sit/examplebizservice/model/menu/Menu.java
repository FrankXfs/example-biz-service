package cn.com.sit.examplebizservice.model.menu;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by frank on 15/08/2017.
 */
@Data
@Entity
public class Menu {
    @Id
    private String id;

    @Column(name = "skey")
    private String key;

    @Column
    private String title;

    @Column
    private String icon;

    @Column
    private String type;

    @Column
    private String link;

    @Column
    private String parentkey;
}
