#!/user/bin/env groovy

def call() {
    echo "Building the application for branch master"
    sh 'mvn package'
}