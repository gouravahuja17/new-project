function SignUpValid() {
	var firstName = document.getElementById('firstName').value;
	var lastName = document.getElementById('lastName').value;
	var contact = document.getElementById('contact').value;
	var locality = document.getElementById('address').value;
	var email = document.getElementById('email').value;

	var password = document.getElementById('password').value;
	var repass = document.getElementById('re-password').value;

	if (firstName == "") {
		document.getElementById('firstName1').innerHTML = "** Please Fill Username Field";
		return false;
	}
	if ((firstName.length <= 2) || (firstName.length > 20)) {
		document.getElementById('firstName1').innerHTML = "** User Length must be between 2 to 20";
		return false;
	}
	if (!isNaN(firstName)) {
		document.getElementById('firstName1').innerHTML = "** User Name can't be number";
		return false;
	}

	if (lastName == "") {
		document.getElementById('lastName1').innerHTML = "** Please Fill Username Field";
		return false;
	}
	if ((lastName.length <= 2) || (lastName.length > 20)) {
		document.getElementById('lastName1').innerHTML = "** User Length must be between 2 to 20";
		return false;
	}
	if (!isNaN(lastName)) {
		document.getElementById('lastName1').innerHTML = "** User Name can't be number";
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

	if (locality == "") {
		document.getElementById('address1').innerHTML = "** Please Fill Address";
		return false;
	}

	if (email == "") {
		document.getElementById('email1').innerHTML = "** Please Fill E-mail Field";
		return false;
	}
	if (email.indexOf('@') <= 0) {
		document.getElementById('email1').innerHTML = "** @ Invalid Position";
		return false;
	}
	if ((email.charAt(email.length - 4) != '.')
			&& (email.charAt(email.length - 3) != '.')) {
		document.getElementById('email1').innerHTML = "** Invalid E-mail";
		return false;
	}

	if (password == null) {
		document.getElementById('password1').innerHTML = "** Please Fill Password Field";
		return false;
	}

	if ((password.length <= 5) || (password.length > 20)) {
		document.getElementById('password1').innerHTML = "** Passwod Length must be between 5 to 20";
		return false;
	}

	if (password != repass) {
		document.getElementById('re-password1').innerHTML = "** Passwords do not match";
		return false;
	}
	if (repass == "") {
		document.getElementById('re-password1').innerHTML = "** Please Fill Re-Password Field";
		return false;
	}
}