
/**
 * @author SAIDI Sarah
 *
 */
public class Codition4 {	
	
	/**
	 * @param args p1,p2,p3,p4,p5, p6,max,min
	 *
	 */
	
		public static void main(String[] args) {
			int p1 = 8, p2 = 9, p3 = -1, p4 = 4, p5 = 8, p6, min, max;

			
		
			
			/**Branchements conditionnels pour trouver la valeur minimale entre les variables p1,p2,p3,p4, et p5*/	
			
			if (p1 < p2) {
				if (p1 < p3) {
					if (p1 < p4) {
						if (p1 < p5) {
							min = p1;
						} else {
							min = p5;

						}
					} else {
						if (p4 < p5)
							min = p4;
						else {
							min = p5;
						}
					}
				} else {
					if (p3 < p4) {
						if (p3 < p5) {
							min = p3;
						} else {
							min = p5;
						}
					} else {
						if (p4 < p5) {
							min = p4;
						} else {
							min = p5;
						}
					}
				}

			} else {
				if (p2 < p3) {
					if (p2 < p4) {
						if (p2 < p5) {
							min = p2;
						} else {
							min = p5;
						}
					} else {
						if (p4 < p5) {
							min = p4;
						} else {
							min = p5;
						}
					}
				} else {
					if (p3 < p4) {
						if (p3 < p5) {
							min = p3;
						} else {
							min = p5;
						}
					} else {
						if (p4 < p5) {
							min = p4;
						} else {
							min = p5;
						}
					}
				}
			}
			/**Affichage du minimum stocké dans la variable "min"*/

			System.out.println("La valeur du minimum est : "+min);
			
			/**Branchements conditionnels pour trouver la valeur maximale entre les variables p1,p2,p3,p4, et p5*/

			if (p1 > p2) {
				if (p1 > p3) {
					if (p1 > p4) {
						if (p1 > p5) {
							max = p1;
						} else {
							max = p5;

						}
					} else {
						if (p4 > p5)
							max = p4;
						else {
							max = p5;
						}
					}
				} else {
					if (p3 > p4) {
						if (p3 > p5) {
							max = p3;
						} else {
							max = p5;
						}
					} else {
						if (p4 > p5) {
							max = p4;
						} else {
							max = p5;
						}
					}
				}

			} else {
				if (p2 > p3) {
					if (p2 > p4) {
						if (p2 > p5) {
							max = p2;
						} else {
							max = p5;
						}
					} else {
						if (p4 > p5) {
							max = p4;
						} else {
							max = p5;
						}
					}
				} else {
					if (p3 > p4) {
						if (p3 > p5) {
							max = p3;
						} else {
							max = p5;
						}
					} else {
						if (p4 > p5) {
							max = p4;
						} else {
							max = p5;
						}
					}
				}
			}
			/**Affichage du maximum stocké dans la variable "max"*/
			System.out.println("La valeur du maximum est : "+max);
			
			/**Branchements conditionnels pour trouver la valeur de la médiane entre les variables p1, p4, et p5 (les variables
			 * p2 et p3 étant, respectivement, le maximum et le minimum
			 */
			if (p1 < p4) {
				if (p5 < p1)
					p6 = p1;
				else {
					if (p4 < p5)
						p6 = p4;
					else
						p6 = p1;

				}

			} else {
				if (p5 < p4)
					p6 = p4;
				else {
					if (p1 > p5)
						p6 = p5;
					else
						p6 = p1;

				}

			}
			/**Affichage de la médiane stockée dans la variable "p6"*/
			System.out.println("La valeur de la médiane est : "+p6);

		}}

	
