#!/user/bin/env groovy

def call() {
    echo "Building the Application"
    withCredentials([usernamePassword(credentialsId: 'dockerhub-repo',passwordVariable:'PASS',usernameVariable:'USER')]) {
        sh 'docker build -t adil2584/demo-app:jma-2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push adil2584/demo-app:jma-2.0'
    }
}