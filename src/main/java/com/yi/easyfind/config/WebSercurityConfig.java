package com.yi.easyfind.config;

import com.yi.easyfind.service.impl.UserDetailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class WebSercurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/AdminLTE/**","/bootstrap/**","/cron/**","/flat_ui/**","font-awesome/**","/lonicons/**",
//                "/iview/**","/layer/**","/libs/**");
//    }
//
//    /**
//     * 配置Spring Security，下面说明几点注意事项。
//     * 1. Spring Security 默认是开启了CSRF的，此时我们提交的POST表单必须有隐藏的字段来传递CSRF，
//     * 而且在logout中，我们必须通过POST到 /logout 的方法来退出用户，详见我们的login.html和logout.html.
//     * 2. 开启了rememberMe()功能后，我们必须提供rememberMeServices，例如下面的getRememberMeServices()方法，
//     * 而且我们只能在TokenBasedRememberMeServices中设置cookie名称、过期时间等相关配置,如果在别的地方同时配置，会报错。
//     * 错误示例：xxxx.and().rememberMe().rememberMeServices(getRememberMeServices()).rememberMeCookieName("cookie-name")
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 配置拦截规则
//        http.csrf().disable()
//                .httpBasic().and().authorizeRequests()
//                // 任何用户都可以访问URL以"/resources/", equals "/signup", 或者 "/about"开头的URL。
//                .antMatchers("/adminLogin").permitAll()
//                .anyRequest().authenticated() // 任何请求都拦截
//                .and()
//                .formLogin()
//                .loginPage("/adminLogin")
//                .successForwardUrl("/main")
//                .defaultSuccessUrl("/main")
//                .permitAll() //登陆后可访问任意页面
//                .and()
//                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/adminLogin");
//        //开启记住我功能
//        http.rememberMe().rememberMeParameter("remeber");
//        http.headers().frameOptions().sameOrigin().httpStrictTransportSecurity().disable();
//    }

    /**
     * 自定义认证数据源
     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder builder) throws Exception{
//        builder.userDetailsService(userDetailService())
//                .passwordEncoder(passwordEncoder());
//    }
//    @Bean
//    public UserDetailServiceImpl userDetailService (){
//        return new UserDetailServiceImpl() ;
//    }
//    /**
//     * 密码加密
//     */
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
}
