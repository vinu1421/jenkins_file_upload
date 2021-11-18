node('master') {


	deleteDir()

	stage('Request files'){

       userInput = input message: 'Input the file ', parameters: [file(description: '', name: 'vinu')]
	   sh 'mv $vinu ${WORKSPACE}/'
			

			
		
	}
}