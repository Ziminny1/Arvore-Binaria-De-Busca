public class ArvoreBinaria {

  Node raiz;

  public ArvoreBinaria() {
  }

  public void insere(int info) {
    if (raiz != null) {
      raiz.insere(info);
    } else {
      raiz = new Node(info);
    }
  }

  public void ImprimePreOrdem() {
    if (raiz != null) {
      raiz.ImprimePreOrdem();
    }
  }

  public void ImprimeInOrdem() {
    if (raiz != null) {
      raiz.ImprimeInOrdem();
    }
  }

  public void ImprimePosOrdem() {
    if (raiz != null) {
      raiz.ImprimePosOrdem();
    }
  }

  public void RemoveMaior() {
    if (raiz != null) {
      raiz = raiz.RemoveMaior();
    }
  }

  public void RemoveMenor() {
    if (raiz != null) {
      raiz = raiz.RemoveMenor();
    }
  }

  public void RemoveElemento(int elemento) {
    if (raiz != null) {
      raiz = raiz.RemoveElemento(elemento);
    }
  }
}
