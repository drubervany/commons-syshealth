package br.com.syshealth.commons.enums;

public enum OperadoraEnum {
    BRADESCO("Bradesco Saúde");
    // ALLIANZ,
    // AMIL,
    // BRADESCO,
    // CAIXASAUDE,
    // CAREPLUS,
    // CNUNIMED,
    // GOLDENCROSS,
    // GREENLINE,
    // HAPVIDA,
    // INTERMEDICA,
    // MARITIMA,
    // MEDISANITAS,
    // MEDISERVICE,
    // NEXTSEISA,
    // NOTREDAME,
    // OMINT,
    // ONEHEALTH,
    // PORTOSEGURO,
    // PORTOMED,
    // SAMEL,
    // SANTAHELENA,
    // SANTAMALIA,
    // SEGUROSUNIMED,
    // SULAMERICA,
    // TEMPOSAUDE,
    // UNIMEDABC,
    // UNIMEDFESP,
    // UNIMEDGUARULHOS,
    // UNIMEDPAULISTANA,
    // UNIMEDRJ;

    private String nome;

    private OperadoraEnum(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
