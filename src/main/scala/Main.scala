object Main {
  def main(args: Array[String]): Unit = {
    def main(args: Array[String]): Unit = {
      val text = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler"
      var novoText = new StringBuilder();

      var palavas = text.split(" ");

      var contadorQntLetras = 0;
      var limiteLinha = 80;

      for (palavra <- palavas) {

        if (contadorQntLetras + palavra.length() >= limiteLinha) {
          contadorQntLetras = 0;
          novoText.append('\n')
        }

        novoText.append(palavra);
        novoText.append(' ');
        contadorQntLetras += palavra.length() + 1;
      }
      println(novoText)
    }  }
}