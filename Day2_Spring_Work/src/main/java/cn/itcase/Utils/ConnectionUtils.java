package cn.itcase.Utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    private ThreadLocal<Connection> t1 = new ThreadLocal<>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Connection getConnection() {
        try {
            //先从Connection上获取
            Connection conn = t1.get();
            //判断当前线程是否有连接
            if (conn == null) {
                conn = dataSource.getConnection();
                t1.set(conn);
            }
            return conn;
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }
}
