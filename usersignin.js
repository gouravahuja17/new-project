function SignInValid() {
    var myUser = document.getElementById('Name').value;
    var myPass = document.getElementById('password').value;
    var contact=document.getElementById('contact').value;

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
    
    if (contact == "") {
		document.getElementById('contact1').innerHTML = "** Please Fill Contact Field";
		return false;
	}
	if (isNaN(contact)) {
		document.getElementById('contact1').innerHTML = "** Contact must be digits only not characters";
		return false;
	}
	if (contact.length != 10) {
		document.getElementById('contact1').innerHTML = "** Mobile No must be 10 digits only";
		return false;
	}
}