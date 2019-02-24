##### 创建网络配置为host模式container

    docker run --name=phoenix --net=host -p 8080:8080 -d raoqiang-phoenix/phoenix
    
##### 查看docker container 日志-实时

    docker logs -f -t --tail 行数 容器名
    
    eg ： docker logs -f -t --tail 100 phoenix
    
    
