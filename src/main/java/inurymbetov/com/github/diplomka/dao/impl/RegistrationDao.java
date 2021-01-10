package inurymbetov.com.github.diplomka.dao.impl;

import inurymbetov.com.github.diplomka.dao.AbDao;
import inurymbetov.com.github.diplomka.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationDao extends AbDao<User> {

    public void insert(User user) {
        sql = "INSERT INTO users (first_name, secand_name, login, password, phone, role) VALUES(?,?,?,?,?,?)";
        getJdbcTemplate().update(sql, user.getFirstName(), user.getSecondName(), user.getLogin(), user.getPassword(), user.getPhone(), user.getRole());
    }

    @Override
    protected User mapper(ResultSet rs, int index) throws SQLException {
        return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
    }
}
