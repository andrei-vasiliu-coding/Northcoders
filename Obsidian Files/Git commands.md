-git clone *https url from Github*; *initialise with readme file*
When cloning it asks for username (GitHub one) and password (use personal key token from GitHub)
-cd *directory*
-open . //drag folder into text editor icon//

-git config --global user.name "" //match GitHub one//
-git config --global user.email *email without quotation marks* //must match GitHub one//

-git config --list //lists all configs on this computer//
-git status //show commits//

-code . //opens current directory inside vs code//

-git commit -a -m "Message" //-a for all changes, -m to add message//

-git log -2 //shows last two commits//
Git log puts you in VIM (terminal based text editor). Use :q

-git remote or git remote -v //verbose, shows details// to see the remote location. Usually Git calls it "origin".
-git push origin master //last word is the branch, usually "main"//
-git push (can also use it like this);
Now put your name and password without quotation marks.

**Easier to create repository on GitHub, clone it locally and push to GitHub, but can also create repository locally.**

-cd *folder*
-git status //should say not a git repository//
-git init //turns it into a git repository//
-git status //says untracked file//

Locally you must save->add->commit //add the changed files you want to commit to the "staging area". Can't do commit -a here without adding them first.

-git add *file name*
-git status //shows now files to be committed//
-git commit -m "Explanation"

-git add . //to add all changes in current directory//
-git add -A //to add all changes from all directories//
-git commit -m "Explanation" //no -a because you to the adding first//

Now to push it to GitHub. Currently no remote existent. Go to GitHub and initialise a repository WITHOUT a readme file.

-git remote add (name, the convention is origin) (url)
-git remote //to check it's there
-git push origin master

If you make changes on GitHub for a directory you created locally, to get the changes from GitHub on your computer:

-git pull origin master
-git pull (can also just say this)