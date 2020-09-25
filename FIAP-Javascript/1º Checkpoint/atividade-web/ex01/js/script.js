const btnCalcula = document.querySelector('#btn-calcular');

btnCalcula.addEventListener('click', event => {
  event.preventDefault()
  
  const valorReal = document.querySelector('#valor-real').value;
  const moeda = document.querySelector('#moeda').value;
  const resultadoValor = document.querySelector('#valor-conversao');
  resultadoValor.innerHTML = ''
  const moedaEscolhida = document.querySelector('#moeda-escolhida');
  moedaEscolhida.innerHTML = ''

  validaDados(valorReal, moeda)

  var nomeMoeda = document.getElementById('moeda').options[document.getElementById('moeda').selectedIndex].innerText;

  const valorCalculado = calculaValor(valorReal, moeda)

  resultadoValor.append(valorCalculado)
  moedaEscolhida.append(nomeMoeda)
})

function calculaValor(valor, moeda){
  const dolar = 5.40;
  const euro = 6.35;
  const bitcoin = 56144;

  if(moeda == 1){
    const soma = valor * dolar
    return soma
  }
  if(moeda == 2){
    const soma = valor * euro
    return soma
  }
  if(moeda == 3){
    const soma = valor * bitcoin
    return soma
  }
}

function validaDados(valor, moeda) {
  if (isNaN(valor) | valor < 0 | valor.length === 0) {
    alert('Digite um valor válido')
    return 0
  }

  if (moeda == 0) {
    alert('Escolha uma opção')
    return 0
  }
}