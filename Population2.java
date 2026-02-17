class Population2 {
    public static void main(String[] args){
        final Long CURR_POP = 312032486L ;
        final Long SECONDS = (365L * 24 * 60 * 60) * 5;
        final Long BIRTH = SECONDS/7 ;
        final Long DEATH = SECONDS/13 ;
        final Long IMMIGRANTS = SECONDS/45 ;

        Long newPop = CURR_POP + BIRTH - DEATH + IMMIGRANTS;
        System.out.println(newPop);
    }
}