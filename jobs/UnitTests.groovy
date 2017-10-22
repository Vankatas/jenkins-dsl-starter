/**
 * Created by isi06 on 22/10/2017.
 */
class UnitTests {

    def static unitTests() {
        def gitUrl = 'git@github.com:Vankatas/java-spring-rest-service-template.git'

        job('unit-tests') {
            scm {
                git(gitUrl)
            }
            triggers {
                scm('H/2 * * * *')
            }
            steps {
                gradle('-e clean test')
            }
        }
    }
}


