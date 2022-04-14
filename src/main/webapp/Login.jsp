<html>
<style>
body {
  background-color:#008B8B;
  align-content: center;
  text-align: center;
}
#main {
  
  width: 100%;
  height: 300px;
  display: flex;
  flex-wrap: wrap;
  align-content: center;
  text-align: center;
}
#main div {
  width: 100%;
  height: 40px; 
  text-align: center;
}
</style>
<body>
 <form action="Login" method="post">
	<h1	style="background-color: #FFFF00; font-size: 200%; ">WELCOME	TO LEARNERS ACADEMY</h1>
	<br/>
	<h2 style="font-size: 200%; font-color: =#000000;">Login</h2>
	<br/>
	<input style="text-align: center;" name="username"
		type="text" value="UserName" placeholder="Enter userName" />
	<br/>
	<input style="text-align: center;" type="password" name="password" value="Password" placeholder="Password" />
	<br/><br/>
	<input style="text-align: center;width:120;font-family: sans-serif; font-size:medium;"  type="submit" value="Login"/>
	<br />
	</form>
</body>
</html>
