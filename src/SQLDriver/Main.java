package SQLDriver;


import static Frames.adminFrame.emp;
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

       
        
            Object[] row = new Object[5];

             
            
        datasource.close();
            
    }
}

