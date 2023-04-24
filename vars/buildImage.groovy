#!/usr/bin/env groovy

def call() {
    echo "Building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', passwordVariable:'PASS', usernameVariable: 'USER')]){
        sh "docker build -t flaviassantos/my-repo:jma-2.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push flaviassantos/my-repo:jma-2.0"
    }
}
