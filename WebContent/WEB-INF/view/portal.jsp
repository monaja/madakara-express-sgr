<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>User Portal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css">
  <script src="../../ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>

<h2>User Portal</h2>
<div class="container">
  <h2>My tickets</h2>
  <p></p>            
  <table class="table">
    <thead>
      <tr>
        <th>Ticket Number</th>
        <th>Date</th>
        <th>Status</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
    <tr class="success">
    <c:forEach var="ticketCurrent" items="${users}">  
      
        <td>${ticketCurrent.userId }</td>
        <td>${ticketCurrent.fName }</td>
        <td>${ticketCurrent.sName }</td> 
        <td>${ticketCurrent.email }</td> 
        <td><a href="view/${ticketCurrent.userId }">Cancel</a></td>            
              
    </c:forEach>
     </tr>
       
       
    </tbody>
  </table>
</div>

</body>

<!-- Mirrored from www.w3schools.com/bootstrap/tryit.asp?filename=trybs_table_contextual&stacked=h by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 13 Mar 2016 11:04:54 GMT -->
</html>
