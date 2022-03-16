// pipeline -> stages -> stage -> steps -> step

pipeline {
  //agent {node { label 'workstation' }
  agent { label 'terraform' }

  environment{
    Test="google.com"
    Ssh=credentails('CENTOS_SSH')
  }
  stages {
    stage('Terraform INIT') {
      steps {
        sh 'echo hello'
        sh 'echo ${Test}'
        sh 'echo ${Ssh}'
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

    post {
      always{
        sh " echo ehllp"
      }
    }
  }