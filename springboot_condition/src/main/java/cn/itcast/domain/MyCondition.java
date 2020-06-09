package cn.itcast.domain;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MyCondition implements Condition {


    /**
     *
     * @param conditionContext     上下文，获取Bean工厂，环境变量
     * @param annotatedTypeMetadata  获取注解信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        boolean flag = true;

        try {
            Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(MyConditional.class.getName());
            String[] strings = (String[]) map.get("value");

            for (String string : strings) {
                Class.forName(string);
            }

        } catch (ClassNotFoundException e) {
            flag = false;
        }

        return flag;
    }
}
