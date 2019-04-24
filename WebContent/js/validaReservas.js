// funcion para validar el correo
function caracteresCorreoValido(email, div){
    var caract = new RegExp(/^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/);
    if (caract.test(email) == false){
        $(div).hide().removeClass('hide').slideDown('fast');
        return false;
    }else{
        $(div).hide().addClass('hide').slideDown('slow');
        return true;
    }
}

// funcion para validar que los campos del formulario están rellenos
function validarFormulario(nombre, email, telefono, codCita){
	if (nombre == '' || email == '' || telefono == '' || codCita < 0){
		return false;
	}
	else{
		return true;
	}
}