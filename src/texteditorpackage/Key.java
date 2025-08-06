package texteditorpackage;

public class Key {
  private char output;
  private int length;

  public Key(char output, int length) {
    this.output = output;
    this.length = length;
  }

  public char getOutput() {
    return output;
  }

  public int getLength() {
    return length;
  }

  public void setOutput(char output) {
    this.output = output;
  }

  public void setLength(int length) {
    this.length = length;
  }
}
