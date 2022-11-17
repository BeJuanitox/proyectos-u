$(document).ready(function () {
  let id = 1;

  $(`#insertar`).click(function () {
    let nombre = $(`#nombre`).val()
    let apellido = $(`#apellido`).val()
    let email = $(`#email`).val()

    if (nombre == "" || apellido == "" || email == "") {
      alert("Dejaste un campo vacio.")
    } else if (!validarHC(email) &&
      !validarGC(email) && !validarHE(email)) {
      alert("Por favor, ingrese un correo valido.")
      return false;
    } else {

      let fila = `<tr>
        <td>${id}</td>
        <td>${nombre}</td>
        <td>${apellido}</td>
        <td class="item_email">${email}</td>
      </tr>`

      $(`table`).append(fila)

      id++;

    }

  }) // Fin boton Insertar

  $(`#recorrer`).click(function () {

    $(`.item_email`).each(function (idx, item) {

      const email = item.innerHTML;

      if (validarHC(email) || validarHE(email)) {
        $(this).addClass("resaltarhotmail")
      } else {
        $(this).addClass("resaltargmail")
      }

    })

  }) // Fin boton Recorrer

}) // Cierre final

//Validaciones correos
function validarHC(email) {
  var tester = /^([a-zA-Z0-9_.+-])+\@(([hotmail]+)\.)([com])+$/;
  return tester.test(email);
}

function validarHE(email) {
  var testerHE = /^([a-zA-Z0-9_.+-])+\@(([hotmail]+)\.)([es])+$/;
  return testerHE.test(email);
}

function validarGC(email) {
  var testergc = /^([a-zA-Z0-9_.+-])+\@(([gmail]+)\.)([com])+$/;
  return testergc.test(email);
}

//Validación letras (Nombre y Apellido)
function sololetras(e) {
  key = e.keyCode || e.which;

  teclado = String.fromCharCode(key).toLowerCase();

  letras = " abcdefghijklmnñopqrstuvwxyz";

  especiales = "8 - 37 - 38 - 46 - 164";

  teclado_especial = false;

  for (var i in especiales) {
    if (key == especiales[i]) {
      teclado_especial = true; break;
    }
  }

  if (letras.indexOf(teclado) == -1 && !teclado_especial) {
    return false;
  }
}
