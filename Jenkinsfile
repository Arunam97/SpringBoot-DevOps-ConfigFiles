pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: '<REPOSITORY LINK>.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'sudo mvn clean'
            }
        }
        stage('Package') {
            steps {
                sh 'sudo mvn package -Dmaven.test.skip=true'
            }
        }
        stage('Deploy') {
            steps {
                sh 'sudo mv target/*.war /home/ubuntu/tomcat/webapps/'
            }
        }
    }
}