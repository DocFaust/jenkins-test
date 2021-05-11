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
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('JaCoCo') {
			steps {
            	sh 'mvn -Dmaven.test.failure.ignore=true jacoco:prepare-agent verify' 
	        	step( [ $class: 'JacocoPublisher' ] )
	     	}
		}
        stage('SonarQube') {
            steps {
                sh 'mvn sonar:sonar   -Dsonar.projectKey=jenkins-test   -Dsonar.host.url=http://localhost:9000   -Dsonar.login=6b8ed445678c9ea91d1a2edf03e98569f333c65b'
            }
        }
        stage ('Analysis') {
            steps {
	                sh 'mvn -Dmaven.test.failure.ignore=true checkstyle:checkstyle pmd:pmd pmd:cpd findbugs:findbugs' 
            }
            post {
			   always {
				   junit testResults: '**/target/surefire-reports/TEST-*.xml'

		            recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
		            recordIssues enabledForFailure: true, tool: checkStyle()
		            recordIssues enabledForFailure: true, tool: spotBugs()
		            recordIssues enabledForFailure: true, tool: cpd(pattern: '**/target/cpd.xml')
		            recordIssues enabledForFailure: true, tool: pmdParser(pattern: '**/target/pmd.xml')
			   }
            }
       }
        
        stage('Deploy') {
            steps {
                echo "Deploying ${params.Greeting}"

            }
        }
    }
}