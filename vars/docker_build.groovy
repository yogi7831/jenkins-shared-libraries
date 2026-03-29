def call(String ProjectName, String ImageTag, String DockerHubUser, String DockerfileFolder){
sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ./${DockerfileFolder}"
}
