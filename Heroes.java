public class Heroes {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;
    
    public Heroes(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
        this.lifePoint = 100;
    }
    
    public int hit(Heroes musuh){
        return musuh.lifePoint -= this.attackHitPoint;
    }
    
    public int kick(Heroes musuh){
        return musuh.lifePoint -= this.attackKickPoint;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lifePoint
     */
    public int getLifePoint() {
        return lifePoint;
    }

    /**
     * @param lifePoint the lifePoint to set
     */
    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    /**
     * @return the attackHitPoint
     */
    public int getAttackHitPoint() {
        return attackHitPoint;
    }

    /**
     * @param attackHitPoint the attackHitPoint to set
     */
    public void setAttackHitPoint(int attackHitPoint) {
        this.attackHitPoint = attackHitPoint;
    }

    /**
     * @return the attackKickPoint
     */
    public int getAttackKickPoint() {
        return attackKickPoint;
    }

    /**
     * @param attackKickPoint the attackKickPoint to set
     */
    public void setAttackKickPoint(int attackKickPoint) {
        this.attackKickPoint = attackKickPoint;
    }
}
