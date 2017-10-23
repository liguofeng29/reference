# about git

## cmd
-------------------
git ls-files // indexのファイル

-------------------
git cat-file -t xx
git cat-file -p xx
git cat-file -p ブランチ名:ファイルパス名

# 一度閲覧してから
git cat-file -p mybranch:dir/file.txt
# リダイレクトしてワーキングツリーに上書き 
git cat-file -p mybranch:dir/file.txt > dir/file.txt
-------------------
git rev-list HEAD
git rev-list HEAD -n 2

git rev-parse HEAD
git rev-parse HEAD~1
git rev-parse 1838ad4786...02cc4e713a
git rev-parse --all
git rev-parse --remotes
-------------------
git log --oneline --decorate
------------------
git ls-remote --tags
git ls-remote origin
------------------------
git show-ref    // local 引用を表示
git show-ref  -r



## rebase -i
|コマンド   |内容       | 
|:--------- |:-----------|
|(p)pick	|コミットをそのまま残す。|
|(r)reword	|コミットメッセージを変更。|
|(e)edit	|コミット自体の内容を編集。|
|(s)squash	|直前のpickを指定したコミットに統合。メッセージも統合。|
|(f)fixup	|直前のpickを指定したコミットに統合。メッセージは破棄。|


