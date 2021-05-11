pipeline {
    agent any
	tools { 
        maven 'Maven 3.8.1' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
                println "this is GROOOOVYYY"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}