package cn.itcase.jdbc;
import java.sql.*;

public class jdbcDemo1 {
        public static void main(String[] args) throws SQLException {
                //1注册驱动
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                //2获取连
                Connection conn = DriverManager.getConnection("jdbc:mysql:///class1", "root", "root");
                //3获取操作数据库的预处理对象
                PreparedStatement pset = conn.prepareStatement("select * from account  WHERE id=1");
                //4执行sql得到结果集
                ResultSet rs = pset.executeQuery();
                //5遍历结果集
                while (rs.next()) {
                        System.out.println(rs.getString("name"));
                }
                //6.释放资源
                rs.close();
                pset.close();
                conn.close();
        }
}
