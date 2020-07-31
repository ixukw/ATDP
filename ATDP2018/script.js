$(document).ready(() => {
	let won=false;
	//let totalClicks=0;
	function randomizeBoard() {
		let randNum = Math.floor(Math.random() * Math.floor(3));
		console.log(randNum);
		if (randNum == 0) {
			$("tr:nth-child(2) td:nth-child(1), tr:nth-child(3) td:nth-child(2), tr:nth-child(3) td:nth-child(2), tr:nth-child(3) td:nth-child(5), tr:nth-child(4) td:nth-child(5)").toggleClass("on");
		} else if (randNum==1) {
			$("tr:nth-child(1) td:nth-child(2), tr:nth-child(2) td:nth-child(1), tr:nth-child(2) td:nth-child(5), tr:nth-child(4) td:nth-child(2),tr:nth-child(5) td:nth-child(2)").toggleClass("on");
		} else if (randNum==2) {
			$("tr:nth-child(1) td:nth-child(2), tr:nth-child(1) td:nth-child(5), tr:nth-child(3) td:nth-child(5), tr:nth-child(4) td:nth-child(1),tr:nth-child(5) td:nth-child(3),tr:nth-child(5) td:nth-child(5) ").toggleClass("on");
		}
	}
	let button = document.createElement("BUTTON");
	button.appendChild(document.createTextNode("Reset"));
	document.body.appendChild(button);
	//$("td:last-of-type").addClass("on");
	/*function displayClicks() {
		totalClicks=parseInt(totalClicks)+parseInt(1);
		let divData=document.getElementById("count");
		divData.innerHTML="Moves: ("+ totalClicks +")";
	}*/
	//$("td").attr("onclick", "displayClicks();");
	if (won==false) {
		randomizeBoard();
		$("td").click((event) => {
			$(event.currentTarget).toggleClass("on");
			$(event.currentTarget).next().toggleClass("on");
			$(event.currentTarget).prev().toggleClass("on");
			$(event.currentTarget).parent().prev().children().eq($(event.currentTarget).index()).toggleClass("on");
			$(event.currentTarget).parent().next().children().eq($(event.currentTarget).index()).toggleClass("on");
			let a=0;

			$("td").each(function() {
				if (!$(this).hasClass("on")) {
					a++;
				}
			});
			if (a ==25) {
				won=true;
			}
			if (won==true) {
				$("h2").toggleClass("hidden");
			}
		});
	}
	$("button").click((event) => {
		$("td").removeClass("on");
		randomizeBoard();
	});
});
