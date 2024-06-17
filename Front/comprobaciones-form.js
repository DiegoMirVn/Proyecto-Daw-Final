


document.getElementById("therapist-registration-form")[8].addEventListener("click", function (evento) {
    evento.preventDefault();

    let nombre = document.getElementById("therapist-name").value;
    let apellidos = document.getElementById("therapist-surname").value;
    let pass = document.getElementById("therapist-pass").value;
    let dni = document.getElementById("therapist-dni").value;
    let telefono = document.getElementById("therapist-phone").value;
    let email = document.getElementById("therapist-email").value;
    let especialidad = document.getElementById("therapist-especialidad").value;

    let datos = {
        dni: dni,
        nombre: nombre,
        apellidos: apellidos,
        password: pass,
        telefono: telefono,
        email: email,
        especialidad: especialidad
    }

    enviarDatosBackend(datos);

});


async function enviarDatosBackend(informacion) {
    try {
        let response = await fetch("http://localhost:8080/terapeuta", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            }, body: JSON.stringify(informacion)

        })


        if(!response.ok){
            throw new Error("Error en la red");
        }
        let resultado = await response.json();
        console.log("Datos recibidos en el servidor", resultado);
    } catch (error) {
        console.error("Hubo un problema", error);
    }
}

/**
 * Probar a crear el backend ahora para que inserte estos datos en una base de datos de terapeuta
 * y hacer las comprobaciones de js para los datos
 */