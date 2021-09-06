def artifact_name = 'target/my-app-1.0.0.jar'

pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        
        stage("Build") {
            steps {
                script {
                    'mvn clean install'
                }
            }
        }
    }
}