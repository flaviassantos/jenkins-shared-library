#!/usr/bin/env groovy

def call() {
    echo 'reading the application version...'
    sh "git fetch --tags"
    def latestVersion = sh(returnStdout: true, script: 'git describe --tags --abbrev=0 --match *.*.* 2> /dev/null || echo 0.0.0').trim()
    env.TAG = latestVersion
    echo "version: ${TAG}"
}
