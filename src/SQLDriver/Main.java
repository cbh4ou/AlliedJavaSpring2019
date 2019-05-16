package SQLDriver;


import Models.Users;
import java.sql.SQLException;

import java.util.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        u datasource = new u();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

       
      ArrayList<Users> list = datasource.queryETable();
            Object[] row = new Object[5];

                System.out.println(list);
            
        datasource.close();
            
    }
}

