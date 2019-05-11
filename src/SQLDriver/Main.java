package SQLDriver;


import Models.Datasource;
import Models.Users;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        /*List<Users> users = datasource.loginUsers();
        if(users == null) {
            System.out.println("No users!");
            return;
        }

        for(Users user : users) {
            System.out.println("ID = " + user.getId() + ", Name = " + user.getEmail());
        }*/

        datasource.close();
    }
}

