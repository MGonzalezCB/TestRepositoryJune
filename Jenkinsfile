pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'sleep 2'
                //sh 'cd /Users/manuelgonzalezalbornoz/LocalJenkinsInstances/jenkins-home/workspace/Multi1_Develop'
                sh 'pwd'
                //sh 'git status'
                script{
                echo "${env.GIT_BRANCH}"
                echo "${env.GIT_COMMIT}"
                echo "${env.GIT_URL}"
                echo "Branch name is ${env.GIT_BRANCH}"
                println "${env.GIT_BRANCH}"
                println "${env.GIT_COMMIT}"
                println "${env.GIT_URL}"
                println "Branch name using println is ${env.GIT_BRANCH}"
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                echo 'Creating Json...'
            }
        }
    }
}
