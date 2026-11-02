package comunicacao;

import comprovante.Comprovante;
import comprovante.ComprovanteTexto;
import comprovante.CriadorComprovante;

public class CriadorTexto extends CriadorComprovante {

        public Comprovante criar() { return new ComprovanteTexto(); }

}
