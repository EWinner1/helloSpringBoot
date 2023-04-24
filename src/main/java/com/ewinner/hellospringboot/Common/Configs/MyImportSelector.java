package com.ewinner.hellospringboot.Common.Configs;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.ewinner.hellospringboot.Common.Models.People", "com.ewinner.hellospringboot.Common.Models.UserRole"};
    }
}
