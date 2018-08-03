# HashMaps
Google Inside Look/ CodingBat challenges

public Map<String, String> mapShare(Map<String, String> map) {
outerloop:
for (Map.Entry<String, String> entry : map.entrySet())
{
    if(entry.getKey().compareTo("a")==0)
    {
      map.put("b",entry.getValue());
      break outerloop;
    }
}
outerloop:  
for (Map.Entry<String, String> entry : map.entrySet())
{
    if(entry.getKey().compareTo("c")==0)
    {
      map.remove(entry.getKey());
      break outerloop;
    }
}
return map;
}
