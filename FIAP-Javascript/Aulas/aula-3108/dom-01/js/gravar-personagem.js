// recuperar o botão que faz a gravação dos dados na tabela
const btnGravar = document.querySelector('#btn_gravar')

// Cancelar um evento padrao - um botão de form tem com padrão enviar os dados
// Vamos cancelar esse padrão para que ele possa enviar os dados para a tabela

btnGravar.addEventListener('click', event => {
    // Cancelar o evento padrão e executar oque está abaixo
    event.preventDefault();

    // Recuperar o formulário inteiro
    const personagemDigitado = document.querySelector('#form_personagens');

    const personagem = pegarDadosDigitados(personagemDigitado);

    // Criar uma função que pega os dados digitados
    function pegarDadosDigitados(personagemDigitado){
        const personagem = {
            nome: personagemDigitado.nome.value,
            velocidade: personagemDigitado.velocidade.value,
            agilidade: personagemDigitado.agilidade.value,
            forca: personagemDigitado.forca.value
        }
        return personagem;
    }


})