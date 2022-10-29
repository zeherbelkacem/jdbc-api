pipeline {
    agent any
  tools{
    maven 'maven386'
  }
    stages {
        stage('mavrn version') {
            steps {
               
                bat 'mvn clean install sonar:sonar'
              
            }
        }
        
    }
    
    
}
