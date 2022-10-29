pipeline {
    agent any
  tools{
    maven 'maven386'
  }
    stages {
        stage('sonar') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                sh 'mvn clean package sonar:sonar'
              }
            }
        }
        
        stage("Quality Gate") {
            steps {
              timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
              }
            }
          }
    }
    
    
}
