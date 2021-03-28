function SignInValid() {
    var myUser = document.getElementById('Name').value;
    var myPass = document.getElementById('password').value;
    var adminid=document.getElementById('adminid').value;

    if (myUser == "") {
        document.getElementById('myFirstName1').innerHTML = "** Please Fill Username Field";
        return false;
    }
    if ((myUser.length <= 2) || (user.length > 20)) {
        document.getElementById('myFirstName1').innerHTML = "** User Length must be between 2 to 20";
        return false;
    }
    if (!isNaN(myUser)) {
        document.getElementById('myFirstName1').innerHTML = "** User Name can't be number";
        return false;
    }

    if (myPass == "") {
        document.getElementById('myPassword1').innerHTML = "** Please Fill Password Field";
        return false;
    }

    if ((myPass.length <= 5) || (password.length > 20)) {
        document.getElementById('myPassword1').innerHTML = "** Passwod Length must be between 5 to 20";
        return false;
    }
    
    if (adminid == "") {
		document.getElementById('adminid1').innerHTML = "** Please Fill Admin-ID Field";
		return false;
	}
	if (isNaN(adminid)) {
		document.getElementById('adminid1').innerHTML = "** Admin-ID must be digits only not characters";
		return false;
	}

}/**
 * 
 */