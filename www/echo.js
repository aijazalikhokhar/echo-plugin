var echo = {
    createEvent: function(message, successCallback, errorCallback) {
 
    }
}
var echo = {
    createEvent: function(message, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'Echo', // mapped to our native Java class called "Echo"
            'showEcho', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "message": message}]
        ); 
     }
}
module.exports = echo;