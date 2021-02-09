package vetores;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// *** Criação de um vetor/array
		double[] notas = {7.8, 8.4, 6.4, 9.2, 10};
		String[] alunos = {
				"Maria",
				 "Pedro",
				 "Ana",
				 "Fabiana", "Fernanda","William"
		};
         
//		double soma = 0;
//		// Looping For/While/Do-Until
//		for(int i=0; i<4; i++) {
//			soma+= notas[i];
//		}
		double media = (soma)/4;
        System.out.println("Média: " + media); 

		 
		
//		System.out.println(notas.length);
//		System.out.println(alunos.length);
		
//		System.out.println("A nota do 3 bimestre foi: " + notas[2]);
//		System.out.println("A nota do 4 bimestre foi: " + notas[3]);
		
//		int x =3;
//		notas[x] = 9.8;
//		notas[3] = 9.8;
//		notas[4] = 10;
//
//		System.out.println("A nota do 5 bimestre foi: " + notas[x]);
//		System.out.println("A nota do 5 bimestre foi: " + notas[4]);
        
        public static double soma(double[] notas) {
    		double soma = 0;
        	for(int i=0; i<4; i++) {
    			soma += notas[i];
    		}
        	return soma;
        }

	}	

}
