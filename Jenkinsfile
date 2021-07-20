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
                    [$class: 'CloneOption', depth: 0, noTags: false, reference: '', shallow: false, honorRefspec: true]
                    //,[$class: 'GitLFSPull']
                ]
            ]
        //gitTool: "NATIVE_GIT"]
        )
        
        //--------------
/*        withCredentials([usernamePassword(credentialsId: 'my-credentials-id', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]){    
        sh('''
        git config --local credential.helper "!f() { echo username=\\$GIT_USERNAME; echo password=\\$GIT_PASSWORD; }; f"
        git fetch --force --progress --depth 1 -- $REPO_URL +refs/tags/*:refs/tags/*
        ''')
        }
  */      //--------------
        
        sh("git tag -l | wc -l")
        
        sh("git tag -l | wc -l")
}
