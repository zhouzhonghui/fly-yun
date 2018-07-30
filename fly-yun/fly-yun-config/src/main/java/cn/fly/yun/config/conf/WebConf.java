package cn.fly.yun.config.conf;


import cn.fly.yun.config.exceptions.errors.MainErrors;
import cn.fly.yun.config.exceptions.errors.SubErrors;
import cn.fly.yun.config.interceptor.HeaderInterceptor;
import cn.fly.yun.config.interceptor.SecrityInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.HashSet;

@Configuration
public class WebConf extends WebMvcConfigurerAdapter {
    private static final String I18N_ROP_ERROR = "i18n/rop/error";

    @Bean
    HeaderInterceptor localInterceptor() {
        return new HeaderInterceptor();
    }

    @Bean
    SecrityInterceptor secrityInterceptor(){
        return new SecrityInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        initMessageSource();
        registry.addInterceptor(localInterceptor()).excludePathPatterns("/swagger-resources/**").excludePathPatterns("/v2/**");
        registry.addInterceptor(secrityInterceptor()).excludePathPatterns("/swagger-resources/**").excludePathPatterns("/v2/**");
    }

    @Bean
    MessageSourceAccessor getMessageSourceAccessor() {
        HashSet<String> baseNamesSet = new HashSet();
        baseNamesSet.add(I18N_ROP_ERROR);//ROP自动的资源
        String[] totalBaseNames = baseNamesSet.toArray(new String[0]);
        ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
        bundleMessageSource.setBasenames(totalBaseNames);
        MessageSourceAccessor messageSourceAccessor = new MessageSourceAccessor(bundleMessageSource);
        return messageSourceAccessor;
    }

    /**
     * 设置国际化资源信息
     */
    public void initMessageSource() {
        MessageSourceAccessor messageSourceAccessor = getMessageSourceAccessor();
        MainErrors.setErrorMessageSourceAccessor(messageSourceAccessor);
        SubErrors.setErrorMessageSourceAccessor(messageSourceAccessor);
    }
}
