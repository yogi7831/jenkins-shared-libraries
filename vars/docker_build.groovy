def call(String projectName, String ImageTag, String DockerHubUser, String DockerfileFolder){
sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ./${DockerfileFolder}"
}
