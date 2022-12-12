class LinkedHashMap {
    java.util.HashMap<String, String> MiHashMap;
    public LinkedHashMap(int table_size){
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
        LinkedHashMap equipo = new LinkedHashMap(4);
        equipo.add("DPS","Diluc" );
        equipo.add("SubDPS","Itto");
        equipo.add("Support","Zhongli");
        equipo.add("Healer","Barbara");
        System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
        System.out.println("Voy a cambiar mi DPS para que tenga variedad");
        equipo.add("DPS","Xiao");
        System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
    }

}