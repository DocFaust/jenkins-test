pipeline {
    agent any
	tools { 
        maven 'Maven 3.8.1' 
    }
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
                println "this is GROOOOVYYY"
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                sh 'mvn verify'
                junit '**/target/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying ${params.Greeting}"

            }
        }
    }
}