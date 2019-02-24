#### 问题1
#####问题原由：
    
    之前安装的hadoop集群应用均为Java7版本，后spark采用版本2.4（要求Java8），导致Java版本兼容不一致。

#####解决方案：

    进行Java版本升级。
    导入Java8环境
    
    1，编辑 ~/.bashrc
    vim ~/.bashrc
    
    2，export 环境变量， 在~/.bashrc 文件中最前面加入：
    export JAVA_HOME=/usr/mysoft/java18
    export JRE_HOME=$JAVA_HOME/jre
    export CLASSPATH=$JAVA_HOME/lib:$JRE_HOME/lib:
    export PATH=$JAVA_HOME/bin:$JAVA_HOME/bin/tools.jar:$JRE_HOME/bin:$PATH
    
    3, 环境变量生效
    source ~/.bashrc
    
    -------------------------------------------------------------------------------
    
    hadoop@hadoop02:~$ java -version
    java version "1.7.0_80"
    Java(TM) SE Runtime Environment (build 1.7.0_80-b15)
    Java HotSpot(TM) 64-Bit Server VM (build 24.80-b11, mixed mode)
    
    # hadoop00机器修改后将文件 scp至从机后
    
    hadoop@hadoop02:~$ source ~/.bashrc
    hadoop@hadoop02:~$ java -version
    java version "1.8.0_191"
    Java(TM) SE Runtime Environment (build 1.8.0_191-b12)
    Java HotSpot(TM) 64-Bit Server VM (build 25.191-b12, mixed mode)
    hadoop@hadoop02:~$ 
