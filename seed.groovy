freeStyleJob('example') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/smachisty92/ansible.git')
            }
        }
    }
    steps {
        shell('ls -ltr')
    }
}