package com.aaa.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.aaa.realm.ShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @Description : shrio配置类
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/8 20:15
 * @Version     : 1.0
 */
@Configuration
public class ShiroConfig {
    /**
     * shiro 的内置过滤器:
     * 1, anon: 匿名拦截器，不需要登录也可以访问
     * 2，authc：需要用户认证通过后才可以访问
     * 3，roles：角色拦截器，用户需要拥有指定的角色才可以访问、
     * 4，perms:权限授权拦截器，用户需要用户指定的权限才可以访问
     * 5.logout：退出拦截器
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(getDefaultWebSecurityManager());

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        linkedHashMap.put("/getAllBook","anon");

       // linkedHashMap.put("/bdeleteBook","roles[admin]");

        linkedHashMap.put("/updateBook","perms[updateBook]");
        linkedHashMap.put("/deleteBook","perms[deleteBook]");

        linkedHashMap.put("/*book","authc");

        linkedHashMap.put("/outLogin","logout");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(linkedHashMap);

        shiroFilterFactoryBean.setLoginUrl("/toLogin");

        return shiroFilterFactoryBean;
    }
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(getShiroRealm());
        return defaultWebSecurityManager;
    }
    @Bean
    public ShiroRealm getShiroRealm(){
        ShiroRealm shiroRealm = new ShiroRealm();
        shiroRealm.setCredentialsMatcher(getHashedCredentialsMatcher());
        return shiroRealm;
    }
    @Bean
    public HashedCredentialsMatcher getHashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("SHA-256");
        hashedCredentialsMatcher.setHashIterations(1024);
        return hashedCredentialsMatcher;
    }
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager defaultWebSecurityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(defaultWebSecurityManager);
        return authorizationAttributeSourceAdvisor;
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }
}
