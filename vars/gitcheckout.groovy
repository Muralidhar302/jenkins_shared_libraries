def call (map config) {
    echo "Branch = ${config.branch}"
    echo "url = ${config.url}"
    credentialsId = ${config.credentialsId}
        checkout scmGit(
                        branches: [[name: 'config.Branch']],
                        userRemoteConfigs:[[credentialsId: 'config.credentialsId', 
                                            url: 'config.url'
                        ]]
        )

}


    // Branch: 'main',
    // credentialsId: 'github_token', 
    // url: 'https://github.com/Muralidhar302/jenkins_shared_libraries.git'

