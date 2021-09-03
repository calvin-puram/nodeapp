pipeline {
    agent any
    tools {
        nodejs "nodejs"
    }
    stages {
        stage('cloning git'){
            steps {
                
                git([url: 'https://github.com/calvin-puram/nodeapp.git', branch: 'master', credentialsId: 'github'])
            }
        }
        stage('install dependencies'){
            steps {
                sh "ls /var/jenkins_home/workspace/pipeline-job@2 "
            }
        }
        stage('deploying'){
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "deploying app"
            }
        }
    }
}