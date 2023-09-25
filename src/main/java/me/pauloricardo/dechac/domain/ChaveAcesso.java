package me.pauloricardo.dechac.domain;

public class ChaveAcesso {

    private final String uf;
    private final String ano;
    private final String mes;
    private final String cnpj;
    private final String modelo;
    private final String serie;
    private final String numero;
    private final String tipoEmissao;
    private final String codigoNumerico;
    private final String digitoVerificador;


    public ChaveAcesso(String chaveAcesso) {
        if(chaveAcesso == null)
            throw new IllegalArgumentException("Chave de acesso inválida.");

        chaveAcesso = chaveAcesso.replace(" ","");
        if(chaveAcesso.length() != 44)
            throw new IllegalArgumentException("Chave de acesso inválida.");



        this.uf = chaveAcesso.substring(0, 2);

        this.ano = chaveAcesso.substring(2, 4);


        this.mes = chaveAcesso.substring(4, 6);
        this.cnpj = chaveAcesso.substring(6,20);
        this.modelo = chaveAcesso.substring(20, 22);
        this.serie = chaveAcesso.substring(22, 25);
        this.numero = chaveAcesso.substring(25, 34);
        this.tipoEmissao = chaveAcesso.substring(34, 35);
        this.codigoNumerico = chaveAcesso.substring(35, 43);
        this.digitoVerificador = chaveAcesso.substring(43,44);


    }

    @Override
    public String toString() {
        return "ChaveAcesso{" +
                "uf='" + uf + '\'' +
                ", ano='" + ano + '\'' +
                ", mes='" + mes + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", modelo='" + modelo + '\'' +
                ", serie='" + serie + '\'' +
                ", numero='" + numero + '\'' +
                ", tipoEmissao='" + tipoEmissao + '\'' +
                ", codigoNumerico='" + codigoNumerico + '\'' +
                ", digitoVerificador='" + digitoVerificador + '\'' +
                '}';
    }
}
