// pipeline -> stages -> stage -> steps -> step

pipeline {
  agent none
  stages {
    stage('Terraform INIT') {
      agent {node { label 'workstation' }}
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