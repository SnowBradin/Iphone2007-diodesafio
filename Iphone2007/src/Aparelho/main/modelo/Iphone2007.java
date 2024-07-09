package Aparelho.main.modelo;

import Aparelho.main.musica.ReprodutorMusical;
import Aparelho.main.musica.ReproduzirMusic;
import Aparelho.main.musica.SelecionarAlbum;
import Aparelho.main.musica.SelecionarMusica;
import Aparelho.main.navegador.AbrindoSafari;
import Aparelho.main.navegador.NavegadorInternet;
import Aparelho.main.navegador.freeIMAP;
import Aparelho.main.navegador.googleMaps;
import Aparelho.main.telefone.Telefone;
import Aparelho.main.telefone.TelefoneFunctions;

public class Iphone2007 {
    public static void main(String[] args) {
        Telefone em = new TelefoneFunctions() {
        };
        //Scanner scanner = new Scanner();

        TelefoneFunctions telefone = (TelefoneFunctions) em;

        telefone.atender();
        telefone.ligar();
        telefone.conectar();

        NavegadorInternet navegadorInternet = new AbrindoSafari();
        NavegadorInternet navegadorInternet2 = new freeIMAP();
        NavegadorInternet navegadorInternet3 = new googleMaps();

        navegadorInternet.navegar();
        navegadorInternet2.navegar();
        navegadorInternet3.navegar();

        ReprodutorMusical reprodutorMusical = new ReproduzirMusic();
        ReprodutorMusical reprodutorMusical2 = new SelecionarAlbum();
        ReprodutorMusical reprodutorMusical3 = new SelecionarMusica();

        reprodutorMusical.reproduzir();
        reprodutorMusical2.reproduzir();
        reprodutorMusical3.reproduzir();
    }
}

    /*NavegadorInternet em = new AbrindoSafari() {
    //tentativa de execução das demais classes
    };

    NavegadorInternet navegar = new NavegadorInternet() {
        @Override
        public void navegar() {

        }

        void freeImMAP() {
        }

        void googleMaps() {
        }

        ;

        void AbrindoSafari() {
        }
    };
}
*/


