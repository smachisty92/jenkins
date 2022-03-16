// pipeline -> stages -> stage -> steps -> step

pipeline {
  //agent {node { label 'workstation' }
  agent { label 'terraform' }
  stages {
    stage('Terraform INIT') {
      steps {
        sh 'echo hello'
        }
      }
    stage('Terraform Plan') {
         steps {
           sh 'echo hello'
           }
         }
    stage('Terraform Apply') {
         steps {
           sh 'echo hello'
           }
         }
    }
  }