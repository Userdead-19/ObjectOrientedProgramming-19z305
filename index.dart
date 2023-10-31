import 'dart:convert';

void main(List<String> args) {
  Hello h1 = new Hello("Abinav", 19);
  print(h1.name);
  print(h1.age);
  String s = "Hello";
  String encode = Base64Encoder().convert(s.codeUnits);
  print(encode);
}

class Hello {
  String name;
  int age;
  Hello(this.name, this.age);
}
