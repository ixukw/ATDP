$(document).ready(() => {
  let validNum=0;
  let alreadyClicked=false;
  let clicked = [""];
  $("h3.questionBar").toggle();
  $("div.mc div input").on("click",(event) => {
    if ($(event.currentTarget).is("div.mc div:nth-of-type(5) input, div.mc div:nth-of-type(7) input")) {
      $(event.currentTarget).parent().toggle("slow");
      $(event.currentTarget).parent().prev().toggle("slow");
      $(event.currentTarget).parent().prev().prev().toggle("slow");
    } else {
      $(event.currentTarget).parent().toggle("slow");
      $(event.currentTarget).parent().prev().toggle("slow");
      /*if ($(event.currentTarget).parent().prev().prev().val() != undefined) {
        $(event.currentTarget).parent().prev().prev().hide("slow");
        $(event.currentTarget).parent().prev().prev().prev().show("slow");
      }*/
    }
  });
  $("div.mc h3.questionBar").on("click", (event) => {
    if ($(event.currentTarget).is("div.mc h3.questionBar:nth-of-type(5), div.mc h3.questionBar:nth-of-type(7)")) {
      $(event.currentTarget).next().show("slow");
      $(event.currentTarget).hide("slow");
      $(event.currentTarget).prev().show("slow");
    } else {
      $(event.currentTarget).next().toggle("slow");
      $(event.currentTarget).toggle("slow");
    }
  });
  $("input[type=number], input[type=text]").on("input", (event) => {
    $(event.currentTarget).addClass("changed");
  });
  $("textarea").on("change", (event) => {
    $(event.currentTarget).toggle("slow");
    $(event.currentTarget).prev().toggle("slow");
    $(event.currentTarget).prev().prev().toggle("slow");
  });
  $(".fr h3.questionBar").on("click", (event) => {
    $(event.currentTarget).next().toggle("slow");
    $(event.currentTarget).next().next().toggle("slow");
    $(event.currentTarget).toggle("slow");
  });
  $("input, textarea").on("change", (event) => {
    let a=$(event.currentTarget).attr("name");
    for (let i=0; i<clicked.length; i++) {
      if (clicked[i] == a) {
        alreadyClicked=true;
      }
    }
    clicked.push(a); // Yeah, I know.
    if (alreadyClicked==false) {
      validNum++;
    } else {
      alreadyClicked=false;
    }
    $("#progress").attr("value", Math.round((validNum/23)*100));
  });
});
