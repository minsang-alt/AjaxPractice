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
<button onclick="getajax()">클릭</button>

<script>
function getajax(){
	//GET으로 key=value 데이터를 전송하고 응답을 text/plain을 받을 예정
	$.ajax({
		type:"GET",
		url:"http://localhost:8080/ajax/ajax1?username=ssar&password=1234",
		//data: get은 전송할 http의 body가 없음. 그래서 data필드 필요없음
		//contentType: 전송한 data가 없으니까 그 data를 설명할 필드가 필요없음
		dataType: "text" //응답결과의 형태 ,파싱해줌, 응답되는 데이터를 자바스크립트 오브젝트로 파싱하는 용도
	}).done(function(result){
		alert(result);
	});//ajax 통신 완료후에 정상이면 done이 가지고 있는 함수 호출
	
	
	
}


</script>
</body>
</html>