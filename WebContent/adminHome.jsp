<%@ page language="java" import="java.util.*;"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
 <HEAD>
  <TITLE>Servlet Application</TITLE>
  
  <script language="javascript">

  function replyToQuery(id){
   
    window.location.href = "#"; 
  }
</script>
 </HEAD>

 <BODY>
 <a href="logoutController">Logout</a>
 <a href="productsHomeController">Products</a>
 <br>
 <p>${message}</p>
<c:remove var="message" scope="session" /> 
<table align="center">
  
</table>
<br>
  <table width="600px"  align="center" style="background-color:#EDF6EA;border:1px solid #000000;">
 <tr><td colspan=9 align="center" height="10px"></td></tr>

    <tr><td colspan=5 align="center"><h3 style="font-weight:bold;color:#cc0000;">Queries</h3></td></tr>
<tr><td colspan=9 align="center" height="10px"></td></tr>
  <tr style="background-color:#7BA88B;font-weight:bold;">
     <td>Query Id</td><td>First Name</td><td>Last Name</td>
	 <td>Email</td><td>Query</td><td>Reply</td>
  </tr>
	<%
	String bgcolor="";
	int count=0;
	List viewList = new ArrayList();
	Iterator  viewItr;
	
	if(request.getAttribute("queryList")!=null && request.getAttribute("queryList")!="")
	{
		List productList =  (ArrayList)request.getAttribute("queryList");
		Iterator itr = productList.iterator();
		
		while(itr.hasNext())
		{
			
			if(count%2==0)
			{
			 bgcolor = "#C8E2D1";
			}
			else
			{
				
				bgcolor = "#EAF8EF";
			}
			
			viewList = (ArrayList)itr.next();
			int id = Integer.parseInt(viewList.get(0).toString());
			viewItr = viewList.iterator();
			%>
			<tr style="background-color:<%=bgcolor%>;">
			<%	
			while(viewItr.hasNext())
			{
			
				%>
				<td><%=viewItr.next()%></td>
				
				<%
					
			}
			count++;
			%>
		
				<td><input type="button" name="delete" style="background-color:#ff0000;font-weight:bold;;color:#ffffff;" value="Reply" onclick="replyToQuery(<%=id%>);"></td>
			</tr>
			<%
		}
	}
	if(count==0)
	{
		%>
		<tr><td colspan="9" align="center">&nbsp;</td></tr>
            <tr><td colspan="9" align="center">No Record Avaliable</td></tr>
		<%
	}
	%>
     <tr><td colspan=9 align="center" height="2px"></td></tr>
  </table>	
 </BODY>
</HTML>
