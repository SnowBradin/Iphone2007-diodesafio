# Iphone2007-diodesafio
 Desafio Lançamento do Iphone
UML (mermaid)

class AparelhoTelefonico {
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
    +mandarSMS()
}

class NavegadorInternet {
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
    +googleMaps()
    +coneccaoComTelefone()
    +freeIMAP()
}

class iPhone {
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}

iPhone --|> ReprodutorMusical
iPhone --|> AparelhoTelefonico
iPhone --|> NavegadorInternet
