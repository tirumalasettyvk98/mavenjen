pipeline {
    agent any

    stages 
    {
                stage('clone')
                {
                            steps 
                            {

                                git 'https://github.com/tirumalasettyvk98/mavenjen.git'

                           }


                }
        
        
         stage('Build code')
                {
                            steps 
                            {

                                

                                  bat "mvn clean package"
                           }


                }
    }
}
