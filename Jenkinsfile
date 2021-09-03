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
                sh "npm install"
            }
        }
        stage('deploying'){
            steps {
                echo "deploying app"
            }
        }
    }
}