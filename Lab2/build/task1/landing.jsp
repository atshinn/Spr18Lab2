<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Landing</title>


</head>


  <body>
  <%@ page import="model.User,model.Story,javax.servlet.ServletContext" %>
	<%
		User user = (User)session.getAttribute("user");
		
		
		String role = user.getRole();
		
		String contextName = session.getServletContext().getServletContextName();
		
		if(user == null || role.equalsIgnoreCase("guest")){
	%>
		<a href="/task1/login.jsp">Login</a><br>
	
	<%}else if(role.equalsIgnoreCase("reporter")){%>
	
		<a href="task1/newstory.jsp">New Story</a><br>
		
	<%}%>
		<h1>ServletContextName = <%=contextName %></h1>
	<%
		Story[] stories = (Story[])session.getAttribute("stories");
		if(stories != null)
			for(int i = 0 ; i < stories.length ; i++){
				Story s = stories[i];
				String sName = s.getName();
				String storyUrl = "task1/viewstory/" + sName;
				
				if(s.canUserView(role)){%>
					<a href=<%=storyUrl%>><%=sName%></a>	
		
			<%	}else{	%>
					<span><%=sName%></span>					
			<%	}
				
				if(role.equalsIgnoreCase("reporter")){%>
					<a href="task1/controller/edit">edit</a>
					<a href="task1/controller/delete">delete</a>
			<%	} 
			}%>
			
	

<br>

</body>
</html>