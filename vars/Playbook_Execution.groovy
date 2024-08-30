def call() {
    stage('playbook execution') {

        sh "ansible-playbook tomcat/tests/test.yml -i tomcat/tests/inventory "
    }
}
