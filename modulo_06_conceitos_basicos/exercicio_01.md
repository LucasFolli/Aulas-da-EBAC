# Algoritmo "Hora de Acordar"

- Acordou!

1. Abrir os olhos;
2. Levantar da cama;
3. Ir ao banheiro;

4. Caminho do banheiro;
```
Se portasFechadas igual a Verdade {
    4.1. Usar maçanetas;
    4.2. Abrir portas;
}
```

5. Fazer as necessidades fisiológicas;

6. Higiene;
```
Higiene {
    6.1. Escovar os dentes;
    6.2. Lavar o rosto;
}
```

7. Ir até a cozinha;

8. Fazer café;
```
Fazer café {
    8.1. Localizar cafeteira;
    8.2. Localizar pote de café;
    8.3. Colocar pó de café no filtro;
    8.4. Usar a jarra da cafeteira para colocar água;
    8.5. Ligar a cafeteira;
}
```

9. Aguardando café;
```
Aguardar o café ficar pronto {
    9.1. Ir até a varanda;
    9.2. Voltar após 10 minutos;
}
```

10. Café da manhã;
```
Tomar café {
    10.1. Localizar e pegar a xícara;
    10.2. Pegar a jarra da cafeteira e colocar café na xícara;
    10.3. Comer alguma coisa {
        Se temPão igual a Verdade {
            10.4.1. Pegar pão;
            10.4.2. Localizar e pegar margarina;
            10.4.3. Localizar e pegar faca e prato;
            10.4.4. Cortar o pão e passar margarina;
            10.4.5. Comer pão e tomar café;
        } Se não {
            10.4.1. Localizar e pegar chaves;
            10.4.2. Descer a escada;
            10.4.3. Usar chave para abrirPortão;
            10.4.4. Sair e usar chave para fecharPortão;
            10.4.5. Ir até o mercadinho;
            10.4.6. Adquirir pão de sal;
            10.4.7. Voltar para casa;
            10.4.8. Usar chave para abrirPortão;
            10.4.9. Entrar e usar a chave para fecharPortão;
            10.4.10. Subir a escada e ir para cozinha;
            10.4.11. Pegar pão;
            10.4.12. Localizar e pegar margarina;
            10.4.13. Localizar e pegar faca e prato;
            10.4.14. Cortar o pão e passar margarina;
            10.4.15. Comer pão e tomar café;
        }
    }
}
```

11. Colocar mais café na xícara;
12. Levar xícara até a sala e colocar na mesa;
13. Ligar computador;
14. Início estudar ou trabalhar.