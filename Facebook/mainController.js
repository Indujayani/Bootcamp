
(function(){

		var app=angular.module("fbw",[]);

		var mainCtrl= function($scope,$http){
			var accessToken="";
			var url=;
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



}())






