def artifact_name = 'target/my-app-1.0.0.jar'

pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage("Build") {
            steps {
                script {
                    bat 'mvn clean package'
                }
            }
        }
    }
}