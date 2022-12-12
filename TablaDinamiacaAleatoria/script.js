$(document).ready(() => {
    let id = 1;
    let nameArray = [];

    $(`#generar`).click(() => {

        if (nameArray.length == 10) {
            return
        }

        const minN = 1;
        const maxN = 11;
        const minE = 1;
        const maxE = 41;
        const minG = 1;
        const maxG = 3;

        let nameID = undefined;

        while (nameID === undefined) {
            const randomNum = Math.floor(Math.random() * (maxN - minN) + 1);
            if (!nameArray.includes(randomNum)) {
                nameID = randomNum;
                nameArray.push(nameID);
            }

        };

        let nombre = "Usuario " + nameID;
        let genero = Math.floor(Math.random() * (maxG - minG) + 1);
        let edad = Math.floor(Math.random() * (maxE - minE) + 1);
        let generoDef = null;

        if (genero == 1) {
            generoDef = "Masculino";
        } else {
            generoDef = "Femenino";
        }

        let fila = `<tr class="filaInner">
                        <td>${id}</td>
                        <td class="item_nombre">${nombre}</td>
                        <td>${generoDef}</td>
                        <td class="item_edad">${edad}</td>
                    </tr>`

        $(`table`).append(fila)

        id++;


    }) // Fin boton Generar

    $(`#recorrer`).click(() => {

        const allFila = $(".filaInner");

        $(`.item_edad`).each(function (idx, item) {

            const edad = item.innerHTML;

            if (edad < 18) {
                $(allFila[idx]).addClass("resalMenores")
            } else {
                $(allFila[idx]).addClass("resaltarMayores")
            }

        })

        const seleccion = $(`#seleccion`).val()

    }) // Fin boton Recorrer

    $('#seleccion').change((e) => {
        const allFila = $(".filaInner");
        $('.filaInner').each( (idx, item) => {
            switch(e.target.value){
                case "Hombres": 
                    if(item.children[2].innerHTML !== "Masculino"){
                        $(allFila[idx]).hide();
                    } else {
                        $(allFila[idx]).show();
                    }
                    break;
                case "Mujeres": 
                    if(item.children[2].innerHTML !== "Femenino"){
                        $(allFila[idx]).hide();
                    } else {
                        $(allFila[idx]).show();
                    }
                    break;
                case "Menores": 
                    if(item.children[3].innerHTML >= 18){
                        $(allFila[idx]).hide();
                    } else {
                        $(allFila[idx]).show();
                    }
                    break;
                case "Mayores": 
                    if(item.children[3].innerHTML < 18){
                        $(allFila[idx]).hide();
                    } else {
                        $(allFila[idx]).show();
                    }
                    break;
                default: 
                    $(allFila[idx]).show()
                    break;
            }
            
        })
    })

}) // Cierre final
