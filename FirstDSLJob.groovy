job('Maven_First_DSL_Job') {
    description('First maven job genenrated by DSL on ${new Date()}, the project is a small maven project hosted on Git')
    scm {
        git('https://github.com/Kartik9555/springboot-unit-example.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.jar')
    }
}