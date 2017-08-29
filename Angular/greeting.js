(function(){

var app=angular.module("greetingapp",[]);

var greetingctrl=function($scope){
$scope.greeting="Hi, Angi you are awsome";


}
app.controller("greetingController",greetingctrl);



}())