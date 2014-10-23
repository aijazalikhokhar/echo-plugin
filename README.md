CalendarPlugin
==============

Sample PhoneGap plugin to Generate toast in android

Install
========
Assuming the PhoneGap CLI is installed, from the command line run:

phonegap local plugin add https://github.com/aijazalikhokhar/toast-plugin

usage
=========
window.echo.show('msg',success,fail);

example
========
If you want to toast text Hello World! then you can follow as below

window.echo.show('Hello World!',function(msg){
  console.log('Success '+msg);
},function(msg){
  console.log('Eroor '+msg);
});

cheers! you will see a toast with text Hello World! .... enjoy
