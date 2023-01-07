<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script>
  src="https://code.jquery.com/jquery-3.6.3.js"
  integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
  crossorigin="anonymous">
 </script>
</head>
<body>
<button onclick="postajax()">클릭</button>

<script>
function postajax(){
	//post로 key=value 데이터를 전송하고 응답을 json을 받을 예정
	$.ajax({
		type:"POST",
		url:"http://localhost:8080/ajax/ajax1",
		data: "username=ssar&password=1234",
		contentType: "application/x-www-form-urlencoded",
		//dataType: "json" //응답결과의 형태 ,파싱해줌, 응답되는 데이터를 자바스크립트 오브젝트로 파싱하는 용도
	}).done(function(result){
		console.log(result);
		console.log(result.username);
	});//ajax 통신 완료후에 정상이면 done이 가지고 있는 함수 호출
	
	
	
}


</script>
</body>
</html>