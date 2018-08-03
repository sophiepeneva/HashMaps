# HashMaps
Google Inside Look/ CodingBat challenges

public Map<String, String> mapAB2(Map<String, String> map) {
  if(map.containsKey("a")&&map.containsKey("b"))
  {
    if(map.get("a").compareTo(map.get("b"))==0)
    {
      map.remove("a");
      map.remove("b");
    }
  }
  return map;
}
