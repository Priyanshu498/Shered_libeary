stage('playbook execution') {
    sh """
    export PATH=\$PATH:/opt/homebrew/bin
    ansible-playbook -i /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/inventory /Users/priyanshu/Apache-tom/assignmet_0n_tool/tomcat/tests/test.yml
    """
}

