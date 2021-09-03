def cloneApp() {
  echo "building the app"
  git([url: 'https://github.com/calvin-puram/nodeapp.git', branch: 'master', credentialsId: 'github'])
}

def buildImage() {
   echo "building the docker image"
   withCredentials([usernamePassword(credentialsId: 'docker-credential', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh "cd /var/jenkins_home/workspace/my-multi-pipeline_master"
        sh "docker build -t puram/tour:1.0.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push puram/tour:1.0.0"
   }
}

def deployApp() {
  echo "deploying the application"
}

return this