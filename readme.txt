
follow below cmd to deploy in aws lambda 

aws --version
sam --version

mvn -v
install maven 
sudo yum remove maven2
sudo yum install maven2
export MAVEN_OPTS="-Xmx256m" 
mvn -v

build jar file 
mvn clean install 

install java 11 
java -version
sudo yum -y update
sudo yum install java-11-openjdk-devel
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk
export PATH=$PATH:$JAVA_HOME/bin
java -version

build sam 
sam build

start in local

 sam local start-api

deploy in aws 

sam deploy --guided

Delete reources 

sam delete                                                  
