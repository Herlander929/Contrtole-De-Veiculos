package ControleDeVeiculos.demo.dominio;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String marca;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String modelo;

    private Integer ano;

    private String DiaDoRodizio;

    private Boolean rodizioAtivo;



    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
    //Gerar construtores
    // Getters e Setters

    public Veiculo(){

    }


    public Veiculo(Integer id, String marca, String modelo, Integer ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDiaDoRodizio() {
        return DiaDoRodizio;
    }

    public void setDiaDoRodizio(String diaDoRodizio, String d) {
        d =Integer.toString(getAno());
        diaDoRodizio = d.substring(d.length()-2);
        if(diaDoRodizio.equals(1) || diaDoRodizio.equals(0)){
            diaDoRodizio = "segunda-feira";
        } else if(diaDoRodizio.equals(2) || diaDoRodizio.equals(3)){
            diaDoRodizio = "terça-feira";
        }else if(diaDoRodizio.equals(4) || diaDoRodizio.equals(5)){
            diaDoRodizio = "quarta-feira";
        }else if(diaDoRodizio.equals(6) || diaDoRodizio.equals(7)){
            diaDoRodizio = "quinta-feira";
        } else if(diaDoRodizio.equals(8) || diaDoRodizio.equals(9)){
            diaDoRodizio = "sexta-feira";
        }


    }

    public Serializable getRodizioAtivo(Calendar dataSemana, String  nome, Integer dia) {

        switch(dia){
            case Calendar.SUNDAY: nome = "Domingo";
            break;
            case Calendar.MONDAY: nome = "segunda-feira";
            break;
            case Calendar.TUESDAY: nome = "terça-feira";
            break;
            case Calendar.WEDNESDAY: nome = "quarta-feira";
            break;
            case Calendar.THURSDAY: nome = "quinta-feira";
            break;
            case Calendar.FRIDAY: nome = "sexta-feira";
            break;
            case Calendar.SATURDAY: nome = "sábado";
            break; }
            if(nome == getDiaDoRodizio()){
                return true;
            }else {
                return false;
            }
    }

    public void setRodizioAtivo(Boolean rodizioAtivo) {
        this.rodizioAtivo = rodizioAtivo;
    }
}
