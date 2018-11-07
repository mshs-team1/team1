package com.bdqn.action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Houseuser;
import javafx.scene.control.TableRow;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.metamodel.source.annotations.HibernateDotNames;
import util.HibernateUtil;

import java.util.List;

public class LoginAction extends ActionSupport {

    private String name;
    private String message;
    private String password;
    private List<Houseuser> list;

    public List<Houseuser> getList() {
        return list;
    }

    public void setList(List<Houseuser> list) {
        this.list = list;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override


    public String execute() throws Exception {
        Session session=HibernateUtil.openSession();
        Transaction tx =session.beginTransaction();
         String hql=" from Houseuser";
           list=session.createQuery(hql).list();
           tx.commit();
        for (Houseuser u:list) {
            if(name.equals(u.getUsername())&&password.equals(u.getPassword())){
                this.setMessage("hello"+name);
                ServletActionContext.getRequest().getSession().setAttribute("uname",name);
                return SUCCESS;
            }
         }
        this.setMessage("用户名密码错误");
        return  "fail";
    }

    @Override
    public void validate() {
        if (this.name.length() == 0 && this.password.length() == 0) {
            addFieldError("name", "用户名密码不能为空");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
