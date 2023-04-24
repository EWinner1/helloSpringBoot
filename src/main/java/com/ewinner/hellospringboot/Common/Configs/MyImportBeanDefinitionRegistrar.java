package com.ewinner.hellospringboot.Common.Configs;

import com.ewinner.hellospringboot.Common.Models.People;
import com.ewinner.hellospringboot.Common.Models.UserRole;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("people", BeanDefinitionBuilder.rootBeanDefinition(People.class).getBeanDefinition());
        //registry.registerBeanDefinition("userRole", BeanDefinitionBuilder.rootBeanDefinition(UserRole.class).getBeanDefinition());
    }
}
