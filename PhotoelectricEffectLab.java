package efTFG.TFG_fe.PhotoelectricEffectLab_pkg;

import java.awt.Dimension;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JFrame;
import org.colos.ejs.library.LauncherApplet;
import org.colos.ejs.library.Simulation;
import org.colos.ejs.library.View;
import org.colos.ejs.library.utils.HtmlPageInfo;
import org.colos.ejs.library.utils.LocaleItem;
import org.opensourcephysics.display.Data;
import org.opensourcephysics.display.DataPanel;
import org.opensourcephysics.display.OSPRuntime;
import org.opensourcephysics.displayejs.InteractiveTrace;
import org.opensourcephysics.tools.ToolForData;

public class PhotoelectricEffectLab extends org.colos.ejs.library.Model
{
  static
  {
    ToolForData.setTool(new org.opensourcephysics.tools.ToolForDataFull());
    __translatorUtil = new org.colos.ejs.library.utils.TranslatorUtil();
  }
  
  public static boolean _sSwingView = true;
  
  public static int _sServerPort = -1;
  public static int _getServerPort() { return _sServerPort; }
  
  public PhotoelectricEffectLabSimulation _simulation = null;
  public PhotoelectricEffectLabView _view = null;
  public PhotoelectricEffectLab _model = this;
  




  private static Map<String, Set<HtmlPageInfo>> __htmlPagesMap = new java.util.HashMap();
  



  public static void _addHtmlPageInfo(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = (Set)__htmlPagesMap.get(paramString1);
    if (localObject == null) {
      localObject = new HashSet();
      __htmlPagesMap.put(paramString1, localObject);
    }
    LocaleItem localLocaleItem = LocaleItem.getLocaleItem(paramString2);
    if (localLocaleItem != null) { ((Set)localObject).add(new HtmlPageInfo(localLocaleItem, paramString3, paramString4));
    }
  }
  

  public static HtmlPageInfo _getHtmlPageClassInfo(String paramString, LocaleItem paramLocaleItem)
  {
    Set localSet = (Set)__htmlPagesMap.get(paramString);
    if (localSet == null) return null;
    Object localObject = null;
    for (HtmlPageInfo localHtmlPageInfo : localSet) {
      if (localHtmlPageInfo.getLocaleItem().isDefaultItem()) localObject = localHtmlPageInfo;
      if (localHtmlPageInfo.getLocaleItem().equals(paramLocaleItem)) return localHtmlPageInfo;
    }
    return localObject;
  }
  
  public HtmlPageInfo _getHtmlPageInfo(String paramString, LocaleItem paramLocaleItem) { return _getHtmlPageClassInfo(paramString, paramLocaleItem); }
  




  public static String _getEjsModel() { return "/efTFG/TFG_fe/PhotoelectricEffectLab.ejs"; }
  
  public static String _getModelDirectory() { return "efTFG/TFG_fe/"; }
  
  public static Dimension _getEjsAppletDimension() {
    return new Dimension(1209, 615);
  }
  
  public static Set<String> _getEjsResources() {
    HashSet localHashSet = new HashSet();
    localHashSet.add("/efTFG/TFG_fe/img/3.gif");
    localHashSet.add("/efTFG/TFG_fe/img/portadaLab.png");
    localHashSet.add("/efTFG/TFG_fe/img/15.gif");
    localHashSet.add("/efTFG/TFG_fe/img/linternabuena.gif");
    localHashSet.add("/efTFG/TFG_fe/img/sliderV.gif");
    localHashSet.add("/efTFG/TFG_fe/img/menos.gif");
    localHashSet.add("/efTFG/TFG_fe/img/VI_22.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/b_off.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_red.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Ii.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/sliderF.gif");
    localHashSet.add("/efTFG/TFG_fe/img/panel.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/14.gif");
    localHashSet.add("/efTFG/TFG_fe/img/0.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_green.gif");
    localHashSet.add("/efTFG/TFG_fe/img/portadaLab.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/6.gif");
    localHashSet.add("/efTFG/TFG_fe/img/sliderFrec.gif");
    localHashSet.add("/efTFG/TFG_fe/img/measure.gif");
    localHashSet.add("/efTFG/TFG_fe/img/3.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Cu.gif");
    localHashSet.add("/efTFG/TFG_fe/img/2.gif");
    localHashSet.add("/efTFG/TFG_fe/img/8.gif");
    localHashSet.add("/efTFG/TFG_fe/img/9.gif");
    localHashSet.add("/efTFG/TFG_fe/img/panel.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/VI_22.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/14.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Al.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Mg.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Ii.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/VI.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/1.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_black.gif");
    localHashSet.add("/efTFG/TFG_fe/img/7.gif");
    localHashSet.add("/efTFG/TFG_fe/img/6.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_off.gif");
    localHashSet.add("/efTFG/TFG_fe/img/sliderF.gif");
    localHashSet.add("/efTFG/TFG_fe/img/portadaLab.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/b_green.gif");
    localHashSet.add("/efTFG/TFG_fe/img/15.gif");
    localHashSet.add("/efTFG/TFG_fe/img/portadaLab.png");
    localHashSet.add("/efTFG/TFG_fe/img/punto.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_blue.gif");
    localHashSet.add("/efTFG/TFG_fe/img/incog1.gif");
    localHashSet.add("/efTFG/TFG_fe/img/sliderV.gif");
    localHashSet.add("/efTFG/TFG_fe/img/0.gif");
    localHashSet.add("/efTFG/TFG_fe/img/linternabuena.gif");
    localHashSet.add("/efTFG/TFG_fe/img/4.gif");
    localHashSet.add("/efTFG/TFG_fe/img/5.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_purple.gif");
    localHashSet.add("/efTFG/TFG_fe/img/sliderFrec.gif");
    localHashSet.add("/efTFG/TFG_fe/img/incog2.gif");
    localHashSet.add("/efTFG/TFG_fe/img/EkF.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/b_red.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Cs.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Au.gif");
    localHashSet.add("/efTFG/TFG_fe/img/menos.gif");
    localHashSet.add("/efTFG/TFG_fe/img/Na.gif");
    localHashSet.add("/efTFG/TFG_fe/img/measure.gif");
    localHashSet.add("/efTFG/TFG_fe/img/EkF.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/5.gif");
    localHashSet.add("/efTFG/TFG_fe/img/VI.jpg");
    localHashSet.add("/efTFG/TFG_fe/img/b_blue.gif");
    localHashSet.add("/efTFG/TFG_fe/img/b_purple.gif");
    return localHashSet;
  }
  
