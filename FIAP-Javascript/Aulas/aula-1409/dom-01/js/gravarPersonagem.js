// recuperar o botão que faz a gravação dos dados na tabela
const btnGravar = document.querySelector('#btn_gravar');
console.log(btnGravar);

// cancelar o evento padrão - um botão de form tem como padrão enviar os dados
// vamos cancelar padrão para que ele possa enviar os dados para a tabela

btnGravar.addEventListener('click', function (event) {
    // cancelar o evento padrão e executar o que está abaixo
    event.preventDefault();

    //recuperar o formulário inteiro
    const personagemDigitado = document.querySelector('#form_personagens');
    const personagem = pegarDadosDigitados(personagemDigitado);
   


    // criar uma função que pega os dados digitados
    function pegarDadosDigitados(personagemDigitado) {
        const personagem = {
            nome: personagemDigitado.nome.value,
            velocidade: personagemDigitado.velocidade.value,
            agilidade: personagemDigitado.agilidade.value,
            forca: personagemDigitado.forca.value,
            xpFinal: xpJogador(this.velocidade.value, this.agilidade.value, this.forca.value)            
        }   
         return personagem;
    }
    
    //chamar a função de validação
    const erros = validarPersonagens(personagem);

    //verificar se existem erros na digitação dos dados - Se tiver alguém no array ===TEM ERRO
    if (erros.length > 0) {
        //chamar a função que exibe as mensagens de erro
         exibirMensagensErro(erros);
         //tendo erro - O PROCESSAMENTO PRECISA PARAR
        //  return vazio vai sair da função
         return;
    }

    // limpa a última mensagem de erro
    const limpaErro = document.querySelector('#mensagens_erro');
    limpaErro.innerHTML = "";

    //criando a função que gera as linhas da tabela
    //o personagem possui os dados que foram digitados no form

    // essa função chamara a montaPersonagemTD para criar as tds da tabela'
    function montaPersonagemTR(personagem) {
        //criar a tag para a nova tr
        const personagemTR = document.createElement('tr');

        //adicionar a classe CSS para a linha, pois todas possuem
        personagemTR.classList.add('heroi');

        //adicionando as tds 
        personagemTR.appendChild(montaPersonagemTD(personagem.nome, 'nome'));
        personagemTR.appendChild(montaPersonagemTD(personagem.velocidade, 'velocidade'));
        personagemTR.appendChild(montaPersonagemTD(personagem.agilidade, 'agilidade'));
        personagemTR.appendChild(montaPersonagemTD(personagem.forca, 'forca'));
        personagemTR.appendChild(montaPersonagemTD(personagem.xpFinal, 'xp-final')); 

        if (personagem.xpFinal < 250) {
             personagemTR.classList.add('bg-warning', 'text-light');
        }

        return personagemTR;
    }

    // cria as tds com os dados que vêm  da função de TR
    function montaPersonagemTD(dado, classe) {
        const personagemTD = document.createElement('td');
        personagemTD.textContent = dado;
        personagemTD.classList.add(classe);
        return personagemTD;
    }

    //chamar a função para gerar a nova linha de personagens
    const novoPersonagemTR = montaPersonagemTR(personagem);

    // pegar a tabela no  html para vincular o novo personagem na tabela
    const tabela = document.querySelector('#tabela-herois');

    //inserir o novo elemento
    tabela.appendChild(novoPersonagemTR);

    //limpar o formulário
    personagemDigitado.reset();
});

//gerar a funcao que valida os dados
//criar um array para receber as mensagens de erro
//quando ele retornar erros - exibirá todos de uma vez 
function validarPersonagens(personagem) {
    const erros = [];
    //validar os dados recuperados
    if (personagem.nome.length === 0) {
        erros.push('O nome está inválido ou vazio');
    }

    if ((personagem.velocidade.length === 0) || isNaN(personagem.velocidade) || 
    (personagem.velocidade > 100)) {
        erros.push('A velocidade está inválida ou vazia');
    }

    if ((personagem.agilidade.length === 0) || isNaN(personagem.agilidade) || 
    (personagem.agilidade > 100)) {
        erros.push('A agilidade está inválida ou vazia');
    }

    if ((personagem.forca.length === 0) || isNaN(personagem.forca) || 
    (personagem.forca > 100)) {
        erros.push('A forca está inválida ou vazia');
    }
    return erros;
}

// função de exibir os erros - retorna o Array como as respectivas mensagens
function exibirMensagensErro(erros) {
    //recuperar a ul da página html
    const ul = document.querySelector('#mensagens_erro');

    // as mensagens de erro estão acumuladas, então devemos limpar a tela toda vez que tiver erro
    // para isso vamos limpar o html da ul
    ul.innerHTML = "";


    // usar um foreach - executará a função definida conforme existirem
    // ocorrencias dentro do array - essa função está vinculada a exsitência elementos do array

    erros.forEach((erro) => {
        // encontro um erro, criar uma nova li
        const li = document.createElement('li');

        // insere em cada li a mensagem de erro'
        li.textContent = erro;

        //inserir nessas lis classe do BootStrap - não é obrigatório
        li.classList.add('alert','alert-info');        

        // vincular a li criada na ul
        ul.appendChild(li);
    });    
}