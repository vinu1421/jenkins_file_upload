@Library('vinu_shared')
node {

	stage('Request files'){

    //    userInput = input message: 'Input the file ', parameters: [file(description: '', name: 'vinu')]
      properties([[$class: 'JiraProjectProperty'], parameters([file(description: '', name: 'file')])])
      def file_in_workspace = unstashParam "file"
	  sh "cat ${file_in_workspace}"
			

			
		
	}
}