  public static boolean _common_initialization(String[] paramArrayOfString) {
    String str = null;
    boolean bool = true;
    if (paramArrayOfString != null) for (i = 0; i < paramArrayOfString.length; i++)
        if (paramArrayOfString[i].equals("-_lookAndFeel")) { str = paramArrayOfString[(++i)];
        } else if (paramArrayOfString[i].equals("-_decorateWindows")) { bool = true;
        } else if (paramArrayOfString[i].equals("-_doNotDecorateWindows")) { bool = false;
        } else if (paramArrayOfString[i].equals("-_noSwingView")) { _sSwingView = false;
        } else if (paramArrayOfString[i].equals("-_serverPort")) try { _sServerPort = Integer.parseInt(paramArrayOfString[(++i)]); } catch (Exception localException1) { _sServerPort = -1;localException1.printStackTrace();
          }
    if (str != null) OSPRuntime.setLookAndFeel(bool, str);
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("efTFG/TFG_fe/");
    int i = 0;int j = 0;
    try {
      if ("true".equals(System.getProperty("org.osp.launcher"))) {
        OSPRuntime.setLauncherMode(true);
      }
    }
    catch (Exception localException2) {}
    try {
      if (System.getProperty("osp_ejs") != null) {
        j = 1;
        Simulation.setPathToLibrary("/home/david/Documents/TFG/EjsS_5.3/bin/config/");
        i = 1;
      }
    } catch (Exception localException3) {
      i = 0; }
    try { org.colos.ejs.library.control.EjsControl.setDefaultScreen(Integer.parseInt(System.getProperty("screen")));
    } catch (Exception localException4) {}
    if (i == 0) {
      Simulation.setPathToLibrary("/home/david/Documents/TFG/EjsS_5.3/bin/config/");
    }
    _addHtmlPageInfo("Description", "_default_", "Description", "./PhotoelectricEffectLab_Intro_1.html");
    _addHtmlPageInfo("Current vs Voltage", "_default_", "Current vs Voltage", "./PhotoelectricEffectLab_Intro_2.html");
    _addHtmlPageInfo("Energy vs Frequency", "_default_", "Energy vs Frequency", "./PhotoelectricEffectLab_Intro_3.html");
    _addHtmlPageInfo("Current vs Intensity", "_default_", "Current vs Intensity", "./PhotoelectricEffectLab_Intro_4.html");
    if (j == 0) {}
    
    return true;
  }
  
  public static void main(String[] paramArrayOfString) {
    if (!_common_initialization(paramArrayOfString)) {
      if (OSPRuntime.isLauncherMode()) return;
      System.exit(-1);
    }
    
    PhotoelectricEffectLab localPhotoelectricEffectLab = new PhotoelectricEffectLab(paramArrayOfString);
  }
  
  public static JComponent getModelPane(String[] paramArrayOfString, JFrame paramJFrame) {
    if (!_common_initialization(paramArrayOfString)) return null;
    PhotoelectricEffectLab localPhotoelectricEffectLab = new PhotoelectricEffectLab("Ventana", paramJFrame, null, null, paramArrayOfString, true);
    return (JComponent)localPhotoelectricEffectLab._getView().getComponent("Ventana");
  }
  
  public PhotoelectricEffectLab() { this(null, null, null, null, null, false); }
  
  public PhotoelectricEffectLab(String[] paramArrayOfString) { this(null, null, null, null, paramArrayOfString, true); }
  
  public PhotoelectricEffectLab(String paramString, java.awt.Frame paramFrame, URL paramURL, LauncherApplet paramLauncherApplet, String[] paramArrayOfString, boolean paramBoolean) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = paramArrayOfString;
    __theApplet = paramLauncherApplet;
    NumberFormat localNumberFormat = NumberFormat.getInstance();
    if ((localNumberFormat instanceof DecimalFormat)) {
      ((DecimalFormat)localNumberFormat).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new PhotoelectricEffectLabSimulation(this, paramString, paramFrame, paramURL, paramBoolean);
    _simulation.processArguments(paramArrayOfString);
    if (_sSwingView) { org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(false);
    }
  }
  



  public String _getClassEjsModel() { return _getEjsModel(); }
  
  public Set<String> _getClassEjsResources() { return _getEjsResources(); }
  
  public String _getClassModelDirectory() { return _getModelDirectory(); }
  
  public View _getView() { return _view; }
  
  public Simulation _getSimulation() { return _simulation; }
  
  public int _getPreferredStepsPerDisplay() { return 1; }
  
  public void _resetModel() {
    _isEnabled_initialization1 = true;
    _isEnabled_initialization2 = true;
    _isEnabled_evolution1 = true;
    _isEnabled_constraints1 = true;
    _isEnabled_constraints2 = true;
    _isEnabled_constraints3 = true;
    _isEnabled_constraints4 = true;
    _isEnabled_constraints5 = true;
    n = 51;
    nf = 0;
    indicef = 1;
    indicefinal = 1;
    t = 0.0D;
    dt = 0.02D;
    totaltime = 0.0D;
    corriente = 0;
    amperios = 0.0D;
    amperios2 = 0.0D;
    tpaso = 2.2D;
    med = 0.0D;
    lambda = 0.0D;
    x = new double[n];
    y = new double[n];
    for (int i = 0; i < n; i++) y[i] = 2.0D;
    v = new double[n];
    for (i = 0; i < n; i++) v[i] = 0.0D;
    yf = new double[n];
    for (i = 0; i < n; i++) yf[i] = 2.0D;
    vf = new double[n];
    xf = new double[n];
    xlinterna = 0.72D;
    ylinterna = 1.45D;
    hxlinterna = 0.268D;
    hylinterna = 0.455D;
    sliderix = 0.516D;
    slideriy = 0.438D;
    frecuencia = 635;
    frecuenciareal = (frecuencia * Math.pow(10.0D, 12.0D));
    frecdig1 = "./img/6.gif";
    frecdig2 = "./img/3.gif";
    frecdig3 = "./img/5.gif";
    frecd1 = 6;
    frecd2 = 3;
    frecd3 = 5;
    e14 = true;
    e15 = false;
    sliderfrecx = -0.378D;
    sliderfrecy = 0.833D;
    V = 0.0D;
    vdig1 = "./img/0.gif";
    vdig2 = "./img/0.gif";
    vdig3 = "./img/0.gif";
    vd1 = 0;
    vd2 = 0;
    vd3 = 0;
    menos = false;
    slidervx = -0.384D;
    slidervy = -0.78D;
    currentdig1 = "./img/0.gif";
    currentdig2 = "./img/0.gif";
    currentdig3 = "./img/0.gif";
    currentdig4 = "./img/0.gif";
    currentd1 = 0;
    currentd2 = 0;
    currentd3 = 0;
    currentd4 = 0;
    I = 0.0D;
    cred = 0.0D;
    cgreen = 0.0D;
    cblue = 0.0D;
    csaturation = 0.0D;
    fgamma = 1.0D;
    colores = new Object['Ā'];
    band = new double[10];
    for (i = 0; i < 10; i++) band[i] = 0.0D;
    indicecolor = 200;
    elementoview = false;
    optionelement = "       ---- Select Element ----;Sodium (Na);Cesium (Cs);Gold (Au);Aluminium (Al);Magnesium (Mg);Cooper (Cu);1-????;2-????";
    elm = "       ---- Select Element ----";
    xdetector = 0.39D;
    xelement = -0.671D;
    yelement = -0.015D;
    helement = -0.295D;
    medida1 = true;
    medida2 = false;
    medida3 = false;
    medida4 = false;
    datos1 = new double[6];
    datos2 = new double[6];
    datos3 = new double[6];
    datos4 = new double[6];
    optiongraph = "Current vs Voltage;Energy vs Frequency;Current vs Intensity";
    graph = "Current vs Voltage";
    showPlot_I_V = true;
    showPlot_Ek_F = false;
    showPlot_I_i = false;
  }
  

  public void _initializeModel()
  {
    __shouldBreak = false;
    boolean bool1 = _isEnabled_initialization1;
    boolean bool2 = _isEnabled_initialization2;
    if (bool1) _initialization1();
    if (__shouldBreak) return;
    if (bool2) _initialization2();
    if (__shouldBreak) return;
    _initializeSolvers();
  }
  



  public void _stepModel()
  {
    __shouldBreak = false;
    boolean bool = _isEnabled_evolution1;
    if (bool) _evolution1();
    if (__shouldBreak) {}
  }
  
