package HelperDate;



import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;


@Repository
public class HelperDate { // trả về một chuỗi 17-07-2006
   public Timestamp date(){
       Date utilDate=new Date();
       java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(utilDate.getTime());
      return sqlTimestamp;
   }
}


