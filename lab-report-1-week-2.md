**Lab Report 1 Week 2**

# Tutorial to log onto ieng6 account
1. Install VSCode via this [link](https://code.visualstudio.com/)!
![VS Code](/Images/SS_VSCode.png)  
- Click the link and install

2. Remotely Connecting
![Remote Connection](/Images/SS_RemoteConnection.png)
- Open Terminal
- Type "ssh cs15lsp22avw@ieng6.ucsd.edu"
- Use your own account! (different letters)

3. Trying Some Commands
![Trying Commands](/Images/SS_Commands.png)
- Try some commands like cp
- In this case, it fails since the file couldn't be copied
- These commands could be fun to play with:
    - cd ~
    - cd
    - ls -lat
    - cat /home/linux/ieng6/cs15lsp22/public/hello.txt

4. Moving Files with scp
![Using scp](/Images/SS_scp.png)
![Moving files](/Images/SS_moveFiles.png)
- Create WhereAmI.java file
- Add a few print statements to the file
- Run "scp WhereAmI.java cs15lsp22svw@ieng6.ucsd.edu:~/"
- You should be asked for a password
- Now log into ieng6, you should be able to see the file
- Now run javac and and java remotely

5. Setting an SSH Key
![Generating SSH Key](/Images/SS_sshKey.png)
- To avoid having to enter your password everytime you ssh to ieng6, we can generate a ssh key to bypass the password prompt
- Steps
    - ssh-keygen
    - /Users/\<user-name\>/.ssh/id_rsa
    - DON'T ADD PASSPHRASE TWICE (just press enter when asked what you want your password to be)
- How copy the _public_ key to the .ssh directory of your user account on the server
    - ssh cs15lsp22avw@ieng6.ucsd.edu
    - mkdir .ssh
    - scp /Users/<user-name>/.ssh/id_rsa.pub 
    - ~/.ssh/authorized_keys
6. Optimize Remote Running

- Using tab a lot to autocomplete as well as copy and pasting cs15lsp22zzz@ieng6.ucsd.edu:~/ will result significantly faster setupt times
- Took roughly 18 keystrokes/mouse clicks to scp files

![Happy Face](/Images/happyface.png)
That's it! Have a _nice_ day!  