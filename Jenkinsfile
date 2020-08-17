pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'echo "Building" >> Build.txt'
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
                sh 'sleep 5'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'Build.txt', onlyIfSuccessful: true
        }
    }
}
