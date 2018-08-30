class Solution {
    public String validIPAddress(String IP) {
        if(IP.isEmpty()) return "Neither";
        if(!(IP.contains(":") || IP.contains("."))) return "Neither";
        if(IP.contains(":")) return validIP6(IP);
        else return validIP4(IP);
    }
    
    public String validIP4(String IP){
        if(IP.length()<7 || IP.charAt(IP.length()-1)=='.' || IP.charAt(0)=='.') return "Neither";
        String[] address = IP.split("\\.");
        if(address.length!=4) return "Neither";
        for(String a:address){
            if(a.isEmpty() || (a.length() >1 && a.charAt(0)=='0') || !a.matches("\\d+") || a.length()>3) return "Neither";
            int id = Integer.parseInt(a);
            if(id<0 || id>255) return "Neither";
        }
        return "IPv4";
    }
    
    public String validIP6(String IP){
        if(IP.length()<15 || IP.charAt(IP.length()-1)==':' || IP.charAt(0)==':') return "Neither";
        String[] address = IP.split(":");
        if(address.length!=8) return "Neither";
        for(String a:address){
            if(a.length()>4 || a.length()<1) return "Neither";
            for(char c:a.toCharArray()){
                if(!Character.isLetterOrDigit(c)) return "Neither";
                if(!Character.isDigit(c)){
                    if(Character.isLowerCase(c) && (c<'a' || c>'f')) return "Neither";
                    if(Character.isUpperCase(c) && (c<'A' || c>'F')) return "Neither";
                }
            }
        }
        return "IPv6";
    }
}
