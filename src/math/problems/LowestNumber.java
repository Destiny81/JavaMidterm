package math.problems;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mysql.cj.jdbc.exceptions.SQLError;
import databases.ConnectToSqlDB;

public class LowestNumber {



    public static void main(String[] args)
    {
        /*
         * Write java solution to find the lowest number from this array.
         * Use one of the databases from mysql or mongodb to store and to retrieve.
       */
        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
//find lowest number from the array
        int num = array[0];
        int len = array.length;
        for (int i =1; i < len; i++) {
            if (array[i] < num) {
                num = array[i];
            }
        }
        System.out.println("The lowest number from the array is:" + num);
     ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
     List<String> lowestValue = new ArrayList<String>();
     try {
       connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
           lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

       } catch (Exception e) {
            e.printStackTrace();
       }
       System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
      for (String st : lowestValue) {
           System.out.println(st);
       }
   }
}
