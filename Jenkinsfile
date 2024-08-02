pipeline {
    agent any

    environment {
            SLACK_CHANNEL = '#aplicación-de-eventos'
            JOB_NAME = 'JOB_NAME'
            BUILD_NUMBER = '1.0'
            BUILD_URL = 'www.app-manage.com'
        }

    stages {
            stage('Checkout') {
                        steps {
                            checkout scmGit(branches: [[name: 'main']],
                                            userRemoteConfigs: [[url: 'https://github.com/s3codecL/app-gestion-eventos']])
                        }
                    }


/*
        stage('SonarQube Analysis') {
            steps {
                script {
                    def sonarRunner = tool name: 'SonarQubeScanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    withSonarQubeEnv('SonarQubeServer') {
                        sh """
                            ${sonarRunner}/bin/sonar-scanner \
                            -Dsonar.projectKey=manage-eventos-app \
                            -Dsonar.java.binaries=target/classes
                        """
                    }
                }
            }
        }


        stage('Quality Gate') {
            steps {
                timeout(time: 3, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
*/

        stage('Build') {
            steps {
                // Compila el proyecto usando Maven
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Ejecuta las pruebas unitarias
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Empaqueta la aplicación
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                // Despliega la aplicación (ajusta según tu entorno)
                sh 'echo "Deploying application..."'
            }
        }
    }

    }

