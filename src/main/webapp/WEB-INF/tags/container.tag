<%@ tag pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="bootstrap" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Mirae Book</title>
	<meta name="description" content="Miraebook index">
	<meta name="author" content="hyungkyu jo">

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le styles -->
    <link href="../css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
    	body {
    		padding-top: 60px;
    		padding-bottom: 40px;
    	}
    </style>
    <link href="../css/bootstrap-responsive.css" rel="stylesheet">	
</head>

<body>

	<bootstrap:topNavi/>
	
	<div class="container">
		<jsp:doBody/>
	
		<bootstrap:footer/>
	</div>
	
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <script src="../js/jquery.js"></script>
    <script src="../js/bootstrap.js"></script>

</body>
</html>

