package com.movie.user.management;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
@ComponentScan()
class DatabaseConnectionTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testEntityManager() {
        assertNotNull(entityManager);
    }

    @Test
    public void testDatabaseConnection() throws SQLException {
        assertNotNull(dataSource);

        // 수동으로 데이터베이스 커넥션 테스트
        try (Connection connection = dataSource.getConnection()) {
            assertNotNull(connection);
        }
    }
}
