package inurymbetov.com.github.diplomka.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbDao<T> {
    protected String sql;

    private static DataSource source;

    public static JdbcTemplate getJdbcTemplate() throws DataAccessException {
        return new JdbcTemplate(source == null ? source = getDriverManagerDataSource() : source);
    };

    private static DriverManagerDataSource getDriverManagerDataSource(){
        DriverManagerDataSource driver = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/koro", "koro", "koro");
        driver.setDriverClassName("org.postgresql.Driver");
//        driver.setUrl("jdbc:postgresql://localhost:5432/koro");
//        driver.setUsername("koro");
//        driver.setPassword("koro");
        return driver;
    }

    protected Object[]                  setParam(Object... args) { return args; }

    protected abstract T                mapper(ResultSet rs, int index) throws SQLException;
}
