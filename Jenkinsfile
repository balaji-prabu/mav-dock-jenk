pipeline{
 agent any
tools {
        maven 'maven'
        jdk 'java8'
    }
stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
}
}
