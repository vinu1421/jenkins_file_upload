node('master') {


	deleteDir()

	stage('Request files'){

    //    userInput = input message: 'Input the file ', parameters: [file(description: '', name: 'vinu')]
      properties([[$class: 'JiraProjectProperty'], parameters([file(description: '', name: 'vinu')])])
	  sh 'ls -l'
			

			
		
	}
}