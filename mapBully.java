# HashMaps
Google Inside Look/ CodingBat challenges

public Map<String, String> mapBully(Map<String, String> map) {
  outerloop:
  for(Map.Entry<String,String> entry : map.entrySet())
  {
    if(entry.getKey().compareTo("a")==0)
    {
      map.put("b",entry.getValue());
      map.put("a","");
      break outerloop;
    }
  }
  return map;
}
