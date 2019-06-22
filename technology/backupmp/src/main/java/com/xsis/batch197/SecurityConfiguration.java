//package com.xsis.batch197;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private BCryptPasswordEncoder encoderPassword;
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Autowired
//	  public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//	    auth.jdbcAuthentication().dataSource(dataSource)
//	        .usersByUsernameQuery("select u.email, u.abpwd,1 as enabled from x_addrbook u where u.email=?")
//	        .authoritiesByUsernameQuery("select u.email, r.name from x_addrbook u inner join x_userrole ur on(u.id=ur.addrbook_id) inner join x_role r on(ur.role_id=r.id) where u.email=?");
//	  }
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests()
//		//url jika access benar
//		.antMatchers("/").permitAll()
//		.antMatchers("/login").permitAll()
////		.antMatchers("/login_user").permitAll()
//		.antMatchers("/register").permitAll()
//		//permitAll agar semua orang bisa akses
//		.antMatchers("/index").hasAnyAuthority("ROLE_ADMINISTRATOR")
//		.anyRequest().authenticated()
//		.and()
//		// form login
//		.csrf().disable().formLogin()
//		.loginPage("/login")
//		.failureUrl("/login?error=true")
//		.defaultSuccessUrl("/index")
//		.usernameParameter("email")
//		.passwordParameter("abpwd")
//		.and()
//		//logout
//		.logout()
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/").and()
//		.exceptionHandling()
//		.accessDeniedPage("/access-denied");
//	}
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
//	}
//	
//	
//}
