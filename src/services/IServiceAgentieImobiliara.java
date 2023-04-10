package services;

import models.AgentieImobiliara;
import models.Locuinta;

import java.util.ArrayList;

public interface IServiceAgentieImobiliara {
    void adaugaAgentie(AgentieImobiliara agentieImobiliara);
    void afiseazaAgentii();
    void afiseazaNumeAgentii();
    ArrayList<AgentieImobiliara> getAgentii();
    AgentieImobiliara getAgentie(int i);
    void modificaAgentie(int i, AgentieImobiliara agentieModificata);
    void stergeAgentie(int i);
    void adaugaLocuinta(int i, Locuinta locuinta);
    void afiseazaLocuinteAgentie(int i);
    void afiseazaLocuinteAgentieIndexate(int i);
    void modificaLocuinta(int iAgentie, int iLocuinta, Locuinta locuintaModificata);
    void stergeLocuinta(int iAgentie, int iLocuinta);
}
