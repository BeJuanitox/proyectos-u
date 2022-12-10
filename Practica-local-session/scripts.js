$(document).ready(function () {

  $(`#generar`).click(function(e){
    e.preventDefault();
    
    const max = 30;
    const min = 10;
    
    var edad = Math.floor(Math.random()*(max - min-1)+min);
    var name = "Usuario "+(Math.floor(Math.random()*10)+1);

    $(`#edad`).val(edad);
    $(`#name`).val(name);
  })

  $(`#enviar`).click(function(){

    window.open("usuario.html", "_self");
    
    if(typeof(Storage) != `undefined`){

      const name = $("#name").val();
      const edad = $("#edad").val();

      sessionStorage.setItem("name", name);
      sessionStorage.setItem("edad", edad);

      $("#name").val("");
      $("#edad").val("");
      
    } else {
      alert("No es compatible en este navegador.")
    }
    
  })
  
  $('#cargar').click(function () {
    /*Obtener datos almacenados*/
    const nam = sessionStorage.getItem("name");
    const ed = sessionStorage.getItem("edad");
    const bodyElement = $("body");
    const profile = $("#profile");

    /*Mostrar datos almacenados*/
    $("#nam").html(nam);
    $("#ed").html(ed);

    if (ed >= 18) {
      bodyElement.addClass("usuario2")
      profile.attr("src","./images/User2.png")
    } else {
      bodyElement.addClass("usuario1")
      profile.attr("src","./images/User1.png")
    }

  });

});

// document.location.href="usuario.html"