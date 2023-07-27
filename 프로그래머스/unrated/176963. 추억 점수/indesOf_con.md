### indexOf

<br/>

> 리스트내에서 특정 값을 가진 자릿수 반환
<br/><br/>

※ 사용 예시
<br/><br/>

```
List<String> list = Arrays.asList("apple", "grape", "banana", "kiwi");
list.indexOf("apple");
```
```
result: 0
```

<br/><br/>
※ <U>indexOf는 배열에서는 사용할 수 없고, List형식에서 사용할 수 있으므로 배열을 리스트로 변경 후 사용</U>
```
ex1) Arrays.asList(array).indexOf("apple");
ex2) Arrays.asList(name).indexOf(photo[i][j]);
```
