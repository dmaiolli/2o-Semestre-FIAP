// pegar o botão calcular
const btnCalcular = document.querySelector('#calcular');
console.log(btnCalcular);

// adicionar ao botão um escutador de Eventos
btnCalcular.addEventListener('click', CalcularXP);

function CalcularXP() {

    // pegar todos os elementos com a classe heroi
    const herois = document.querySelectorAll('.heroi');
    // console.log(herois);

    // percorrer o array de herois
    for (let i = 0; i < herois.length; i++) {

        //pegando os dados para calcular o xp
        // todas as informações vem no formato STRING
        let velocidadeTD = Number(herois[i].querySelector('.velocidade').textContent);
        let agilidadeTD = Number(herois[i].querySelector('.agilidade').textContent);
        let forcaTD = Number(herois[i].querySelector('.forca').textContent);

        // calculamos o XPFinal
        let xpFinal = (velocidadeTD + agilidadeTD + forcaTD);

        // escrever na tabela
        herois[i].querySelector('.xp-final').textContent = xpFinal;

        if (xpFinal < 250) {
            //forma não legal....pois para formatar preciso de CSS - local correto
            // herois[i].style.backgroundColor = '#f60';
            // herois[i].style.color = '#fff';

            // forma legal chamando as classes da CSS
            herois[i].classList.add('bg-warning', 'text-light');
        }
    }
}