  public void _updateModel() {
    __shouldBreak = false;
    boolean bool1 = _isEnabled_constraints1;
    boolean bool2 = _isEnabled_constraints2;
    boolean bool3 = _isEnabled_constraints3;
    boolean bool4 = _isEnabled_constraints4;
    boolean bool5 = _isEnabled_constraints5;
    if (bool1) _constraints1();
    if (__shouldBreak) return;
    if (bool2) _constraints2();
    if (__shouldBreak) return;
    if (bool3) _constraints3();
    if (__shouldBreak) return;
    if (bool4) _constraints4();
    if (__shouldBreak) return;
    if (bool5) _constraints5();
    if (__shouldBreak) {}
  }
  


  public void _freeMemory()
  {
    getSimulation().setEnded();
    x = null;
    y = null;
    v = null;
    yf = null;
    vf = null;
    xf = null;
    colores = null;
    band = null;
    datos1 = null;
    datos2 = null;
    datos3 = null;
    datos4 = null;
    System.gc();
  }
  




  public int n = 51;
  public int nf = 0;
  public int indicef = 1;
  public int indicefinal = 1;
  public int ne1;
  public int ne2;
  public int ne;
  public double t = 0.0D;
  public double dt = 0.02D;
  public double totaltime = 0.0D;
  public int corriente = 0;
  public double amperios = 0.0D;
  public double amperios2 = 0.0D;
  public double tpaso = 2.2D;
  public double med = 0.0D;
  public double lambda = 0.0D;
  public double[] x;
  public double[] y;
  public double[] v;
  public double[] yf;
  public double[] vf;
  public double[] xf;
  public double xlinterna = 0.72D;
  public double ylinterna = 1.45D;
  public double hxlinterna = 0.268D;
  public double hylinterna = 0.455D;
  public double sliderix = 0.516D;
  public double slideriy = 0.438D;
  public double aceleracion;
  public int frecuencia = 635;
  public double frecuenciareal = frecuencia * Math.pow(10.0D, 12.0D);
  public String frecdig1 = "./img/6.gif";
  public String frecdig2 = "./img/3.gif";
  public String frecdig3 = "./img/5.gif";
  public int frecd1 = 6;
  public int frecd2 = 3;
  public int frecd3 = 5;
  public boolean e14 = true;
  public boolean e15 = false;
  public double sliderfrecx = -0.378D;
  public double sliderfrecy = 0.833D;
  public double V = 0.0D;
  public String vdig1 = "./img/0.gif";
  public String vdig2 = "./img/0.gif";
  public String vdig3 = "./img/0.gif";
  public int vd1 = 0;
  public int vd2 = 0;
  public int vd3 = 0;
  public boolean menos = false;
  public double Ek;
  public double V0;
  public double slidervx = -0.384D;
  public double slidervy = -0.78D;
  public String currentdig1 = "./img/0.gif";
  public String currentdig2 = "./img/0.gif";
  public String currentdig3 = "./img/0.gif";
  public String currentdig4 = "./img/0.gif";
  public int currentd1 = 0;
  public int currentd2 = 0;
  public int currentd3 = 0;
  public int currentd4 = 0;
  public double I1;
  public double I2;
  public double I = 0.0D;
  public double cred = 0.0D;
  public double cgreen = 0.0D;
  public double cblue = 0.0D;
  public double csaturation = 0.0D;
  public double fgamma = 1.0D;
  public Object[] colores;
  public double[] band;
  public int bandselec;
  public Object lightcolor = null;
  public int indicecolor = 200;
  public String element = "";
  public boolean elementoview = false;
  public String optionelement = "       ---- Select Element ----;Sodium (Na);Cesium (Cs);Gold (Au);Aluminium (Al);Magnesium (Mg);Cooper (Cu);1-????;2-????";
  public String elm = "       ---- Select Element ----";
  public double potencialcorte;
  public double xdetector = 0.39D;
  public double xelement = -0.671D;
  public double yelement = -0.015D;
  public double helement = -0.295D;
  public String mat = "";
  public String mat1 = "";
  public String mat2 = "";
  public String mat3 = "";
  public String mat4 = "";
  public boolean medir;
  public boolean medida1 = true;
  public boolean medida2 = false;
  public boolean medida3 = false;
  public boolean medida4 = false;
  public boolean tablavisible;
  public double[] datos1;
  public double[] datos2;
  public double[] datos3;
  public double[] datos4;
  public String optiongraph = "Current vs Voltage;Energy vs Frequency;Current vs Intensity";
  public String graph = "Current vs Voltage";
  public boolean showPlot_I_V = true;
  public boolean showPlot_Ek_F = false;
  public boolean showPlot_I_i = false;
  




  private boolean _isEnabled_initialization1 = true;
  private boolean _isEnabled_initialization2 = true;
  private boolean _isEnabled_evolution1 = true;
  private boolean _isEnabled_constraints1 = true;
  private boolean _isEnabled_constraints2 = true;
  private boolean _isEnabled_constraints3 = true;
  private boolean _isEnabled_constraints4 = true;
  private boolean _isEnabled_constraints5 = true;
  
  public void _setPageEnabled(String paramString, boolean paramBoolean) {
    int i = 0;
    if ("Inicio".equals(paramString)) { i = 1;_isEnabled_initialization1 = paramBoolean; }
    if ("Espectro".equals(paramString)) { i = 1;_isEnabled_initialization2 = paramBoolean; }
    if ("Evolucion".equals(paramString)) { i = 1;_isEnabled_evolution1 = paramBoolean; }
    if ("Espectro de luz".equals(paramString)) { i = 1;_isEnabled_constraints1 = paramBoolean; }
    if ("Intensidad fotones".equals(paramString)) { i = 1;_isEnabled_constraints2 = paramBoolean; }
    if ("Voltios".equals(paramString)) { i = 1;_isEnabled_constraints3 = paramBoolean; }
    if ("Amperimetro".equals(paramString)) { i = 1;_isEnabled_constraints4 = paramBoolean; }
    if ("Tabla".equals(paramString)) { i = 1;_isEnabled_constraints5 = paramBoolean; }
    if (i == 0) { System.out.println("_setPageEnabled() warning. Page not found: " + paramString);
    }
  }
  




  public void _initialization1()
  {
    inicio();
  }
  
  public void _initialization2()
  {
    band[0] = 275.0D;band[1] = 435.0D;band[2] = 500.0D;
    band[3] = 520.0D;band[4] = 565.0D;band[5] = 590.0D;
    band[6] = 625.0D;band[7] = 700.0D;band[8] = 840.0D;
    band[9] = 1000.0D;
    for (int i = 0; i < 256; i++) {
      cred = 0.0D;
      cgreen = 0.0D;
      cblue = 0.0D;
      csaturation = 1.0D;
      bandselec = 10;
      lambda = (230.0D + (255 - i) * 670.0D / 255.0D);
      
      for (int j = 0; j < 10; j++)
      {
        if (lambda <= band[j])
        {
          bandselec = j;
          break;
        }
      }
      switch (bandselec)
      {
      case 0: 
        cred = 0.0D;
        cgreen = 0.0D;
        cblue = 0.0D;
        csaturation = 0.0D;
        break;
      
      case 1: 
        cred = ((440.0D - lambda) / 165.0D);
        cgreen = 0.0D;
        cblue = 1.0D;
        csaturation = (0.4D + (lambda - 275.0D) * 0.5D / 160.0D);
        break;
      
      case 2: 
        cred = ((500.0D - lambda) / 225.0D);
        
        cgreen = 0.0D;
        cblue = 1.0D;
        break;
      
      case 3: 
        cred = 0.0D;
        cgreen = ((lambda - 500.0D) / 20.0D);
        cblue = 1.0D;
        break;
      
      case 4: 
        cred = 0.0D;
        cgreen = 1.0D;
        cblue = ((565.0D - lambda) / 45.0D);
        break;
      
      case 5: 
        cred = ((lambda - 565.0D) / 25.0D);
        cgreen = 1.0D;
        cblue = 0.0D;
        break;
      
      case 6: 
        cred = 1.0D;
        cgreen = ((625.0D - lambda) / 35.0D);
        cblue = 0.0D;
        break;
      
      case 7: 
        cred = 0.9D;
        cgreen = 0.2D;
        cblue = 0.0D;
        
        break;
      
      case 8: 
        cred = 1.0D;
        cgreen = 0.0D;
        cblue = 0.0D;
        csaturation = (0.4D + (840.0D - lambda) * 0.5D / 140.0D);
        break;
      
      case 9: 
        cred = 0.0D;
        cgreen = 0.0D;
        cblue = 0.0D;
        csaturation = 0.0D;
      }
      
      
      csaturation *= fgamma;
      cred *= csaturation;
      cgreen *= csaturation;
      cblue *= csaturation;
      colores[i] = new java.awt.Color((float)cred, (float)cgreen, (float)cblue);
    }
    lightcolor = colores[indicecolor];
  }
  

