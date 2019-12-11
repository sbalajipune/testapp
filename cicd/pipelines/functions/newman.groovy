// newman utility operations

def runTest(testCollection, testEnvironment) {
   echo "Testing collection ${testCollection} against environment ${testEnvironment}"
   // TODO create a jenkins slave image with newman install
   // meanwhile, install it everytime...
   sh "ls -ltr"
   sh "pwd"
   sh "npm install -g newman"
   sh "newman run ${testCollection} -e ${testEnvironment} --disable-unicode --color off"
}

return this
