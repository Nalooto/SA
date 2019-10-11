package threeLayer.BUS;

import threeLayer.DAO.userDAO;
import threeLayer.VO.userVO;

import java.sql.ResultSet;

public class userBUS {
    public class UserBUS
    {
        private userDAO _userDAO;

        /// <constructor>
        /// Constructor UserBUS
        /// </constructor>
        public UserBUS()
        {
            _userDAO  = new userDAO();
        }

        /// <method>
        /// Get User Email By Firstname or Lastname and return VO
        /// </method>
        public userVO getUserEmailByName(String name)
        {
            userVO _userVO = new userVO();
            try {
                ResultSet resultSet = _userDAO.searchByName(name);
                while(resultSet.next())
                {
                    _userVO.set_idUser(resultSet.getInt(1));
                    _userVO.set_firstname(resultSet.getString(2));
                    _userVO.set_lastname(resultSet.getString(3));
                    _userVO.set_email(resultSet.getString(4));
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return _userVO;
        }


        public userVO getUserById(String _id)
        {
            userVO _userVO = new userVO();
            try {
                ResultSet resultSet = _userDAO.searchById(_id);
                while(resultSet.next())
                {
                    _userVO.set_idUser(resultSet.getInt(1));
                    _userVO.set_firstname(resultSet.getString(2));
                    _userVO.set_lastname(resultSet.getString(3));
                    _userVO.set_email(resultSet.getString(4));
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return _userVO;
        }
    }

}