  public void _evolution1()
  {
    if (potencialcorte > 0.0D)
    {
      for (int i = 1; i <= indicef; i++) {
        movf(i);
        if (xf[i] < xelement)
        {
          yf[i] = ((ylinterna + hylinterna * Math.random()) * 0.6D);
          xf[i] = ((xlinterna + hxlinterna * Math.random()) * 0.6D);
          vf[i] = 0.0D;
          

          nf += 1;
          movfe(i);
        }
      }
      

      controltime();
      
      for (i = 1; i <= nf; i++)
      {
        movfe2(i);
      }
      


      totaltime += dt;
    }
  }
  


  public void _constraints1()
  {
    sliderfrecy = 0.833D;
    if (sliderfrecx < -0.933D) sliderfrecx = -0.933D;
    if (sliderfrecx > -0.065D) sliderfrecx = -0.065D;
    indicecolor = ((int)(255.0D * (0.933D + sliderfrecx) / 0.8680000000000001D));
    
    lightcolor = colores[indicecolor];
    lambda = (230.0D + (255 - indicecolor) * 670.0D / 255.0D);
    frecuencia = ((int)(3.0D * Math.pow(10.0D, 5.0D) / lambda));
    

    frecuenciareal = (frecuencia * Math.pow(10.0D, 12.0D));
    if ((4.136D * Math.pow(10.0D, -15.0D) * frecuenciareal > potencialcorte) && (I > 0.0D)) {
      Ek = (4.136D * Math.pow(10.0D, -15.0D) * frecuenciareal - potencialcorte);
      V0 = (Ek / (1.6D * Math.pow(10.0D, -19.0D)));
      Ek = (Math.round(Ek * 100.0D) / 100.0D);
    } else {
      Ek = 0.0D;
      V0 = 0.0D;
    }
    
    frecd1 = ((int)(frecuencia / 100.0D));
    frecdig1 = digito(frecd1);
    frecd2 = ((int)(frecuencia / 10.0D) - 10 * frecd1);
    frecdig2 = digito(frecd2);
    frecd3 = (frecuencia - 100 * frecd1 - 10 * frecd2);
    frecdig3 = digito(frecd3);
    if (frecuencia < 1000) {
      e14 = true;
      e15 = false;
      
      frecd1 = ((int)(frecuencia / 100.0D));
      frecdig1 = digito(frecd1);
      frecd2 = ((int)(frecuencia / 10.0D) - 10 * frecd1);
      frecdig2 = digito(frecd2);
      frecd3 = (frecuencia - 100 * frecd1 - 10 * frecd2);
      frecdig3 = digito(frecd3);
    } else {
      e14 = false;
      e15 = true;
      
      frecd1 = ((int)(frecuencia / 1000.0D));
      frecdig1 = digito(frecd1);
      frecd2 = ((int)(frecuencia / 100.0D) - 10 * frecd1);
      frecdig2 = digito(frecd2);
      frecd3 = ((int)((frecuencia - 1000 * frecd1 - 100.0D * frecd2) / 10.0D));
      frecdig3 = digito(frecd3);
    }
  }
  
  public void _constraints2()
  {
    slideriy = 0.438D;
    if (sliderix < 0.516D) sliderix = 0.516D;
    if (sliderix > 0.944D) sliderix = 0.944D;
    indicef = ((int)(50.5D * (sliderix - 0.516D) / 0.42799999999999994D));
    indicefinal = (indicef * 2);
  }
  
  public void _constraints3()
  {
    slidervy = -0.78D;
    vd1 = ((int)Math.abs(V));
    vdig1 = digito(vd1);
    vd2 = ((int)(Math.abs(V) * 10.0D) - 10 * vd1);
    vdig2 = digito(vd2);
    vd3 = ((int)(Math.abs(V) * 100.0D) - 100 * vd1 - 10 * vd2);
    vdig3 = digito(vd3);
    if (V < 0.0D) {
      menos = true;
    } else {
      menos = false;
    }
  }
  
  public void _constraints4()
  {
    currentd1 = ((int)Math.abs(I * 0.01D));
    currentdig1 = digito(currentd1);
    currentd2 = ((int)(Math.abs(I * 0.1D) - 10 * currentd1));
    currentdig2 = digito(currentd2);
    currentd3 = ((int)(Math.abs(I) - 100 * currentd1 - 10 * currentd2));
    currentdig3 = digito(currentd3);
    currentd4 = ((int)(Math.abs(I * 10.0D) - 1000 * currentd1 - 100 * currentd2 - 10 * currentd3));
    currentdig4 = digito(currentd4);
  }
  
  public void _constraints5() {
    if (medir == true)
    {
      if (datos1[0] == 0.0D) {
        _view.dataTable_IV_1.clearData();
        _view.trace_IV_1.clear();
        _view.dataTable_EkF_1.clearData();
        _view.trace_EkF_1.clear();
        _view.dataTable_Ii_1.clearData();
        _view.trace_Ii_1.clear();
      }
      
      if (datos2[0] == 0.0D)
      {
        _view.dataTable_IV_2.clearData();
        _view.trace_IV_2.clear();
        _view.dataTable_EkF_2.clearData();
        _view.trace_EkF_2.clear();
        _view.dataTable_Ii_2.clearData();
        _view.trace_Ii_2.clear();
      }
      
      if (datos3[0] == 0.0D)
      {
        _view.dataTable_IV_3.clearData();
        _view.trace_IV_3.clear();
        _view.dataTable_EkF_3.clearData();
        _view.trace_EkF_3.clear();
        _view.dataTable_Ii_3.clearData();
        _view.trace_Ii_3.clear();
      }
      
      if (datos4[0] == 0.0D)
      {
        _view.dataTable_IV_4.clearData();
        _view.trace_IV_4.clear();
        _view.dataTable_EkF_4.clearData();
        _view.trace_EkF_4.clear();
        _view.dataTable_Ii_4.clearData();
        _view.trace_Ii_4.clear();
      }
      


      if (medida1) {
        tablavisible = medida1;
        datos1[0] = frecuenciareal;
        datos1[1] = indicefinal;
        datos1[2] = V;
        datos1[3] = (I / 10.0D);
        datos1[4] = lambda;
        datos1[5] = Ek;


      }
      else if (medida2) {
        tablavisible = medida2;
        datos2[0] = frecuenciareal;
        datos2[1] = indicefinal;
        datos2[2] = V;
        datos2[3] = (I / 10.0D);
        datos2[4] = lambda;
        datos2[5] = Ek;
      }
      else if (medida3) {
        tablavisible = medida3;
        datos3[0] = frecuenciareal;
        datos3[1] = indicefinal;
        datos3[2] = V;
        datos3[3] = (I / 10.0D);
        datos3[4] = lambda;
        datos3[5] = Ek;

      }
      else if (medida4) {
        tablavisible = medida4;
        datos4[0] = frecuenciareal;
        datos4[1] = indicefinal;
        datos4[2] = V;
        datos4[3] = (I / 10.0D);
        datos4[4] = lambda;
        datos4[5] = Ek;
      }
      
    }
    else
    {
      medir = false;
    }
  }
  



