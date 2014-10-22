var echo = {
    show: function(title,successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'Echo', // mapped to our native Java class called "CalendarPlugin"
            'showEcho', // with this action name
            [title]
        ); 
    }
}
module.exports = echo;