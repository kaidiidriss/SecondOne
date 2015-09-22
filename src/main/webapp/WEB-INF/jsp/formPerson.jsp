<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

      <form:form class="well" commandName="person" method="post" action="savePerson.html">
		<form:errors path="*" cssClass="errorblock" element="div" />
		 <table>
		   <tr>
		     <td>			
			    <label for="textinput1">
		          Name :
		        </label>
	        </td>
	        <td>
	          <form:input path="name" cssErrorClass="error"  />
			  <form:errors path="name" cssClass="error" />
	        </td>
		   </tr>
		   
		   <tr>
		     <td>
				<label for="textinput2">
		          Age :
		        </label>			     
		     </td>
		     <td>
				<form:input path="age" cssErrorClass="error"  />
				<form:errors path="age" cssClass="error" />		     
		     </td>
		   </tr>
		   		   
		 </table>
	

			<br/>

				
			<input type="submit" class="btn btn-default" value="Save"/> <a class="btn btn-default" href="person.html">Cancel</a>
	  </form:form>    