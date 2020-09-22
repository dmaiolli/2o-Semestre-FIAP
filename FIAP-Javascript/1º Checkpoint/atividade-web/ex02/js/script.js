window.onload = adicionaImagem()

function adicionaImagem() {
  const foto = document.querySelector('#foto');
  const nome = document.querySelector('#nome');

  const img = document.createElement('img');
  const imagemSelecionada = selecionaImagem();
  const nomeSelecionado = selecionaNome()
  img.src = imagemSelecionada
  foto.appendChild(img)
  nome.append(nomeSelecionado)

  const velocidade = document.querySelector('.velocidade');
  const drible = document.querySelector('.drible');
  const passe = document.querySelector('.passe');
  const chute = document.querySelector('.chute');
  const defesa = document.querySelector('.defesa');
  const fisico = document.querySelector('.fisico');

  const habilidades = {
    velocidade: sorteiaNumero100(),
    drible: sorteiaNumero100(),
    passe: sorteiaNumero100(),
    chute: sorteiaNumero100(),
    defesa: sorteiaNumero100(),
    fisico: sorteiaNumero100()
  }

  velocidade.append(habilidades.velocidade)
  drible.append(habilidades.drible)
  passe.append(habilidades.passe)
  chute.append(habilidades.chute)
  defesa.append(habilidades.defesa)
  fisico.append(habilidades.fisico)
}

function selecionaNome(){
  const numeroSorteado = sorteiaNumero9();

  switch(numeroSorteado){
    case 0:
      return 'Allen';
    case 1:
      return 'Gondo';
    case 2:
      return 'Andrey';
    case 3:
      return 'Thiago';
    case 4:
      return 'Marcelo';
    case 5:
      return 'Israel';
    case 6:
      return 'Sálvio';
    case 7:
      return 'Humberto';
    case 8:
      return 'Alexandre';
    case 9:
      return 'Silva';
  }
}

function selecionaImagem() {
  const numeroSorteado = sorteiaNumero9();

  switch (numeroSorteado) {
    case 0:
      return './images/0.png';
    case 1:
      return './images/1.png';
    case 2:
      return './images/2.png';
    case 3:
      return './images/3.png';
    case 4:
      return './images/4.png';
    case 5:
      return './images/5.png';
    case 6:
      return './images/6.png';
    case 7:
      return './images/7.png';
    case 8:
      return './images/8.png';
    case 9:
      return './images/9.png';
  }
}

function sorteiaNumero9() {
  const numeroSorteado = Math.floor(Math.random() * 10)
  return numeroSorteado
}

function sorteiaNumero100(){
  
  numeroSorteado = Math.floor(Math.random() * 100)

  while(numeroSorteado < 50){
    numeroSorteado = Math.floor(Math.random() * 100)
  }

  return numeroSorteado;
}