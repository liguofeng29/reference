## demo for プロファイル切り替え
- mvn clean package -s settings.xml    //environment.type=devはデフォルト有効   
  or  
  mvn clean package -s settings.xml -Denvironment.type=dev
- mvn clean package -s settings.xml -Denvironment.type=prod