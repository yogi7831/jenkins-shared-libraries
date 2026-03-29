def call(String projectName, String ImageTag, String DockerHubUser){
sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
