pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'sleep 1'
                sh 'sleep 1'
                sh 'cd /Users/manuelgonzalezalbornoz/LocalJenkinsInstances/jenkins-home/workspace/Multi1_Develop'
                sh 'pwd'
                sh 'git status'
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
            }
        }
    }
}
