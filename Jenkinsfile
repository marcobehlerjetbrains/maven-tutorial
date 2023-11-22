pipeline{
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage('fetch') {
      steps {
        git branch: 'main',
        url:'https://github.com/marcobehlerjetbrains/maven-tutorial'
      }
    stage('validate') {
      steps {
        sh 'mvn validate'
      }
    }
