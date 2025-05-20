/* Primeira aula de programação de java - senac
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestordesalas;

//calculo <-- (peso/(altura*altura)
//se calculo  <18.5 --> é abaixo do peso;
//se calculo  maior ou igual 25 && calculo menor ou igual  29.9  --> é sobrepeso do peso;
//se calculo  maior ou igual 18.5 && calculo menor ou igual  24.9  --> é peso ideal
// se calculo > 30 --> é obesidade
public class GestorDeSalas {

    public static void main(String[] args) {
        //variaveis dos dados essenciais - tipo (double) - nome (peso) - valor (130)
        double peso = 150.0;
        double altura = 1.75;
        double resultado = peso / (altura * altura);
        System.out.println(resultado);

        //exemplo de if-else aninhado 
        if (resultado < 18.5) {
            System.out.println(" abaixo do peso");
        } else if (resultado >= 25 && resultado <= 29.9) {
            System.out.println("está com sobreso!");
        } else if (resultado >= 18.5 && resultado <= 24.9) {

            System.out.println("Você está no peso ideal!");
        } else {
            System.out.println(" Você está com Obesidade!");
        }

    }

}
