package com.abc.sa.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String os = environment.getProperty("os.name");
		if(os.contains("Linux")) {
			return true;
		}
		
		return false;
	}

}
