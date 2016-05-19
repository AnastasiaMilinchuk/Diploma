package app.config;

import app.dao.UserDAO;
import app.dao.UserDAOImpl;
import app.mock.ArticleServiceImplMock;
import app.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by click on 5/16/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("app")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver= new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

    @Bean
    public PostService getPostService(){
        return new app.mock.PostService();
    }

    @Bean
    public UserDAO getUserDAO(){
        return new UserDAOImpl();
    }

    @Bean
    public ArticleService getArticleService() {
        return new ArticleServiceImplMock();
    }

    @Bean
    public TagService getTagService(){return new TagServiceImpl();}
}