package HelperDate;



import Model.entity.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Repository
public class HelperDate { // trả về một chuỗi 17-07-2006
    @Autowired
    private SessionFactory sessionFactory;
   public Timestamp date(){
       Date utilDate=new Date();
       java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(utilDate.getTime());
      return sqlTimestamp;
   }

    public List<Blog> finAllByDate() {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();//SELECT id, name, form_id, DATE(updated_at) as date
      /*  FROM wp_frm_items
        WHERE user_id = 11 && form_id=9
        ORDER BY updated_at DESC*/
//        List<Blog> listBlog = ("from Blog where blogDate = :blogDate").setParameter("blogDate", blogDate).list();
        List<Blog> listBlog = session.createQuery("from Blog order by blogDate DESC").list();
        session.getTransaction().commit();
        session.close();
        return listBlog;

    }


}


