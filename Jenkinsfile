pipeline{
 agent any
tools {
        maven 'maven'
        jdk 'java8'
    }
stages {
        stage('Build') {
            steps {
                sh 'mvn -o -B -DskipTests clean package'
            }
        }
}
}
