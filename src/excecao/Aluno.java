/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excecao;

import streams.*;
import java.util.Objects;

/**
 *
 * @author luist
 */
public class Aluno {
    public final String nome;
    public final double nota;
    public final boolean bomComportamento;

    public Aluno(String nome, double nota){
        this(nome, nota, true);
    }
    
    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return String.format("%s tem nota %.1f", 
                this.nome, this.nota);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        hash = 67 * hash + (this.bomComportamento ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (this.bomComportamento != other.bomComportamento) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
}
