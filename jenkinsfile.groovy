node('master') {


	deleteDir()

	stage('Request files'){


		def userInput
		timeout(time: 5, unit: 'MINUTES') {
			// userInput = input(id: 'userInput', message: 'Files to import', parameters: parameters)
            userInput = input message: 'Input the file ', parameters: [file(description: '', name: 'vinu')]
		}

	    sh 'mv vinu ${WORKSPACE}/'
			

			
		
	}
}