<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>
		boppage.jsp
		<%@ page import="java.util.*" %>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>
<%@ page import="javax.activation.*" %>
<%
String host = "localhost,8080";//your local host
String to = request.getParameter("to");
to = "umeshsohaliya85@gmail.com";
	System.out.print(to);
String from = request.getParameter("from");
from="umeshsohaliya85@hotmail.com";
String subject = request.getParameter("subject");
subject="test";
String messageText = request.getParameter("body");
messageText="fcdv  gthy fgrgh";
boolean sessionDebug = false;
Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol", "smtp");
Session mailSession = Session.getDefaultInstance(props, null);
mailSession.setDebug(sessionDebug);
Message msg = new MimeMessage(mailSession);
System.out.print(msg);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
System.out.print(subject);
msg.setSubject(subject);
msg.setSentDate(new Date());
msg.setText(messageText);
Transport.send(msg);
out.println("Mail was sent to " + to);
out.println(" from " + from);
out.println(" using host " + host + ".");
%>
</body>
</html>