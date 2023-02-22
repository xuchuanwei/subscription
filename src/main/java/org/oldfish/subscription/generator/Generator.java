package org.oldfish.subscription.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;

public class Generator {
    private static final String author = "chuanwei.xu";

    private static final String url = "jdbc:mysql://101.35.145.100:3306/subscription?useUnicode=true&characterEncoding=utf8";
    private static final String username = "laoyu";
    private static final String password = "xuchuanwei";
    private static final String outputDir = System.getProperty("user.dir") + "/src/main/java";

    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .outputDir(outputDir) // 指定输出目录
                            .disableOpenDir();
                })
                .packageConfig(builder -> {
                    // 设置包名
                    builder.parent("com.example.test")
                            .entity("domain")
                            .mapper("mapper")
                            .build();
                })
                .strategyConfig(builder -> {
                    builder.disableSqlFilter();
                    // 设置ID主键生成策略
                    builder.entityBuilder().idType(IdType.INPUT).enableLombok().enableTableFieldAnnotation().enableFileOverride();
                })
                //不生产指定模板
                .templateConfig(builder -> builder.disable(TemplateType.CONTROLLER, TemplateType.XML))
                .execute();
    }
}

