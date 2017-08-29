
/*(function(){

		var app=angular.module("facebook",[]);

		var mainCtrl= function($scope,$http){
			var accessToken="EAACEdEose0cBALt5n0KYBxIqIhbNPfFKw0IDOZATfGhZCWlT4UG26XhE3ZAK4KpJgpS25ZBLjjZArZCGZB0s4nMEZAfvlUWStRXA999ccWnQYxewnhpXKZBoJpbzwYE32E7DV4HfUun9GZCYbZC9nuLPaxflGWViw06YdSEE8Wm37CZBaSLXBJX8SiU8CejvaNEhzjjEGpsPr2Pn8QZDZD";
			var url="https://graph.facebook.com/v2.10";
			var userid=$scope.userid;
			
			
			var onUserComplete=function(response){
				
				$scope.user=response.data;
				console.log(response.data);
			};
			
			var onError=function(reason){
				$scope.error=reason;
			
			};
			$scope.search=function(){
				$http.get(url+"/"+$scope.userid+"?fields=about,id,name,cover&access_token="+accessToken).then(onUserComplete);
			}
			/*promise.then(function (response){
			
				$scope.user=response.data;
			
			})*/
				


		}
		app.controller("mainController",mainCtrl);



}())*/






(function(){

	 var app=angular.module("fbw",[]);
	 
	 var mainCtrl=function($scope,$http){
	 var accessToken="EAACEdEose0cBAJe1iWilGGqa27yqvr9GKC2VXzVMBq0ozNLRdTabzUMgAtSMwnLSq1pkbXuLfScHEv7AZA2TZCtJyMFHf0TFqxUvruRVh9PGh4zFKp1bu9iqxbP0hbQKh6geXIaldty4pOqv4euYDde6pjYJsemPTwZAd0bZBAvdPAi7PmH3mhjQiAAGKAclS1AM8ayWbAZDZD";
	 var url="https://graph.facebook.com/v2.10";
	 var userid=$scope.userid;
	 
	
	 var onUserComplete=function(response){
	 $scope.user=response.data;
	 
	 console.log(response.data);
	 }
	 
	 var onError=function(reason){
	$scope.error=reason;
	 }
	$scope.search=function(){
	$http.get(url+"/"+$scope.userid+"?fields=about,id,name,cover&access_token="+accessToken).then(onUserComplete);
	}
	/* promise.then(function(response){
	$scope.user=response.data;
	 })*/
	 }
	app.controller("mainController",mainCtrl);

}())
