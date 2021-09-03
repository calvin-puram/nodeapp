pipeline {
    agent any
    tools {
        nodejs "nodejs"
    }
    stages {
        stage('cloning git'){
            steps {
                git "https://github.com/calvin-puram/nodeapp.git"
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