pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '5953128d-96a8-4a5e-9bc9-9ad787e0b621', url: 'git@github.com:lonely7yk/jenkins-web-demo.git']]])
            }
        }
        stage('build project') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('publish project') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'a21fef84-e4c5-4a12-999a-b9b5cfe48577', path: '', url: 'http://129.146.155.241:8080')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}
