package mail.plugin.bug

import grails.plugins.mail.MailService

class SendThatMailService {

    MailService mailService

    void sendMailFrom(String sendingFrom) {
        mailService.sendMail {
            to 'sbglasius+test@gr8conf.org'
            from sendingFrom
            subject "Testing Emails, sent from $sendingFrom"
            body "Should be working, sent from $sendingFrom"
        }
    }
    
    void testScenarios() {
        sendMailFrom('Søren Gmail <sbglasius@gmail.dk>') // The account email
        sendMailFrom('sbglasius@gmail.dk') // The account email
        sendMailFrom('Søren Google Workspace <soeren@glasius.dk>') // An account email alias
        sendMailFrom('soeren@glasius.dk')  // An account email alias
        sendMailFrom('Someone <email@somewhere.com>') // Obviously not mine
        sendMailFrom('email@somewhere.com') // Obviously not mine
    }
}
