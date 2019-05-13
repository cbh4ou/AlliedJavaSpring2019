package SQLDriver;


import Models.Datasource;
import Models.Users;
import java.sql.SQLException;

import java.util.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

       
        System.out.println(datasource.loginUsers("admin", "admin"));
        datasource.close();
    }
}

