pipeline {
    agent any
	tools { 
        maven 'Maven 3.6.1' 
        jdk 'JDK 8' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}