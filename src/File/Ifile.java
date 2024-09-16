package File;

public interface Ifile {
  void AddEmployee(fileDetails details);
  void deleteEmployee(int index, fileDetails details);
  void updateEmployee(int index, fileDetails details);
  void Display();
}
