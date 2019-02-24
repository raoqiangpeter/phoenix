####问题1

#####错误提示

    spark2 Failed to send RPC 5346982634 to /ns1:58312: java.nio.channels.ClosedChannelException 错误
#####参考解决方案

    https://blog.csdn.net/qiaotongzxcv/article/details/84325577
    
    
####操作指引

##### spark yarn

    不稳定 ->  Container exited with a non-zero exit code 1 
    ./spark-shell --master yarn --deploy-mode client
    
    2019-01-08 06:18:53 WARN  Utils:66 - Truncated the string representation of a plan since it was too large. This behavior can be adjusted by setting 'spark.debug.maxToStringFields' in SparkEnv.conf.
    [Stage 20:>   (0 + 2) / 4][Stage 22:>   (0 + 0) / 4][Stage 24:> (0 + 0) / 200]2019-01-08 06:20:07 WARN  YarnSchedulerBackend$YarnSchedulerEndpoint:66 - Requesting driver to remove executor 2 for reason Container marked as failed: container_1546956649675_0001_01_000003 on host: hadoop02. Exit status: 1. Diagnostics: Exception from container-launch.
    Container id: container_1546956649675_0001_01_000003
    Exit code: 1
    Stack trace: ExitCodeException exitCode=1: 
    	at org.apache.hadoop.util.Shell.runCommand(Shell.java:582)
    	at org.apache.hadoop.util.Shell.run(Shell.java:479)
    	at org.apache.hadoop.util.Shell$ShellCommandExecutor.execute(Shell.java:773)
    	at org.apache.hadoop.yarn.server.nodemanager.DefaultContainerExecutor.launchContainer(DefaultContainerExecutor.java:212)
    	at org.apache.hadoop.yarn.server.nodemanager.containermanager.launcher.ContainerLaunch.call(ContainerLaunch.java:302)
    	at org.apache.hadoop.yarn.server.nodemanager.containermanager.launcher.ContainerLaunch.call(ContainerLaunch.java:82)
    	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    	at java.lang.Thread.run(Thread.java:748)
    spark executor挂掉后，但是可以自动恢复。待补充。。。。（未找到解决方案？ 内存资源分配？？）

    
##### spark standalone

    单节点/spark集群 已验证，可以运行credit_card_balance.csv作业
    ./spark-shell --master spark://hadoop00:7077 --executor-memory 2G --driver-memory 2G
    
###### spark spark-env.sh配置
    
    export JAVA_HOME=/usr/mysoft/java18
    export HADOOP_CONF_DIR=/usr/mysoft/hadoop/etc/hadoop
    export SPARK_DIST_CLASSPATH=$(/usr/mysoft/hadoop/bin/hadoop classpath)
    export SPARK_MASTER_IP=hadoop00
    export SPARK_MASTER_PORT=7077
    export SPARK_WORKER_CORES=4
    export SPARK_WORKER_INSTANCES=1
    export SPARK_WORKER_MEMORY=2g
    export SPARK_EXECUTOR_CORES=1
    export SPARK_EXECUTOR_MEMORY=1024M
    export SPARK_HISTORY_OPTS=-Dspark.history.fs.logDirectory=hdfs://hadoop00:9000/user/spark/eventlogs/
