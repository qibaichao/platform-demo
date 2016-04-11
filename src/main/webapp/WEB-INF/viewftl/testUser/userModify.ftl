
<form  action="userModify.aj"  refreshId="list-page" class="ajaxfrmwin" method="post" stopRefresh=true>
<input type="hidden" name="userId" id="userId" value="${userVo.userId}">
	userName:<input name="userName" type="text" value="${userVo.userName}"/><br>
	email:<input name="email" type="text" value="${userVo.email}"/><br>
	phone:<input name="phone" type="text" value="${userVo.phone}"/><br>
	address:<input name="address" type="text" value="${userVo.address}"/><br>
	age:<input name="age" type="text" value="${userVo.age}"/><br><br>
	 <input type="submit" name="button6" id="button6" value="确定" />
</form>
