package configuration;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBUtils {
	private static final JdbcTemplate jdbcTemplate;

	static {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/CodeForDC_Homeless");
		dataSource.setUsername("postgres");
		dataSource.setPassword("test");
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public static JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
