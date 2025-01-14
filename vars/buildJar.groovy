#!/user/bin/env groovy

def call() {
    echo "Building the application for $BRANCH_NAME"
    sh 'mvn package'
}