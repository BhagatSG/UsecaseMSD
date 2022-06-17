package msd.usecase.view.repository;

/**
 * Created by bhagat on 5/20/19.
 */

import msd.usecase.view.model.SecondQueryOutput;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SecondQueryOutputRepository implements ISecondQueryOutputRepository {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    @Override
    public List<SecondQueryOutput> findAll()  {

        List<SecondQueryOutput> output = new ArrayList<SecondQueryOutput>();

        try {
            Class.forName(driverName);
            System.out.println("After Class: ");
            Connection con = DriverManager.getConnection(
                    "jdbc:hive2://", "hiveuser", "hivepassword");
            System.out.println("After Connection: ");
            Statement stmt = con.createStatement();

            String tableName = "second_query_output";

            String sql = "select * from msdusecase." + tableName;
            System.out.println("Running: " + sql);
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(2));
                output.add(new SecondQueryOutput(res.getString(0),res.getInt(1),res.getString(2),res.getDouble(3)));
            }
            res.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        return output;
    }

}
