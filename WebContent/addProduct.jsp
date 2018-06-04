<html>
<head>
</head>
<body>
<a href="logoutController">Logout</a>
 <a href="adminHomeController">Home</a>
<form name="productform" method="post" action="addProductController">
<br><br><br>
<table align="center" width="300px" style="background-color:#EDF6EA;border:1px solid #000000;">
<tr><td colspan=2 style="font-weight:bold;" align="center">Add Product</td></tr>
<tr><td colspan=2 align="center" height="10px"></td></tr>
	<tr>
		<td style="font-weight:bold;">Product Name</td>
		<td><input type="text" name="name" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Description</td>
		<td><input type="text" name="description" value=""></td>
	</tr>
	<tr>
		<td style="font-weight:bold;">Price</td>
		<td><input type="number" name="price" value=""></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" name="Submit" value="Save" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
	</tr>
	<tr><td colspan=2 align="center" height="10px"></td></tr>
</table>
</form>


</body>
</html>


