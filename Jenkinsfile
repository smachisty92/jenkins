// pipeline -> stages -> stage -> steps -> step

pipeline {
  //agent {node { label 'workstation' }
  agent { label 'terraform' }

  environment{
    Test="google.com"
    SSH=credentials('CENTOS_SSH')
  }
  stages {
    stage('Terraform INIT') {
      environment{
          Test="gmail.com"
        }
      steps {
        sh 'echo hello'
        sh 'echo ${Test}'
        sh 'echo ${SSH}'
        }
      }
    stage('Terraform Plan') {
         steps {
           sh 'echo hello'
           sh 'echo ${Test}'
           }
         }
    stage('Terraform Apply') {
         steps {
           sh 'echo hello'
           sh 'echo ${Test}'
           }
         }
    }

    post {
      always{
        sh " echo ehllp"
      }
    }
  }