  public void inicio()
  {
    for (int i = 1; i < n; i++)
    {
      yf[i] = ((ylinterna + hylinterna * Math.random()) * 0.6D);
      xf[i] = ((xlinterna + hxlinterna * Math.random()) * 0.6D);
      vf[i] = 0.0D;
    }
    
    for (i = 1; i < n; i++) {
      x[i] = xelement;
      v[i] = 0.0D;
      y[i] = 2.0D;
    }
    medir = false;
    ne2 = 0;
    ne1 = 0;
    ne = 0;
    nf = 0;
    t = 0.0D;
    amperios = 0.0D;
    I = 0.0D;
    
    corriente = 0;
    med = 0.0D;
  }
  
  public void movf(int paramInt)
  {
    if ((x[indicef] <= xelement) && (ne1 == 0) && (ne2 == 0) && (ne != indicef)) {
      vf[paramInt] = -0.7D;
      xf[paramInt] += vf[paramInt] * dt;
      yf[paramInt] += vf[paramInt] * dt;
    }
    else {
      yf[paramInt] = ((ylinterna + hylinterna * Math.random()) * 0.6D);
      xf[paramInt] = ((xlinterna + hxlinterna * Math.random()) * 0.6D);
      vf[paramInt] = 0.0D;
    }
  }
  



  public void movfe(int paramInt)
  {
    if (0.004136D * frecuencia > potencialcorte)
    {


      v[paramInt] = Math.sqrt((Math.random() + 0.1D) * 2.0D * (0.004136D * frecuencia - potencialcorte));
      y[paramInt] = (yelement + helement * Math.random());
      x[paramInt] = xelement;

    }
    else
    {
      v[paramInt] = 0.0D;
      y[paramInt] = 2.0D;
      x[paramInt] = xelement;
      nf = 0;
    }
  }
  
  public void movfe2(int paramInt) { if (0.004136D * frecuencia > potencialcorte)
    {
      aceleracion = (V * 2.0D / (xdetector - xelement));
      x[paramInt] += v[paramInt] * dt + 0.5D * aceleracion * dt * dt;
      v[paramInt] += aceleracion * dt;
      
      if ((x[paramInt] > xdetector) && (y[paramInt] < 1.5D)) {
        corriente += 1;
        ne += 1;
        ne1 += 1;
        x[paramInt] = xelement;
        v[paramInt] = 0.0D;
        y[paramInt] = 2.0D;

      }
      else if ((x[paramInt] < xelement) && (y[paramInt] < 1.5D))
      {
        ne += 1;
        ne2 += 1;
        x[paramInt] = xelement;
        v[paramInt] = 0.0D;
        y[paramInt] = 2.0D;
      }
      

    }
    else
    {
      v[paramInt] = 0.0D;
      y[paramInt] = 2.0D;
      x[paramInt] = xelement;
      nf = 0;
    }
    


    if (ne == indicef)
    {
      nf = 0;
      ne = 0;
      ne1 = 0;
      ne2 = 0;
      
      x[indicef] = xelement;
      v[paramInt] = 0.0D;
      y[paramInt] = 2.0D;
      t = 0.0D;
    }
  }
  


  public void controltime()
  {
    I1 = (indicef / 2.2D);
    







    if (t > tpaso) {
      amperios = (corriente / tpaso);
      
      corriente = 0;
      t = 0.0D;
      
      I2 = ((med * I2 + amperios) / (med + 1.0D));
      med += 1.0D;
      
      if (I2 < I1) {
        I = I2;
      }
      else
      {
        I = I1;
      }
    }
    
    if ((corriente > 0) || (ne1 > 0))
    {
      t += dt;
    }
    


    totaltime += dt;
  }
  

  public String digito(int paramInt)
  {
    switch (paramInt) {
    case 0: 
      return "img/0.gif";
    
    case 1: 
      return "img/1.gif";
    
    case 2: 
      return "img/2.gif";
    
    case 3: 
      return "img/3.gif";
    
    case 4: 
      return "img/4.gif";
    
    case 5: 
      return "img/5.gif";
    
    case 6: 
      return "img/6.gif";
    
    case 7: 
      return "img/7.gif";
    
    case 8: 
      return "img/8.gif";
    }
    
    return "img/9.gif";
  }
  

