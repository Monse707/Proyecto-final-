public class HashMap {
    java.util.HashMap<String, String> MiHashMap;
    public HashMap(int table_size){
        MiHashMap = new java.util.HashMap<>();
    }

    public void add(String key, String value){
        MiHashMap.put(key, value);
    }

    public String valueOf(String key){
        return MiHashMap.get(key);
    }

    public void remove( String key){
        MiHashMap.remove(key);

    }

    public static void main(String[] args) {
        HashMap equipo = new HashMap(4);
        equipo.add("DPS","Razor" );
        equipo.add("SubDPS","Xiao");
        equipo.add("Support","Kazuha");
        equipo.add("Healer","Bennett");
        System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
        System.out.println("Voy a cambiar mi DPS para no ser furra");
        equipo.add("DPS","Itto");
        System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
    }

}




