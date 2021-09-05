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
        stage("Artifact Upload To Nexus") {
            steps {
                script {
                    nexusArtifactUploader artifacts: [
                        [
                            artifactId: 'my-app', 
                            classifier: '', 
                            file: 'target/my-app-1.0.0.jar', 
                            type: 'jar'
                        ]
                    ], 
                    credentialsId: 'nexus', 
                    groupId: 'com.nbs.app', 
                    nexusUrl: '107.21.158.64:8081', 
                    nexusVersion: 'nexus3', 
                    protocol: 'http', 
                    repository: 'nexus-maven', 
                    version: '1.0.0'
                }
            }
        }
    }
}