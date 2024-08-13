
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList, java.util.Map" %>

<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Car List</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css">
</head>

<body>
<!-- Menu -->
<%@ include file="/WEB-INF/views/commons/header.jsp" %>

<%
  ArrayList<Map<String, Object>> resultList = (ArrayList<Map<String, Object>>) request.getAttribute("carCompanyInfo");
%>

<table class="table">
  <thead>
  <tr>
    <th>회사이름</th>
    <th>자동차이름</th>
    <th>연식</th>
    <th>옵션 갯수</th>
  </tr>
  </thead>

  <tbody id="carCompanyTableBody">
  <%
    if (resultList != null) {
      for(int i=0; i < resultList.size(); i=i+1){
        Map<String, Object> record = resultList.get(i); %>
      <tr>
        <td> <%= record.get("CP_NAME") %> </td>
        <td> <%= record.get("CAR_NAME") %> </td>
        <td> <%= record.get("DATE_YEAR") %> </td>
        <td> <%= record.get("OPT_COUNT") %> </td>
      </tr>
  <%
      }
    }else{ %>
      <tr>
        <td colspan="4">No data</td>
      </tr>
  <% } %>
  </tbody>
</table>

<!-- Footer -->
<%@ include file="/WEB-INF/views/commons/footer.jsp" %>

</body>
</html>
