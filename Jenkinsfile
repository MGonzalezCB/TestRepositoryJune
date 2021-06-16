node {
        checkout(
            [$class: 'GitSCM', 
            branches: [[name: '*/master']], 
            doGenerateSubmoduleConfigurations: false, 
            //extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: 'https://github.com/MGonzalezCB/TestRepositoryJune.git']],
                extensions : scm.extensions + [
                    [$class: 'SubmoduleOption', disableSubmodules: false, parentCredentials: true, recursiveSubmodules: true, reference: '', trackingSubmodules: false],
                    [$class: 'CloneOption', depth: 0, noTags: false, reference: '', shallow: false, honorRefspec: true],
                    [$class: 'GitLFSPull']
                ]
            ]
        //gitTool: "NATIVE_GIT"]
        )
        sh("git tag -l | wc -l")
}
