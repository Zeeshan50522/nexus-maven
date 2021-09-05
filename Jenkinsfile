def artifact_name = 'target/my-app-1.0.0.jar'

pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        stage('Build approval'){
          input "build to mvn?"
       }
        stage("Build") {
            steps {
                script {
                    'mvn clean package'
                }
            }
        }
    }
}