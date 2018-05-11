pipeline{
 agent { node { label 'master' } }
stages {
        stage('Build') {
            steps {
                mvn -B -DskipTests clean package
            }
        }
}
}
