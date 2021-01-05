package com.abc.sa.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		log.info("ApplicationContextAware {}", applicationContext.toString());
	}

	@Override
	public void setBeanName(String name) {
		log.info("BeanNameAware {}", name);

	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		String str = resolver.resolveStringValue("你好${os.name},我是#{10*12}");
		log.info("EmbeddedValueResolverAware {}", str);

	}

}
