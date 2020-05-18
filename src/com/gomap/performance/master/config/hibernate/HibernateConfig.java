/**
 * 
 */
package com.gomap.performance.master.config.hibernate;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 1056082 This class having both db and hibernate config
 */

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.gomap.performance.master.config.hibernate" })
@PropertySource(value = { "classpath:db-hibernate.properties" })
public class HibernateConfig {

	private static final String JDBC_DRIVER_CLASS_NAME = "jdbc.driverClassName";
	private static final String JDBC_URL = "jdbc.url";
	private static final String JDBC_USERNAME = "jdbc.username";
	private static final String JDBC_PASSWORD = "jdbc.password";
	private static final String HIBERNATE_DIALECT = "hibernate.dialect";
	private static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";
	private static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
	private static final String HIBERNATE_DEFAULT_SCHEMA = "hibernate.default_schema";
	private static final String MASTER_MODEL = "com.gomap.performance.master.model";
	private static final String HIBERNATE_BATCH_SIZE = "hibernate.jdbc.batch_size";
	private static final String HIBERNATE_ORDER_INSERTS= "hibernate.order_inserts";
	private static final String HIBERNATE_ORDER_UPDATES= "hibernate.order_updates";
	private static final String ORG_MODEL = "com.gomap.performance.organisastion.model";

	@Autowired
	private Environment environment;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory
				.setPackagesToScan(new String[] {ORG_MODEL});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		
		/*DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment
				.getRequiredProperty(JDBC_DRIVER_CLASS_NAME));
		dataSource.setUrl(environment.getRequiredProperty(JDBC_URL));
		dataSource.setUsername(environment.getRequiredProperty(JDBC_USERNAME));
		dataSource.setPassword(environment.getRequiredProperty(JDBC_PASSWORD));
		return dataSource;*/
		return dataBaseInit();
	}
	
	public  DataSource dataBaseInit() 
	{
		/** close any open connections 
		if (dataSource != null) {
			try {
				dataSource.close();
			} catch (Exception e) {
				//
			}
			dataSource = null;
		}**/
		
		
		try {
			Properties p = new Properties();
			p.setProperty("driverClassName", environment.getRequiredProperty(JDBC_DRIVER_CLASS_NAME));
			p.setProperty("url", environment.getRequiredProperty(JDBC_URL));
			p.setProperty("password", environment.getRequiredProperty(JDBC_PASSWORD));
			p.setProperty("username", environment.getRequiredProperty(JDBC_USERNAME));
			p.setProperty("maxTotal", "20");
			p.setProperty("initialSize", "8");
			p.setProperty("removeAbandoned", "true");
			p.setProperty("removeAbandonedTimeout", "120");
			p.setProperty("autoReconnect", "true");
			p.setProperty("testOnBorrow", "true");
			p.setProperty("validationQuery","select 1 from dual");
			BasicDataSource dataSource = (BasicDataSource) BasicDataSourceFactory.createDataSource(p);
			System.out.println("DBCP Pool configured");
			return dataSource;
		} catch (Exception e) 
		{
			System.err.println("Could not create a DBCP pool. There is an error in the Hibernate configuration file,");
			return null;
		}
		
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put(HIBERNATE_BATCH_SIZE,environment.getRequiredProperty(HIBERNATE_BATCH_SIZE));
		properties.put(HIBERNATE_DIALECT,environment.getRequiredProperty(HIBERNATE_DIALECT));
		properties.put(HIBERNATE_SHOW_SQL,environment.getRequiredProperty(HIBERNATE_SHOW_SQL));
		properties.put(HIBERNATE_FORMAT_SQL,environment.getRequiredProperty(HIBERNATE_FORMAT_SQL));
		properties.put(HIBERNATE_DEFAULT_SCHEMA, environment.getRequiredProperty(HIBERNATE_DEFAULT_SCHEMA));
		properties.put(HIBERNATE_ORDER_INSERTS, environment.getRequiredProperty(HIBERNATE_ORDER_INSERTS));
		properties.put(HIBERNATE_ORDER_UPDATES, environment.getRequiredProperty(HIBERNATE_ORDER_UPDATES));
		properties.put("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}
