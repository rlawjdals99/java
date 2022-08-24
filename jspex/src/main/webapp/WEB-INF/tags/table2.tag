<%@ tag language="java" pageEncoding="UTF-8" body-content="empty" %>
<%@ attribute name="no" required="true" type="java.lang.Integer" %>
<%@ attribute name="no2" required="false" %>
<!-- attribute는 JSP에서 값을 가져올 때 사용하는 문법입니다. name으로 태그에 있는
값을 가져옴. type 값을 가져올 때 자료형을 말합니다.
required : true (자료형을 무조건 사용), false (자료형과 관계없이 사용)-기본 -->

<%@ variable name-given="returncall" variable-class="java.lang.Integer" scope="AT_END"%>
<%@ variable name-given="returncall2" scope="AT_END"%>
<!-- variable : 출력 여부 및 변수 이름을 추가할 때 사용합니다. (return에 사용할 이름) 
variable-class : 자료형을 구분하게 됨. 단, required false일 경우 사용하지 않으셔도 됩니다.
{
scope : 출력형태, 
AT_END : 태그 종료 후 출력, 
AT_BEGIN : 태그 시작에 초기값을 입력 받아 출력, 
NESTED : foreach 사용시 적용 
} 
-->


<%@ taglib prefix="kk" uri="http://java.sun.com/jsp/jstl/core"%>
<kk:set var="returncall" value="${no}"></kk:set>
<kk:set var="returncall2" value="${no2}"></kk:set>