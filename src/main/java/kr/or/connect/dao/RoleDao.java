package kr.or.connect.dao;

import kr.or.connect.dto.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

import static kr.or.connect.dao.RoleDaoSqls.*;

@Repository
public class RoleDao {
    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);

    public RoleDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Role> selectAll() {
        return jdbc.query(SELECT_ALL, Collections.<String, Object>emptyMap(), rowMapper);
    }
}
