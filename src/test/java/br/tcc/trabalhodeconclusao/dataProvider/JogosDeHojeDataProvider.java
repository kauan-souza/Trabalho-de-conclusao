package br.tcc.trabalhodeconclusao.dataProvider;

import br.tcc.trabalhodeconclusao.domain.JogosDeHoje;

public class JogosDeHojeTeste {

    public static JogosDeHoje build() {
        return JogosDeHoje
                .builder()
                .id(1L)
                .timeMandante("golden state warriors")
                .timeVisitante("dallas mavericks")
                .canalDeTransmissao("ESPN")
                .horario("21:30")
                .build();
    }
}
