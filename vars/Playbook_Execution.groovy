def call() {
    stage('Playbook Execution') {
        // Set the PATH variable to include the location of ansible-playbook
        withEnv(["PATH+AN=/opt/homebrew/bin"]) {
            sh "ansible-playbook -i /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/inventory /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/test.yml"
        }
    }
}


