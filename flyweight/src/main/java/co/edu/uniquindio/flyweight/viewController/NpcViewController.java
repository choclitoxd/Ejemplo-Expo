package co.edu.uniquindio.flyweight.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.flyweight.controller.NpcController;
import co.edu.uniquindio.flyweight.model.Npc;
import co.edu.uniquindio.flyweight.model.assets.Animation;
import co.edu.uniquindio.flyweight.model.assets.Prefab;
import co.edu.uniquindio.flyweight.model.assets.Sound;
import co.edu.uniquindio.flyweight.model.assets.Texture;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class NpcViewController {
    NpcController npcController;
    Npc npcSelection;
    ObservableList<Npc> listaNpc = FXCollections.observableArrayList();

    @FXML
    void initialize() {

        npcController =  new NpcController();

        initCombo();
        initTableNpc();

    }

    private void initCombo() {
        comboAnimaciones();
        comboSounds();
        comboTexturas();
    }

    private void comboTexturas() {
        ObservableList<String> itemscbTipo = FXCollections.observableArrayList();
        itemscbTipo.add("--Seleccione--");
        itemscbTipo.addAll(npcController.obtenerTextura());

        boxTexturas.setItems(itemscbTipo);
        boxTexturas.getSelectionModel().select("--Seleccione--");
    }

    private void comboSounds() {
        ObservableList<String> itemscbTipo = FXCollections.observableArrayList();
        itemscbTipo.add("--Seleccione--");
        itemscbTipo.addAll(npcController.obtenerSounds());

        boxVoz.setItems(itemscbTipo);
        boxVoz.getSelectionModel().select("--Seleccione--");
    }


    private void comboAnimaciones() {
        ObservableList<String> itemscbTipo = FXCollections.observableArrayList();
        itemscbTipo.add("--Seleccione--");
        itemscbTipo.addAll(npcController.obtnerAnimaciones());

        boxAnimacion.setItems(itemscbTipo);
        boxAnimacion.getSelectionModel().select("--Seleccione--");
    }

    private void initTableNpc() {

        initDataBinding();
        obtenerNpc();
        tableNpc.getItems().clear();
        tableNpc.setItems(listaNpc);
    }

    private void obtenerNpc() {
        listaNpc.clear();
        listaNpc.addAll(npcController.obtenerNpc());
    }

    private void initDataBinding() {
        tcName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        tcVida.setCellValueFactory(cellData -> new SimpleStringProperty(Integer.toString(cellData.getValue().getHealth())));
        tcX.setCellValueFactory(cellData -> new SimpleStringProperty(Integer.toString(cellData.getValue().getCoordinates().getPosX())));
        tcY.setCellValueFactory(cellData -> new SimpleStringProperty(Integer.toString(cellData.getValue().getCoordinates().getPosY())));
        tcZ.setCellValueFactory(cellData -> new SimpleStringProperty(Integer.toString(cellData.getValue().getCoordinates().getPosZ())));
        tcPrefab.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPrefab().getName()));
    }
    @FXML
    void onCrearNpc(ActionEvent event) {
        if (validarCampos()){
            List<Animation> animations = obtenerAnimacionLista();
            List<Texture> textura = obtenerListaTextura();
            List<Sound> sounds = obtenerListaSounds();
            Prefab prefab = new Prefab(animations,textura,sounds);
            if (!npcController.agregarPrefab(prefab)) {
                prefab = npcController.obtenerPrefab(prefab);
            }
            Npc npc = new Npc(prefab);
            npc.showNpc();
            if(npcController.addNpc(npc)){
                obtenerNpc();
                mostrarMensaje("Notificación Npc", "Npc creado", "La Npc se ha creado con éxito", Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje("Notificación Npc", "Npc no creado", "La Npc no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación Npc", "Npc no creado", "Los datos ingresados no son validos", Alert.AlertType.ERROR);
        }
        
    }
    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }


    private boolean validarCampos() {
        return !boxVoz.getValue().equalsIgnoreCase("--Seleccione--")
                && !boxAnimacion.getValue().equalsIgnoreCase("--Seleccione--")
                && !boxAnimacion.getValue().equalsIgnoreCase("--Seleccione--");
    }

    private List<Sound> obtenerListaSounds() {
        String mensaje = boxVoz.getValue();
        int numero = Integer.parseInt(String.valueOf(mensaje.charAt(4)));
        return npcController.obtenerlistaSounds(numero);
    }

    private List<Texture> obtenerListaTextura() {
        String mensaje = boxTexturas.getValue();
        int numero = Integer.parseInt(String.valueOf(mensaje.charAt(8)));
        return npcController.obtenerListaTextura(numero);
    }

    private List<Animation> obtenerAnimacionLista() {
        String mensaje = boxAnimacion.getValue();
        int numero = Integer.parseInt(String.valueOf(mensaje.charAt(10)));
        return npcController.obtenerAnimacionLista(numero);
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> boxAnimacion;

    @FXML
    private ChoiceBox<String> boxTexturas;

    @FXML
    private ChoiceBox<String> boxVoz;

    @FXML
    private TableView<Npc> tableNpc;

    @FXML
    private TableColumn<Npc, String> tcName;

    @FXML
    private TableColumn<Npc, String> tcPrefab;

    @FXML
    private TableColumn<Npc, String> tcVida;

    @FXML
    private TableColumn<Npc, String> tcX;

    @FXML
    private TableColumn<Npc, String> tcY;

    @FXML
    private TableColumn<Npc, String> tcZ;

}
