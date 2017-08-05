import java.sql.*;

/**
 * Created by Mustafa on 8/5/2017.
 */
public class LoginDao {
    String sql = "select * from login where uname=? and pass=?"; //query
    String url = "jdbc:mysql://localhost:3306/testing"; //database name is testing
    String username = "mustu"; //database username
    String password = "admin"; //database pass
    public boolean checkAuth(String uname, String pass)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password); //connect to db using credintials
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);

            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;

    }
}
