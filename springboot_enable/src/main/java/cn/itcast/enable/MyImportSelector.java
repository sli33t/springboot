package cn.itcast.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"cn.itcast.domain.User", "cn.itcast.domain.Role"};
    }
}
