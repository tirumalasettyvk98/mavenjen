pipeline {
    agent any

    tools 
    {
      
        maven "MAVEN"
    }

    stages 
    {
                stage('Build')
                {
                            steps 
                            {

                                git 'https://github.com/tirumalasettyvk98/mavenjen.git'

                                  bat "mvn clean package"
                           }


                }
    }
}
