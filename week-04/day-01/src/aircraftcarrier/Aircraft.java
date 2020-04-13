package aircraftcarrier;

public class Aircraft {
  protected String type;

  protected int ammunition;
  protected int maxAmmo;
  protected int baseDamage;
  protected boolean priority;

  public Aircraft() {
    this.ammunition = 0;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public int getAmmunition() {
    return ammunition;
  }

  public void setAmmunition(int ammunition) {
    this.ammunition = ammunition;
  }

  public int fight() {
    int damageDealt = this.baseDamage * ammunition;
    this.ammunition = 0;
    return damageDealt;
  }

  public int refill(int refillAmmo) {
    int remainingAmmo = 0;
    if (refillAmmo > this.maxAmmo - this.ammunition) {
      remainingAmmo = refillAmmo - (this.maxAmmo + this.ammunition);
      this.ammunition = maxAmmo;
    } else {
      this.ammunition += refillAmmo;
    }
    return remainingAmmo;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type " + this.type + ", Ammo: " + this.ammunition + ", Base Damage: " +
        this.baseDamage + ", All Damage: " + (int)(this.baseDamage * this.ammunition);
  }

  public boolean isPriority() {
    return this.priority;
  }
}
