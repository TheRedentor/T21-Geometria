package TestGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

import JUnit.Junit09_Geometria.App;

class TestGeometria {
	
	Geometria geom;
	App main;
	
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geom = new Geometria();
	}
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		geom.clear();
	}
	
	@Test
	public void testCrearGeometria() {
		geom = new Geometria(6);
		geom.clear();
	}

	@Test
	void testAreaCuadrado() {
		int resultado = Geometria.areacuadrado(3);
		int esperado = 9;
		assertEquals(esperado, resultado);
	}

	@Test
	void testAreaCirculo() {
		double resultado = Geometria.areaCirculo(3);
		double esperado = 28.27;
		assertEquals(esperado, resultado, 1);
	}
	
	@Test
	void testAreaTriangulo() {
		int resultado = Geometria.areatriangulo(4, 4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testAreaRectangulo() {
		int resultado = Geometria.arearectangulo(3, 4);
		int esperado = 12;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testAreaPentagono() {
		int resultado = Geometria.areapentagono(4, 4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testAreaRombo() {
		int resultado = Geometria.arearombo(4, 4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testAreaRomboide() {
		int resultado = Geometria.arearomboide(4, 4);
		int esperado = 16;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testAreaTrapecio() {
		int resultado = Geometria.areatrapecio(4, 4, 4);
		int esperado = 16;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraCuadrado() {
		String resultado = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraCirculo() {
		String resultado = Geometria.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraTriangulo() {
		String resultado = Geometria.figura(3);
		String esperado = "Triangulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraRectangulo() {
		String resultado = Geometria.figura(4);
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraPentagono() {
		String resultado = Geometria.figura(5);
		String esperado = "Pentagono";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraRomboide() {
		String resultado = Geometria.figura(7);
		String esperado = "Romboide";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraTrapecio() {
		String resultado = Geometria.figura(8);
		String esperado = "Trapecio";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testFiguraDefault() {
		String resultado = Geometria.figura(12);
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testGetId() {
		geom = new Geometria();
		geom.setId(6);
		int resultado = geom.getId();
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testGetNom() {
		geom = new Geometria();
		geom.setNom("Rombo");
		String resultado = geom.getNom();
		String esperado = "Rombo";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testGetArea() {
		geom = new Geometria(6);
		geom.setArea(6);
		double resultado = geom.getArea();
		double esperado = 6;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testToString() {
		geom = new Geometria(6);
		geom.setArea(6);
		String resultado = geom.toString();
		String esperado = "Geometria [id=" + geom.getId() + ", nom=" + geom.getNom() + ", area=" + geom.getArea() + "]";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMain() {
		main = new App();
		main.main(null);
	}

}