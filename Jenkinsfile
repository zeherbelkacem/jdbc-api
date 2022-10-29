pipeline {
    agent any
  tools{
    maven 'maven386'
  }
    stages {
        stage('mavrn version') {
            steps {
               
                sh 'mvn clean install sonar:sonar'
              
            }
        }
        
    }
    
    
}
