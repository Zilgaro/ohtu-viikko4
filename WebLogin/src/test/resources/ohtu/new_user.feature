Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation successful with correct username and password
        Given new user is selected
        When username "testi" and password "ohtu2017" and password confirmation "ohtu2017" are given
        Then user is created

    Scenario: creation fails with too short username and valid passord
        Given new user is selected
        When username "ka" and password "ohtu2017" and password confirmation "ohtu2017" are given
        Then user is not created and error "username should have at least 3 characters" is reported   

    Scenario: creation fails with correct username and too short password
        Given new user is selected
        When username "testi" and password "oh" and password confirmation "oh" are given
        Then user is not created and error "password should have at least 8 characters" is reported   

    Scenario: creation fails with correct username and password consisting of letters
        Given new user is selected
        When username "testi" and password "ohtukaksi" and password confirmation "ohtukaksi" are given
        Then user is not created and error "password can not contain only letters" is reported 

    Scenario: creation fails with already taken username and valid pasword
        Given new user is selected
        When username "jukka" and password "ohtu201*" and password confirmation "ohtu201*" are given
        Then user is not created and error "username is already taken" is reported 

    Scenario: creation fails when password and password confirmation do not match
        Given new user is selected
        When username "newuser" and password "password121" and password confirmation "jeesuskristus" are given
        Then user is not created and error "password and password confirmation do not match" is reported   