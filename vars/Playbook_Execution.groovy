def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/inventory /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/test.yml"
    }
}


