Public class Vehicles{
    private boolean powered;
    private int maxSpeed;
    private String colour;
    public Vehicles(boolean powered , int maxSpeed , String colour){
        this.powerd = powered;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }
    //Setter and getter
    public boolean getPowered(){
        return powered ;
    }
    public int getMaxSpeed (){
        return maxSpeed; 
    }
    public String getColour(){
        return colour;
    }

    public void setPowered(boolean powered){
        this.powered = powered;
    }
    public void setMaxSpeed(int maxSpeed ){
        this.maxSpeed = maxSpeed;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    @override
    public String toString(){
        return "MaxSpeed" + maxSpeed + "powered" + powered + "colour" + colour;
    }
}
