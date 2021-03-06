node {

    def pom
    def version

    stage('Checkout') {
        checkout scm
    }

    stage('Preparation') {
        pom = readMavenPom file: 'pom.xml'
        version = pom.version.replace("-SNAPSHOT", ".${currentBuild.number}")
    }

    stage('Compile') {
        withDockerContainer('elara/mvn:3.5.4_201') {
            sh "mvn -B -e versions:set -DnewVersion=${version} clean compile"
        }

    }

//    stage('Unit Tests') {
//        withDockerContainer('elara/mvn:3.5.4_201') {
//            sh 'mvn -B -e org.jacoco:jacoco-maven-plugin:prepare-agent test'
//            junit '**/target/surefire-reports/TEST-*.xml'
//            jacoco()
//        }
//    }

    stage('SonarQube Analysis') {
        withDockerContainer('elara/mvn:3.5.4_201') {
            withSonarQubeEnv("SonarQube") {
                sh 'mvn -B -e org.jacoco:jacoco-maven-plugin:prepare-agent sonar:sonar'
            }
        }
    }

    stage("SonarQube Quality Gate") {
        timeout(time: 5, unit: 'MINUTES') {
            def qg = waitForQualityGate()
            if (qg.status != 'OK') {
                error "Pipeline aborted due to quality gate failure: ${qg.status}"
            }
        }
    }

    stage('Package') {
        withDockerContainer('elara/mvn:3.5.4_201') {
            sh 'mvn -B -e -DskipTests package'
        }
    }

    stage('Release') {
        parallel 'Deploy': {
            withDockerContainer('elara/mvn:3.5.4_201') {
                sh 'mvn -B -e -DskipTests deploy'
            }
        }, 'Tag': {
            sshagent(['cis-ssh']) {
                sh('git config --global user.email "cis@elara-gmbh.de"')
                sh('git config --global user.name "jenkins"')
                sh("git tag ${version}")
                sh('git push --tags')
            }
        }
    }
}
