pipeline {
    agent any
    tools {
        nodejs "nodejs"
    }
    stages {
        stage('test npm'){
            steps {
                sh "npm config ls"
            }
        }
        stage('deploy-app'){
            steps {
                echo "deploying app..."
            }
        }
    }
}