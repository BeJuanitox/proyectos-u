$(document).ready(() => {
    let id = 1;
    let asignaturaArray = [];

    const minName = 1;
    const maxName = 6;
    const minEdad = 10;
    const maxEdad = 26;
    const minGen = 1;
    const maxGen = 3;

    let nombre = "Estudiante " + Math.floor(Math.random() * (maxName - minName) + 1);
    let genero = Math.floor(Math.random() * (maxGen - minGen) + 1);
    let generoDef = null;
    let edad = Math.floor(Math.random() * (maxEdad - minEdad) + minEdad);

    if (genero == 1) {
        generoDef = "Masculino";
    } else {
        generoDef = "Femenino";
    }

    const infoElement = $(".containerEstudiante");
    const perfil = $("#perfil")

    if (generoDef === "Masculino" && edad >= 18) {
        perfil.attr("src", "../images/usuario2.png")
    } else if (generoDef === "Masculino" && edad < 18) {
        perfil.attr("src", "../images/usuario4.png")
    } else if (generoDef === "Femenino" && edad >= 18) {
        perfil.attr("src", "../images/usuario1.png")
    } else if (generoDef === "Femenino" && edad < 18) {
        perfil.attr("src", "../images/usuario3.png")
    }

    const InfoEstudiante = nombre + " - " + generoDef + " - " + edad + " años.";

    $("#InfoEstudiante").html(InfoEstudiante);

    let sum = 0;

    $(`#generar`).click(() => {

        // if (asignaturaArray.length == 10) {
        //     return
        // }

        while (asignaturaArray.length != 10) {



            const minAsig = 1;
            const maxAsig = 11;

            let asignaturaID = undefined;

            while (asignaturaID === undefined) {
                const randomNum = Math.floor(Math.random() * (maxAsig - minAsig) + 1);
                if (!asignaturaArray.includes(randomNum)) {
                    asignaturaID = randomNum;
                    asignaturaArray.push(asignaturaID);
                }

            };

            const maxNota = 5;
            const minNota = 1;
            // const decimales = 2;

            let materia = "Asignatura " + asignaturaID;
            let nota = Math.floor(Math.random() * (maxNota - minNota) + 1);

            sum += nota;
            let sacarProm = 0;
            sacarProm = sum / id;

            const prom = sacarProm.toFixed(1)

            sessionStorage.setItem("promedio", prom);

            let fila = `<tr class="filaInner">
                        <td>${id}</td>
                        <td class="item_materia">${materia}</td>
                        <td class="item_nota">${nota}</td>
                        <td class="item_prom">${prom}</td>
                    </tr>`

            $(`table`).append(fila)

            id++;
        }

        $(`#generar`).attr("disabled", true);

    }) // Fin boton Generar

    $(`#recorrer`).click(() => {
        const mensajeProm = sessionStorage.getItem("promedio");
        
        $("#mostrarProm").html("El promedio total es de: "+mensajeProm);

        const allFila = $(".filaInner");

        $('.item_prom').each(function (idx, item) {

            const prome = item.innerHTML;

            if (prome < 3) {
                $(allFila[idx]).addClass("resaltarMenores");
            } else {
                $(allFila[idx]).addClass("resaltarMayores");
            }

        })

    }) // Fin boton Recorrer

}) // Cierre final

// function notaRandom(minNota, maxNota, decimales) {
//     var precision = Math.pow(10, decimales);
//     minNota = minNota*precision;
//     maxNota = maxNota*precision;
//     return Math.floor(Math.random()*(maxNota-minNota+1) + minNota) / precision;
// }
