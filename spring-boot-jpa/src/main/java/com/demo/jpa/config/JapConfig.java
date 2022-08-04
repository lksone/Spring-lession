package com.demo.jpa.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/8/3 22:54
 */
/*@Configuration
@EnableJpaRepositories(basePackages = "com.demo.jpa.properties")
@EnableTransactionManagement //开启事务*/
public class JapConfig {


    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        //dataSource.setDriverClassName(driverClassName);//如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName
        dataSource.setUrl("jdbc:mysql://localhost:3306/jpa?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //用来检测连接是否有效
        dataSource.setValidationQuery("SELECT 1");
        //借用连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        dataSource.setTestOnBorrow(false);
        //归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
        dataSource.setTestOnReturn(false);
        //连接空闲时检测，如果连接空闲时间大于timeBetweenEvictionRunsMillis指定的毫秒，执行validationQuery指定的SQL来检测连接是否有效

        //如果检测失败，则连接将被从池中去除
        dataSource.setTestWhileIdle(true);
        //1分钟
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        //最大活动数
        dataSource.setMaxActive(20);
        //初始化数据
        dataSource.setInitialSize(5);
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        //供应商适配器
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();

        hibernateJpaVendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        managerFactoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        managerFactoryBean.setPackagesToScan("com.demo.jpa");
        managerFactoryBean.setDataSource(dataSource());
        return managerFactoryBean;
    }
}
