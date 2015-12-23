config = new Properties()
new File('config.properties').withInputStream { config.load it }
geb.Browser.drive {
    go config.url
    $ config.username_selector value config.username 
    $ config.password_selector value config.password
    $ config.button_selector click()
}