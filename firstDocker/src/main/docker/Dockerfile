FROM java:8   #带边拉取java的镜像 必须写
MAINTAINER "liss"<168337573@qq.com> #作者名称 必须写
WORKDIR  /tmp  #工作的目录
ADD ./app.jar app.jar #将本地的jar包添加在docker容器中
EXPOSE 8080  #容器启动的端口
CMD java -jar app.jar  #启动jar的命令