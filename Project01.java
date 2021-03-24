import java.util.Scanner;
public class Project01 {
public static void main(String[] args) {
	
//Process

Scanner Zed = new Scanner(System.in);// FYI "Zed" was just the first word I could come up with
double A=10;//A is short for "Answer"
double X=10;//First Variable\\First band
double Y=10;//2nd Variable\\2nd band
double Z=10;//3rd Variable\\3rd band
String  W="?!?%";//4th Variable\\4th band

//Input 

System.out.print("Enter 4 COLORS of a resistor: ");
String B = Zed.next();
String C = Zed.next();
String D = Zed.next();
String E = Zed.next();

System.out.println("["+B+"]");
System.out.println("["+C+"]");
System.out.println("["+D+"]");
System.out.println("["+E+"]");

// Calculations

//Band 1
if(B.equalsIgnoreCase("BLACK")) {
X=0;
}
else if(B.equalsIgnoreCase("BROWN")) {
X=1;
}
else if(B.equalsIgnoreCase("RED")) {
X=2;
}
else if(B.equalsIgnoreCase("ORANGE")) {
X=2;
}
else if(B.equalsIgnoreCase("YELLOW")) {
X=2;
}
else if(B.equalsIgnoreCase("GREEN")) {
X=5;
}
else if(B.equalsIgnoreCase("BLUE")) {
X=6;
}
else if(B.equalsIgnoreCase("VIOLET")) { 
X=7;
}
else if(B.equalsIgnoreCase("GRAY")){
X=8;
}
else if(B.equalsIgnoreCase("GREY")) { 
X=8;
}
else if(B.equalsIgnoreCase("WHITE")) {
X=9;
}
System.out.println("The First digit is "+X);


//Band 2
if(C.equalsIgnoreCase("BLACK")) {
Y=0;
}
else if(C.equalsIgnoreCase("BROWN")) {
Y=1;
}
else if(C.equalsIgnoreCase("RED")) {
Y=2;
}
else if(C.equalsIgnoreCase("ORANGE")) {
Y=2;
}
else if(C.equalsIgnoreCase("YELLOW")) {
Y=2;
}
else if(C.equalsIgnoreCase("GREEN")) {
Y=5;
}
else if(C.equalsIgnoreCase("BLUE")) {
Y=6;
}
else if(C.equalsIgnoreCase("VIOLET")) { 
Y=7;
}
else if(C.equalsIgnoreCase("GRAY")){
Y=8;
}
else if(C.equalsIgnoreCase("GREY")) { 
Y=8;
}
else if(C.equalsIgnoreCase("WHITE")) {
Y=9;
}
System.out.println("The Second digit is "+Y);


//Band 3
if(D.equalsIgnoreCase("BLACK")) {
Z=1;
}
else if(D.equalsIgnoreCase("BROWN")) {
Z=10;
}
else if(D.equalsIgnoreCase("RED")) {
Z=100;
}
else if(D.equalsIgnoreCase("ORANGE")) {
Z=1000;
}
else if(D.equalsIgnoreCase("YELLOW")) {
Z=10000;
}
else if(D.equalsIgnoreCase("GREEN")) {
Z=100000;
}
else if(D.equalsIgnoreCase("BLUE")) {
Z=1000000;
}
else if(D.equalsIgnoreCase("VIOLET")) { 
Z=10000000;
}
else if(D.equalsIgnoreCase("GRAY")) { 
Z=100000000;
}
else if(D.equalsIgnoreCase("GREY")) {
Z=100000000;
}
else if(D.equalsIgnoreCase("WHITE")){
Z=1000000000;
}
else if(D.equalsIgnoreCase("GOLD")) { 
Z=0.1;
}
else if(D.equalsIgnoreCase("SILVER")) {
Z=0.01;
}
System.out.println("The Multiplier is "+Z);


//Band 4
if(E.equalsIgnoreCase("BROWN")) {
W = "1%";
}
else if(E.equalsIgnoreCase("RED")) {
W="2%";
}
else if(E.equalsIgnoreCase("GREEN")) {
W="0.5%";
}
else if(E.equalsIgnoreCase("BLUE")) {
W="0.25%";
}
else if(E.equalsIgnoreCase("VIOLET")) { 
W="0.1%";
}
else if(E.equalsIgnoreCase("GRAY")) { 
W="0.05%";
}
else if(E.equalsIgnoreCase("GREY")) {
W="0.05%";
}
else if(E.equalsIgnoreCase("NONE")){
W="20%";
}
else if(E.equalsIgnoreCase("GOLD")) { 
W="5%";
}
else if(E.equalsIgnoreCase("SILVER")) {
W="10%";
}
System.out.println("The Tolerance is "+W);

A = ((X*10+Y)*Z);

//Output

System.out.println();
System.out.println("The result is given as follows:");
System.out.println(A + "ohms @ " + W);
Zed.close();//Close Zed Scanner
}//closing be=racket for method main
}//closing bracket for class