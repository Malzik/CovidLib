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
                sh 'make clean && ./configure --with-option=/path/etc && make && make install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}


