package msd.usecase.view.repository;

/**
 * Created by bhagat on 5/20/19.
 */

import msd.usecase.view.model.FirstQueryOutput;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FirstQueryOutputRepository implements IFirstQueryOutputRepository {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    @Override
    public List<FirstQueryOutput> findAll()  {

        List<FirstQueryOutput> output = new ArrayList<FirstQueryOutput>();

        try {
            Class.forName(driverName);
            System.out.println("After Class: ");
            Connection con = DriverManager.getConnection(
                    "jdbc:hive2://", "hiveuser", "hivepassword");
            System.out.println("After Connection: ");
            Statement stmt = con.createStatement();

            String tableName = "first_query_output";

            String sql = "select * from msdusecase." + tableName;
            System.out.println("Running: " + sql);
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(2));
                output.add(new FirstQueryOutput(res.getString(0),res.getInt(1),res.getString(2),res.getDouble(3)));
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
