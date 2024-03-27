/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ncb.hibernatedemo;

import com.ncb.pojo.Category;
import com.ncb.pojo.Comment;
import com.ncb.pojo.OrderDetail;
import com.ncb.pojo.ProdTag;
import com.ncb.pojo.Product;
import com.ncb.pojo.SaleOrder;
import com.ncb.pojo.Tag;
import com.ncb.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ncanh
 */
public class HibernateUtils {
    private static final SessionFactory factory;
    
    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
//        Properties props = new Properties();
//        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL, "jdbc:mysql://localhost/saledb");
//        props.put(Environment.USER, "root");
//        props.put(Environment.PASS, "Admin@123");
//        props.put(Environment.SHOW_SQL, "true");
//        conf.setProperties(props);
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(ProdTag.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(registry);
    }

    /**
     * @return the factory
     */
    public static SessionFactory getFactory() {
        return factory;
    }
    
}