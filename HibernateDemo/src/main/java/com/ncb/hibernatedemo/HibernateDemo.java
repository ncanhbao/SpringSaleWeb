/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ncb.hibernatedemo;

import com.ncb.pojo.Category;
import com.ncb.pojo.Product;
import com.ncb.pojo.Tag;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 * @author ncanh
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("FROM Product");
//            List<Product> cates = q.getResultList();
//
//            cates.forEach(c -> System.out.println(c.getId() + "   " + c.getName()));
//        }

        try (Session s = HibernateUtils.getFactory().openSession()) {
            String kq = "%iPhone%";
            Query q = s.createQuery("FROM Product");
            q.setParameter("iPhone 11");
            //q.setParameter("loc", kq);
            List<Product> cates = q.getResultList();

            cates.forEach(c -> System.out.println(c.getId() + "   " + c.getName()));
        }
    }

}
