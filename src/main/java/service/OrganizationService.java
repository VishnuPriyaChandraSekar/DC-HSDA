package service;

import configuration.DBUtils;
import models.Organization;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrganizationService {
	public Organization findOrganizationById(String id) {
		JdbcTemplate jdbcTemplate = DBUtils.getJdbcTemplate();
		List<Organization> organization = jdbcTemplate.query("SELECT * FROM organization WHERE id=?", new Object[]{id},
				(rs, row) -> new Organization(rs.getString("id"), rs.getString("name"), rs.getString("alternate_name"), rs.getString("description"), rs.getString("email"), rs.getString("url"),
						rs.getString("tax_status"), rs.getString("tax_id"), rs.getString("year_incorporated"), rs.getString("legal_status"))
		);

		return organization.get(0);
	}
}
