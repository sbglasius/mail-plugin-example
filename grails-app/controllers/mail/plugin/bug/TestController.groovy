package mail.plugin.bug

class TestController {

    SendThatMailService sendThatMailService

    def index() {
        sendThatMailService.testScenarios()

        render(text: "Sent")
    }
}
 