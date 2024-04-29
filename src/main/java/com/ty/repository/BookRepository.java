package com.ty.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Book> searchBooks(String keyword) {
		String sql = "SELECT * FROM books WHERE title LIKE ? OR author LIKE ? OR isbn LIKE ?";
		Object[] params = new Object[] { "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%" };
		return jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<>(Book.class));
	}

}
