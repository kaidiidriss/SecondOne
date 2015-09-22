<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

        <a class="btn btn-primary" href="formPerson.html">
          Add Article »
        </a>

        <table width="100%" class="table table-striped">
         <thead>
           <th>ID</th>
           <th>NAME</th>
           <th>AGE</th>          
           <th></th>
           <th></th>
           <th></th> 
         </thead>
         <tbody>

		 <c:forEach items="${myListPerosn}" var="element">
          <tr>
            <td ><c:out value="${element.id}" /></td>
            <td><c:out value="${element.name}" /></td>  
            <td><c:out value="${element.age}" /></td>

            <td width="24px"><a href="" class="btn btn-danger btn-xs" style="padding:0px 4px"><i class="icon-trash icon-white" ></i></</a></td>
            <td width="24px"><a href="" class="btn btn-danger btn-xs" style="padding:0px 4px"><i class="icon-pencil icon-white" ></i></</a></td>
            <td width="24px"></td>
            
		  </tr>
		  
		</c:forEach>
		 </tbody>

		</table>

