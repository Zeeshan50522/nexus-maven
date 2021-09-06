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
                    'mvn clean package'
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
                    nexusUrl: '3.208.29.34:8081', 
                    nexusVersion: 'nexus3', 
                    protocol: 'http', 
                    repository: 'maven-nexus-demo', 
                    version: '1.0.0'
                }
            }
        }
    }
}