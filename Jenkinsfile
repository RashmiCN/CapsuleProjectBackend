pipeline {
  agent {
    docker {
      image 'maven : 4.0.0'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'sh \'mvn --version\''
      }
    }
  }
}