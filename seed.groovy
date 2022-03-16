folder('Terraform') {
    displayName('Terraform')
    description('Terraform')
}

freeStyleJob('Terraform-VPC') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/smachisty92/terraform-vpc.git')
            }
        }
    }
    steps {
        shell('make dev')
    }
}

freeStyleJob('terraform-mutable-alb') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/smachisty92/terraform-mutable-alb.git')
            }
        }
    }
    steps {
        shell('make')
    }
}

freeStyleJob('terraform-databases') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/smachisty92/terraform-databases.git')
            }
        }
    }
    steps {
        shell('make')
    }
}

