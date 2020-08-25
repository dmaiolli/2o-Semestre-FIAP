let total = 0;
for (let i = 0; i <=9; i++) {
    // sorteio
    let numero = Math.floor(Math.random()*7);
    // caso sorteado seja 0 - refaz sorteio
    while (numero === 0) {
        numero = Math.floor(Math.random() * 7);
    }
    //acumular o total do valor do dado sorteado - gerar total
    total+= numero;
    // criar a imagem para receber o dado sorteado
    let imagem = document.createElement('img'); //<img>
    imagem.src = './images/' + numero + '.png';
    document.querySelector('#elemento').appendChild(imagem);    
}
document.querySelector('#total').innerHTML = `Valor total dos sorteios: ${total}`;
