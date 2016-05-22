<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

    <!--<context:component-scan base-package="app"/>-->

    <!--<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">-->
        <!--<property name="prefix" value="/WEB-INF/pages/"/>-->
        <!--<property name="suffix" value=".jsp"/>-->
    <!--</bean>-->

    <bean id="postService" class="app.mock.PostService"/>
    <bean id="userDetailsService" class="app.services.detailsServices.UserDetailsServiceImpl"/>
    <bean id="userService" class="app.services.UserServiceImpl"/>
    <bean id="userDAO" class="app.dao.UserDAOImpl" />
    <bean id="articleService" class="app.mock.ArticleServiceImplMock" />
    <bean id="tagService" class="app.services.TagServiceImpl" />
    <bean id="likePostAction" class="app.actions.post.LikePostAction"/>
    <bean id="mongoDB" class="app.config.MongoDB"/>
</beans>