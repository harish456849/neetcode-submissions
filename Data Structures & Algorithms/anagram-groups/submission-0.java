class Solution {
    //public static boolean isAnagram(String str1,String str2){
    //     if(str1.length()!=str2.length()){
    //         return false;
    //     }
    //     int coun[] = new int[26];
    //     for(int i=0; i<str1.length(); i++){
    //         coun[str1.charAt(i)-'a']++;
    //         coun[str2.charAt(i)-'a']--;
    //     }
    //     for(int c : coun){
    //         if(c!=0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
      for(String s : strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String Key = new String(charArray);
        map.putIfAbsent(Key,new ArrayList<String>());
        map.get(Key).add(s);


      }
    // List<List<String>> out = new ArrayList<>();
    // HashMap<Integer,List<Integer>> index = new HashMap<>();
    

    // for(int i=0; i<strs.length; i++){
    //     List<Integer> list = new ArrayList<>();
    //     for(int j=i+1; j<strs.length; j++){
    //        if(strs[i].length()==strs[j].length()){
    //         if(isAnagram(strs[i],strs[j])){
    //             list.add(j);
    //             index.put(i,list);
    //         }
    //        }
    //     }
    // }
    // System.out.println(index);
    // for(int i=0; i<strs.length; i++){
    //     for(int j=0; j<strs.length; j++){
    //         out[i][j]=index.get();
    //     }
    // }
    // return out;
    return new ArrayList<>(map.values());
    }
}
