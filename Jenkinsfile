pipeline {
    agent any
  tools{
    maven 'maven386'
  }
    stages {
        stage('sonar') {
            steps {
                sh 'mvn clean install sonar:sonar'
            }
        }
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }
        
    }
}
