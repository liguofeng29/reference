#　Maven

## default life cycle 
1. clean
    - pre-clean
    - clean
    - post-clean
2. default
    - 略
3. site
    - pre-site
    - site
    - post-site
    - site-deploy

https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

## cmd 
- mvn -v
- mvn archetype:generate -DgroupId=com.test.maven -DartifactId=maven-test -DpackageName=com.test.maven
- mvn clean
- mvn compile
- mvn test-compile
- mvn test
- mvn site
- mvn clean
- mvn package
- mvn install
    - mvn install:install-file -Dfile=<path-to-file>  
                               -DgroupId=<group-id>  
                               -DartifactId=<artifact-id>  
                               -Dversion=<version>  
                               -Dpackaging=<packaging>  
- mvn eclipse
    - mvn eclipse:eclipse
    - mvn eclipse:clean
- mvn idea
    - mvn idea:idea
- mvn exec
    - mvn exec:java -Dexec.mainClass=com.test.maven.App
- mvn help
    - mvn help:describe -Dplugin=help
    - mvn help:describe -Dplugin=eclipse -Dfull
    - mvn help:effective-pom
    - mvn help:active-profiles
- mvn cobertura:cobertura               // coverage
- mvn dependency
    - mvn dependency:tree
    - mvn dependency:resolve
    - mvn dependency:analyze


## setting.xml
- localRepository

## pom.xml
- repositories/repository               // ライブラリを取得するためのリモートリポジトリ
- pluginRepositories/pluginRepository   // プラグインを取得するためのリモートリポジトリ
- distributionManagement/repository     // プロジェクトを配布するためのリモートリポジトリ
- dependencies                          // 依存関係
- dependencyManagement/dependencies     // 子POMに継承させる
- build/pluginManagement                // 子プロジェクトに提供するプラグイン
- build/plugin                          // プロジェクトで使用するプラグイン 
- profiles                              // 個性化、指定要素上書き
    - can user profiles.xml with -s

    
## profiles
- pom.xml内
- 外部profile                        // !!! maven3からサポートしない？
- setting.xml 
- 多環境例：demo-1
- pom.xml以外で定義して有効になるもの
    - repositories
    - pluginRepositories
    - properties
- 同じプロパティが複数ある場合、mvn help:active-profilesで表示するprofileの最後が有効

## Mavenの属性
1. project.*
2. settings.*
3. env.*
4. system属性
5. ユーザ属性

- maven属性をすべて表示してみる。  
下記追加後、`mvn validate`
```xml
<!-- 環境変数表示のため追加した -->
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-antrun-plugin</artifactId>
    <version>1.7</version>
    <executions>
        <execution>
            <phase>validate</phase>
            <goals>
                <goal>run</goal>
            </goals>
            <configuration>
                <tasks>
                    <echoproperties />
                </tasks>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## tip
- super pom.xml
pom-4.0.0.xml in maven-model-builder-3.5.0.jar
- 推移的な依存関係
- pom依存関係 
```xml
<dependency>
<tpye>pom</type>
</dependency>
```

- optional
```xml
<dependency>
<optional>true</optional>
</dependency>
```

- version範囲指定
```xml
<dependency>
<version>[3.8,4.0)</version>
</dependency>
```

- scope : provided : jarにいれない。例：servletAPI
```xml
<dependency>
<scope>provided</scope>
</dependency>
```

- about assembly plugin : demo2

- about `mvn site` : demo3