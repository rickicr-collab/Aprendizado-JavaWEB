/**
 *  confirmação de exclusão de um contato
 *  @author Ricardo Cunha
 * @param idcon
 */

function confirmar(idcon) {
	let resposta = confirm("Confirma a exclusão deste contato ?")
	if (resposta === true) {
		alert("Contato Excluido !")
		window.location.href = "delete?idcon=" + idcon
	}

}
