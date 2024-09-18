def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/Priyanshu498/tomcat.git'
    }
}
