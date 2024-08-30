def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'priyanshu1912003@gmail.com'
          slackSend channel: 'jenkinnotify', message: 'successfull '
    }
}
