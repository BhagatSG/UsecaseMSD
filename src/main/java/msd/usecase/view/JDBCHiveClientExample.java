package msd.usecase.view;

import java.sql.*;

/**
 * Created by bhagat on 5/20/19.
 */
public class JDBCHiveClientExample {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public static void main(String[] args) throws SQLException {

        System.out.println("Inside Main: ");
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println("After Class: ");
        Connection con = DriverManager.getConnection(
                "jdbc:hive2://", "hiveuser", "hivepassword");
        System.out.println("After Connection: ");
        Statement stmt = con.createStatement();

        String tableName = "msd_usecase_data";

        String sql = "describe msdusecase." + tableName;
        System.out.println("Running: " + sql);
        ResultSet res = stmt.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(2));
        }
        res.close();
        stmt.close();
        con.close();
    }

    }
