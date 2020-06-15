pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'sleep 1'
                sh 'cd /Users/manuelgonzalezalbornoz/LocalJenkinsInstances/jenkins-home/workspace/Multi1_Develop'
                sh 'pwd'
                sh 'git status'
                sh 'git commit -m "test"'
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
