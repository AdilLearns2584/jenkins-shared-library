#!/user/bin/env groovy

def call() {
    echo "Building the Image"
    sh 'mvn package'
}