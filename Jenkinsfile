pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh 'make'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                }
            }
        }
        stage ('Test') {
            steps {
                sh 'make check || true'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}