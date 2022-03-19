package application;

import db.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 " +
                    "WHERE DepartmentId = 1");

            int
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 " +
                    "WHERE DepartmentId = 2");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
