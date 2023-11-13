import 'package:http/http.dart' as http;

void main(List<String> args) {
  fetch();
}

void fetch() async {
  var uri = "http://abinav19.pythonanywhere.com/";
  var response = await http.get(Uri.parse(uri));
  print(response.body);
}
