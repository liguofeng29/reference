# parent pom

## run
mvn clean package

## dependencies
子で指定されなくても、そのまま継承される。

## plugin
子で指定されなくても、そのまま継承される。

## dependencyManagement 
子は、groupIdとartifactIdだけ指定することで利用できる。

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
## pluginManagement
子は、groupIdとartifactIdだけ指定することで利用できる。
```xml
<pluginManagement>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.20.1</version>
            <configuration>
                <skip>false</skip>
            </configuration>
        </plugin>
    </plugins>
</pluginManagement>
```

## 子に属性を継承させる
子は、{groupId}で参照する。
```xml
<properties>
    <groupId>org.lee.maven</groupId>
</properties>
```


