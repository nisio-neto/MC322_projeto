package Pacotes;

import java.time.LocalDateTime;

public class Agendamento {
    private LocalDateTime dataIda;
    private LocalDateTime dataVolta;
    private String informacoes;
    private LocalDateTime checkin;
    private LocalDateTime checkout;

    // Construtor
    public Agendamento(LocalDateTime dataIda, LocalDateTime dataVolta, String informacoes,
                       LocalDateTime checkin, LocalDateTime checkout) {
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.informacoes = informacoes;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Getters e setters
    public LocalDateTime getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDateTime dataIda) {
        this.dataIda = dataIda;
    }

    public LocalDateTime getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDateTime dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }
}
