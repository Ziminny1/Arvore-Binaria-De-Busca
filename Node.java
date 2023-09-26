public class Node {

  int info;
  Node direita;
  Node esquerda;

  public Node(int info) {
    this.info = info;
  }

  public void insere(int number) {
    if (number >= info) {
      if (direita != null) {
        direita.insere(number);
      } else {
        direita = new Node(number);
      }
    } else if (number < info) {
      if (esquerda != null) {
        esquerda.insere(number);
      } else {
        esquerda = new Node(number);
      }
    }
  }

  public void insereNode(Node node) {
    if (direita != null) {
      direita.insereNode(node);
    } else {
      direita = node;
    }
  }

  public void ImprimePreOrdem() {
    System.out.println(info);
    if (esquerda != null) {
      esquerda.ImprimePreOrdem();
    }
    if (direita != null) {
      direita.ImprimePreOrdem();
    }
  }

  public void ImprimeInOrdem() {
    if (esquerda != null) {
      esquerda.ImprimeInOrdem();
    }
    System.out.println(info);
    if (direita != null) {
      direita.ImprimeInOrdem();
    }
  }

  public void ImprimePosOrdem() {
    if (esquerda != null) {
      esquerda.ImprimePosOrdem();
    }
    if (direita != null) {
      direita.ImprimePosOrdem();
    }
    System.out.println(info);
  }

  public Node RemoveMaior() {
    if (direita != null) {
      direita = direita.RemoveMaior();
      return this;
    } else {
      if (esquerda != null) {
        return esquerda;
      }
      return null;
    }
  }

  public Node RemoveMenor() {
    if (esquerda != null) {
      esquerda = esquerda.RemoveMenor();
      return this;
    } else {
      if (direita != null) {
        return direita;
      }
      return null;
    }
  }

  public Node RemoveElemento(int elemento) {
    if (info == elemento) {
      if (esquerda != null && direita == null) {
        return esquerda;
      } else if (esquerda == null && direita != null) {
        return direita;
      } else if (esquerda != null && direita != null) {
        esquerda.insereNode(direita);
        return esquerda;
      }
      return null;
    } else {
      if (esquerda != null) {
        esquerda = esquerda.RemoveElemento(elemento);
      }
      if (direita != null) {
        direita = direita.RemoveElemento(elemento);

      }
      return this;

    }
  }
}