  public void felemento()
  {
    if (elm.startsWith("Sodium (Na)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Na.gif";
      potencialcorte = 2.28D;
      mat = "Na";
      if (medida1) {
        mat1 = "Na";
      } else if (medida2) {
        mat2 = "Na";
      } else if (medida3) {
        mat3 = "Na";
      } else if (medida4) {
        mat4 = "Na";
      }
    }
    else if (elm.startsWith("Cesium (Cs)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Cs.gif";
      potencialcorte = 2.1D;
      mat = "Cs";
      if (medida1) {
        mat1 = "Cs";
      } else if (medida2) {
        mat2 = "Cs";
      } else if (medida3) {
        mat3 = "Cs";
      } else if (medida4) {
        mat4 = "Cs";
      }
    }
    else if (elm.startsWith("Gold (Au)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Au.gif";
      potencialcorte = 5.1D;
      mat = "Au";
      if (medida1) {
        mat1 = "Au";
      } else if (medida2) {
        mat2 = "Au";
      } else if (medida3) {
        mat3 = "Au";
      } else if (medida4) {
        mat4 = "Au";
      }
    }
    else if (elm.startsWith("Aluminium (Al)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Al.gif";
      potencialcorte = 4.08D;
      mat = "Al";
      if (medida1) {
        mat1 = "Al";
      } else if (medida2) {
        mat2 = "Al";
      } else if (medida3) {
        mat3 = "Al";
      } else if (medida4) {
        mat4 = "Al";
      }
    }
    else if (elm.startsWith("Magnesium (Mg)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Mg.gif";
      potencialcorte = 3.68D;
      mat = "Mg";
      if (medida1) {
        mat1 = "Mg";
      } else if (medida2) {
        mat2 = "Mg";
      } else if (medida3) {
        mat3 = "Mg";
      } else if (medida4) {
        mat4 = "Mg";
      }
    }
    else if (elm.startsWith("Cooper (Cu)")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/Cu.gif";
      potencialcorte = 4.18D;
      mat = "Cu";
      if (medida1) {
        mat1 = "Cu";
      } else if (medida2) {
        mat2 = "Cu";
      } else if (medida3) {
        mat3 = "Cu";
      } else if (medida4) {
        mat4 = "Cu";
      }
    }
    else if (elm.startsWith("1-????")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/incog1.gif";
      potencialcorte = 2.71D;
      mat = "1-?";
      if (medida1) {
        mat1 = "1-?";
      } else if (medida2) {
        mat2 = "1-?";
      } else if (medida3) {
        mat3 = "1-?";
      } else if (medida4) {
        mat4 = "1-?";
      }
    }
    else if (elm.startsWith("2-????")) {
      inicio();
      _play();
      
      elementoview = true;
      element = "img/incog2.gif";
      potencialcorte = 4.33D;
      mat = "2-?";
      if (medida1) {
        mat1 = "2-?";
      } else if (medida2) {
        mat2 = "2-?";
      } else if (medida3) {
        mat3 = "2-?";
      } else if (medida4) {
        mat4 = "2-?";
      }
    }
    else if (elm.startsWith("       ---- Select Element ----")) {
      inicio();
      _play();
      potencialcorte = 0.0D;
      mat1 = null;
      mat2 = null;
      mat3 = null;
      mat4 = null;
      elementoview = false;
    }
  }
  

  public void clearGraphTable()
  {
    int i;
    
    if (medida1)
    {
      _view.trace_IV_1.clear();
      _view.dataTable_IV_1.clear();
      _view.trace_EkF_1.clear();
      _view.dataTable_EkF_1.clear();
      _view.dataTable_Ii_1.clear();
      _view.trace_Ii_1.clear();
      
      for (i = 0; i < 6; i++) {
        datos1[i] = 0.0D;
      }
    }
    else if (medida2)
    {
      _view.trace_IV_2.clear();
      _view.dataTable_IV_2.clear();
      _view.trace_EkF_2.clear();
      _view.dataTable_EkF_2.clear();
      _view.dataTable_Ii_2.clear();
      _view.trace_Ii_2.clear();
      
      for (i = 0; i < 6; i++) {
        datos2[i] = 0.0D;
      }
    }
    else if (medida3)
    {
      _view.trace_IV_3.clear();
      _view.dataTable_IV_3.clear();
      _view.trace_EkF_3.clear();
      _view.dataTable_EkF_3.clear();
      _view.dataTable_Ii_3.clear();
      _view.trace_Ii_3.clear();
      
      for (i = 0; i < 6; i++) {
        datos3[i] = 0.0D;
      }
    }
    else if (medida4)
    {
      _view.trace_IV_4.clear();
      _view.dataTable_IV_4.clear();
      _view.trace_EkF_4.clear();
      _view.dataTable_EkF_4.clear();
      _view.dataTable_Ii_4.clear();
      _view.trace_Ii_4.clear();
      
      for (i = 0; i < 6; i++) {
        datos4[i] = 0.0D;
      }
    }
  }
  
  public void fGraphTable()
  {
    clearAllGraphTable();
    if (graph.startsWith("Current vs Voltage")) {
      showPlot_I_V = true;
      showPlot_Ek_F = false;
      showPlot_I_i = false;
    }
    else if (graph.startsWith("Energy vs Frequency")) {
      showPlot_I_V = false;
      showPlot_Ek_F = true;
      showPlot_I_i = false;
    }
    else if (graph.startsWith("Current vs Intensity")) {
      showPlot_I_V = false;
      showPlot_Ek_F = false;
      showPlot_I_i = true;
    }
  }
  

  public void clearAllGraphTable()
  {
    _view.clearData();
    _view.resetTraces();
    for (int i = 0; i < 6; i++) {
      datos1[i] = 0.0D;
      datos2[i] = 0.0D;
      datos3[i] = 0.0D;
      datos4[i] = 0.0D;
    }
  }
  



  public void dataToolIV()
  {
    if (datos1[1] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_IV_1 });
    }
    if (datos2[1] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_IV_2 });
    }
    if (datos3[1] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_IV_3 });
    }
    if (datos4[1] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_IV_4 });
    }
  }
  
  public void dataToolEkF() {
    if (datos1[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_EkF_1 });
    }
    if (datos2[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_EkF_2 });
    }
    if (datos3[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_EkF_3 });
    }
    if (datos4[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_EkF_4 });
    }
  }
  
  public void dataToolIi() {
    if (datos1[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_Ii_1 });
    }
    if (datos2[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_Ii_2 });
    }
    if (datos3[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_Ii_3 });
    }
    if (datos4[0] > 0.0D) {
      _tools.showDataTool(new Data[] { _view.trace_Ii_4 });
    }
  }
  




  public void _method_for_BackgroundLab_pressaction() { _pause(); }
  
  public void _method_for_BackgroundLab_action() {
    inicio();
    _play();
  }
  
  public int _method_for_Photons_loops() { return frecuencia / 100; }
  


  public void _method_for_sliderSpectrum_pressaction() { _pause(); }
  
  public void _method_for_sliderSpectrum_action() {
    inicio();
    _play();
  }
  
  public double _method_for_nm_rectangulo_x() { return sliderfrecx + 0.04D; }
  
  public double _method_for_nm_rectangulo_y()
  {
    return sliderfrecy + 0.09D;
  }
  
  public double _method_for_nm_x() {
    return sliderfrecx + 0.04D;
  }
  
  public double _method_for_nm_y() {
    return sliderfrecy + 0.09D;
  }
  
  public String _method_for_nm_text() {
    return _format(lambda, "0") + " nm";
  }
  
  public void _method_for_measure_pressaction() {
    _pause();
    medir = true;
  }
  
  public void _method_for_measure_action() { medir = false;
    _play();
  }
  
  public void _method_for_sliderVolt_pressaction() { _pause(); }
  
  public void _method_for_sliderVolt_dragaction() {
    V = ((slidervx + 0.384D) * 2.0D / 0.318D);
    

    if (slidervx > -0.066D) {
      slidervx = -0.066D;
      V = 2.0D;
    }
    if ((0.99D < V) && (V < 1.01D)) {
      slidervx = -0.23D;
      V = 1.0D;
    }
    if (Math.abs(V) < 0.01D) {
      slidervx = -0.384D;
      V = 0.0D;
    }
    if ((-0.99D > V) && (V > -1.01D)) {
      slidervx = -0.545D;
      V = -1.0D;
    }
    if (slidervx < -0.7D) {
      slidervx = -0.7D;
      V = -2.0D;
    }
  }
  
  public void _method_for_sliderVolt_action() { inicio();
    _play();
  }
  
  public void _method_for_image_pressAction() { _pause(); }
  
  public void _method_for_image_releaseAction() {
    _initialize();
    _play();
  }
  
  public void _method_for_sliderIntensityLight_pressaction() { _pause(); }
  
  public void _method_for_sliderIntensityLight_action() {
    inicio();
    _play();
  }
  
  public double _method_for_porcentaje_rectangulo2_y() { return slideriy + 0.072D; }
  
  public double _method_for_porcentaje_y()
  {
    return slideriy + 0.07D;
  }
  
  public String _method_for_porcentaje_text() {
    return _format(indicef * 2, "0") + "%";
  }
  
  public void _method_for_Stop_action() {
    _reset();
    _pause();
    elm = "       ---- Select Element ----";
  }
  
  public void _method_for_reload_action() { inicio();
    medir = false;
  }
  
  public void _method_for_play_action() { _play();
    medir = false;
  }
  
  public void _method_for_Pause_action() { _pause();
    medir = false;
  }
  
  public void _method_for_comboBox_Elementos_action() { felemento(); }
  
  public void _method_for_comboBox_Graph_Tables_action() {
    fGraphTable();
  }
  
  public double _method_for_trace_IV_1_x() { return datos1[2]; }
  
  public double _method_for_trace_IV_1_y()
  {
    return datos1[3];
  }
  
  public String _method_for_trace_IV_1_menuName() {
    return "Data1: " + mat + _format(datos1[1], " 0") + "% " + _format(datos1[4], " 0") + "nm";
  }
  
  public void _method_for_trace_IV_1_pressaction() {
    _view.trace_IV_1.removeAllListeners();
    _view.resetTraces();
    _view.clearData();
    _view.resetElements();
  }
  
  public String _method_for_cartelintensidad_IV_i_1_text() { return _format(datos1[1], "   0") + "%"; }
  
  public String _method_for_cartelintensidad_IV_nm_1_text()
  {
    return _format(datos1[4], "   0") + "nm";
  }
  
  public double _method_for_trace_IV_2_x() {
    return datos2[2];
  }
  
  public double _method_for_trace_IV_2_y() {
    return datos2[3];
  }
  
  public String _method_for_trace_IV_2_menuName() {
    return "Data2: " + mat + _format(datos2[1], " 0") + "% " + _format(datos2[4], " 0") + "nm";
  }
  
  public String _method_for_cartelintensidad_IV_i_2_text() {
    return _format(datos2[1], "   0") + "%";
  }
  
  public String _method_for_cartelintensidad_IV_nm_2_text() {
    return _format(datos2[4], "   0") + "nm";
  }
  
  public double _method_for_trace_IV_3_x() {
    return datos3[2];
  }
  
  public double _method_for_trace_IV_3_y() {
    return datos3[3];
  }
  
  public String _method_for_trace_IV_3_menuName() {
    return "Data3: " + mat + _format(datos3[1], " 0") + "% " + _format(datos3[4], " 0") + "nm";
  }
  
  public String _method_for_cartelintensidad_IV_i_3_text() {
    return _format(datos3[1], "   0") + "%";
  }
  
  public String _method_for_cartelintensidad_IV_nm_3_text() {
    return _format(datos3[4], "   0") + "nm";
  }
  
  public double _method_for_trace_IV_4_x() {
    return datos4[2];
  }
  
  public double _method_for_trace_IV_4_y() {
    return datos4[3];
  }
  
  public String _method_for_trace_IV_4_menuName() {
    return "Data4: " + mat + _format(datos4[1], " 0") + "% " + _format(datos4[4], " 0") + "nm";
  }
  
  public String _method_for_cartelintensidad_IV_i_4_text() {
    return _format(datos4[1], "   0") + "%";
  }
  
  public String _method_for_cartelintensidad_IV_nm_4_text() {
    return _format(datos4[4], "   0") + "nm";
  }
  
  public double _method_for_puntero_IV_y() {
    return I / 10.0D;
  }
  
  public double _method_for_etiqueta_IV_x() {
    return V - 0.15D;
  }
  
  public double _method_for_etiqueta_IV_y() {
    return I / 10.0D + 0.1D;
  }
  
  public String _method_for_etiqueta_IV_text() {
    return _format(I / 10.0D, "0.00") + " mA";
  }
  

  public void _method_for_med1_IV_action() { medida1 = true; }
  
  public void _method_for_med1_IV_actionon() {
    medida2 = false;
    medida3 = false;
    medida4 = false;
  }
  
  public void _method_for_med2_IV_action() { medida2 = true; }
  
  public void _method_for_med2_IV_actionon() {
    medida1 = false;
    medida3 = false;
    medida4 = false;
  }
  
  public void _method_for_med3_IV_action() { medida3 = true; }
  
  public void _method_for_med3_IV_actionon() {
    medida1 = false;
    medida2 = false;
    medida4 = false;
  }
  
  public void _method_for_med4_IV_action() { medida4 = true; }
  
  public void _method_for_med4_IV_actionon() {
    medida1 = false;
    medida2 = false;
    medida3 = false;
  }
  
  public double[] _method_for_dataTable_IV_1_input() { return new double[] { datos1[3], datos1[2] }; }
  
  public String[] _method_for_dataTable_IV_1_columnNames()
  {
    return new String[] { _format(datos1[4], "0") + "nm " + _format(datos1[1], " 0") + "% ", "Current (mA)", "Voltage (V)" };
  }
  
  public double[] _method_for_dataTable_IV_2_input() {
    return new double[] { datos2[3], datos2[2] };
  }
  
  public String[] _method_for_dataTable_IV_2_columnNames() {
    return new String[] { _format(datos2[4], "0") + "nm " + _format(datos2[1], " 0") + "% ", "Current (mA)", "Voltage (V)" };
  }
  
  public double[] _method_for_dataTable_IV_3_input() {
    return new double[] { datos3[3], datos3[2] };
  }
  
  public String[] _method_for_dataTable_IV_3_columnNames() {
    return new String[] { _format(datos3[4], "0") + "nm " + _format(datos3[1], " 0") + "% ", "Current (mA)", "Voltage (V)" };
  }
  
  public double[] _method_for_dataTable_IV_4_input() {
    return new double[] { datos4[3], datos4[2] };
  }
  
  public String[] _method_for_dataTable_IV_4_columnNames() {
    return new String[] { _format(datos4[4], "0") + "nm " + _format(datos4[1], " 0") + "% ", "Current (mA)", "Voltage (V)" };
  }
  
  public double _method_for_Ek_F3_minimumX() {
    return Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_Ek_F3_maximumX() {
    return 15.0D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_trace_EkF_1_x() {
    return datos1[0];
  }
  
  public double _method_for_trace_EkF_1_y() {
    return datos1[5];
  }
  
  public String _method_for_trace_EkF_1_menuName() {
    return "Data1: " + mat1 + _format(datos1[1], " 0") + "% ";
  }
  
  public double _method_for_cartelEk_EkF_1_x() {
    return 2.0D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_trace_EkF_2_x() {
    return datos2[0];
  }
  
  public double _method_for_trace_EkF_2_y() {
    return datos2[5];
  }
  
  public String _method_for_trace_EkF_2_menuName() {
    return "Data2: " + mat2 + _format(datos2[1], " 0") + "% ";
  }
  
  public double _method_for_cartelEk_EkF_2_x() {
    return 2.0D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_trace_EkF_3_x() {
    return datos3[0];
  }
  
  public double _method_for_trace_EkF_3_y() {
    return datos3[5];
  }
  
  public String _method_for_trace_EkF_3_menuName() {
    return "Data3: " + mat3 + _format(datos3[1], " 0") + "% ";
  }
  
  public double _method_for_cartelEk_EkF_3_x() {
    return 2.0D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_trace_EkF_4_x() {
    return datos4[0];
  }
  
  public double _method_for_trace_EkF_4_y() {
    return datos4[5];
  }
  
  public String _method_for_trace_EkF_4_menuName() {
    return "Data4: " + mat4 + _format(datos4[1], " 0") + "% ";
  }
  
  public double _method_for_cartelEk_EkF_4_x() {
    return 2.0D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_etiqueta_EkF_x() {
    return frecuenciareal - 0.4D * Math.pow(10.0D, 14.0D);
  }
  
  public double _method_for_etiqueta_EkF_y() {
    return Ek + 0.2D;
  }
  
  public String _method_for_etiqueta_EkF_text() {
    return _format(Ek, "0.00") + " eV";
  }
  
  public String _method_for_med1_EkF_text() {
    return "1:" + mat1;
  }
  

  public void _method_for_med1_EkF_action() { medida1 = true; }
  
  public void _method_for_med1_EkF_actionon() {
    medida2 = false;
    medida3 = false;
    medida4 = false;
  }
  
  public String _method_for_med2_EkF_text() { return "2:" + mat2; }
  


  public void _method_for_med2_EkF_action() { medida2 = true; }
  
  public void _method_for_med2_EkF_actionon() {
    medida1 = false;
    medida3 = false;
    medida4 = false;
  }
  
  public String _method_for_med3_EkF_text() { return "3:" + mat3; }
  


  public void _method_for_med3_EkF_action() { medida3 = true; }
  
  public void _method_for_med3_EkF_actionon() {
    medida1 = false;
    medida2 = false;
    medida4 = false;
  }
  
  public String _method_for_med4_EkF_text() { return "4:" + mat4; }
  


  public void _method_for_med4_EkF_action() { medida4 = true; }
  
  public void _method_for_med4_EkF_actionon() {
    medida1 = false;
    medida2 = false;
    medida3 = false;
  }
  
  public double[] _method_for_dataTable_EkF_1_input() { return new double[] { datos1[0], datos1[5] }; }
  
  public String[] _method_for_dataTable_EkF_1_columnNames()
  {
    return new String[] { mat1, "Frequency (Hz)", "Ek (eV)" };
  }
  
  public double[] _method_for_dataTable_EkF_2_input() {
    return new double[] { datos2[0], datos2[5] };
  }
  
  public String[] _method_for_dataTable_EkF_2_columnNames() {
    return new String[] { mat2, "Frequency (Hz)", "Ek (eV)" };
  }
  
  public double[] _method_for_dataTable_EkF_3_input() {
    return new double[] { datos3[0], datos3[5] };
  }
  
  public String[] _method_for_dataTable_EkF_3_columnNames() {
    return new String[] { mat3, "Frequency (Hz)", "Ek (eV)" };
  }
  
  public double[] _method_for_dataTable_EkF_4_input() {
    return new double[] { datos4[0], datos4[5] };
  }
  
  public String[] _method_for_dataTable_EkF_4_columnNames() {
    return new String[] { mat4, "Frequency (Hz)", "Ek (eV)" };
  }
  
  public double _method_for_trace_Ii_1_x() {
    return datos1[1];
  }
  
  public double _method_for_trace_Ii_1_y() {
    return datos1[3];
  }
  
  public String _method_for_trace_Ii_1_menuName() {
    return "Data1: " + mat1 + _format(datos1[4], " 0") + "nm " + _format(datos1[2], "0.00") + "V";
  }
  
  public String _method_for_cartelintensidad_Ii_nm_1_text() {
    return _format(datos1[4], "0") + "nm";
  }
  
  public String _method_for_cartelintensidad_Ii_V_1_text() {
    return _format(datos1[2], "0.00") + "V";
  }
  
  public double _method_for_trace_Ii_2_x() {
    return datos2[1];
  }
  
  public double _method_for_trace_Ii_2_y() {
    return datos2[3];
  }
  
  public String _method_for_trace_Ii_2_menuName() {
    return "Data2: " + mat2 + _format(datos2[4], " 0") + "nm " + _format(datos2[2], "0.00") + "V";
  }
  
  public String _method_for_cartelintensidad_Ii_nm_2_text() {
    return _format(datos2[4], "0") + "nm";
  }
  
  public String _method_for_cartelintensidad_Ii_V_2_text() {
    return _format(datos2[2], "0.00") + "V";
  }
  
  public double _method_for_trace_Ii_3_x() {
    return datos3[1];
  }
  
  public double _method_for_trace_Ii_3_y() {
    return datos3[3];
  }
  
  public String _method_for_trace_Ii_3_menuName() {
    return "Data3: " + mat3 + _format(datos3[4], " 0") + "nm " + _format(datos3[2], "0.00") + "V";
  }
  
  public String _method_for_cartelintensidad_Ii_nm_3_text() {
    return _format(datos3[4], "0") + "nm";
  }
  
  public String _method_for_cartelintensidad_Ii_V_3_text() {
    return _format(datos3[2], "0.00") + "V";
  }
  
  public double _method_for_trace_Ii_4_x() {
    return datos4[1];
  }
  
  public double _method_for_trace_Ii_4_y() {
    return datos4[3];
  }
  
  public String _method_for_trace_Ii_4_menuName() {
    return "Data4: " + mat4 + _format(datos4[4], " 0") + "nm " + _format(datos4[2], "0.00") + "V";
  }
  
  public String _method_for_cartelintensidad_Ii_nm_4_text() {
    return _format(datos4[4], "0") + "nm";
  }
  
  public String _method_for_cartelintensidad_Ii_V_4_text() {
    return _format(datos4[2], "0.00") + "V";
  }
  
  public double _method_for_puntero_Ii_y() {
    return I / 10.0D;
  }
  
  public double _method_for_etiqueta_Ii_y() {
    return I / 10.0D + 0.1D;
  }
  
  public String _method_for_etiqueta_Ii_text() {
    return _format(I / 10.0D, "0.00") + " mA";
  }
  

  public void _method_for_med1_Ii_action() { medida1 = true; }
  
  public void _method_for_med1_Ii_actionon() {
    medida2 = false;
    medida3 = false;
    medida4 = false;
  }
  
  public void _method_for_med2_Ii_action() { medida2 = true; }
  
  public void _method_for_med2_Ii_actionon() {
    medida1 = false;
    medida3 = false;
    medida4 = false;
    mat2 = elm;
  }
  
  public void _method_for_med3_Ii_action() { medida3 = true; }
  
  public void _method_for_med3_Ii_actionon() {
    medida1 = false;
    medida2 = false;
    medida4 = false;
  }
  
  public void _method_for_med4_Ii_action() { medida4 = true; }
  
  public void _method_for_med4_Ii_actionon() {
    medida1 = false;
    medida2 = false;
    medida3 = false;
  }
  
  public double[] _method_for_dataTable_Ii_1_input() { return new double[] { datos1[3], datos1[1] }; }
  
  public String[] _method_for_dataTable_Ii_1_columnNames()
  {
    return new String[] { _format(datos1[4], "0") + "nm, " + _format(datos1[2], " 0.00") + "V", "Current (mA)", "Intensity Light (%)" };
  }
  
  public double[] _method_for_dataTable_Ii_2_input() {
    return new double[] { datos2[3], datos2[1] };
  }
  
  public String[] _method_for_dataTable_Ii_2_columnNames() {
    return new String[] { _format(datos2[4], "0") + "nm, " + _format(datos2[2], " 0.00") + "V", "Current (mA)", "Intensity Light (%)" };
  }
  
  public double[] _method_for_dataTable_Ii_3_input() {
    return new double[] { datos3[3], datos3[1] };
  }
  
  public String[] _method_for_dataTable_Ii_3_columnNames() {
    return new String[] { _format(datos3[4], "0") + "nm, " + _format(datos3[2], " 0.00") + "V", "Current (mA)", "Intensity Light (%)" };
  }
  
  public double[] _method_for_dataTable_Ii_4_input() {
    return new double[] { datos4[3], datos4[1] };
  }
  
  public String[] _method_for_dataTable_Ii_4_columnNames() {
    return new String[] { _format(datos4[4], "0") + "nm, " + _format(datos4[2], " 0.00") + "V", "Current (mA)", "Intensity Light (%)" };
  }
  
  public void _method_for_borrarMedida_action() {
    clearGraphTable();
  }
  
  public void _method_for_borrarTodo_action() { clearAllGraphTable(); }
  

  public void _method_for_DataTool_action()
  {
    if (showPlot_I_V)
    {
      dataToolIV();
    } else if (showPlot_Ek_F)
    {
      dataToolEkF();
    } else if (showPlot_I_i)
    {
      dataToolIi(); }
  }
  
  public double _method_for_abajo_variable() {
    return x[indicef];
  }
  
  public void _initializeSolvers() {}
  
  public void _automaticResetSolvers() {}
  
  public void _resetSolvers() {}
  
  public void _readFromViewAfterUpdate() {}
}
