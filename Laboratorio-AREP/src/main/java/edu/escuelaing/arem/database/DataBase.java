package edu.escuelaing.arem.database;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author Nicolas
 */

@Component
public class DataBase {

    @Value("${spring.datasource.url}")
    private String DbUrl;
    @Value("${spring.datasource.username}")
    private String DbUsername;
    @Value("${spring.datasource.password}")
    private String DbPass;

    @Bean
    public DataSource dataSource() throws SQLException{
        if(DbUrl == null || DbUrl.isEmpty()){
            return new HikariDataSource();
        }
        else{
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(DbUrl);
            config.setUsername(DbUsername);
            config.setPassword(DbPass);
            config.setMaximumPoolSize(2);
            return new HikariDataSource(config);

        }
    }



}