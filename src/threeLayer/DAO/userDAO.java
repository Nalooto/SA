package threeLayer.DAO;

import java.sql.ResultSet;

public class userDAO {
    private dbConnection conn;

    /// <constructor>
    /// Constructor UserDAO
    /// </constructor>
    public userDAO()
    {
        conn = new dbConnection();
    }

    /// <method>
    /// Get User Email By Firstname or Lastname and return DalaTable
    /// </method>
    public ResultSet searchByName(String _username)
    {
        String sql = "select * from [t01_user] where t01_firstname like @t01_firstname or t01_lastname like @t01_lastname ";
        String[]para=new String[2];
        para[0] = _username;
        para[1] = _username;

        return conn.executeSelectQuery(sql,para);
    }

    /// <method>
    /// Get User Email By Id and return DalaTable
    /// </method>
    public ResultSet searchById(String _id)
    {
        String sql="select * from [t01_id] where t01_id =?";
        String []para=new String[1];
        para[0]=_id;
        return conn.executeSelectQuery(sql,para);

    }

}
