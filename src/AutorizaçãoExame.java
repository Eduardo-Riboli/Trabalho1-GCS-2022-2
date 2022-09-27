public class AutorizaçãoExame {
    private int codigo;
    private int dataCadastro;
    private Usuario medicoSolicitante;
    private Usuario paciente;
    private String exame;

    public AutorizaçãoExame(int codigo, int dataCadastro, Usuario medicoSolicitante, Usuario paciente, String exame) {
        this.codigo = codigo;
        this.dataCadastro = dataCadastro;
        this.medicoSolicitante = medicoSolicitante;
        this.paciente = paciente;
        this.exame = exame;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(int dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Usuario getMedicoSolicitante() {
        return medicoSolicitante;
    }

    public void setMedicoSolicitante(Usuario medicoSolicitante) {
        this.medicoSolicitante = medicoSolicitante;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    @Override
    public String toString() {
        return "AutorizaçãoExame [codigo=" + codigo + ", dataCadastro=" + dataCadastro + ", exame=" + exame
                + ", medicoSolicitante=" + medicoSolicitante + ", paciente=" + paciente + "]";
    }

}
