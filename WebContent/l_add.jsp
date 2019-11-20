<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<!-- //js -->
<link rel="stylesheet" href="css/colorbox.css" />
<!-- font-awesome-icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome-icons -->
<link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>

</head>
<body>
	<div class="services">
		<div class="container">
			<h3 class="w3l_header w3_agileits_header1">Publish add Form</span></h3>
			<div class="w3layouts_mail_grid">
				<div class="col-md-7 agileits_mail_grid_right agileits_w3layouts_mail_grid_right">
					<div class="agileits_mail_grid_right1 agile_mail_grid_right1">
						<form action="viewQues.jsp" method="post">
							<span>
								<i>Username</i>
								<input type="text" name="uname" class="form-control" style="width:450px" value="" required="">
							</span>
							<span>
								<i>NIC</i>
								<input type="text" name="nic" class="form-control" style="width:450px" value="" required="">
							</span>
							<span>
								<i>Email</i>
								<input type="email" name="email" class="form-control" style="width:450px"  value=" " required="">
							</span>
							<span>
								<i>Date</i>
								<input type="date" name="date" class="form-control" style="width:450px"  value=" " required="">
							</span>
							<span>
								<i>Type</i>
								<!--<input type="text" name="Subject" placeholder=" " required="">-->
								<select class="form-control" style="width:450px">
								  <option value="Rent">Rent</option>
								  <option value="Sell">Sell</option>
								</select>
							</span>
							<span>
								<i>price</i>
								<input type="text" name="nic" class="form-control" style="width:450px" value=" " required="">
							</span>
							<span>
							
							</span>
							<input type="submit" value="Submit Now">
						</form>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
</body>
</html>