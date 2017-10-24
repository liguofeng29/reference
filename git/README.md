# about git

## cmd (整理中)

## git --version

## git init
- git init demo


## git config
- git config -e
- git config --system user.name "write to /etc/gitconfig"
- git config --global user.name "write to ~/.gitconfig"
- git config --local user.name  "write to ~repo/.git/config"
- git config --system alias.ci "commit -s"                         //  別名
- git config --system|global|local --unset   // 削除

## git status
- git -p status
- git status -s
- git status -s -b

## git diff          // workspace and stage
- git diff HEAD      // workspace and HEAD
- git diff --staged  // stage and .git
- git diff --cached  // stage and .git
- git diff -w 

## git commit
- git commit -m "initialized"
- git commit --amend 
- git commit --allow-empty -m "who does commit?" // 空コミット
- git commit --amend --allow-empty --reset-author // authorリセット
- git commit -a // !!!!!!! 使用禁止 !!!!!!!

## git rev-parse
- git rev-parse --show-toplevel // workspace絶対パス
- git rev-parse --show-prefix   // workspace相対パス
- git rev-parse --show-cdup // workspaceまでの深さ
- git rev-parse --git-dir // .git位置
- git rev-parse master | HEAD | refs/heads/master


## git rev-list

## git ls-remote origin

## git log
- git log --stat            // show file change
- git log --pretty=oneline
- git log --pretty=fuller
- git log -1 HEAD | master | refs/heads/master
- git log --pretty=raw --graph b3bfdae62


## git ls-tree -l HEAD
## git cat-file -p f58da9a
## git cat-file -t f58da9a


## git clean

## git stash
git stash list

git stash save "message"

git stash pop [--index]

git stash apply [--index]

git stash drop

git stash clear



##########################################
## git reset  // .git/HEAD  like a cursor   
##########################################

1. refsを変更する !! HEADは変更されない
2. 変更内容をindex tree, work treeへの反映を--mixed, --hardで制御する！！


- git reset | git reset HEAD // HEADが指すIDでindexを更新する

- git reset HEAD filename | git reset -- filename // HEADが指すIDのファイルでindex更新

- git reset --hard master@{2}     // git reflog show master | head -5

- git reset --hard HEAD^ // 


###############################
- git commit -amend

- git reset --soft HEAD^
- git commit -e -F .git/COMMIT_EDITMSG
###############################



##########################################
## git checkout  // HEADが変わる
##########################################

## git checkout
- git checkout [HEAD]                  // 差分概要

- git checkout branch                 // HEAD更新、index, work更新
- git checkout branch -- filename     // HEAD更新せず、index,work更新

- git checkout [HEAD|branch|commit] -- filename

- git checkout commit_id    // detached

- git checkout -- filename  // index to work tree
- git checkout .            // index to work tree all



########## else



- git ls-files // indexのファイル


- git cat-file -t xx
- git cat-file -p xx
- git cat-file -p ブランチ名:ファイルパス名

- git cat-file -p mybranch:dir/file.txt　// 一度閲覧してから
- git cat-file -p mybranch:dir/file.txt > dir/file.txt　// リダイレクトしてワーキングツリーに上書き

- git rev-list HEAD
- git rev-list HEAD -n 2

- git rev-parse HEAD
- git rev-parse HEAD~1
- git rev-parse 1838ad4786...02cc4e713a
- git rev-parse --all
- git rev-parse --remotes

- git log --oneline --decorate

- git ls-remote --tags
- git ls-remote origin

- git show-ref    // local 引用を表示
- git show-ref  -r

- git remote set-url origin git@github.com:xxx/xxx.git // remote変更


## rebase -i
|コマンド   |内容       | 
|:--------- |:-----------|
|(p)pick	|コミットをそのまま残す。|
|(r)reword	|コミットメッセージを変更。|
|(e)edit	|コミット自体の内容を編集。|
|(s)squash	|直前のpickを指定したコミットに統合。メッセージも統合。|
|(f)fixup	|直前のpickを指定したコミットに統合。メッセージは破棄。|


## wincred (パスワード保存)
git config --global credential.helper wincred
