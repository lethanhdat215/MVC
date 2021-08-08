package Helper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

@Component
public  class Helper {

    public int random() {
        int code = (int) Math.floor(((Math.random() * 89999) + 10000));
        return code;
    }

}