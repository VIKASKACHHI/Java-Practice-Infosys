public class Stringbuilder {
 public static void main(String[] args) {
  //   StringBuilder sb = new StringBuilder("Tony");
  //   System.out.println(sb);
  //   System.out.println(sb.charAt(3));

  //   //set char at index

  //  sb.setCharAt(0, 'p'); //changes the char with p
  //  System.out.println(sb);

  //  sb.insert(0, 's'); //adds a char in the given index
  //  System.out.println(sb);

  //  sb.delete(0, 1); // deletes the given index till the end-1 index
  //  System.out.println(sb);

  //  sb.setCharAt(0,'T');

  //  sb.append(" hello");
  //  System.out.println(sb);


  //To Reverse a String
   StringBuilder or = new StringBuilder("hello");
   for(int i =0;i<or.length()/2;i++){
    int front = i;
    int back = or.length()-1-i;

    char frontchar = or.charAt(i);
    char backchar = or.charAt(back);

    or.setCharAt(front, backchar);
    or.setCharAt(back, frontchar);

   }
   System.out.println(or);
 }   
}
