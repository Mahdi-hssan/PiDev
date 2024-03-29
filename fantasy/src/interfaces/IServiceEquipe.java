package interfaces;


import entites.Equipe;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public interface IServiceEquipe {

    public void addEquipe(Equipe e);

    public List<Equipe> getEquipes();

    public void deleteEquipe(Equipe p);

    public Equipe getByName(String name);

    public void updateEquipe(Equipe p);

    public Equipe getById(int id);
    
    public List<Equipe> SearchTeam(String character);

}
