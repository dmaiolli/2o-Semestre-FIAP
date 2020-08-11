// usando construtor
const modoAntigo = new Array('x','a','b','c','e');
console.log(modoAntigo);

//modo mais comum
const personagens = ['Leia','Han Solo','Chewbacca','R2-D2','Darth Vader','Obi Wan'];
console.log(personagens);
console.log(personagens[3]);

//exibir array como se fosse uma tabela
console.table(personagens);

// Não faça isso
const naoMistura =['oi',12121212,true,5555.888,false,'nao usar assim'];
console.log(naoMistura);

// mudando conteúdo dos indices
personagens[1] = 'Yoda';
console.log(personagens);

//inserindo dados no fim do array
personagens.push('C3PO');
console.log(personagens);

//retirar o último elemento do array
let retiradoFim = personagens.pop();
console.log(personagens);
console.log(`Personagem que foi retirado: ${retiradoFim}`);

// inserindo no início do array
personagens.unshift('BB8');
console.log(personagens);

//retirar a primeira posição do array
let retiradoInicio = personagens.shift();
console.log(personagens);
console.log(`Personagem que foi retirado: ${retiradoInicio}`);

//remover itens a partir de uma posição - posicional inicial - qtde de itens a serem excluídos
personagens.splice(3,2);
console.log(personagens);

//inserir itens a partir de uma posição no array - onde deve iniciar, quantos devem ser apagados, novos elementos
personagens.splice(3,0,'Han Solo', 'Darth Vader');
console.log(personagens);

//retirar um conteúdo mas manter o índice
delete personagens[0];
console.log(personagens);

personagens[0] = 'Leia';
console.log(personagens);

//percorrendo o array - parte do array
console.log(personagens.slice(0,3));
console.log(personagens);

//copiar uma fatia do array
const copiado = personagens.slice(3,5);
console.log(copiado);

// apontar para o endereço de memória do array - passando por referência 
const personagens1 = personagens;
console.log(personagens1);

//quando vc alterar um reflete no outro 
personagens1.pop();
console.log(personagens1);
console.log(personagens);

personagens.push('Obi Wan');
console.log(personagens1);
console.log(personagens);

// copiando usando spread Operator - não faz referência
const personagens2 = [...personagens];
console.log(personagens2);

// inserido novo elemento apenas no personagens2
personagens2.push('Luke');
console.log(personagens2);
console.log(personagens);

//converter uma string em array, vc pode definir a quantidade de elementos
const frase = 'O rato roeu a roupa do rei de Roma';
console.log(frase);
const fraseVirouArray = frase.split(' ',3);
console.log(fraseVirouArray);


//concaternar arrays
const novosPersonagens =['Hank','Sheila','Boby'];
const personagensJuntos = personagens.concat(novosPersonagens,'Batman','Coringa');
console.log(personagensJuntos);

//concatenando com spread
const personagensJuntos2 =[...personagens, ...personagensJuntos, ...novosPersonagens, 'Eu mesmo', ...[2,3,4,5]];
console.table(personagensJuntos2);









