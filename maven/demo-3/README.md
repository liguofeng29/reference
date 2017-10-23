## about maven site

1. site生成 : mvn clean site
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-site-plugin</artifactId>
    <version>3.3</version>
    <configuration>
        <locales>ja</locales>
        <outputEncoding>${project.build.sourceEncoding}</outputEncoding>
    </configuration>

</plugin>
```

```xml
<reporting>
    <outputDirectory>target/site-report</outputDirectory>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-project-info-reports-plugin</artifactId>
            <version>LATEST</version>
        </plugin>
    </plugins>
</reporting>
```
2. siteのdeploy : mvn site:deploy
```xml
    <distributionManagement>
        <site>
            <id>site-report</id>
            <name>サイト情報</name>
            <url>file://C:\workspace\env\apache-tomcat-8.5.23\webapps\site-report</url>
        </site>
    </distributionManagement>
```

※tomcatにデプロイする

## tip
- mvn site:run         // mavenの組み込みjettyで起動される
http://localhost:8080/

- 親子プロジェクトの場合
    - plugin, reporting, distributionManagementを親に移動する　
    - 親で、`mvn site`
    - 同じディレクトリにしたい場合、`mvn site:stage`
    
- もっと情報をsiteへ出した場合
    - `maven-project-info-reports-plugin`以外のプラグインを色々追加すればいい
    
- htmlのテンプレートは変えられる