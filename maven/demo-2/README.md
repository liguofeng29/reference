## about Assembly plugin

Assembly pluginはmavenのコアプラグインである。

### DdescriptorId
1. bin                     // jar to zip
2. jar-with-dependencies   // 依頼jar組み込み
3. project                 // projectソースパッケージング
4. src                     // srcソースパッケージング


### demo

- mvn assembly:single -DdescriptorId=project

[INFO] Building tar : C:\workspace\git\reference\maven\demo-2\target\demo2-1.0.0-project.tar.gz
[INFO] Building tar : C:\workspace\git\reference\maven\demo-2\target\demo2-1.0.0-project.tar.bz2
[INFO] Building zip: C:\workspace\git\reference\maven\demo-2\target\demo2-1.0.0-project.zip

- mvn assembly:single -DdescriptorId=src
- mvn assembly:single -DdescriptorId=bin
- mvn assembly:single -DdescriptorId=jar-with-dependencies // 先にinstallするとsrcも含む

### Assembly pluginをもって、上記４つ以外をパッケージングすることもできる。
