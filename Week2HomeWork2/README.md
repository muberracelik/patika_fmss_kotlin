# Login UI

<p align="center"  width="60%">
  <img width="30%" src="https://github.com/muberracelik/patika_fmss_kotlin/tree/main/Week2HomeWork2/res/loginUI.gif" alt="Application View"/>
</p>

## Lazy Filters – asSequence() Kullanımı
Bir elemanın veya ifadenin değeri tanımlandığı anda değil de ilk erişildiği anda değerlendiriliyorsa ve yalnızca çalışma zamanında gerçekleşecekse bunun için lazy filters kullanılır. İhtiyaç duyulacağı ana kadar bekletilir. Tembel bir liste oluşturmak için listeyi bir diziye dönüştürmemiz gerekir. Listeye dönüştürülmeden önceki çıktı aşağıdaki örnekte verilmiştir.

```
fun main(args: Array<String>) {
  val animals = listOf("bird","lion","shark","lionfish  ").asSequence()
  var lazyList = animals.filter{it[0]=='l'}
  println(lazyList)
}
```
Çıktı:
 ```
kotlin.sequences.FilteringSequence@45ff54e6
```

Diziler, toList() kullanılarak tekrar listelere dönüştürülebilir. Çıktı aşağıdaki gibidir.
```
fun main(args: Array<String>) {
  val animals = listOf("bird","lion","shark","dog").asSequence()
  var lazyList = animals.filter{it[0]=='l'}
  println(lazyList.toList())
}
```
Çıktı:
```
[lion, lionfish]
```
### Eager Filter
Lazy Filter’in tam tersi yönde çalışır. Kullanacağımız nesneleri, nesnenin ihtiyaç anından çok önce yaratır ve bekletir.  Her filtre kullandığınızda yeni bir liste oluşturulur.
```
fun main(args: Array<String>) {
  val animals = listOf("bird","lion","shark","lionfish")
  var eagerList = animals.filter{it[0]=='l'}
  println(eagerList)
}
```
Çıktı:
```
[lion, lionfish]
```

