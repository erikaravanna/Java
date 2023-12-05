import java.util.ArrayList;
import java.util.List;

class Paciente {
    private String nome;
    private String tipoAtendimento;

    public Paciente(String nome, String tipoAtendimento) {
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public void fazerTriagem(Enfermeiro enfermeiro) {
        enfermeiro.fazerTriagem(this);
    }
}

class AgenteSaude {
    private String nome;

    public AgenteSaude(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Medico extends AgenteSaude {
    public Medico(String nome) {
        super(nome);
    }

    public void realizarProcedimento(Procedimento procedimento, Paciente paciente) {
        System.out.println("Médico " + getNome() + " realizou o procedimento " + procedimento.getNome() +
                " no paciente " + paciente.getNome());
    }
}

class Enfermeiro extends AgenteSaude {
    public Enfermeiro(String nome) {
        super(nome);
    }

    public void fazerTriagem(Paciente paciente) {
        System.out.println("Enfermeiro " + getNome() + " fez a triagem do paciente " + paciente.getNome());
    }
}

class Atendimento {
    private Paciente paciente;
    private boolean urgencia;
    private AgenteSaude agenteResponsavel;

    public Atendimento(Paciente paciente, boolean urgencia, AgenteSaude agenteResponsavel) {
        this.paciente = paciente;
        this.urgencia = urgencia;
        this.agenteResponsavel = agenteResponsavel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public AgenteSaude getAgenteResponsavel() {
        return agenteResponsavel;
    }

    public void setAgenteResponsavel(AgenteSaude agenteResponsavel) {
        this.agenteResponsavel = agenteResponsavel;
    }

    public void associarMedico(Medico medico) {
        if (agenteResponsavel instanceof Medico) {
            this.agenteResponsavel = medico;
        }
    }
}

class Procedimento {
    private String nome;
    private List<Medicamento> medicamentosUsados;
    private List<Insumo> insumosUsados;
    private List<Procedimento> procedimentosFilhos;

    public Procedimento(String nome) {
        this.nome = nome;
        this.medicamentosUsados = new ArrayList<>();
        this.insumosUsados = new ArrayList<>();
        this.procedimentosFilhos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Medicamento> getMedicamentosUsados() {
        return medicamentosUsados;
    }

    public void setMedicamentosUsados(List<Medicamento> medicamentosUsados) {
        this.medicamentosUsados = medicamentosUsados;
    }

    public List<Insumo> getInsumosUsados() {
        return insumosUsados;
    }

    public void setInsumosUsados(List<Insumo> insumosUsados) {
        this.insumosUsados = insumosUsados;
    }

    public List<Procedimento> getProcedimentosFilhos() {
        return procedimentosFilhos;
    }

    public void setProcedimentosFilhos(List<Procedimento> procedimentosFilhos) {
        this.procedimentosFilhos = procedimentosFilhos;
    }

    public void adicionarMedicamento(Medicamento medicamento, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.medicamentosUsados.add(medicamento);
        }
    }

    public void adicionarInsumo(Insumo insumo, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            this.insumosUsados.add(insumo);
        }
    }

    public void adicionarProcedimentoFilho(Procedimento procedimentoFilho) {
        this.procedimentosFilhos.add(procedimentoFilho);
    }
}

class Medicamento {
    private String nome;

    public Medicamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Insumo {
    private String nome;

    public Insumo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Hospital {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Enfermeiro> enfermeiros;
    private List<Atendimento> atendimentos;
    private List<Procedimento> procedimentos;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;

    public Hospital() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
    }

    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void cadastrarInsumo(Insumo insumo) {
        insumos.add(insumo);
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void registrarTriagem(Paciente paciente, Enfermeiro enfermeiro) {
        paciente.fazerTriagem(enfermeiro);
    }

    public void registrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void registrarProcedimento(String nomeProcedimento, Medico medico, Enfermeiro enfermeiro,
        List<Medicamento> medicamentos, List<Insumo> insumos) {
        Procedimento procedimento = new Procedimento(nomeProcedimento);
        procedimento.setMedicamentosUsados(medicamentos);
        procedimento.setInsumosUsados(insumos);

        medico.realizarProcedimento(procedimento, null);
        enfermeiro.fazerTriagem(null);

        procedimentos.add(procedimento);
    }

    public void registrarProcedimentoComoParte(String nomeProcedimentoPai, Procedimento procedimentoFilho) {
        Procedimento procedimentoPai = buscarProcedimento(nomeProcedimentoPai);

        if (procedimentoPai != null) {
            procedimentoPai.adicionarProcedimentoFilho(procedimentoFilho);
        } else {
            System.out.println("Procedimento pai não encontrado.");
        }
    }

    public Medicamento buscarMedicamento(String nome) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getNome().equals(nome)) {
                return medicamento;
            }
        }
        return null;
    }

    public Insumo buscarInsumo(String nome) {
        for (Insumo insumo : insumos) {
            if (insumo.getNome().equals(nome)) {
                return insumo;
            }
        }
        return null;
    }

    public Procedimento buscarProcedimento(String nome) {
        for (Procedimento procedimento : procedimentos) {
            if (procedimento.getNome().equals(nome)) {
                return procedimento;
            }
        }
        return null;
    }

    // Adicione outros métodos conforme necessário...

    public static void main(String[] args) {
        // Exemplo de utilização
        Hospital hospital = new Hospital();

        Medicamento antibiotico = new Medicamento("Antibiótico");
        Insumo seringaDescartavel = new Insumo("Seringa Descartável");

        hospital.cadastrarMedicamento(antibiotico);
        hospital.cadastrarInsumo(seringaDescartavel);

        Medico medico = new Medico("Dr. Silva");
        Enfermeiro enfermeiro = new Enfermeiro("Enf. Souza");
        Paciente paciente = new Paciente("João", "Clínica Geral");

        hospital.cadastrarMedico(medico);
        hospital.cadastrarEnfermeiro(enfermeiro);
        hospital.cadastrarPaciente(paciente);

        hospital.registrarTriagem(paciente, enfermeiro);

        Atendimento atendimento = new Atendimento(paciente, false, medico);
        hospital.registrarAtendimento(atendimento);

        hospital.registrarProcedimento("Cirurgia Cardíaca", medico, enfermeiro, List.of(antibiotico), List.of(seringaDescartavel));

        // Exemplo de registro de procedimento como parte de outro procedimento
        Procedimento exameSangue = new Procedimento("Exame de Sangue");
        hospital.cadastrarProcedimento(exameSangue);
        hospital.registrarProcedimentoComoParte("Cirurgia Cardíaca", exameSangue);
    }
}
