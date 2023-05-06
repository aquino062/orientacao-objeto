


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if (ano < 1) {
            return false;
        }

        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasNoMes = getDiasNoMes(mes, ano);
        if (dia < 1 || dia > diasNoMes) {
            return false;
        }

        return true;
    }

    private int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return isBissexto(ano) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public int compara(Data outraData) {
        if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {
            return 0;
        } else if (this.ano > outraData.ano || (this.ano == outraData.ano && this.mes > outraData.mes) || (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public String getMesExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[this.mes - 1];
    }

    public int getAno() {
        return this.ano;
    }

    public boolean isBissexto() {
        return isBissexto(this.ano);
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
}

