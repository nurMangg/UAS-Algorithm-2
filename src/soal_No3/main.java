package soal_No3;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import soal_No3.network.ConnectURI;
import soal_No3.Model.pokemon;

public class main {
    public static void main(String[] args) {
        String jsonStr = ConnectURI.getResponseFromHTTPUrl("https://pokemon.go1.p.rapidapi.com/type_effectiveness.json");
        ArrayList<pokemon> pokemonku = new ArrayList<>();
        pokemon pokemonQ = new pokemon();
        pokemonQ.setBug(JSONObject.class);
        pokemonQ.setDark(JSONObject.class);
        pokemonQ.setDragon(JSONObject.class);
        pokemonQ.add(pokemonku);

    }
}
