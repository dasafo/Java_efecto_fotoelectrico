package efTFG.TFG_fe.PhotoelectricEffectLab_pkg;

import org.colos.ejs.library.LauncherApplet;
import org.colos.ejs.library.Model;
import org.colos.ejs.library.Simulation;
import org.opensourcephysics.tools.ResourceLoader;




public class PhotoelectricEffectLabApplet
  extends LauncherApplet
{
  static
  {
    org.opensourcephysics.display.OSPRuntime.loadTranslatorTool = false;
    org.opensourcephysics.display.OSPRuntime.loadVideoTool = false;
    org.opensourcephysics.display.OSPRuntime.loadExportTool = false;
  }
  
  public void init() {
    super.init();
    ResourceLoader.addAppletSearchPath("/efTFG/TFG_fe/");
    ResourceLoader.addSearchPath(getCodeBase() + "efTFG/TFG_fe/");
    ResourceLoader.addSearchPath("efTFG/TFG_fe/");
    
    PhotoelectricEffectLab._addHtmlPageInfo("Description", "_default_", "Description", "./PhotoelectricEffectLab_Intro_1.html");
    PhotoelectricEffectLab._addHtmlPageInfo("Current vs Voltage", "_default_", "Current vs Voltage", "./PhotoelectricEffectLab_Intro_2.html");
    PhotoelectricEffectLab._addHtmlPageInfo("Energy vs Frequency", "_default_", "Energy vs Frequency", "./PhotoelectricEffectLab_Intro_3.html");
    PhotoelectricEffectLab._addHtmlPageInfo("Current vs Intensity", "_default_", "Current vs Intensity", "./PhotoelectricEffectLab_Intro_4.html");
    if (getParentFrame() != null) {
      _model = new PhotoelectricEffectLab("Ventana", getParentFrame(), getCodeBase(), this, (String[])null, true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    else {
      _model = new PhotoelectricEffectLab(null, null, getCodeBase(), this, (String[])null, true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    _simulation.initMoodle(); }
  
  public void _reset() { ((PhotoelectricEffectLab)_model)._reset(); }
  public void _initialize() { ((PhotoelectricEffectLab)_model)._initialize(); }
  public void stop() { _model.getSimulation().onExit(); }
  
  public PhotoelectricEffectLabApplet() {}
}
