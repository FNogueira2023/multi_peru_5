//def buildApp(){
//    echo 'building the app...'
//    sh 'mvn clean install'
//}
//
//def buildImage() {
//    echo 'building the image...'
//    withCredentials([usernamePassword(credentialsId:'docker_hub', passwordVariable: 'PASSWORD', usernameVariable: 'USER' )]) {
//        sh 'docker build -t fnogueira2023/multi_peru_5:1.0 .'
//        sh 'echo $PASSWORD | docker login -u $USER --password-stdin'
//        sh 'docker push fnogueira2023/multi_peru_5:1.0 '
//    }
//}
def deployApp(){
    echo "deploying version ${params.Version }"
}

return this

