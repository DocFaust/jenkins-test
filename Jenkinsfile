pipeline {
    agent any

    node {
        checkout scm 
    }
    stages {
        stage('Build') {
            steps {
                sh mvn install
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