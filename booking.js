
	function priceCalculation(pssngSelectObj){
		var priceOf1=document.getElementById("priceHidden").value;
		var passenger=pssngSelectObj.value;
		var price=document.getElementById("price");

			price.value=priceOf1*passenger;
	}
	
