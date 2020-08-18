// ex1
function maiorDez(lista){
    let maiorQueDez = 0;
    for (num of lista){
        if(num > 10){
            maiorQueDez++;
        }
        else{
            continue;
        }
    }
    console.log(maiorQueDez)
}

lista1 = [23,10,51,10,11];

maiorDez(lista1);


// ex2
function calculaMedia(lista){
    let soma = 0;
    for(num of lista){
        soma += num;
    }
    
    resultado = soma / lista.length;
    console.log(resultado)
}

lista2 = [10,10,10,10,10];
calculaMedia(lista2);


// ex3
function entre100e200(num){
    if(num >= 100 && num <= 200){
        return true;
    } return false;
}

console.log(entre100e200(150));


// ex4
function pesoNoPlaneta(num, peso){
        switch(num){
            case 1:
                pPlaneta = peso * 0.37;
                console.log(`Em mercúrio você pesaria ${pPlaneta} kg`);
                break
            case 2:
                pPlaneta = peso * 0.88;
                console.log(`Em vênus você pesaria ${pPlaneta} kg`);
                break
            case 3:
                pPlaneta = peso * 0.38;
                console.log(`Em marte você pesaria ${pPlaneta} kg`);
                break
            case 4:
                pPlaneta = peso * 2.64;
                console.log(`Em jupiter você pesaria ${pPlaneta} kg`);
                break
            case 5:
                pPlaneta = peso * 1.15;
                console.log(`Em saturno você pesaria ${pPlaneta} kg`);
                break
            case 6:
                pPlaneta = peso * 1.17;
                console.log(`Em urano você pesaria ${pPlaneta} kg`);
                break
                
        }
}

pesoNoPlaneta(2, 80)

// ex5
function credEspecial(saldoMedio){
    if(saldoMedio > 20000){
        credito = saldoMedio * 0.40
        console.log(`Você terá um total de: ${credito}R$ de crédito especial `)
    } else if(saldoMedio >= 10000){
        credito = saldoMedio * 0.30
        console.log(`Você terá um total de: ${credito}R$ de crédito especial `)
    } else if(saldoMedio >= 2000){
        credito = saldoMedio * 0.20
        console.log(`Você terá um total de: ${credito}R$ de crédito especial `)
    } else{
        credito = 0
        console.log(`Você terá um total de: ${credito}R$ de crédito especial `)
    }
}

credEspecial(30000)