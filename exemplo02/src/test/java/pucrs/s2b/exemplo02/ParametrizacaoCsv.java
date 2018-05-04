package pucrs.s2b.exemplo02;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class ParametrizacaoCsv {

	@Test
    @FileParameters("./dados.csv")
    public void testeParametrizacaoJUnit(int n1, int n2, int resultado) {
		assertEquals(resultado, App.somar(n1, n2));
		
		

    }

}

