package scene;
import elements.*;
import geometries.*;
import primitives.Color;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * class scene stores the info of the scene
 */
public class Scene
{
    private  String _name;
    private  Color _background;
    private AmbientLight _ambientLight;
    private Geometries _geometries=null;
    private  Camera _camera;
    private  double _distance;
    private List<LightSource> _lights;

    /**
     *
     * @return the light source of the sceane
     */
    public List<LightSource> get_lights() {
        return _lights;
    }

    /**
     * remove all the geometries from the list
     * @param geometries
     */
    public void removeGeometries(Intersectable... geometries) {
        _geometries.removeAll(geometries);
    }
    /**
     * constructor
     * @param _name gets the scene name
     *   creates a empty geometries list
     */
    public Scene(String _name) {
        this._name = _name;
        _geometries = new Geometries(); // need to check .......
        _lights = new LinkedList<>();
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setGeometries(Geometries _geometries) {
        this._geometries = _geometries;
    }

    public void setBackground(Color _background) {
        this._background = _background;
    }

    public void setAmbientLight(AmbientLight _ambientLight) {
        this._ambientLight = _ambientLight;
    }

    public void setCamera(Camera _camera) {
        this._camera = _camera;
    }

    public void setDistance(double _distance) {
        this._distance = _distance;
    }

    public String getName() {
        return _name;
    }

    public Color getBackground() {
        return _background;
    }

    public AmbientLight getAmbientLight() {
        return _ambientLight;
    }

    public Geometries getGeometries() {
        return _geometries;
    }

    public Camera getCamera() {
        return _camera;
    }

    public double getDistance() {
        return _distance;
    }

    /**
     * add a new shape to geometries list
     * @param geometries
     */
    public void addGeometries(Intersectable... geometries)
    {
        for (Intersectable i  :geometries)
        {
           this._geometries.add(i);
        }
    }

    /**
     * add new lihgt source to the sceane
     * @param light
     */
    public void addLights(LightSource light) {
        if(_lights==null)
        {
            _lights=new ArrayList<>();
        }
        _lights.add(light);
    }
}
