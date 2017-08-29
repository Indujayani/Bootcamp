(function(){

		var app=angular.module("profile",[]);

		var profileCtrl= function($scope){
				var employee ={
				name:"indu",
				city:"colombo",
				image:"https://www.w3schools.com/css/paris.jpg"
				};
		$scope.message="profile";
		$scope.employee=employee;


		}
		app.controller("profileController",profileCtrl);



}())