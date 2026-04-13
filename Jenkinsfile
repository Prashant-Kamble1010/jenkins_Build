pipeline {
    agent any

    tools {
        jdk 'JDK17'   // Must match Jenkins Global Tool Configuration
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/Prashant-Kamble1010/jenkinsDemo.git'
            }
        }

        stage('Compile Java') {
            steps {
                bat 'javac Main.java'
            }
        }

        stage('Run Program') {
            steps {
                bat 'java Main'
            }
        }
    }

    triggers {
        githubPush()   // Trigger build on every GitHub commit
    }
}
