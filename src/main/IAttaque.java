package main;

public interface IAttaque {
	public int lancerAttaque();

    // Getters et Setters
    public String getNom();
    public String getDescription();
    public double getChanceToucher();
    public int getDegats();
    public void setNom(String nom);
    public void setDescription(String description);
    // Chance de toucher doit �tre compris entre 0 et 100 obligatoirement
    public void setChanceToucher(double chanceToucher); 
    public void setDegats(int degats);
}
