class CollectionDemoMap{
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1,"MCA");
        m.put(2,"BCA");
        m.put(3,"BBA");
        m.put(4,"MBA");
        m.put(3,"BCom");
        m.put(4,"MCom");
        System.out.println(m);

        Set s = m.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() +  " = " + me.getValue());
        }
    }
}
