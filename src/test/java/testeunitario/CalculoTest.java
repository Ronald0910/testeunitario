package testeunitario;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculoTest {

	Calculo calculo = new Calculo();
		@Test
	public void testSomaCenarioFeliz() {
		Assert. assertEquals(4, calculo.soma(2,2));
	}
	public void testSubtracaoFeliz() {
		Assert.assertEquals(0, calculo.subtracao(2,2));
	}
	public void testMultiplicacao1() {
		Assert.assertEquals(2, calculo.multiplicacao(2, 1));
	}
	public void testDivisao1() {
		Assert.assertEquals(2, calculo.divisao(4, 2));
	}
	
	
	
	public void testSomaCenarioFelis() {
		Assert.assertEquals(14, calculo.soma(7, 7));
	}
	public void testSubtracao() {
		Assert.assertEquals(5, calculo.subtracao(10, 5));
	}
	public void testMultiplicacao() {
		Assert.assertEquals(25, calculo.multiplicacao(5, 5));
	}
	public void testDivisao() {
		Assert.assertEquals(10, calculo.divisao(100, 10));
	
	}
	
	
	


}




