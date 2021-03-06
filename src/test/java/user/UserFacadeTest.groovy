package user

import question.QuestionFacade
import spock.lang.Specification

class UserFacadeSpec extends Specification {

    def questionFacade
    def userFacade
    def user

    void setup() {
        questionFacade = new QuestionFacade()
        userFacade = new UserFacade(questionFacade)
    }

    def "Newly registered user should be provided with ten initial challanges"() {
        given: "User creation dto"
        NewUserDto newUserDto = new NewUserDto("anyUsername");

        when: "Request is performed on facade"
        user = userFacade.registerUserIntoGame(newUserDto);

        then: "Created user should have ten challenges provided"

    }
}
