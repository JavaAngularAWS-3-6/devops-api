#!/bin/sh

echo "updating existing packages"
sudo yum update -y

echo "installing java 11"
sudo yum install java-11-amazon-corretto-devel
sudo update-alternatives --config java
sudo update-alternatives --config javac
echo "java 11 installed and configured"

echo "installing git"
sudo yum install -y git
echo "git installed"

echo "installing maven"
sudo wget https://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
sudo yum install -y apache-maven
echo "maven installed"

echo "installing jenkins"
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat/jenkins.io.key
sudo yum install jenkins -y
echo "jenkins installed now starting"
sudo service jenkins start
echo "jenkins started"

echo "allocated 1 GB swap space"
sudo dd if=/dev/zero of=/swapfile bs=128M count=8
sudo chmod 600 /swapfile
sudo mkswap /swapfile
sudo swapon /swapfile
echo '/swapfile swap swap defaults 0 0' | sudo tee -a /etc/fstab
echo "swap allocated"

echo "installing docker"
sudo yum search docker
sudo yum install docker
sudo usermod -a -G docker jenkins
echo "starting docker"
sudo service docker start
echo "docker started"
sudo chmod 666 /var/run/docker.sock