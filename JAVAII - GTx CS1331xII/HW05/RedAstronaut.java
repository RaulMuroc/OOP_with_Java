package HW05;

public class RedAstronaut extends Player implements Impostor, Comparable {

     private String skill; // inexperienced, experienced, or expert.

     public String getSkill() {
          return this.skill;
     }

     public RedAstronaut(String name) {
          super(name, 15);
          this.skill = "experienced";
     }

     public RedAstronaut(String name, int susLevel, String skill) {
          super(name, susLevel);
          this.skill = skill;
     }

    
     @Override 
     protected void emergencyMeeting() {
          if (!this.isFrozen()) {
               Player[] players = getPlayers();
               Player votedoff = players[0];
               for (int i = 1; i < players.length; i++) {
                    if (players[i-1].getSusLevel() < players[i].getSusLevel()) {
                         votedoff = players[i];
                    } else if (players[i-1].getSusLevel() == players[i].getSusLevel()) {
                         continue;
                    } 
                    
                    if (!this.equals(votedoff)) {
                         votedoff.setFrozen((true));
                    }
               }
               gameOver();
          }
     }

     @Override
     public void freeze(Player p) {
          if (p.isFrozen()) {
               break;
          }

          if (!this.isFrozen()) {
               Player[] players = getPlayers();
               if (this.getSusLevel() < p.getSusLevel()) {
                    p.setFrozen(true);
               }      
               else {
                    this.setSusLevel(this.getSusLevel() * 2);
                    p.setFrozen(false);
               }    
          }
          gameOver();
     }

     @Override
     public void sabotage(Player p) {
          if (p.isFrozen()) {
               break;
          }

          if (!this.isFrozen()) {
               Player[] players = getPlayers();
               if (this.getSusLevel() < 20) {
                    p.setSusLevel(p.getSusLevel() + (p.getSusLevel() * 0.5));
               }      
               else {
                    this.setSusLevel(this.getSusLevel() * 2);
                    p.setFrozen(false);
               }    
          }
     }

    public boolean equals(Object o) {
        return this.getName() == o.getName() && this.isFrozen() == o.isFrozen() && this.getSusLevel() == o.getSusLevel && this.skill == o.getSkill();
    }

    @Override
    public String toString() {
        //String outputFrozen = isFrozen() ? "frozen": "not frozen";
        //String output = String.format("My Name is %s, and I have a suslevel of %d. I am currently %s. I am an skill %d player!", this.getName(), this.getSusLevel(), outputFrozen, this.getSkill());
        if (this.getSusLevel() > 15) {
             //output = output.toUpperCase();
             return super.toString().toUpperCase();
        }
        return super.toString();
    }
}