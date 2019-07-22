package efTFG.TFG_fe.PhotoelectricEffectLab_pkg;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.colos.ejs.library.control.ControlElement;
import org.colos.ejs.library.control.displayejs.ControlImage;
import org.colos.ejs.library.control.displayejs.ControlTrace;
import org.colos.ejs.library.control.drawing2d.ControlText2D;
import org.colos.ejs.library.control.swing.ControlButton;
import org.colos.ejs.library.control.swing.ControlDataTable;
import org.colos.ejs.library.control.swing.ControlPanel;
import org.colos.ejs.library.control.swing.ControlParsedNumberField;
import org.colos.ejs.library.control.swing.ControlRadioButton;
import org.colos.ejs.library.control.value.Value;
import org.opensourcephysics.display.DataPanel;
import org.opensourcephysics.displayejs.InteractiveImage;
import org.opensourcephysics.displayejs.InteractiveTrace;
import org.opensourcephysics.drawing2d.ElementShape;
import org.opensourcephysics.drawing2d.ElementText;

class PhotoelectricEffectLabView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View
{
  private PhotoelectricEffectLabSimulation _simulation = null;
  private PhotoelectricEffectLab _model = null;
  
  public java.awt.Component Ventana;
  
  public JPanel PanelLab;
  
  public org.opensourcephysics.drawing2d.DrawingPanel2D BackgroundLab;
  
  public InteractiveImage fondoLab;
  public org.opensourcephysics.displayejs.ElementSet Photoelectrons;
  public org.opensourcephysics.drawing2d.Set Photons;
  public InteractiveImage Elemento;
  public InteractiveImage sliderSpectrum;
  public ElementShape nm_rectangulo;
  public ElementText nm;
  public InteractiveImage e14;
  public InteractiveImage e15;
  public InteractiveImage frecDig1;
  public InteractiveImage frecDig2;
  public InteractiveImage frecDig3;
  public InteractiveImage vDig1;
  public InteractiveImage vDig2;
  public InteractiveImage vDig3;
  public InteractiveImage menos;
  public InteractiveImage measure;
  public InteractiveImage sliderVolt;
  public InteractiveImage currentDig1;
  public InteractiveImage currentDig2;
  public InteractiveImage currentDig3;
  public InteractiveImage currentDig4;
  public org.opensourcephysics.drawing2d.Group linterna;
  public org.opensourcephysics.drawing2d.Set salida;
  public org.opensourcephysics.drawing2d.ElementImage image;
  public InteractiveImage sliderIntensityLight;
  public ElementShape porcentaje_rectangulo2;
  public ElementText porcentaje;
  public JPanel buttons_panel;
  public JButton Stop;
  public JButton reload;
  public JButton play;
  public JButton Pause;
  public JPanel tools;
  public JPanel desplegables;
  public javax.swing.JComboBox comboBox_Elementos;
  public javax.swing.JComboBox comboBox_Graph_Tables;
  public JPanel I_V4;
  public JPanel graph_I_V;
  public org.opensourcephysics.drawing2d.PlottingPanel2D I_V;
  public InteractiveTrace trace_IV_1;
  public ElementText cartelintensidad_IV_i_1;
  public ElementText cartelintensidad_IV_nm_1;
  public InteractiveTrace trace_IV_2;
  public ElementText cartelintensidad_IV_i_2;
  public ElementText cartelintensidad_IV_nm_2;
  public InteractiveTrace trace_IV_3;
  public ElementText cartelintensidad_IV_i_3;
  public ElementText cartelintensidad_IV_nm_3;
  public InteractiveTrace trace_IV_4;
  public ElementText cartelintensidad_IV_i_4;
  public ElementText cartelintensidad_IV_nm_4;
  public org.opensourcephysics.displayejs.InteractivePoligon linea0_IV;
  public ElementShape puntero_IV;
  public ElementText etiqueta_IV;
  public JPanel medidanumero_IV;
  public javax.swing.JLabel data_IV;
  public JRadioButton med1_IV;
  public JRadioButton med2_IV;
  public JRadioButton med3_IV;
  public JRadioButton med4_IV;
  public JPanel tablas_IV;
  public DataPanel dataTable_IV_1;
  public DataPanel dataTable_IV_2;
  public DataPanel dataTable_IV_3;
  public DataPanel dataTable_IV_4;
  public JPanel Ek_F;
  public JPanel graph_Ek_F;
  public org.opensourcephysics.drawing2d.PlottingPanel2D Ek_F3;
  public InteractiveTrace trace_EkF_1;
  public ElementText cartelEk_EkF_1;
  public InteractiveTrace trace_EkF_2;
  public ElementText cartelEk_EkF_2;
  public InteractiveTrace trace_EkF_3;
  public ElementText cartelEk_EkF_3;
  public InteractiveTrace trace_EkF_4;
  public ElementText cartelEk_EkF_4;
  public org.opensourcephysics.displayejs.InteractivePoligon linea0_EkF;
  public ElementShape puntero_EkF;
  public ElementText etiqueta_EkF;
  public JPanel medidanumero_EkF;
  public javax.swing.JLabel data_EkF;
  public JRadioButton med1_EkF;
  public JRadioButton med2_EkF;
  public JRadioButton med3_EkF;
  public JRadioButton med4_EkF;
  public JPanel tablas_EkF;
  public DataPanel dataTable_EkF_1;
  public DataPanel dataTable_EkF_2;
  public DataPanel dataTable_EkF_3;
  public DataPanel dataTable_EkF_4;
  public JPanel I_i;
  public JPanel graph_I_i;
  public org.opensourcephysics.drawing2d.PlottingPanel2D I_i2;
  public InteractiveTrace trace_Ii_1;
  public ElementText cartelintensidad_Ii_nm_1;
  public ElementText cartelintensidad_Ii_V_1;
  public InteractiveTrace trace_Ii_2;
  public ElementText cartelintensidad_Ii_nm_2;
  public ElementText cartelintensidad_Ii_V_2;
  public InteractiveTrace trace_Ii_3;
  public ElementText cartelintensidad_Ii_nm_3;
  public ElementText cartelintensidad_Ii_V_3;
  public InteractiveTrace trace_Ii_4;
  public ElementText cartelintensidad_Ii_nm_4;
  public ElementText cartelintensidad_Ii_V_4;
  public org.opensourcephysics.displayejs.InteractivePoligon linea0_Ii;
  public ElementShape puntero_Ii;
  public ElementText etiqueta_Ii;
  public JPanel medidanumero_Ii;
  public javax.swing.JLabel data_Ii;
  public JRadioButton med1_Ii;
  public JRadioButton med2_Ii;
  public JRadioButton med3_Ii;
  public JRadioButton med4_Ii;
  public JPanel tablas_Ii;
  public DataPanel dataTable_Ii_1;
  public DataPanel dataTable_Ii_2;
  public DataPanel dataTable_Ii_3;
  public DataPanel dataTable_Ii_4;
  public JPanel tooldata;
  public JButton borrarMedida;
  public JButton borrarTodo;
  public JButton DataTool;
  public javax.swing.JDialog datosPrograma;
  public JPanel DatosProgram;
  public JPanel DatosSalida2;
  public JTextField I2;
  public JTextField Voltaje2;
  public JTextField i2;
  public JTextField FrecuenciaReal2;
  public JPanel OtrosDatos2;
  public JTextField nf2;
  public JTextField ne3;
  public JTextField ne12;
  public JTextField ne22;
  public JPanel temporales2;
  public JTextField intensity2;
  public JTextField amperes2;
  public JTextField t2;
  public JTextField nmed2;
  public JTextField I1;
  public JTextField I22;
  public JTextField abajo3;
  public JTextField abajo;
  public JPanel temporales222;
  public JTextField intensity222;
  public JTextField amperes222;
  public JTextField t222;
  public JTextField nmed222;
  public JTextField lambda22;
  public JTextField textField_Graph22;
  public JTextField textField_Graph23;
  public JTextField textField_Graph2;
  public JTextField textField_Graph32;
  public JTextField textField_Graph3;
  public JTextField textField_Graph;
  private boolean __n_canBeChanged__ = true;
  private boolean __nf_canBeChanged__ = true;
  private boolean __indicef_canBeChanged__ = true;
  private boolean __indicefinal_canBeChanged__ = true;
  private boolean __ne1_canBeChanged__ = true;
  private boolean __ne2_canBeChanged__ = true;
  private boolean __ne_canBeChanged__ = true;
  private boolean __t_canBeChanged__ = true;
  private boolean __dt_canBeChanged__ = true;
  private boolean __totaltime_canBeChanged__ = true;
  private boolean __corriente_canBeChanged__ = true;
  private boolean __amperios_canBeChanged__ = true;
  private boolean __amperios2_canBeChanged__ = true;
  private boolean __tpaso_canBeChanged__ = true;
  private boolean __med_canBeChanged__ = true;
  private boolean __lambda_canBeChanged__ = true;
  private boolean __x_canBeChanged__ = true;
  private boolean __y_canBeChanged__ = true;
  private boolean __v_canBeChanged__ = true;
  private boolean __yf_canBeChanged__ = true;
  private boolean __vf_canBeChanged__ = true;
  private boolean __xf_canBeChanged__ = true;
  private boolean __xlinterna_canBeChanged__ = true;
  private boolean __ylinterna_canBeChanged__ = true;
  private boolean __hxlinterna_canBeChanged__ = true;
  private boolean __hylinterna_canBeChanged__ = true;
  private boolean __sliderix_canBeChanged__ = true;
  private boolean __slideriy_canBeChanged__ = true;
  private boolean __aceleracion_canBeChanged__ = true;
  private boolean __frecuencia_canBeChanged__ = true;
  private boolean __frecuenciareal_canBeChanged__ = true;
  private boolean __frecdig1_canBeChanged__ = true;
  private boolean __frecdig2_canBeChanged__ = true;
  private boolean __frecdig3_canBeChanged__ = true;
  private boolean __frecd1_canBeChanged__ = true;
  private boolean __frecd2_canBeChanged__ = true;
  private boolean __frecd3_canBeChanged__ = true;
  private boolean __e14_canBeChanged__ = true;
  private boolean __e15_canBeChanged__ = true;
  private boolean __sliderfrecx_canBeChanged__ = true;
  private boolean __sliderfrecy_canBeChanged__ = true;
  private boolean __V_canBeChanged__ = true;
  private boolean __vdig1_canBeChanged__ = true;
  private boolean __vdig2_canBeChanged__ = true;
  private boolean __vdig3_canBeChanged__ = true;
  private boolean __vd1_canBeChanged__ = true;
  private boolean __vd2_canBeChanged__ = true;
  private boolean __vd3_canBeChanged__ = true;
  private boolean __menos_canBeChanged__ = true;
  private boolean __Ek_canBeChanged__ = true;
  private boolean __V0_canBeChanged__ = true;
  private boolean __slidervx_canBeChanged__ = true;
  private boolean __slidervy_canBeChanged__ = true;
  private boolean __currentdig1_canBeChanged__ = true;
  private boolean __currentdig2_canBeChanged__ = true;
  private boolean __currentdig3_canBeChanged__ = true;
  private boolean __currentdig4_canBeChanged__ = true;
  private boolean __currentd1_canBeChanged__ = true;
  private boolean __currentd2_canBeChanged__ = true;
  private boolean __currentd3_canBeChanged__ = true;
  private boolean __currentd4_canBeChanged__ = true;
  private boolean __I1_canBeChanged__ = true;
  private boolean __I2_canBeChanged__ = true;
  private boolean __I_canBeChanged__ = true;
  private boolean __cred_canBeChanged__ = true;
  private boolean __cgreen_canBeChanged__ = true;
  private boolean __cblue_canBeChanged__ = true;
  private boolean __csaturation_canBeChanged__ = true;
  private boolean __fgamma_canBeChanged__ = true;
  private boolean __colores_canBeChanged__ = true;
  private boolean __band_canBeChanged__ = true;
  private boolean __bandselec_canBeChanged__ = true;
  private boolean __lightcolor_canBeChanged__ = true;
  private boolean __indicecolor_canBeChanged__ = true;
  private boolean __element_canBeChanged__ = true;
  private boolean __elementoview_canBeChanged__ = true;
  private boolean __optionelement_canBeChanged__ = true;
  private boolean __elm_canBeChanged__ = true;
  private boolean __potencialcorte_canBeChanged__ = true;
  private boolean __xdetector_canBeChanged__ = true;
  private boolean __xelement_canBeChanged__ = true;
  private boolean __yelement_canBeChanged__ = true;
  private boolean __helement_canBeChanged__ = true;
  private boolean __mat_canBeChanged__ = true;
  private boolean __mat1_canBeChanged__ = true;
  private boolean __mat2_canBeChanged__ = true;
  private boolean __mat3_canBeChanged__ = true;
  private boolean __mat4_canBeChanged__ = true;
  private boolean __medir_canBeChanged__ = true;
  private boolean __medida1_canBeChanged__ = true;
  private boolean __medida2_canBeChanged__ = true;
  private boolean __medida3_canBeChanged__ = true;
  private boolean __medida4_canBeChanged__ = true;
  private boolean __tablavisible_canBeChanged__ = true;
  private boolean __datos1_canBeChanged__ = true;
  private boolean __datos2_canBeChanged__ = true;
  private boolean __datos3_canBeChanged__ = true;
  private boolean __datos4_canBeChanged__ = true;
  private boolean __optiongraph_canBeChanged__ = true;
  private boolean __graph_canBeChanged__ = true;
  private boolean __showPlot_I_V_canBeChanged__ = true;
  private boolean __showPlot_Ek_F_canBeChanged__ = true;
  private boolean __showPlot_I_i_canBeChanged__ = true;
  

  public PhotoelectricEffectLabView(PhotoelectricEffectLabSimulation paramPhotoelectricEffectLabSimulation, String paramString, java.awt.Frame paramFrame)
  {
    super(paramPhotoelectricEffectLabSimulation, paramString, paramFrame);
    _simulation = paramPhotoelectricEffectLabSimulation;
    _model = ((PhotoelectricEffectLab)paramPhotoelectricEffectLabSimulation.getModel());
    _model._view = this;
    addTarget("_simulation", _simulation);
    addTarget("_model", _model);
    _model._resetModel();
    initialize();
    setUpdateSimulation(false);
    try {
      setUserCodebase(new java.net.URL(System.getProperty("jnlp.codebase")));
    } catch (Exception localException) {}
    update();
    if (javax.swing.SwingUtilities.isEventDispatchThread()) createControl(); else
      try {
        javax.swing.SwingUtilities.invokeAndWait(new Runnable()
        {
          public void run() { PhotoelectricEffectLabView.this.createControl(); }
        });
      } catch (java.lang.reflect.InvocationTargetException localInvocationTargetException) {
        localInvocationTargetException.printStackTrace();
      } catch (InterruptedException localInterruptedException) { localInterruptedException.printStackTrace(); }
    addElementsMenuEntries();
    update();
    setUpdateSimulation(true);
    addListener("n");
    addListener("nf");
    addListener("indicef");
    addListener("indicefinal");
    addListener("ne1");
    addListener("ne2");
    addListener("ne");
    addListener("t");
    addListener("dt");
    addListener("totaltime");
    addListener("corriente");
    addListener("amperios");
    addListener("amperios2");
    addListener("tpaso");
    addListener("med");
    addListener("lambda");
    addListener("x");
    addListener("y");
    addListener("v");
    addListener("yf");
    addListener("vf");
    addListener("xf");
    addListener("xlinterna");
    addListener("ylinterna");
    addListener("hxlinterna");
    addListener("hylinterna");
    addListener("sliderix");
    addListener("slideriy");
    addListener("aceleracion");
    addListener("frecuencia");
    addListener("frecuenciareal");
    addListener("frecdig1");
    addListener("frecdig2");
    addListener("frecdig3");
    addListener("frecd1");
    addListener("frecd2");
    addListener("frecd3");
    addListener("e14");
    addListener("e15");
    addListener("sliderfrecx");
    addListener("sliderfrecy");
    addListener("V");
    addListener("vdig1");
    addListener("vdig2");
    addListener("vdig3");
    addListener("vd1");
    addListener("vd2");
    addListener("vd3");
    addListener("menos");
    addListener("Ek");
    addListener("V0");
    addListener("slidervx");
    addListener("slidervy");
    addListener("currentdig1");
    addListener("currentdig2");
    addListener("currentdig3");
    addListener("currentdig4");
    addListener("currentd1");
    addListener("currentd2");
    addListener("currentd3");
    addListener("currentd4");
    addListener("I1");
    addListener("I2");
    addListener("I");
    addListener("cred");
    addListener("cgreen");
    addListener("cblue");
    addListener("csaturation");
    addListener("fgamma");
    addListener("colores");
    addListener("band");
    addListener("bandselec");
    addListener("lightcolor");
    addListener("indicecolor");
    addListener("element");
    addListener("elementoview");
    addListener("optionelement");
    addListener("elm");
    addListener("potencialcorte");
    addListener("xdetector");
    addListener("xelement");
    addListener("yelement");
    addListener("helement");
    addListener("mat");
    addListener("mat1");
    addListener("mat2");
    addListener("mat3");
    addListener("mat4");
    addListener("medir");
    addListener("medida1");
    addListener("medida2");
    addListener("medida3");
    addListener("medida4");
    addListener("tablavisible");
    addListener("datos1");
    addListener("datos2");
    addListener("datos3");
    addListener("datos4");
    addListener("optiongraph");
    addListener("graph");
    addListener("showPlot_I_V");
    addListener("showPlot_Ek_F");
    addListener("showPlot_I_i");
  }
  


  public void read() {}
  


  public void read(String paramString)
  {
    if ("n".equals(paramString)) {
      _model.n = getInt("n");
      __n_canBeChanged__ = true;
    }
    if ("nf".equals(paramString)) {
      _model.nf = getInt("nf");
      __nf_canBeChanged__ = true;
    }
    if ("indicef".equals(paramString)) {
      _model.indicef = getInt("indicef");
      __indicef_canBeChanged__ = true;
    }
    if ("indicefinal".equals(paramString)) {
      _model.indicefinal = getInt("indicefinal");
      __indicefinal_canBeChanged__ = true;
    }
    if ("ne1".equals(paramString)) {
      _model.ne1 = getInt("ne1");
      __ne1_canBeChanged__ = true;
    }
    if ("ne2".equals(paramString)) {
      _model.ne2 = getInt("ne2");
      __ne2_canBeChanged__ = true;
    }
    if ("ne".equals(paramString)) {
      _model.ne = getInt("ne");
      __ne_canBeChanged__ = true;
    }
    if ("t".equals(paramString)) {
      _model.t = getDouble("t");
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(paramString)) {
      _model.dt = getDouble("dt");
      __dt_canBeChanged__ = true;
    }
    if ("totaltime".equals(paramString)) {
      _model.totaltime = getDouble("totaltime");
      __totaltime_canBeChanged__ = true;
    }
    if ("corriente".equals(paramString)) {
      _model.corriente = getInt("corriente");
      __corriente_canBeChanged__ = true;
    }
    if ("amperios".equals(paramString)) {
      _model.amperios = getDouble("amperios");
      __amperios_canBeChanged__ = true;
    }
    if ("amperios2".equals(paramString)) {
      _model.amperios2 = getDouble("amperios2");
      __amperios2_canBeChanged__ = true;
    }
    if ("tpaso".equals(paramString)) {
      _model.tpaso = getDouble("tpaso");
      __tpaso_canBeChanged__ = true;
    }
    if ("med".equals(paramString)) {
      _model.med = getDouble("med");
      __med_canBeChanged__ = true;
    }
    if ("lambda".equals(paramString)) {
      _model.lambda = getDouble("lambda");
      __lambda_canBeChanged__ = true; }
    Object localObject;
    int i; int j; if ("x".equals(paramString)) {
      localObject = (double[])getValue("x").getObject();
      i = localObject.length;
      if (i > _model.x.length) i = _model.x.length;
      for (j = 0; j < i; j++) {
        _model.x[j] = localObject[j];
      }
      __x_canBeChanged__ = true;
    }
    if ("y".equals(paramString)) {
      localObject = (double[])getValue("y").getObject();
      i = localObject.length;
      if (i > _model.y.length) i = _model.y.length;
      for (j = 0; j < i; j++) {
        _model.y[j] = localObject[j];
      }
      __y_canBeChanged__ = true;
    }
    if ("v".equals(paramString)) {
      localObject = (double[])getValue("v").getObject();
      i = localObject.length;
      if (i > _model.v.length) i = _model.v.length;
      for (j = 0; j < i; j++) {
        _model.v[j] = localObject[j];
      }
      __v_canBeChanged__ = true;
    }
    if ("yf".equals(paramString)) {
      localObject = (double[])getValue("yf").getObject();
      i = localObject.length;
      if (i > _model.yf.length) i = _model.yf.length;
      for (j = 0; j < i; j++) {
        _model.yf[j] = localObject[j];
      }
      __yf_canBeChanged__ = true;
    }
    if ("vf".equals(paramString)) {
      localObject = (double[])getValue("vf").getObject();
      i = localObject.length;
      if (i > _model.vf.length) i = _model.vf.length;
      for (j = 0; j < i; j++) {
        _model.vf[j] = localObject[j];
      }
      __vf_canBeChanged__ = true;
    }
    if ("xf".equals(paramString)) {
      localObject = (double[])getValue("xf").getObject();
      i = localObject.length;
      if (i > _model.xf.length) i = _model.xf.length;
      for (j = 0; j < i; j++) {
        _model.xf[j] = localObject[j];
      }
      __xf_canBeChanged__ = true;
    }
    if ("xlinterna".equals(paramString)) {
      _model.xlinterna = getDouble("xlinterna");
      __xlinterna_canBeChanged__ = true;
    }
    if ("ylinterna".equals(paramString)) {
      _model.ylinterna = getDouble("ylinterna");
      __ylinterna_canBeChanged__ = true;
    }
    if ("hxlinterna".equals(paramString)) {
      _model.hxlinterna = getDouble("hxlinterna");
      __hxlinterna_canBeChanged__ = true;
    }
    if ("hylinterna".equals(paramString)) {
      _model.hylinterna = getDouble("hylinterna");
      __hylinterna_canBeChanged__ = true;
    }
    if ("sliderix".equals(paramString)) {
      _model.sliderix = getDouble("sliderix");
      __sliderix_canBeChanged__ = true;
    }
    if ("slideriy".equals(paramString)) {
      _model.slideriy = getDouble("slideriy");
      __slideriy_canBeChanged__ = true;
    }
    if ("aceleracion".equals(paramString)) {
      _model.aceleracion = getDouble("aceleracion");
      __aceleracion_canBeChanged__ = true;
    }
    if ("frecuencia".equals(paramString)) {
      _model.frecuencia = getInt("frecuencia");
      __frecuencia_canBeChanged__ = true;
    }
    if ("frecuenciareal".equals(paramString)) {
      _model.frecuenciareal = getDouble("frecuenciareal");
      __frecuenciareal_canBeChanged__ = true;
    }
    if ("frecdig1".equals(paramString)) {
      _model.frecdig1 = getString("frecdig1");
      __frecdig1_canBeChanged__ = true;
    }
    if ("frecdig2".equals(paramString)) {
      _model.frecdig2 = getString("frecdig2");
      __frecdig2_canBeChanged__ = true;
    }
    if ("frecdig3".equals(paramString)) {
      _model.frecdig3 = getString("frecdig3");
      __frecdig3_canBeChanged__ = true;
    }
    if ("frecd1".equals(paramString)) {
      _model.frecd1 = getInt("frecd1");
      __frecd1_canBeChanged__ = true;
    }
    if ("frecd2".equals(paramString)) {
      _model.frecd2 = getInt("frecd2");
      __frecd2_canBeChanged__ = true;
    }
    if ("frecd3".equals(paramString)) {
      _model.frecd3 = getInt("frecd3");
      __frecd3_canBeChanged__ = true;
    }
    if ("e14".equals(paramString)) {
      _model.e14 = getBoolean("e14");
      __e14_canBeChanged__ = true;
    }
    if ("e15".equals(paramString)) {
      _model.e15 = getBoolean("e15");
      __e15_canBeChanged__ = true;
    }
    if ("sliderfrecx".equals(paramString)) {
      _model.sliderfrecx = getDouble("sliderfrecx");
      __sliderfrecx_canBeChanged__ = true;
    }
    if ("sliderfrecy".equals(paramString)) {
      _model.sliderfrecy = getDouble("sliderfrecy");
      __sliderfrecy_canBeChanged__ = true;
    }
    if ("V".equals(paramString)) {
      _model.V = getDouble("V");
      __V_canBeChanged__ = true;
    }
    if ("vdig1".equals(paramString)) {
      _model.vdig1 = getString("vdig1");
      __vdig1_canBeChanged__ = true;
    }
    if ("vdig2".equals(paramString)) {
      _model.vdig2 = getString("vdig2");
      __vdig2_canBeChanged__ = true;
    }
    if ("vdig3".equals(paramString)) {
      _model.vdig3 = getString("vdig3");
      __vdig3_canBeChanged__ = true;
    }
    if ("vd1".equals(paramString)) {
      _model.vd1 = getInt("vd1");
      __vd1_canBeChanged__ = true;
    }
    if ("vd2".equals(paramString)) {
      _model.vd2 = getInt("vd2");
      __vd2_canBeChanged__ = true;
    }
    if ("vd3".equals(paramString)) {
      _model.vd3 = getInt("vd3");
      __vd3_canBeChanged__ = true;
    }
    if ("menos".equals(paramString)) {
      _model.menos = getBoolean("menos");
      __menos_canBeChanged__ = true;
    }
    if ("Ek".equals(paramString)) {
      _model.Ek = getDouble("Ek");
      __Ek_canBeChanged__ = true;
    }
    if ("V0".equals(paramString)) {
      _model.V0 = getDouble("V0");
      __V0_canBeChanged__ = true;
    }
    if ("slidervx".equals(paramString)) {
      _model.slidervx = getDouble("slidervx");
      __slidervx_canBeChanged__ = true;
    }
    if ("slidervy".equals(paramString)) {
      _model.slidervy = getDouble("slidervy");
      __slidervy_canBeChanged__ = true;
    }
    if ("currentdig1".equals(paramString)) {
      _model.currentdig1 = getString("currentdig1");
      __currentdig1_canBeChanged__ = true;
    }
    if ("currentdig2".equals(paramString)) {
      _model.currentdig2 = getString("currentdig2");
      __currentdig2_canBeChanged__ = true;
    }
    if ("currentdig3".equals(paramString)) {
      _model.currentdig3 = getString("currentdig3");
      __currentdig3_canBeChanged__ = true;
    }
    if ("currentdig4".equals(paramString)) {
      _model.currentdig4 = getString("currentdig4");
      __currentdig4_canBeChanged__ = true;
    }
    if ("currentd1".equals(paramString)) {
      _model.currentd1 = getInt("currentd1");
      __currentd1_canBeChanged__ = true;
    }
    if ("currentd2".equals(paramString)) {
      _model.currentd2 = getInt("currentd2");
      __currentd2_canBeChanged__ = true;
    }
    if ("currentd3".equals(paramString)) {
      _model.currentd3 = getInt("currentd3");
      __currentd3_canBeChanged__ = true;
    }
    if ("currentd4".equals(paramString)) {
      _model.currentd4 = getInt("currentd4");
      __currentd4_canBeChanged__ = true;
    }
    if ("I1".equals(paramString)) {
      _model.I1 = getDouble("I1");
      __I1_canBeChanged__ = true;
    }
    if ("I2".equals(paramString)) {
      _model.I2 = getDouble("I2");
      __I2_canBeChanged__ = true;
    }
    if ("I".equals(paramString)) {
      _model.I = getDouble("I");
      __I_canBeChanged__ = true;
    }
    if ("cred".equals(paramString)) {
      _model.cred = getDouble("cred");
      __cred_canBeChanged__ = true;
    }
    if ("cgreen".equals(paramString)) {
      _model.cgreen = getDouble("cgreen");
      __cgreen_canBeChanged__ = true;
    }
    if ("cblue".equals(paramString)) {
      _model.cblue = getDouble("cblue");
      __cblue_canBeChanged__ = true;
    }
    if ("csaturation".equals(paramString)) {
      _model.csaturation = getDouble("csaturation");
      __csaturation_canBeChanged__ = true;
    }
    if ("fgamma".equals(paramString)) {
      _model.fgamma = getDouble("fgamma");
      __fgamma_canBeChanged__ = true;
    }
    if ("colores".equals(paramString)) {
      localObject = (Object[])getValue("colores").getObject();
      i = localObject.length;
      if (i > _model.colores.length) i = _model.colores.length;
      for (j = 0; j < i; j++) {
        _model.colores[j] = localObject[j];
      }
      __colores_canBeChanged__ = true;
    }
    if ("band".equals(paramString)) {
      localObject = (double[])getValue("band").getObject();
      i = localObject.length;
      if (i > _model.band.length) i = _model.band.length;
      for (j = 0; j < i; j++) {
        _model.band[j] = localObject[j];
      }
      __band_canBeChanged__ = true;
    }
    if ("bandselec".equals(paramString)) {
      _model.bandselec = getInt("bandselec");
      __bandselec_canBeChanged__ = true;
    }
    if ("lightcolor".equals(paramString)) {
      _model.lightcolor = getObject("lightcolor");
      __lightcolor_canBeChanged__ = true;
    }
    if ("indicecolor".equals(paramString)) {
      _model.indicecolor = getInt("indicecolor");
      __indicecolor_canBeChanged__ = true;
    }
    if ("element".equals(paramString)) {
      _model.element = getString("element");
      __element_canBeChanged__ = true;
    }
    if ("elementoview".equals(paramString)) {
      _model.elementoview = getBoolean("elementoview");
      __elementoview_canBeChanged__ = true;
    }
    if ("optionelement".equals(paramString)) {
      _model.optionelement = getString("optionelement");
      __optionelement_canBeChanged__ = true;
    }
    if ("elm".equals(paramString)) {
      _model.elm = getString("elm");
      __elm_canBeChanged__ = true;
    }
    if ("potencialcorte".equals(paramString)) {
      _model.potencialcorte = getDouble("potencialcorte");
      __potencialcorte_canBeChanged__ = true;
    }
    if ("xdetector".equals(paramString)) {
      _model.xdetector = getDouble("xdetector");
      __xdetector_canBeChanged__ = true;
    }
    if ("xelement".equals(paramString)) {
      _model.xelement = getDouble("xelement");
      __xelement_canBeChanged__ = true;
    }
    if ("yelement".equals(paramString)) {
      _model.yelement = getDouble("yelement");
      __yelement_canBeChanged__ = true;
    }
    if ("helement".equals(paramString)) {
      _model.helement = getDouble("helement");
      __helement_canBeChanged__ = true;
    }
    if ("mat".equals(paramString)) {
      _model.mat = getString("mat");
      __mat_canBeChanged__ = true;
    }
    if ("mat1".equals(paramString)) {
      _model.mat1 = getString("mat1");
      __mat1_canBeChanged__ = true;
    }
    if ("mat2".equals(paramString)) {
      _model.mat2 = getString("mat2");
      __mat2_canBeChanged__ = true;
    }
    if ("mat3".equals(paramString)) {
      _model.mat3 = getString("mat3");
      __mat3_canBeChanged__ = true;
    }
    if ("mat4".equals(paramString)) {
      _model.mat4 = getString("mat4");
      __mat4_canBeChanged__ = true;
    }
    if ("medir".equals(paramString)) {
      _model.medir = getBoolean("medir");
      __medir_canBeChanged__ = true;
    }
    if ("medida1".equals(paramString)) {
      _model.medida1 = getBoolean("medida1");
      __medida1_canBeChanged__ = true;
    }
    if ("medida2".equals(paramString)) {
      _model.medida2 = getBoolean("medida2");
      __medida2_canBeChanged__ = true;
    }
    if ("medida3".equals(paramString)) {
      _model.medida3 = getBoolean("medida3");
      __medida3_canBeChanged__ = true;
    }
    if ("medida4".equals(paramString)) {
      _model.medida4 = getBoolean("medida4");
      __medida4_canBeChanged__ = true;
    }
    if ("tablavisible".equals(paramString)) {
      _model.tablavisible = getBoolean("tablavisible");
      __tablavisible_canBeChanged__ = true;
    }
    if ("datos1".equals(paramString)) {
      localObject = (double[])getValue("datos1").getObject();
      i = localObject.length;
      if (i > _model.datos1.length) i = _model.datos1.length;
      for (j = 0; j < i; j++) {
        _model.datos1[j] = localObject[j];
      }
      __datos1_canBeChanged__ = true;
    }
    if ("datos2".equals(paramString)) {
      localObject = (double[])getValue("datos2").getObject();
      i = localObject.length;
      if (i > _model.datos2.length) i = _model.datos2.length;
      for (j = 0; j < i; j++) {
        _model.datos2[j] = localObject[j];
      }
      __datos2_canBeChanged__ = true;
    }
    if ("datos3".equals(paramString)) {
      localObject = (double[])getValue("datos3").getObject();
      i = localObject.length;
      if (i > _model.datos3.length) i = _model.datos3.length;
      for (j = 0; j < i; j++) {
        _model.datos3[j] = localObject[j];
      }
      __datos3_canBeChanged__ = true;
    }
    if ("datos4".equals(paramString)) {
      localObject = (double[])getValue("datos4").getObject();
      i = localObject.length;
      if (i > _model.datos4.length) i = _model.datos4.length;
      for (j = 0; j < i; j++) {
        _model.datos4[j] = localObject[j];
      }
      __datos4_canBeChanged__ = true;
    }
    if ("optiongraph".equals(paramString)) {
      _model.optiongraph = getString("optiongraph");
      __optiongraph_canBeChanged__ = true;
    }
    if ("graph".equals(paramString)) {
      _model.graph = getString("graph");
      __graph_canBeChanged__ = true;
    }
    if ("showPlot_I_V".equals(paramString)) {
      _model.showPlot_I_V = getBoolean("showPlot_I_V");
      __showPlot_I_V_canBeChanged__ = true;
    }
    if ("showPlot_Ek_F".equals(paramString)) {
      _model.showPlot_Ek_F = getBoolean("showPlot_Ek_F");
      __showPlot_Ek_F_canBeChanged__ = true;
    }
    if ("showPlot_I_i".equals(paramString)) {
      _model.showPlot_I_i = getBoolean("showPlot_I_i");
      __showPlot_I_i_canBeChanged__ = true;
    }
  }
  
  public void propagateValues() {
    setValue("_isPlaying", _simulation.isPlaying());
    setValue("_isPaused", _simulation.isPaused());
    if (__n_canBeChanged__) setValue("n", _model.n);
    if (__nf_canBeChanged__) setValue("nf", _model.nf);
    if (__indicef_canBeChanged__) setValue("indicef", _model.indicef);
    if (__indicefinal_canBeChanged__) setValue("indicefinal", _model.indicefinal);
    if (__ne1_canBeChanged__) setValue("ne1", _model.ne1);
    if (__ne2_canBeChanged__) setValue("ne2", _model.ne2);
    if (__ne_canBeChanged__) setValue("ne", _model.ne);
    if (__t_canBeChanged__) setValue("t", _model.t);
    if (__dt_canBeChanged__) setValue("dt", _model.dt);
    if (__totaltime_canBeChanged__) setValue("totaltime", _model.totaltime);
    if (__corriente_canBeChanged__) setValue("corriente", _model.corriente);
    if (__amperios_canBeChanged__) setValue("amperios", _model.amperios);
    if (__amperios2_canBeChanged__) setValue("amperios2", _model.amperios2);
    if (__tpaso_canBeChanged__) setValue("tpaso", _model.tpaso);
    if (__med_canBeChanged__) setValue("med", _model.med);
    if (__lambda_canBeChanged__) setValue("lambda", _model.lambda);
    if (__x_canBeChanged__) setValue("x", _model.x);
    if (__y_canBeChanged__) setValue("y", _model.y);
    if (__v_canBeChanged__) setValue("v", _model.v);
    if (__yf_canBeChanged__) setValue("yf", _model.yf);
    if (__vf_canBeChanged__) setValue("vf", _model.vf);
    if (__xf_canBeChanged__) setValue("xf", _model.xf);
    if (__xlinterna_canBeChanged__) setValue("xlinterna", _model.xlinterna);
    if (__ylinterna_canBeChanged__) setValue("ylinterna", _model.ylinterna);
    if (__hxlinterna_canBeChanged__) setValue("hxlinterna", _model.hxlinterna);
    if (__hylinterna_canBeChanged__) setValue("hylinterna", _model.hylinterna);
    if (__sliderix_canBeChanged__) setValue("sliderix", _model.sliderix);
    if (__slideriy_canBeChanged__) setValue("slideriy", _model.slideriy);
    if (__aceleracion_canBeChanged__) setValue("aceleracion", _model.aceleracion);
    if (__frecuencia_canBeChanged__) setValue("frecuencia", _model.frecuencia);
    if (__frecuenciareal_canBeChanged__) setValue("frecuenciareal", _model.frecuenciareal);
    if (__frecdig1_canBeChanged__) setValue("frecdig1", _model.frecdig1);
    if (__frecdig2_canBeChanged__) setValue("frecdig2", _model.frecdig2);
    if (__frecdig3_canBeChanged__) setValue("frecdig3", _model.frecdig3);
    if (__frecd1_canBeChanged__) setValue("frecd1", _model.frecd1);
    if (__frecd2_canBeChanged__) setValue("frecd2", _model.frecd2);
    if (__frecd3_canBeChanged__) setValue("frecd3", _model.frecd3);
    if (__e14_canBeChanged__) setValue("e14", _model.e14);
    if (__e15_canBeChanged__) setValue("e15", _model.e15);
    if (__sliderfrecx_canBeChanged__) setValue("sliderfrecx", _model.sliderfrecx);
    if (__sliderfrecy_canBeChanged__) setValue("sliderfrecy", _model.sliderfrecy);
    if (__V_canBeChanged__) setValue("V", _model.V);
    if (__vdig1_canBeChanged__) setValue("vdig1", _model.vdig1);
    if (__vdig2_canBeChanged__) setValue("vdig2", _model.vdig2);
    if (__vdig3_canBeChanged__) setValue("vdig3", _model.vdig3);
    if (__vd1_canBeChanged__) setValue("vd1", _model.vd1);
    if (__vd2_canBeChanged__) setValue("vd2", _model.vd2);
    if (__vd3_canBeChanged__) setValue("vd3", _model.vd3);
    if (__menos_canBeChanged__) setValue("menos", _model.menos);
    if (__Ek_canBeChanged__) setValue("Ek", _model.Ek);
    if (__V0_canBeChanged__) setValue("V0", _model.V0);
    if (__slidervx_canBeChanged__) setValue("slidervx", _model.slidervx);
    if (__slidervy_canBeChanged__) setValue("slidervy", _model.slidervy);
    if (__currentdig1_canBeChanged__) setValue("currentdig1", _model.currentdig1);
    if (__currentdig2_canBeChanged__) setValue("currentdig2", _model.currentdig2);
    if (__currentdig3_canBeChanged__) setValue("currentdig3", _model.currentdig3);
    if (__currentdig4_canBeChanged__) setValue("currentdig4", _model.currentdig4);
    if (__currentd1_canBeChanged__) setValue("currentd1", _model.currentd1);
    if (__currentd2_canBeChanged__) setValue("currentd2", _model.currentd2);
    if (__currentd3_canBeChanged__) setValue("currentd3", _model.currentd3);
    if (__currentd4_canBeChanged__) setValue("currentd4", _model.currentd4);
    if (__I1_canBeChanged__) setValue("I1", _model.I1);
    if (__I2_canBeChanged__) setValue("I2", _model.I2);
    if (__I_canBeChanged__) setValue("I", _model.I);
    if (__cred_canBeChanged__) setValue("cred", _model.cred);
    if (__cgreen_canBeChanged__) setValue("cgreen", _model.cgreen);
    if (__cblue_canBeChanged__) setValue("cblue", _model.cblue);
    if (__csaturation_canBeChanged__) setValue("csaturation", _model.csaturation);
    if (__fgamma_canBeChanged__) setValue("fgamma", _model.fgamma);
    if (__colores_canBeChanged__) setValue("colores", _model.colores);
    if (__band_canBeChanged__) setValue("band", _model.band);
    if (__bandselec_canBeChanged__) setValue("bandselec", _model.bandselec);
    if (__lightcolor_canBeChanged__) setValue("lightcolor", _model.lightcolor);
    if (__indicecolor_canBeChanged__) setValue("indicecolor", _model.indicecolor);
    if (__element_canBeChanged__) setValue("element", _model.element);
    if (__elementoview_canBeChanged__) setValue("elementoview", _model.elementoview);
    if (__optionelement_canBeChanged__) setValue("optionelement", _model.optionelement);
    if (__elm_canBeChanged__) setValue("elm", _model.elm);
    if (__potencialcorte_canBeChanged__) setValue("potencialcorte", _model.potencialcorte);
    if (__xdetector_canBeChanged__) setValue("xdetector", _model.xdetector);
    if (__xelement_canBeChanged__) setValue("xelement", _model.xelement);
    if (__yelement_canBeChanged__) setValue("yelement", _model.yelement);
    if (__helement_canBeChanged__) setValue("helement", _model.helement);
    if (__mat_canBeChanged__) setValue("mat", _model.mat);
    if (__mat1_canBeChanged__) setValue("mat1", _model.mat1);
    if (__mat2_canBeChanged__) setValue("mat2", _model.mat2);
    if (__mat3_canBeChanged__) setValue("mat3", _model.mat3);
    if (__mat4_canBeChanged__) setValue("mat4", _model.mat4);
    if (__medir_canBeChanged__) setValue("medir", _model.medir);
    if (__medida1_canBeChanged__) setValue("medida1", _model.medida1);
    if (__medida2_canBeChanged__) setValue("medida2", _model.medida2);
    if (__medida3_canBeChanged__) setValue("medida3", _model.medida3);
    if (__medida4_canBeChanged__) setValue("medida4", _model.medida4);
    if (__tablavisible_canBeChanged__) setValue("tablavisible", _model.tablavisible);
    if (__datos1_canBeChanged__) setValue("datos1", _model.datos1);
    if (__datos2_canBeChanged__) setValue("datos2", _model.datos2);
    if (__datos3_canBeChanged__) setValue("datos3", _model.datos3);
    if (__datos4_canBeChanged__) setValue("datos4", _model.datos4);
    if (__optiongraph_canBeChanged__) setValue("optiongraph", _model.optiongraph);
    if (__graph_canBeChanged__) setValue("graph", _model.graph);
    if (__showPlot_I_V_canBeChanged__) setValue("showPlot_I_V", _model.showPlot_I_V);
    if (__showPlot_Ek_F_canBeChanged__) setValue("showPlot_Ek_F", _model.showPlot_Ek_F);
    if (__showPlot_I_i_canBeChanged__) setValue("showPlot_I_i", _model.showPlot_I_i);
  }
  
  public void blockVariable(String paramString)
  {
    if ("n".equals(paramString)) __n_canBeChanged__ = false;
    if ("nf".equals(paramString)) __nf_canBeChanged__ = false;
    if ("indicef".equals(paramString)) __indicef_canBeChanged__ = false;
    if ("indicefinal".equals(paramString)) __indicefinal_canBeChanged__ = false;
    if ("ne1".equals(paramString)) __ne1_canBeChanged__ = false;
    if ("ne2".equals(paramString)) __ne2_canBeChanged__ = false;
    if ("ne".equals(paramString)) __ne_canBeChanged__ = false;
    if ("t".equals(paramString)) __t_canBeChanged__ = false;
    if ("dt".equals(paramString)) __dt_canBeChanged__ = false;
    if ("totaltime".equals(paramString)) __totaltime_canBeChanged__ = false;
    if ("corriente".equals(paramString)) __corriente_canBeChanged__ = false;
    if ("amperios".equals(paramString)) __amperios_canBeChanged__ = false;
    if ("amperios2".equals(paramString)) __amperios2_canBeChanged__ = false;
    if ("tpaso".equals(paramString)) __tpaso_canBeChanged__ = false;
    if ("med".equals(paramString)) __med_canBeChanged__ = false;
    if ("lambda".equals(paramString)) __lambda_canBeChanged__ = false;
    if ("x".equals(paramString)) __x_canBeChanged__ = false;
    if ("y".equals(paramString)) __y_canBeChanged__ = false;
    if ("v".equals(paramString)) __v_canBeChanged__ = false;
    if ("yf".equals(paramString)) __yf_canBeChanged__ = false;
    if ("vf".equals(paramString)) __vf_canBeChanged__ = false;
    if ("xf".equals(paramString)) __xf_canBeChanged__ = false;
    if ("xlinterna".equals(paramString)) __xlinterna_canBeChanged__ = false;
    if ("ylinterna".equals(paramString)) __ylinterna_canBeChanged__ = false;
    if ("hxlinterna".equals(paramString)) __hxlinterna_canBeChanged__ = false;
    if ("hylinterna".equals(paramString)) __hylinterna_canBeChanged__ = false;
    if ("sliderix".equals(paramString)) __sliderix_canBeChanged__ = false;
    if ("slideriy".equals(paramString)) __slideriy_canBeChanged__ = false;
    if ("aceleracion".equals(paramString)) __aceleracion_canBeChanged__ = false;
    if ("frecuencia".equals(paramString)) __frecuencia_canBeChanged__ = false;
    if ("frecuenciareal".equals(paramString)) __frecuenciareal_canBeChanged__ = false;
    if ("frecdig1".equals(paramString)) __frecdig1_canBeChanged__ = false;
    if ("frecdig2".equals(paramString)) __frecdig2_canBeChanged__ = false;
    if ("frecdig3".equals(paramString)) __frecdig3_canBeChanged__ = false;
    if ("frecd1".equals(paramString)) __frecd1_canBeChanged__ = false;
    if ("frecd2".equals(paramString)) __frecd2_canBeChanged__ = false;
    if ("frecd3".equals(paramString)) __frecd3_canBeChanged__ = false;
    if ("e14".equals(paramString)) __e14_canBeChanged__ = false;
    if ("e15".equals(paramString)) __e15_canBeChanged__ = false;
    if ("sliderfrecx".equals(paramString)) __sliderfrecx_canBeChanged__ = false;
    if ("sliderfrecy".equals(paramString)) __sliderfrecy_canBeChanged__ = false;
    if ("V".equals(paramString)) __V_canBeChanged__ = false;
    if ("vdig1".equals(paramString)) __vdig1_canBeChanged__ = false;
    if ("vdig2".equals(paramString)) __vdig2_canBeChanged__ = false;
    if ("vdig3".equals(paramString)) __vdig3_canBeChanged__ = false;
    if ("vd1".equals(paramString)) __vd1_canBeChanged__ = false;
    if ("vd2".equals(paramString)) __vd2_canBeChanged__ = false;
    if ("vd3".equals(paramString)) __vd3_canBeChanged__ = false;
    if ("menos".equals(paramString)) __menos_canBeChanged__ = false;
    if ("Ek".equals(paramString)) __Ek_canBeChanged__ = false;
    if ("V0".equals(paramString)) __V0_canBeChanged__ = false;
    if ("slidervx".equals(paramString)) __slidervx_canBeChanged__ = false;
    if ("slidervy".equals(paramString)) __slidervy_canBeChanged__ = false;
    if ("currentdig1".equals(paramString)) __currentdig1_canBeChanged__ = false;
    if ("currentdig2".equals(paramString)) __currentdig2_canBeChanged__ = false;
    if ("currentdig3".equals(paramString)) __currentdig3_canBeChanged__ = false;
    if ("currentdig4".equals(paramString)) __currentdig4_canBeChanged__ = false;
    if ("currentd1".equals(paramString)) __currentd1_canBeChanged__ = false;
    if ("currentd2".equals(paramString)) __currentd2_canBeChanged__ = false;
    if ("currentd3".equals(paramString)) __currentd3_canBeChanged__ = false;
    if ("currentd4".equals(paramString)) __currentd4_canBeChanged__ = false;
    if ("I1".equals(paramString)) __I1_canBeChanged__ = false;
    if ("I2".equals(paramString)) __I2_canBeChanged__ = false;
    if ("I".equals(paramString)) __I_canBeChanged__ = false;
    if ("cred".equals(paramString)) __cred_canBeChanged__ = false;
    if ("cgreen".equals(paramString)) __cgreen_canBeChanged__ = false;
    if ("cblue".equals(paramString)) __cblue_canBeChanged__ = false;
    if ("csaturation".equals(paramString)) __csaturation_canBeChanged__ = false;
    if ("fgamma".equals(paramString)) __fgamma_canBeChanged__ = false;
    if ("colores".equals(paramString)) __colores_canBeChanged__ = false;
    if ("band".equals(paramString)) __band_canBeChanged__ = false;
    if ("bandselec".equals(paramString)) __bandselec_canBeChanged__ = false;
    if ("lightcolor".equals(paramString)) __lightcolor_canBeChanged__ = false;
    if ("indicecolor".equals(paramString)) __indicecolor_canBeChanged__ = false;
    if ("element".equals(paramString)) __element_canBeChanged__ = false;
    if ("elementoview".equals(paramString)) __elementoview_canBeChanged__ = false;
    if ("optionelement".equals(paramString)) __optionelement_canBeChanged__ = false;
    if ("elm".equals(paramString)) __elm_canBeChanged__ = false;
    if ("potencialcorte".equals(paramString)) __potencialcorte_canBeChanged__ = false;
    if ("xdetector".equals(paramString)) __xdetector_canBeChanged__ = false;
    if ("xelement".equals(paramString)) __xelement_canBeChanged__ = false;
    if ("yelement".equals(paramString)) __yelement_canBeChanged__ = false;
    if ("helement".equals(paramString)) __helement_canBeChanged__ = false;
    if ("mat".equals(paramString)) __mat_canBeChanged__ = false;
    if ("mat1".equals(paramString)) __mat1_canBeChanged__ = false;
    if ("mat2".equals(paramString)) __mat2_canBeChanged__ = false;
    if ("mat3".equals(paramString)) __mat3_canBeChanged__ = false;
    if ("mat4".equals(paramString)) __mat4_canBeChanged__ = false;
    if ("medir".equals(paramString)) __medir_canBeChanged__ = false;
    if ("medida1".equals(paramString)) __medida1_canBeChanged__ = false;
    if ("medida2".equals(paramString)) __medida2_canBeChanged__ = false;
    if ("medida3".equals(paramString)) __medida3_canBeChanged__ = false;
    if ("medida4".equals(paramString)) __medida4_canBeChanged__ = false;
    if ("tablavisible".equals(paramString)) __tablavisible_canBeChanged__ = false;
    if ("datos1".equals(paramString)) __datos1_canBeChanged__ = false;
    if ("datos2".equals(paramString)) __datos2_canBeChanged__ = false;
    if ("datos3".equals(paramString)) __datos3_canBeChanged__ = false;
    if ("datos4".equals(paramString)) __datos4_canBeChanged__ = false;
    if ("optiongraph".equals(paramString)) __optiongraph_canBeChanged__ = false;
    if ("graph".equals(paramString)) __graph_canBeChanged__ = false;
    if ("showPlot_I_V".equals(paramString)) __showPlot_I_V_canBeChanged__ = false;
    if ("showPlot_Ek_F".equals(paramString)) __showPlot_Ek_F_canBeChanged__ = false;
    if ("showPlot_I_i".equals(paramString)) { __showPlot_I_i_canBeChanged__ = false;
    }
  }
  





  private void createControl()
  {
    addElement(new org.colos.ejs.library.control.swing.ControlFrame(), "_TOP_SECRET_").setProperty("waitForReset", "true").setProperty("visible", "false").setProperty("background", "green").setProperty("size", "100,100");
    










    Ventana = ((java.awt.Component)addElement(new org.colos.ejs.library.control.swing.ControlFrame(), "Ventana").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("exit", "true").setProperty("waitForReset", "true").setProperty("title", "Photoelectric Effect Lab").setProperty("layout", "BORDER:0,0").setProperty("visible", "true").setProperty("location", "101,246").setProperty("size", "1209,615").setProperty("resizable", "true").getObject());
    






    PanelLab = ((JPanel)addElement(new ControlPanel(), "PanelLab").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "Ventana").setProperty("layout", "BORDER:0,0").setProperty("size", "500,400").getObject());
    













    BackgroundLab = ((org.opensourcephysics.drawing2d.DrawingPanel2D)addElement(new org.colos.ejs.library.control.swing.ControlDrawingPanel(), "BackgroundLab").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "PanelLab").setProperty("autoscaleX", "false").setProperty("autoscaleY", "false").setProperty("minimumX", "-1.0").setProperty("maximumX", "1.0").setProperty("minimumY", "-1.0").setProperty("maximumY", "1.0").setProperty("pressaction", "_model._method_for_BackgroundLab_pressaction()").setProperty("action", "_model._method_for_BackgroundLab_action()").setProperty("background", "100,100,100").getObject());
    









    fondoLab = ((InteractiveImage)addElement(new ControlImage(), "fondoLab").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("sizex", "2").setProperty("sizey", "2").setProperty("visible", "true").setProperty("enabled", "false").setProperty("image", "./img/panel.jpg").setProperty("elementposition", "CENTERED").getObject());
    













    Photoelectrons = ((org.opensourcephysics.displayejs.ElementSet)addElement(new org.colos.ejs.library.control.displayejs.ControlParticleSet(), "Photoelectrons").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("elementnumber", "n").setProperty("x", "x").setProperty("y", "y").setProperty("sizex", "0.02").setProperty("sizey", "0.02").setProperty("enabled", "false").setProperty("style", "ELLIPSE").setProperty("secondaryColor", "red").setProperty("color", "blue").setProperty("stroke", "1").getObject());
    
















    Photons = ((org.opensourcephysics.drawing2d.Set)addElement(new org.colos.ejs.library.control.drawing2d.ControlSpringSet2D(), "Photons").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("numberOfElements", "n").setProperty("x", "xf").setProperty("y", "yf").setProperty("sizeX", "0.1").setProperty("sizeY", "0.1").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("radius", "0.02").setProperty("thinExtremes", "true").setProperty("loops", "%_model._method_for_Photons_loops()%").setProperty("pointsPerLoop", "30").setProperty("lineColor", "lightcolor").setProperty("lineWidth", "1.4").getObject());
    












    Elemento = ((InteractiveImage)addElement(new ControlImage(), "Elemento").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.671").setProperty("y", "-0.144").setProperty("trueSize", "false").setProperty("sizex", "0.1").setProperty("sizey", "0.55").setProperty("visible", "elementoview").setProperty("enabled", "false").setProperty("image", "%element%").setProperty("elementposition", "CENTERED").getObject());
    














    sliderSpectrum = ((InteractiveImage)addElement(new ControlImage(), "sliderSpectrum").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "sliderfrecx").setProperty("y", "sliderfrecy").setProperty("z", "0.0").setProperty("trueSize", "false").setProperty("sizey", "0.12").setProperty("visible", "true").setProperty("enabled", "true").setProperty("sensitivity", "10").setProperty("pressaction", "_model._method_for_sliderSpectrum_pressaction()").setProperty("action", "_model._method_for_sliderSpectrum_action()").setProperty("image", "./img/sliderFrec.gif").getObject());
    









    nm_rectangulo = ((ElementShape)addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(), "nm_rectangulo").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "%_model._method_for_nm_rectangulo_x()%").setProperty("y", "%_model._method_for_nm_rectangulo_y()%").setProperty("sizeX", "0.24").setProperty("sizeY", "0.075").setProperty("style", "ROUND_RECTANGLE").setProperty("fillColor", "WHITE").getObject());
    












    nm = ((ElementText)addElement(new ControlText2D(), "nm").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "%_model._method_for_nm_x()%").setProperty("y", "%_model._method_for_nm_y()%").setProperty("sizeX", "0.2").setProperty("sizeY", "0.06").setProperty("pixelSize", "false").setProperty("text", "%_model._method_for_nm_text()%").setProperty("font", "Verdana,PLAIN,18").setProperty("lineColor", "BLACK").setProperty("lineWidth", "0").getObject());
    











    e14 = ((InteractiveImage)addElement(new ControlImage(), "e14").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.38").setProperty("y", "0.705").setProperty("trueSize", "false").setProperty("sizex", "0.06").setProperty("sizey", "0.12").setProperty("visible", "e14").setProperty("enabled", "false").setProperty("image", "./img/14.gif").getObject());
    











    e15 = ((InteractiveImage)addElement(new ControlImage(), "e15").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.38").setProperty("y", "0.705").setProperty("trueSize", "false").setProperty("sizex", "0.06").setProperty("sizey", "0.12").setProperty("visible", "e15").setProperty("enabled", "false").setProperty("image", "./img/15.gif").getObject());
    









    frecDig1 = ((InteractiveImage)addElement(new ControlImage(), "frecDig1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.715").setProperty("y", "0.678").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%frecdig1%").getObject());
    









    frecDig2 = ((InteractiveImage)addElement(new ControlImage(), "frecDig2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.635").setProperty("y", "0.678").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%frecdig2%").getObject());
    









    frecDig3 = ((InteractiveImage)addElement(new ControlImage(), "frecDig3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.570").setProperty("y", "0.678").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%frecdig3%").getObject());
    









    vDig1 = ((InteractiveImage)addElement(new ControlImage(), "vDig1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.49").setProperty("y", "-0.650").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%vdig1%").getObject());
    









    vDig2 = ((InteractiveImage)addElement(new ControlImage(), "vDig2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.39").setProperty("y", "-0.650").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%vdig2%").getObject());
    









    vDig3 = ((InteractiveImage)addElement(new ControlImage(), "vDig3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.325").setProperty("y", "-0.650").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%vdig3%").getObject());
    











    menos = ((InteractiveImage)addElement(new ControlImage(), "menos").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.545").setProperty("y", "-0.655").setProperty("trueSize", "false").setProperty("sizex", "0.05").setProperty("sizey", "0.1").setProperty("visible", "menos").setProperty("enabled", "false").setProperty("image", "./img/menos.gif").getObject());
    
















    measure = ((InteractiveImage)addElement(new ControlImage(), "measure").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "0.78").setProperty("y", "0.17").setProperty("z", "0.0").setProperty("trueSize", "false").setProperty("sizex", "0.25").setProperty("sizey", "0.45").setProperty("visible", "true").setProperty("measured", "false").setProperty("enabled", "true").setProperty("sensitivity", "40").setProperty("pressaction", "_model._method_for_measure_pressaction()").setProperty("action", "_model._method_for_measure_action()").setProperty("image", "./img/measure.gif").getObject());
    
















    sliderVolt = ((InteractiveImage)addElement(new ControlImage(), "sliderVolt").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "slidervx").setProperty("y", "slidervy").setProperty("z", "0.0").setProperty("trueSize", "false").setProperty("sizex", "0.08").setProperty("sizey", "0.2").setProperty("visible", "true").setProperty("enabled", "true").setProperty("sensitivity", "10").setProperty("pressaction", "_model._method_for_sliderVolt_pressaction()").setProperty("dragaction", "_model._method_for_sliderVolt_dragaction()").setProperty("action", "_model._method_for_sliderVolt_action()").setProperty("image", "./img/sliderV.gif").getObject());
    










    currentDig1 = ((InteractiveImage)addElement(new ControlImage(), "currentDig1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "0.286").setProperty("y", "-0.720").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("visible", "false").setProperty("enabled", "false").setProperty("image", "%currentdig1%").getObject());
    









    currentDig2 = ((InteractiveImage)addElement(new ControlImage(), "currentDig2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "0.350").setProperty("y", "-0.720").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%currentdig2%").getObject());
    









    currentDig3 = ((InteractiveImage)addElement(new ControlImage(), "currentDig3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "0.440").setProperty("y", "-0.720").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%currentdig3%").getObject());
    










    currentDig4 = ((InteractiveImage)addElement(new ControlImage(), "currentDig4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "0.510").setProperty("y", "-0.720").setProperty("trueSize", "false").setProperty("sizex", "0.06").setProperty("sizey", "0.11").setProperty("enabled", "false").setProperty("image", "%currentdig4%").getObject());
    








    linterna = ((org.opensourcephysics.drawing2d.Group)addElement(new org.colos.ejs.library.control.drawing2d.ControlGroup2D(), "linterna").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "-0.25").setProperty("y", "0.15").setProperty("sizeX", "1.8").setProperty("sizeY", "1.8").setProperty("visible", "true").getObject());
    
















    salida = ((org.opensourcephysics.drawing2d.Set)addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(), "salida").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "linterna").setProperty("x", "0.34").setProperty("y", "0.368").setProperty("sizeX", "0.23").setProperty("sizeY", "0.26").setProperty("pixelSize", "false").setProperty("visible", "true").setProperty("style", "ELLIPSE").setProperty("elementposition", "CENTERED").setProperty("lineColor", "BLACK").setProperty("fillColor", "lightcolor").setProperty("lineWidth", "lightcolor").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    












    image = ((org.opensourcephysics.drawing2d.ElementImage)addElement(new org.colos.ejs.library.control.drawing2d.ControlImage2D(), "image").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "linterna").setProperty("x", "0.399").setProperty("y", "0.445").setProperty("trueSize", "false").setProperty("sizeX", "0.66").setProperty("sizeY", "0.7").setProperty("visible", "true").setProperty("pressAction", "_model._method_for_image_pressAction()").setProperty("releaseAction", "_model._method_for_image_releaseAction()").setProperty("imageFile", "./img/linternabuena.gif").getObject());
    















    sliderIntensityLight = ((InteractiveImage)addElement(new ControlImage(), "sliderIntensityLight").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "sliderix").setProperty("y", "slideriy").setProperty("z", "0.0").setProperty("trueSize", "false").setProperty("sizex", "0.08").setProperty("sizey", "0.15").setProperty("visible", "true").setProperty("enabled", "true").setProperty("sensitivity", "10").setProperty("pressaction", "_model._method_for_sliderIntensityLight_pressaction()").setProperty("action", "_model._method_for_sliderIntensityLight_action()").setProperty("image", "./img/sliderF.gif").getObject());
    









    porcentaje_rectangulo2 = ((ElementShape)addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(), "porcentaje_rectangulo2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "sliderix").setProperty("y", "%_model._method_for_porcentaje_rectangulo2_y()%").setProperty("sizeX", "0.15").setProperty("sizeY", "0.08").setProperty("style", "ROUND_RECTANGLE").setProperty("fillColor", "WHITE").getObject());
    












    porcentaje = ((ElementText)addElement(new ControlText2D(), "porcentaje").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "BackgroundLab").setProperty("x", "sliderix").setProperty("y", "%_model._method_for_porcentaje_y()%").setProperty("sizeX", "0.12").setProperty("sizeY", "0.06").setProperty("pixelSize", "false").setProperty("text", "%_model._method_for_porcentaje_text()%").setProperty("font", "Verdana,PLAIN,10").setProperty("fillColor", "BLACK").setProperty("lineWidth", "0").getObject());
    












    buttons_panel = ((JPanel)addElement(new ControlPanel(), "buttons_panel").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "south").setProperty("parent", "PanelLab").setProperty("layout", "GRID:1,4,0,0").setProperty("visible", "true").setProperty("size", "60,40").setProperty("border", "0,3,3,3").setProperty("borderType", "ROUNDED_LINE").setProperty("borderColor", "BLACK").setProperty("borderJustification", "LEFT").setProperty("foreground", "RED").getObject());
    







    Stop = ((JButton)addElement(new ControlButton(), "Stop").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "buttons_panel").setProperty("image", "/org/opensourcephysics/resources/controls/images/power_off.png").setProperty("mnemonic", "Power off").setProperty("action", "_model._method_for_Stop_action()").setProperty("tooltip", "Stop Program").getObject());
    







    reload = ((JButton)addElement(new ControlButton(), "reload").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "buttons_panel").setProperty("image", "/org/opensourcephysics/resources/controls/images/reset.gif").setProperty("mnemonic", "Reload").setProperty("action", "_model._method_for_reload_action()").setProperty("tooltip", "Reload").getObject());
    






    play = ((JButton)addElement(new ControlButton(), "play").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "buttons_panel").setProperty("image", "/org/opensourcephysics/resources/controls/images/play.gif").setProperty("action", "_model._method_for_play_action()").setProperty("tooltip", "Play").getObject());
    






    Pause = ((JButton)addElement(new ControlButton(), "Pause").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "buttons_panel").setProperty("image", "/org/opensourcephysics/resources/controls/images/pause.gif").setProperty("action", "_model._method_for_Pause_action()").setProperty("tooltip", "Pause").getObject());
    






    tools = ((JPanel)addElement(new ControlPanel(), "tools").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "east").setProperty("parent", "Ventana").setProperty("layout", "VBOX").setProperty("size", "400,400").getObject());
    





    desplegables = ((JPanel)addElement(new ControlPanel(), "desplegables").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "tools").setProperty("layout", "VBOX").getObject());
    











    comboBox_Elementos = ((javax.swing.JComboBox)addElement(new org.colos.ejs.library.control.swing.ControlComboBox(), "comboBox_Elementos").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "desplegables").setProperty("options", "%optionelement%").setProperty("variable", "%elm%").setProperty("value", "Sodium").setProperty("action", "_model._method_for_comboBox_Elementos_action()").setProperty("editBackground", "64,192,128,255").setProperty("background", "white").setProperty("font", "Verdana,BOLD,20").getObject());
    










    comboBox_Graph_Tables = ((javax.swing.JComboBox)addElement(new org.colos.ejs.library.control.swing.ControlComboBox(), "comboBox_Graph_Tables").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "desplegables").setProperty("options", "%optiongraph%").setProperty("variable", "%graph%").setProperty("value", "Current vs Voltage").setProperty("action", "_model._method_for_comboBox_Graph_Tables_action()").setProperty("editBackground", "64,192,128,255").setProperty("background", "white").setProperty("font", "Verdana,BOLD,20").getObject());
    





    I_V4 = ((JPanel)addElement(new ControlPanel(), "I_V4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tools").setProperty("visible", "showPlot_I_V").setProperty("size", "400,700").getObject());
    





    graph_I_V = ((JPanel)addElement(new ControlPanel(), "graph_I_V").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V4").setProperty("layout", "border").setProperty("size", "400,300").getObject());
    
















    I_V = ((org.opensourcephysics.drawing2d.PlottingPanel2D)addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(), "I_V").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "graph_I_V").setProperty("autoscaleX", "false").setProperty("autoscaleY", "false").setProperty("maximumX", "2.2").setProperty("minimumY", "-0.8").setProperty("maximumY", "2.6").setProperty("xMarginPercentage", "50").setProperty("titleX", "Voltage (V)").setProperty("titleY", "Current (mA)").setProperty("showCoordinates", "true").setProperty("xFormat", "0.00 V ").setProperty("yFormat", "0.00 mA").setProperty("size", "400,100").getObject());
    



















    trace_IV_1 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_IV_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "%_model._method_for_trace_IV_1_x()%").setProperty("y", "%_model._method_for_trace_IV_1_y()%").setProperty("menuName", "%_model._method_for_trace_IV_1_menuName()%").setProperty("pressaction", "_model._method_for_trace_IV_1_pressaction()").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "false").setProperty("color", "192,0,192,255").setProperty("stroke", "2").setProperty("xLabel", "Voltage [V]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "192,0,192,255").getObject());
    















    cartelintensidad_IV_i_1 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_i_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.5").setProperty("y", "-0.3").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida1").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_i_1_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "192,0,192,255").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_IV_nm_1 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_nm_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.45").setProperty("y", "-0.6").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida1").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_nm_1_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "192,0,192,255").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_IV_2 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_IV_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "%_model._method_for_trace_IV_2_x()%").setProperty("y", "%_model._method_for_trace_IV_2_y()%").setProperty("menuName", "%_model._method_for_trace_IV_2_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "false").setProperty("color", "BLUE").setProperty("stroke", "2").setProperty("xLabel", "Voltage [V]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "BLUE").getObject());
    















    cartelintensidad_IV_i_2 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_i_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.5").setProperty("y", "-0.3").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida2").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_i_2_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "BLUE").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    createControl50();
  }
  















  private void createControl50()
  {
    cartelintensidad_IV_nm_2 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_nm_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.45").setProperty("y", "-0.6").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida2").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_nm_2_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "BLUE").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_IV_3 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_IV_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "%_model._method_for_trace_IV_3_x()%").setProperty("y", "%_model._method_for_trace_IV_3_y()%").setProperty("menuName", "%_model._method_for_trace_IV_3_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "false").setProperty("color", "RED").setProperty("stroke", "2").setProperty("xLabel", "Voltage [V]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "RED").getObject());
    















    cartelintensidad_IV_i_3 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_i_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.5").setProperty("y", "-0.3").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida3").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_i_3_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "RED").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_IV_nm_3 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_nm_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.45").setProperty("y", "-0.6").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida3").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_nm_3_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "RED").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_IV_4 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_IV_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "%_model._method_for_trace_IV_4_x()%").setProperty("y", "%_model._method_for_trace_IV_4_y()%").setProperty("menuName", "%_model._method_for_trace_IV_4_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "false").setProperty("color", "GREEN").setProperty("stroke", "2").setProperty("xLabel", "Voltage [V]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "GREEN").getObject());
    















    cartelintensidad_IV_i_4 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_i_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.5").setProperty("y", "-0.3").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida4").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_i_4_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "GREEN").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_IV_nm_4 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_IV_nm_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "-0.45").setProperty("y", "-0.6").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida4").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_IV_nm_4_text()%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "GREEN").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    













    linea0_IV = ((org.opensourcephysics.displayejs.InteractivePoligon)addElement(new org.colos.ejs.library.control.displayejs.ControlAnalyticCurve(), "linea0_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("points", "2").setProperty("variable", "s").setProperty("functionx", "s").setProperty("functiony", "0").setProperty("x", "0").setProperty("y", "0").setProperty("color", "red").setProperty("stroke", "-2").setProperty("visible", "true").setProperty("enabled", "false").getObject());
    














    puntero_IV = ((ElementShape)addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(), "puntero_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "V").setProperty("y", "%_model._method_for_puntero_IV_y()%").setProperty("sizeX", "10").setProperty("sizeY", "10").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("measured", "true").setProperty("enabledPosition", "false").setProperty("style", "ELLIPSE").setProperty("lineColor", "lightcolor").setProperty("fillColor", "lightcolor").getObject());
    















    etiqueta_IV = ((ElementText)addElement(new ControlText2D(), "etiqueta_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V").setProperty("x", "%_model._method_for_etiqueta_IV_x()%").setProperty("y", "%_model._method_for_etiqueta_IV_y()%").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "false").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_etiqueta_IV_text()%").setProperty("font", "Monospaced,BOLD,14").setProperty("lineColor", "BLACK").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    









    medidanumero_IV = ((JPanel)addElement(new ControlPanel(), "medidanumero_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "I_V4").setProperty("layout", "GRID:1,5,0,0").setProperty("size", "400,20").setProperty("border", "1,0,1,0").setProperty("borderType", "ROUNDED_LINE").setProperty("borderColor", "BLACK").getObject());
    










    data_IV = ((javax.swing.JLabel)addElement(new org.colos.ejs.library.control.swing.ControlLabel(), "data_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_IV").setProperty("text", "Data:").setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif").setProperty("alignment", "CENTER").setProperty("visible", "true").setProperty("background", "192,192,255,255").setProperty("foreground", "BLACK").setProperty("font", "Verdana,BOLD,15").getObject());
    














    med1_IV = ((JRadioButton)addElement(new ControlRadioButton(), "med1_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "medidanumero_IV").setProperty("variable", "medida1").setProperty("selected", "true").setProperty("text", "1").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_purple.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_V").setProperty("action", "_model._method_for_med1_IV_action()").setProperty("actionon", "_model._method_for_med1_IV_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med2_IV = ((JRadioButton)addElement(new ControlRadioButton(), "med2_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_IV").setProperty("variable", "medida2").setProperty("text", "2").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_blue.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_V").setProperty("action", "_model._method_for_med2_IV_action()").setProperty("actionon", "_model._method_for_med2_IV_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med3_IV = ((JRadioButton)addElement(new ControlRadioButton(), "med3_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_IV").setProperty("variable", "medida3").setProperty("text", "3").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_red.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_V").setProperty("action", "_model._method_for_med3_IV_action()").setProperty("actionon", "_model._method_for_med3_IV_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med4_IV = ((JRadioButton)addElement(new ControlRadioButton(), "med4_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_IV").setProperty("variable", "medida4").setProperty("text", "4").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_green.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_V").setProperty("action", "_model._method_for_med4_IV_action()").setProperty("actionon", "_model._method_for_med4_IV_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    





    tablas_IV = ((JPanel)addElement(new ControlPanel(), "tablas_IV").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_V4").setProperty("visible", "tablavisible").setProperty("size", "380,250").getObject());
    












    dataTable_IV_1 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_IV_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "tablas_IV").setProperty("input", "%_model._method_for_dataTable_IV_1_input()%").setProperty("active", "medida1").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_IV_1_columnNames()%").setProperty("columnFormat", "0,0.00,0.00").setProperty("visible", "medida1").setProperty("size", "350,175").getObject());
    












    dataTable_IV_2 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_IV_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "tablas_IV").setProperty("input", "%_model._method_for_dataTable_IV_2_input()%").setProperty("active", "medida2").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_IV_2_columnNames()%").setProperty("columnFormat", "0,0.00,0.00").setProperty("visible", "medida2").setProperty("size", "350,210").getObject());
    











    dataTable_IV_3 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_IV_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_IV").setProperty("input", "%_model._method_for_dataTable_IV_3_input()%").setProperty("active", "medida3").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_IV_3_columnNames()%").setProperty("columnFormat", "0,0.00,0.00").setProperty("visible", "medida3").setProperty("size", "350,210").getObject());
    











    dataTable_IV_4 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_IV_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_IV").setProperty("input", "%_model._method_for_dataTable_IV_4_input()%").setProperty("active", "medida4").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_IV_4_columnNames()%").setProperty("columnFormat", "0,0.00,0.00").setProperty("visible", "medida4").setProperty("size", "350,210").getObject());
    





    Ek_F = ((JPanel)addElement(new ControlPanel(), "Ek_F").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tools").setProperty("visible", "showPlot_Ek_F").setProperty("size", "400,700").getObject());
    





    graph_Ek_F = ((JPanel)addElement(new ControlPanel(), "graph_Ek_F").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F").setProperty("layout", "border").setProperty("size", "400,300").getObject());
    


















    Ek_F3 = ((org.opensourcephysics.drawing2d.PlottingPanel2D)addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(), "Ek_F3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "graph_Ek_F").setProperty("autoscaleX", "false").setProperty("autoscaleY", "false").setProperty("minimumX", "%_model._method_for_Ek_F3_minimumX()%").setProperty("maximumX", "%_model._method_for_Ek_F3_maximumX()%").setProperty("minimumY", "-1").setProperty("maximumY", "3.5").setProperty("xMarginPercentage", "10").setProperty("yMarginPercentage", "10").setProperty("titleX", "Frequency (Hz)").setProperty("titleY", "Energy Photoelectrons (eV)").setProperty("showCoordinates", "true").setProperty("xFormat", "0.#E0 Hz ").setProperty("yFormat", "0.00 Ev").setProperty("size", "400,100").getObject());
    


















    trace_EkF_1 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_EkF_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_trace_EkF_1_x()%").setProperty("y", "%_model._method_for_trace_EkF_1_y()%").setProperty("menuName", "%_model._method_for_trace_EkF_1_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "192,0,192,255").setProperty("stroke", "2").setProperty("xLabel", "Frequency [Hz]").setProperty("yLabel", "Ek [eV]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "192,0,192,255").getObject());
    















    cartelEk_EkF_1 = ((ElementText)addElement(new ControlText2D(), "cartelEk_EkF_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_cartelEk_EkF_1_x()%").setProperty("y", "0.5").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("text", "%mat1%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "192,0,192,255").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_EkF_2 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_EkF_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_trace_EkF_2_x()%").setProperty("y", "%_model._method_for_trace_EkF_2_y()%").setProperty("menuName", "%_model._method_for_trace_EkF_2_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "BLUE").setProperty("stroke", "2").setProperty("xLabel", "Frequency [Hz]").setProperty("yLabel", "Ek [eV]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "BLUE").getObject());
    















    cartelEk_EkF_2 = ((ElementText)addElement(new ControlText2D(), "cartelEk_EkF_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_cartelEk_EkF_2_x()%").setProperty("y", "0.9").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("text", "%mat2%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "BLUE").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_EkF_3 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_EkF_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_trace_EkF_3_x()%").setProperty("y", "%_model._method_for_trace_EkF_3_y()%").setProperty("menuName", "%_model._method_for_trace_EkF_3_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "RED").setProperty("stroke", "2").setProperty("xLabel", "Frequency [Hz]").setProperty("yLabel", "Ek [eV]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "RED").getObject());
    















    cartelEk_EkF_3 = ((ElementText)addElement(new ControlText2D(), "cartelEk_EkF_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_cartelEk_EkF_3_x()%").setProperty("y", "1.3").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("text", "%mat3%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "RED").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    


















    trace_EkF_4 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_EkF_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_trace_EkF_4_x()%").setProperty("y", "%_model._method_for_trace_EkF_4_y()%").setProperty("menuName", "%_model._method_for_trace_EkF_4_menuName()%").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "GREEN").setProperty("stroke", "2").setProperty("xLabel", "Frequency [Hz]").setProperty("yLabel", "Ek [eV]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "GREEN").getObject());
    















    cartelEk_EkF_4 = ((ElementText)addElement(new ControlText2D(), "cartelEk_EkF_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_cartelEk_EkF_4_x()%").setProperty("y", "1.7").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("text", "%mat4%").setProperty("font", "Monospaced,BOLD,22").setProperty("lineColor", "GREEN").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    













    linea0_EkF = ((org.opensourcephysics.displayejs.InteractivePoligon)addElement(new org.colos.ejs.library.control.displayejs.ControlAnalyticCurve(), "linea0_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("points", "2").setProperty("variable", "s").setProperty("functionx", "s").setProperty("functiony", "0").setProperty("x", "0").setProperty("y", "0").setProperty("color", "red").setProperty("stroke", "-2").setProperty("visible", "true").setProperty("enabled", "false").getObject());
    














    puntero_EkF = ((ElementShape)addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(), "puntero_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "frecuenciareal").setProperty("y", "Ek").setProperty("sizeX", "10").setProperty("sizeY", "10").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("measured", "true").setProperty("enabledPosition", "false").setProperty("style", "ELLIPSE").setProperty("lineColor", "lightcolor").setProperty("fillColor", "lightcolor").getObject());
    















    etiqueta_EkF = ((ElementText)addElement(new ControlText2D(), "etiqueta_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F3").setProperty("x", "%_model._method_for_etiqueta_EkF_x()%").setProperty("y", "%_model._method_for_etiqueta_EkF_y()%").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_etiqueta_EkF_text()%").setProperty("font", "Monospaced,BOLD,14").setProperty("lineColor", "BLACK").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    








    medidanumero_EkF = ((JPanel)addElement(new ControlPanel(), "medidanumero_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F").setProperty("layout", "GRID:1,5,0,0").setProperty("size", "400,20").setProperty("border", "1,0,1,0").setProperty("borderType", "ROUNDED_LINE").setProperty("borderColor", "BLACK").getObject());
    










    data_EkF = ((javax.swing.JLabel)addElement(new org.colos.ejs.library.control.swing.ControlLabel(), "data_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_EkF").setProperty("text", "Data:").setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif").setProperty("alignment", "CENTER").setProperty("visible", "true").setProperty("background", "192,192,255,255").setProperty("foreground", "BLACK").setProperty("font", "Verdana,BOLD,15").getObject());
    














    med1_EkF = ((JRadioButton)addElement(new ControlRadioButton(), "med1_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "medidanumero_EkF").setProperty("variable", "medida1").setProperty("selected", "true").setProperty("text", "%_model._method_for_med1_EkF_text()%").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_purple.gif").setProperty("enabled", "showPlot_Ek_F").setProperty("action", "_model._method_for_med1_EkF_action()").setProperty("actionon", "_model._method_for_med1_EkF_actionon()").setProperty("visible", "true").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med2_EkF = ((JRadioButton)addElement(new ControlRadioButton(), "med2_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_EkF").setProperty("variable", "medida2").setProperty("selected", "false").setProperty("text", "%_model._method_for_med2_EkF_text()%").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_blue.gif").setProperty("enabled", "showPlot_Ek_F").setProperty("action", "_model._method_for_med2_EkF_action()").setProperty("actionon", "_model._method_for_med2_EkF_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med3_EkF = ((JRadioButton)addElement(new ControlRadioButton(), "med3_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_EkF").setProperty("variable", "medida3").setProperty("selected", "false").setProperty("text", "%_model._method_for_med3_EkF_text()%").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_red.gif").setProperty("enabled", "showPlot_Ek_F").setProperty("action", "_model._method_for_med3_EkF_action()").setProperty("actionon", "_model._method_for_med3_EkF_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    











    med4_EkF = ((JRadioButton)addElement(new ControlRadioButton(), "med4_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_EkF").setProperty("variable", "medida4").setProperty("text", "%_model._method_for_med4_EkF_text()%").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_green.gif").setProperty("enabled", "showPlot_Ek_F").setProperty("action", "_model._method_for_med4_EkF_action()").setProperty("actionon", "_model._method_for_med4_EkF_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    





    tablas_EkF = ((JPanel)addElement(new ControlPanel(), "tablas_EkF").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "Ek_F").setProperty("visible", "tablavisible").setProperty("size", "380,250").getObject());
    












    dataTable_EkF_1 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_EkF_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "tablas_EkF").setProperty("input", "%_model._method_for_dataTable_EkF_1_input()%").setProperty("active", "medida1").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_EkF_1_columnNames()%").setProperty("columnFormat", "0.00, 000.#E0,0.00").setProperty("visible", "medida1").setProperty("size", "350,175").getObject());
    












    dataTable_EkF_2 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_EkF_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "tablas_EkF").setProperty("input", "%_model._method_for_dataTable_EkF_2_input()%").setProperty("active", "medida2").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_EkF_2_columnNames()%").setProperty("columnFormat", "0, 000.#E0,0.00").setProperty("visible", "medida2").setProperty("size", "350,210").getObject());
    











    dataTable_EkF_3 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_EkF_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_EkF").setProperty("input", "%_model._method_for_dataTable_EkF_3_input()%").setProperty("active", "medida3").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_EkF_3_columnNames()%").setProperty("columnFormat", "0, 000.#E0,0.00").setProperty("visible", "medida3").setProperty("size", "350,210").getObject());
    











    dataTable_EkF_4 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_EkF_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_EkF").setProperty("input", "%_model._method_for_dataTable_EkF_4_input()%").setProperty("active", "medida4").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_EkF_4_columnNames()%").setProperty("columnFormat", "0, 000.#E0,0.00").setProperty("visible", "medida4").setProperty("size", "350,210").getObject());
    





    I_i = ((JPanel)addElement(new ControlPanel(), "I_i").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tools").setProperty("visible", "showPlot_I_i").setProperty("size", "400,700").getObject());
    





    graph_I_i = ((JPanel)addElement(new ControlPanel(), "graph_I_i").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i").setProperty("layout", "border").setProperty("size", "400,300").getObject());
    


















    I_i2 = ((org.opensourcephysics.drawing2d.PlottingPanel2D)addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(), "I_i2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "graph_I_i").setProperty("autoscaleX", "false").setProperty("autoscaleY", "false").setProperty("minimumX", "0").setProperty("maximumX", "105").setProperty("minimumY", "-0.2").setProperty("maximumY", "2.5").setProperty("xMarginPercentage", "10").setProperty("yMarginPercentage", "10").setProperty("titleX", "Intensity of Light (%)").setProperty("titleY", "Current (mA)").setProperty("showCoordinates", "true").setProperty("xFormat", "0 per cent ").setProperty("yFormat", "0.00 mA").setProperty("size", "400,100").getObject());
    



















    trace_Ii_1 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_Ii_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "%_model._method_for_trace_Ii_1_x()%").setProperty("y", "%_model._method_for_trace_Ii_1_y()%").setProperty("menuName", "%_model._method_for_trace_Ii_1_menuName()%").setProperty("visible", "medida1").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "192,0,192,255").setProperty("stroke", "2").setProperty("xLabel", "Intensity light [%]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "192,0,192,255").getObject());
    createControl100();
  }
  















  private void createControl100()
  {
    cartelintensidad_Ii_nm_1 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_nm_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.8").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida1").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_nm_1_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "192,0,192,255").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_Ii_V_1 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_V_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.5").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida1").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_V_1_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "192,0,192,255").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    



















    trace_Ii_2 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_Ii_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "%_model._method_for_trace_Ii_2_x()%").setProperty("y", "%_model._method_for_trace_Ii_2_y()%").setProperty("menuName", "%_model._method_for_trace_Ii_2_menuName()%").setProperty("visible", "medida2").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "BLUE").setProperty("stroke", "2").setProperty("xLabel", "Intensity light [%]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "BLUE").getObject());
    















    cartelintensidad_Ii_nm_2 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_nm_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.8").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida2").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_nm_2_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "BLUE").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_Ii_V_2 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_V_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.5").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida2").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_V_2_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "BLUE").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    



















    trace_Ii_3 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_Ii_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "%_model._method_for_trace_Ii_3_x()%").setProperty("y", "%_model._method_for_trace_Ii_3_y()%").setProperty("menuName", "%_model._method_for_trace_Ii_3_menuName()%").setProperty("visible", "medida3").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "RED").setProperty("stroke", "2").setProperty("xLabel", "Intensity light [%]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "RED").getObject());
    















    cartelintensidad_Ii_nm_3 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_nm_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.8").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida3").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_nm_3_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "RED").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_Ii_V_3 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_V_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.5").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida3").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_V_3_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "RED").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    



















    trace_Ii_4 = ((InteractiveTrace)addElement(new ControlTrace(), "trace_Ii_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "%_model._method_for_trace_Ii_4_x()%").setProperty("y", "%_model._method_for_trace_Ii_4_y()%").setProperty("menuName", "%_model._method_for_trace_Ii_4_menuName()%").setProperty("visible", "medida4").setProperty("maxpoints", "100").setProperty("clearAtInput", "false").setProperty("active", "true").setProperty("norepeat", "true").setProperty("connected", "true").setProperty("color", "GREEN").setProperty("stroke", "2").setProperty("xLabel", "Intensity light [%]").setProperty("yLabel", "Current [mA]").setProperty("style", "ELLIPSE").setProperty("markersize", "5").setProperty("secondaryColor", "GREEN").getObject());
    















    cartelintensidad_Ii_nm_4 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_nm_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.8").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida4").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_nm_4_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "GREEN").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    















    cartelintensidad_Ii_V_4 = ((ElementText)addElement(new ControlText2D(), "cartelintensidad_Ii_V_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "12").setProperty("y", "1.5").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "medida4").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_cartelintensidad_Ii_V_4_text()%").setProperty("font", "Monospaced,BOLD,20").setProperty("lineColor", "GREEN").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    













    linea0_Ii = ((org.opensourcephysics.displayejs.InteractivePoligon)addElement(new org.colos.ejs.library.control.displayejs.ControlAnalyticCurve(), "linea0_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("points", "2").setProperty("variable", "s").setProperty("functionx", "s").setProperty("functiony", "0").setProperty("x", "0").setProperty("y", "0").setProperty("color", "red").setProperty("stroke", "-2").setProperty("visible", "true").setProperty("enabled", "false").getObject());
    














    puntero_Ii = ((ElementShape)addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(), "puntero_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "indicefinal").setProperty("y", "%_model._method_for_puntero_Ii_y()%").setProperty("sizeX", "10").setProperty("sizeY", "10").setProperty("pixelSize", "true").setProperty("visible", "true").setProperty("measured", "true").setProperty("enabledPosition", "false").setProperty("style", "ELLIPSE").setProperty("lineColor", "lightcolor").setProperty("fillColor", "lightcolor").getObject());
    















    etiqueta_Ii = ((ElementText)addElement(new ControlText2D(), "etiqueta_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i2").setProperty("x", "indicefinal").setProperty("y", "%_model._method_for_etiqueta_Ii_y()%").setProperty("sizeX", "0.05").setProperty("sizeY", "0.05").setProperty("pixelSize", "true").setProperty("visible", "false").setProperty("enabledPosition", "false").setProperty("text", "%_model._method_for_etiqueta_Ii_text()%").setProperty("font", "Monospaced,BOLD,14").setProperty("lineColor", "BLACK").setProperty("drawingLines", "true").setProperty("drawingFill", "true").getObject());
    









    medidanumero_Ii = ((JPanel)addElement(new ControlPanel(), "medidanumero_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "I_i").setProperty("layout", "GRID:1,6,0,0").setProperty("size", "400,20").setProperty("border", "1,0,1,0").setProperty("borderType", "ROUNDED_LINE").setProperty("borderColor", "BLACK").getObject());
    










    data_Ii = ((javax.swing.JLabel)addElement(new org.colos.ejs.library.control.swing.ControlLabel(), "data_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_Ii").setProperty("text", "Data:").setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif").setProperty("alignment", "CENTER").setProperty("visible", "true").setProperty("background", "192,192,255,255").setProperty("foreground", "BLACK").setProperty("font", "Verdana,BOLD,15").getObject());
    














    med1_Ii = ((JRadioButton)addElement(new ControlRadioButton(), "med1_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "medidanumero_Ii").setProperty("variable", "medida1").setProperty("selected", "true").setProperty("text", "1").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_purple.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_i").setProperty("action", "_model._method_for_med1_Ii_action()").setProperty("actionon", "_model._method_for_med1_Ii_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med2_Ii = ((JRadioButton)addElement(new ControlRadioButton(), "med2_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_Ii").setProperty("variable", "medida2").setProperty("text", "2").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_blue.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_i").setProperty("action", "_model._method_for_med2_Ii_action()").setProperty("actionon", "_model._method_for_med2_Ii_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med3_Ii = ((JRadioButton)addElement(new ControlRadioButton(), "med3_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_Ii").setProperty("variable", "medida3").setProperty("text", "3").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_red.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_i").setProperty("action", "_model._method_for_med3_Ii_action()").setProperty("actionon", "_model._method_for_med3_Ii_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    












    med4_Ii = ((JRadioButton)addElement(new ControlRadioButton(), "med4_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "medidanumero_Ii").setProperty("variable", "medida4").setProperty("text", "4").setProperty("image", "./img/b_off.gif").setProperty("selectedimage", "./img/b_green.gif").setProperty("alignment", "CENTER").setProperty("enabled", "showPlot_I_i").setProperty("action", "_model._method_for_med4_Ii_action()").setProperty("actionon", "_model._method_for_med4_Ii_actionon()").setProperty("font", "Monospaced,BOLD,16").getObject());
    





    tablas_Ii = ((JPanel)addElement(new ControlPanel(), "tablas_Ii").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "I_i").setProperty("visible", "tablavisible").setProperty("size", "380,250").getObject());
    












    dataTable_Ii_1 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_Ii_1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "tablas_Ii").setProperty("input", "%_model._method_for_dataTable_Ii_1_input()%").setProperty("active", "medida1").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_Ii_1_columnNames()%").setProperty("columnFormat", "0,0.00,0").setProperty("visible", "medida1").setProperty("size", "350,175").getObject());
    












    dataTable_Ii_2 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_Ii_2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "tablas_Ii").setProperty("input", "%_model._method_for_dataTable_Ii_2_input()%").setProperty("active", "medida2").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_Ii_2_columnNames()%").setProperty("columnFormat", "0,0.00,0").setProperty("visible", "medida2").setProperty("size", "350,210").getObject());
    











    dataTable_Ii_3 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_Ii_3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_Ii").setProperty("input", "%_model._method_for_dataTable_Ii_3_input()%").setProperty("active", "medida3").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_Ii_3_columnNames()%").setProperty("columnFormat", "0,0.00,0").setProperty("visible", "medida3").setProperty("size", "350,210").getObject());
    











    dataTable_Ii_4 = ((DataPanel)addElement(new ControlDataTable(), "dataTable_Ii_4").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tablas_Ii").setProperty("input", "%_model._method_for_dataTable_Ii_4_input()%").setProperty("active", "medida4").setProperty("norepeat", "true").setProperty("showRowNumber", "true").setProperty("columnNames", "%_model._method_for_dataTable_Ii_4_columnNames()%").setProperty("columnFormat", "0,0.00,0").setProperty("visible", "medida4").setProperty("size", "350,210").getObject());
    






    tooldata = ((JPanel)addElement(new ControlPanel(), "tooldata").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "south").setProperty("parent", "tools").setProperty("layout", "GRID:1,4,0,0").setProperty("size", "400,40").getObject());
    








    borrarMedida = ((JButton)addElement(new ControlButton(), "borrarMedida").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "tooldata").setProperty("text", "Clear Data").setProperty("image", "/org/opensourcephysics/resources/controls/images/erase.gif").setProperty("enabled", "true").setProperty("action", "_model._method_for_borrarMedida_action()").setProperty("tooltip", "Clear Data").getObject());
    








    borrarTodo = ((JButton)addElement(new ControlButton(), "borrarTodo").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "west").setProperty("parent", "tooldata").setProperty("text", "Clear All").setProperty("image", "/org/opensourcephysics/resources/controls/images/clear.gif").setProperty("action", "_model._method_for_borrarTodo_action()").setProperty("tooltip", "Clear All Data").getObject());
    








    DataTool = ((JButton)addElement(new ControlButton(), "DataTool").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "tooldata").setProperty("text", "DataTool").setProperty("image", "/org/opensourcephysics/resources/controls/images/wrench.gif").setProperty("action", "_model._method_for_DataTool_action()").setProperty("tooltip", "Data Analysis Tool").getObject());
    








    datosPrograma = ((javax.swing.JDialog)addElement(new org.colos.ejs.library.control.swing.ControlDialog(), "datosPrograma").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("waitForReset", "true").setProperty("title", "Variables del Programa (PRUEBAS)").setProperty("layout", "border").setProperty("visible", "false").setProperty("location", "280,236").setProperty("size", "795,281").getObject());
    






    DatosProgram = ((JPanel)addElement(new ControlPanel(), "DatosProgram").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "datosPrograma").setProperty("layout", "GRID:4,1,0,0").setProperty("visible", "true").getObject());
    





    DatosSalida2 = ((JPanel)addElement(new ControlPanel(), "DatosSalida2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "DatosProgram").setProperty("layout", "GRID:1,4,0,0").getObject());
    





    I2 = ((JTextField)addElement(new ControlParsedNumberField(), "I2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "DatosSalida2").setProperty("variable", "I").setProperty("format", "Intensidad = 0.000").getObject());
    





    Voltaje2 = ((JTextField)addElement(new ControlParsedNumberField(), "Voltaje2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "DatosSalida2").setProperty("variable", "V").setProperty("format", "Voltaje = 0.000").getObject());
    





    i2 = ((JTextField)addElement(new ControlParsedNumberField(), "i2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "DatosSalida2").setProperty("variable", "indicef").setProperty("format", "indicef = 0").getObject());
    





    FrecuenciaReal2 = ((JTextField)addElement(new ControlParsedNumberField(), "FrecuenciaReal2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "DatosSalida2").setProperty("variable", "frecuenciareal").setProperty("format", "frecuenciareal = 000.#E0").getObject());
    





    OtrosDatos2 = ((JPanel)addElement(new ControlPanel(), "OtrosDatos2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "center").setProperty("parent", "DatosProgram").setProperty("layout", "GRID:1,4,0,0").getObject());
    





    nf2 = ((JTextField)addElement(new ControlParsedNumberField(), "nf2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "OtrosDatos2").setProperty("variable", "nf").setProperty("format", "nf = 0").getObject());
    





    ne3 = ((JTextField)addElement(new ControlParsedNumberField(), "ne3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "OtrosDatos2").setProperty("variable", "ne").setProperty("format", "ne = 0").getObject());
    





    ne12 = ((JTextField)addElement(new ControlParsedNumberField(), "ne12").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "OtrosDatos2").setProperty("variable", "ne1").setProperty("format", "ne1 = 0").getObject());
    





    ne22 = ((JTextField)addElement(new ControlParsedNumberField(), "ne22").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "OtrosDatos2").setProperty("variable", "ne2").setProperty("format", "ne2 = 0").getObject());
    





    temporales2 = ((JPanel)addElement(new ControlPanel(), "temporales2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "south").setProperty("parent", "DatosProgram").setProperty("layout", "GRID:2,4,0,0").getObject());
    





    intensity2 = ((JTextField)addElement(new ControlParsedNumberField(), "intensity2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "corriente").setProperty("format", "corriente = 000.#E0").getObject());
    





    amperes2 = ((JTextField)addElement(new ControlParsedNumberField(), "amperes2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "amperios").setProperty("format", "amperios = 000.#E0").getObject());
    





    t2 = ((JTextField)addElement(new ControlParsedNumberField(), "t2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "t").setProperty("format", "t = 0.000").getObject());
    





    nmed2 = ((JTextField)addElement(new ControlParsedNumberField(), "nmed2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "med").setProperty("format", "med = 0").getObject());
    






    I1 = ((JTextField)addElement(new ControlParsedNumberField(), "I1").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "north").setProperty("parent", "temporales2").setProperty("variable", "I1").setProperty("format", "I1 = 0.00").getObject());
    





    I22 = ((JTextField)addElement(new ControlParsedNumberField(), "I22").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "I2").setProperty("format", "I2 = 0.00").getObject());
    





    abajo3 = ((JTextField)addElement(new ControlParsedNumberField(), "abajo3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales2").setProperty("variable", "indicefinal").setProperty("format", "indicefinal = 0").getObject());
    






    abajo = ((JTextField)addElement(new ControlParsedNumberField(), "abajo").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("position", "south").setProperty("parent", "temporales2").setProperty("variable", "%_model._method_for_abajo_variable()%").setProperty("format", "x_indicef = 000.#E0").getObject());
    createControl150();
  }
  




  private void createControl150()
  {
    temporales222 = ((JPanel)addElement(new ControlPanel(), "temporales222").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "DatosProgram").setProperty("layout", "GRID:3,4,0,0").getObject());
    





    intensity222 = ((JTextField)addElement(new ControlParsedNumberField(), "intensity222").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "corriente").setProperty("format", "corriente = 000.#E0").getObject());
    





    amperes222 = ((JTextField)addElement(new ControlParsedNumberField(), "amperes222").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "amperios").setProperty("format", "amperios = 000.#E0").getObject());
    





    t222 = ((JTextField)addElement(new ControlParsedNumberField(), "t222").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "t").setProperty("format", "t = 0.000").getObject());
    




    nmed222 = ((JTextField)addElement(new ControlParsedNumberField(), "nmed222").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("format", "fsfsd= ").getObject());
    





    lambda22 = ((JTextField)addElement(new ControlParsedNumberField(), "lambda22").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "a").setProperty("format", "a = 0").getObject());
    




    textField_Graph22 = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph22").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "mat").getObject());
    




    textField_Graph23 = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph23").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "matmedida[4]").getObject());
    




    textField_Graph2 = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph2").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "matmedida[3]").getObject());
    




    textField_Graph32 = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph32").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "matmedida[2]").getObject());
    




    textField_Graph3 = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph3").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "matmedida[1]").getObject());
    




    textField_Graph = ((JTextField)addElement(new org.colos.ejs.library.control.swing.ControlTextField(), "textField_Graph").setProperty("_ejs_SecondAction_", "updateAfterModelAction()").setProperty("parent", "temporales222").setProperty("variable", "mat1").getObject());
  }
  




  public void reset()
  {
    getElement("Ventana").setProperty("title", "Photoelectric Effect Lab").setProperty("visible", "true").setProperty("resizable", "true");
    getElement("PanelLab")
      .setProperty("size", "500,400");
    getElement("BackgroundLab")
      .setProperty("autoscaleX", "false")
      .setProperty("autoscaleY", "false")
      .setProperty("minimumX", "-1.0")
      .setProperty("maximumX", "1.0")
      .setProperty("minimumY", "-1.0")
      .setProperty("maximumY", "1.0")
      .setProperty("background", "100,100,100");
    getElement("fondoLab")
      .setProperty("sizex", "2")
      .setProperty("sizey", "2")
      .setProperty("visible", "true")
      .setProperty("enabled", "false")
      .setProperty("image", "./img/panel.jpg")
      .setProperty("elementposition", "CENTERED");
    getElement("Photoelectrons")
      .setProperty("sizex", "0.02")
      .setProperty("sizey", "0.02")
      .setProperty("enabled", "false")
      .setProperty("style", "ELLIPSE")
      .setProperty("secondaryColor", "red")
      .setProperty("color", "blue")
      .setProperty("stroke", "1");
    getElement("Photons")
      .setProperty("sizeX", "0.1")
      .setProperty("sizeY", "0.1")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("radius", "0.02")
      .setProperty("thinExtremes", "true")
      .setProperty("pointsPerLoop", "30")
      .setProperty("lineWidth", "1.4");
    getElement("Elemento")
      .setProperty("x", "-0.671")
      .setProperty("y", "-0.144")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.1")
      .setProperty("sizey", "0.55")
      .setProperty("enabled", "false")
      .setProperty("elementposition", "CENTERED");
    getElement("sliderSpectrum")
      .setProperty("z", "0.0")
      .setProperty("trueSize", "false")
      .setProperty("sizey", "0.12")
      .setProperty("visible", "true")
      .setProperty("enabled", "true")
      .setProperty("sensitivity", "10")
      .setProperty("image", "./img/sliderFrec.gif");
    getElement("nm_rectangulo")
      .setProperty("sizeX", "0.24")
      .setProperty("sizeY", "0.075")
      .setProperty("style", "ROUND_RECTANGLE")
      .setProperty("fillColor", "WHITE");
    getElement("nm")
      .setProperty("sizeX", "0.2")
      .setProperty("sizeY", "0.06")
      .setProperty("pixelSize", "false")
      .setProperty("font", "Verdana,PLAIN,18")
      .setProperty("lineColor", "BLACK")
      .setProperty("lineWidth", "0");
    getElement("e14")
      .setProperty("x", "-0.38")
      .setProperty("y", "0.705")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.12")
      .setProperty("enabled", "false")
      .setProperty("image", "./img/14.gif");
    getElement("e15")
      .setProperty("x", "-0.38")
      .setProperty("y", "0.705")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.12")
      .setProperty("enabled", "false")
      .setProperty("image", "./img/15.gif");
    getElement("frecDig1")
      .setProperty("x", "-0.715")
      .setProperty("y", "0.678")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("frecDig2")
      .setProperty("x", "-0.635")
      .setProperty("y", "0.678")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("frecDig3")
      .setProperty("x", "-0.570")
      .setProperty("y", "0.678")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("vDig1")
      .setProperty("x", "-0.49")
      .setProperty("y", "-0.650")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("vDig2")
      .setProperty("x", "-0.39")
      .setProperty("y", "-0.650")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("vDig3")
      .setProperty("x", "-0.325")
      .setProperty("y", "-0.650")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("menos")
      .setProperty("x", "-0.545")
      .setProperty("y", "-0.655")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.05")
      .setProperty("sizey", "0.1")
      .setProperty("enabled", "false")
      .setProperty("image", "./img/menos.gif");
    getElement("measure")
      .setProperty("x", "0.78")
      .setProperty("y", "0.17")
      .setProperty("z", "0.0")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.25")
      .setProperty("sizey", "0.45")
      .setProperty("visible", "true")
      .setProperty("measured", "false")
      .setProperty("enabled", "true")
      .setProperty("sensitivity", "40")
      .setProperty("image", "./img/measure.gif");
    getElement("sliderVolt")
      .setProperty("z", "0.0")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.08")
      .setProperty("sizey", "0.2")
      .setProperty("visible", "true")
      .setProperty("enabled", "true")
      .setProperty("sensitivity", "10")
      .setProperty("image", "./img/sliderV.gif");
    getElement("currentDig1")
      .setProperty("x", "0.286")
      .setProperty("y", "-0.720")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("visible", "false")
      .setProperty("enabled", "false");
    getElement("currentDig2")
      .setProperty("x", "0.350")
      .setProperty("y", "-0.720")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("currentDig3")
      .setProperty("x", "0.440")
      .setProperty("y", "-0.720")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("currentDig4")
      .setProperty("x", "0.510")
      .setProperty("y", "-0.720")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.06")
      .setProperty("sizey", "0.11")
      .setProperty("enabled", "false");
    getElement("linterna")
      .setProperty("x", "-0.25")
      .setProperty("y", "0.15")
      .setProperty("sizeX", "1.8")
      .setProperty("sizeY", "1.8")
      .setProperty("visible", "true");
    getElement("salida")
      .setProperty("x", "0.34")
      .setProperty("y", "0.368")
      .setProperty("sizeX", "0.23")
      .setProperty("sizeY", "0.26")
      .setProperty("pixelSize", "false")
      .setProperty("visible", "true")
      .setProperty("style", "ELLIPSE")
      .setProperty("elementposition", "CENTERED")
      .setProperty("lineColor", "BLACK")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("image")
      .setProperty("x", "0.399")
      .setProperty("y", "0.445")
      .setProperty("trueSize", "false")
      .setProperty("sizeX", "0.66")
      .setProperty("sizeY", "0.7")
      .setProperty("visible", "true")
      .setProperty("imageFile", "./img/linternabuena.gif");
    getElement("sliderIntensityLight")
      .setProperty("z", "0.0")
      .setProperty("trueSize", "false")
      .setProperty("sizex", "0.08")
      .setProperty("sizey", "0.15")
      .setProperty("visible", "true")
      .setProperty("enabled", "true")
      .setProperty("sensitivity", "10")
      .setProperty("image", "./img/sliderF.gif");
    getElement("porcentaje_rectangulo2")
      .setProperty("sizeX", "0.15")
      .setProperty("sizeY", "0.08")
      .setProperty("style", "ROUND_RECTANGLE")
      .setProperty("fillColor", "WHITE");
    getElement("porcentaje")
      .setProperty("sizeX", "0.12")
      .setProperty("sizeY", "0.06")
      .setProperty("pixelSize", "false")
      .setProperty("font", "Verdana,PLAIN,10")
      .setProperty("fillColor", "BLACK")
      .setProperty("lineWidth", "0");
    getElement("buttons_panel")
      .setProperty("visible", "true")
      .setProperty("size", "60,40")
      .setProperty("border", "0,3,3,3")
      .setProperty("borderType", "ROUNDED_LINE")
      .setProperty("borderColor", "BLACK")
      .setProperty("borderJustification", "LEFT")
      .setProperty("foreground", "RED");
    getElement("Stop")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/power_off.png")
      .setProperty("mnemonic", "Power off")
      .setProperty("tooltip", "Stop Program");
    getElement("reload")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("mnemonic", "Reload")
      .setProperty("tooltip", "Reload");
    getElement("play")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("tooltip", "Play");
    getElement("Pause")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("tooltip", "Pause");
    getElement("tools")
      .setProperty("size", "400,400");
    getElement("desplegables");
    getElement("comboBox_Elementos")
      .setProperty("value", "Sodium")
      .setProperty("editBackground", "64,192,128,255")
      .setProperty("background", "white")
      .setProperty("font", "Verdana,BOLD,20");
    getElement("comboBox_Graph_Tables")
      .setProperty("value", "Current vs Voltage")
      .setProperty("editBackground", "64,192,128,255")
      .setProperty("background", "white")
      .setProperty("font", "Verdana,BOLD,20");
    getElement("I_V4")
      .setProperty("size", "400,700");
    getElement("graph_I_V")
      .setProperty("size", "400,300");
    getElement("I_V")
      .setProperty("autoscaleX", "false")
      .setProperty("autoscaleY", "false")
      .setProperty("maximumX", "2.2")
      .setProperty("minimumY", "-0.8")
      .setProperty("maximumY", "2.6")
      .setProperty("xMarginPercentage", "50")
      .setProperty("titleX", "Voltage (V)")
      .setProperty("titleY", "Current (mA)")
      .setProperty("showCoordinates", "true")
      .setProperty("xFormat", "0.00 V ")
      .setProperty("yFormat", "0.00 mA")
      .setProperty("size", "400,100");
    getElement("trace_IV_1")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "false")
      .setProperty("color", "192,0,192,255")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "192,0,192,255");
    getElement("cartelintensidad_IV_i_1")
      .setProperty("x", "-0.5")
      .setProperty("y", "-0.3")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "192,0,192,255")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_IV_nm_1")
      .setProperty("x", "-0.45")
      .setProperty("y", "-0.6")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "192,0,192,255")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_IV_2")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "false")
      .setProperty("color", "BLUE")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "BLUE");
    getElement("cartelintensidad_IV_i_2")
      .setProperty("x", "-0.5")
      .setProperty("y", "-0.3")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "BLUE")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_IV_nm_2")
      .setProperty("x", "-0.45")
      .setProperty("y", "-0.6")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "BLUE")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_IV_3")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "false")
      .setProperty("color", "RED")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "RED");
    getElement("cartelintensidad_IV_i_3")
      .setProperty("x", "-0.5")
      .setProperty("y", "-0.3")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "RED")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_IV_nm_3")
      .setProperty("x", "-0.45")
      .setProperty("y", "-0.6")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "RED")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_IV_4")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "false")
      .setProperty("color", "GREEN")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "GREEN");
    getElement("cartelintensidad_IV_i_4")
      .setProperty("x", "-0.5")
      .setProperty("y", "-0.3")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "GREEN")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_IV_nm_4")
      .setProperty("x", "-0.45")
      .setProperty("y", "-0.6")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "GREEN")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("linea0_IV")
      .setProperty("points", "2")
      .setProperty("variable", "s")
      .setProperty("functionx", "s")
      .setProperty("functiony", "0")
      .setProperty("x", "0")
      .setProperty("y", "0")
      .setProperty("color", "red")
      .setProperty("stroke", "-2")
      .setProperty("visible", "true")
      .setProperty("enabled", "false");
    getElement("puntero_IV")
      .setProperty("sizeX", "10")
      .setProperty("sizeY", "10")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("measured", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("style", "ELLIPSE");
    getElement("etiqueta_IV")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "false")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,14")
      .setProperty("lineColor", "BLACK")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("medidanumero_IV")
      .setProperty("size", "400,20")
      .setProperty("border", "1,0,1,0")
      .setProperty("borderType", "ROUNDED_LINE")
      .setProperty("borderColor", "BLACK");
    getElement("data_IV")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("visible", "true")
      .setProperty("background", "192,192,255,255")
      .setProperty("foreground", "BLACK")
      .setProperty("font", "Verdana,BOLD,15");
    getElement("med1_IV")
      .setProperty("selected", "true")
      .setProperty("text", "1")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med2_IV")
      .setProperty("text", "2")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med3_IV")
      .setProperty("text", "3")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med4_IV")
      .setProperty("text", "4")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("tablas_IV")
      .setProperty("size", "380,250");
    getElement("dataTable_IV_1")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,175");
    getElement("dataTable_IV_2")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    getElement("dataTable_IV_3")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    getElement("dataTable_IV_4")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    getElement("Ek_F")
      .setProperty("size", "400,700");
    getElement("graph_Ek_F")
      .setProperty("size", "400,300");
    getElement("Ek_F3")
      .setProperty("autoscaleX", "false")
      .setProperty("autoscaleY", "false")
      .setProperty("minimumY", "-1")
      .setProperty("maximumY", "3.5")
      .setProperty("xMarginPercentage", "10")
      .setProperty("yMarginPercentage", "10")
      .setProperty("titleX", "Frequency (Hz)")
      .setProperty("titleY", "Energy Photoelectrons (eV)")
      .setProperty("showCoordinates", "true")
      .setProperty("xFormat", "0.#E0 Hz ")
      .setProperty("yFormat", "0.00 Ev")
      .setProperty("size", "400,100");
    getElement("trace_EkF_1")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "192,0,192,255")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "192,0,192,255");
    getElement("cartelEk_EkF_1")
      .setProperty("y", "0.5")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "192,0,192,255")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_EkF_2")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "BLUE")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "BLUE");
    getElement("cartelEk_EkF_2")
      .setProperty("y", "0.9")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "BLUE")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_EkF_3")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "RED")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "RED");
    getElement("cartelEk_EkF_3")
      .setProperty("y", "1.3")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "RED")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_EkF_4")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "GREEN")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "GREEN");
    getElement("cartelEk_EkF_4")
      .setProperty("y", "1.7")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,22")
      .setProperty("lineColor", "GREEN")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("linea0_EkF")
      .setProperty("points", "2")
      .setProperty("variable", "s")
      .setProperty("functionx", "s")
      .setProperty("functiony", "0")
      .setProperty("x", "0")
      .setProperty("y", "0")
      .setProperty("color", "red")
      .setProperty("stroke", "-2")
      .setProperty("visible", "true")
      .setProperty("enabled", "false");
    getElement("puntero_EkF")
      .setProperty("sizeX", "10")
      .setProperty("sizeY", "10")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("measured", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("style", "ELLIPSE");
    getElement("etiqueta_EkF")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,14")
      .setProperty("lineColor", "BLACK")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("medidanumero_EkF")
      .setProperty("size", "400,20")
      .setProperty("border", "1,0,1,0")
      .setProperty("borderType", "ROUNDED_LINE")
      .setProperty("borderColor", "BLACK");
    getElement("data_EkF")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("visible", "true")
      .setProperty("background", "192,192,255,255")
      .setProperty("foreground", "BLACK")
      .setProperty("font", "Verdana,BOLD,15");
    getElement("med1_EkF")
      .setProperty("selected", "true")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif")
      .setProperty("visible", "true")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med2_EkF")
      .setProperty("selected", "false")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med3_EkF")
      .setProperty("selected", "false")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med4_EkF")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("tablas_EkF")
      .setProperty("size", "380,250");
    getElement("dataTable_EkF_1")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0.00, 000.#E0,0.00")
      .setProperty("size", "350,175");
    getElement("dataTable_EkF_2")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    getElement("dataTable_EkF_3")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    getElement("dataTable_EkF_4")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    getElement("I_i")
      .setProperty("size", "400,700");
    getElement("graph_I_i")
      .setProperty("size", "400,300");
    getElement("I_i2")
      .setProperty("autoscaleX", "false")
      .setProperty("autoscaleY", "false")
      .setProperty("minimumX", "0")
      .setProperty("maximumX", "105")
      .setProperty("minimumY", "-0.2")
      .setProperty("maximumY", "2.5")
      .setProperty("xMarginPercentage", "10")
      .setProperty("yMarginPercentage", "10")
      .setProperty("titleX", "Intensity of Light (%)")
      .setProperty("titleY", "Current (mA)")
      .setProperty("showCoordinates", "true")
      .setProperty("xFormat", "0 per cent ")
      .setProperty("yFormat", "0.00 mA")
      .setProperty("size", "400,100");
    getElement("trace_Ii_1")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "192,0,192,255")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "192,0,192,255");
    getElement("cartelintensidad_Ii_nm_1")
      .setProperty("x", "12")
      .setProperty("y", "1.8")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "192,0,192,255")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_Ii_V_1")
      .setProperty("x", "12")
      .setProperty("y", "1.5")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "192,0,192,255")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_Ii_2")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "BLUE")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "BLUE");
    getElement("cartelintensidad_Ii_nm_2")
      .setProperty("x", "12")
      .setProperty("y", "1.8")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "BLUE")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_Ii_V_2")
      .setProperty("x", "12")
      .setProperty("y", "1.5")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "BLUE")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_Ii_3")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "RED")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "RED");
    getElement("cartelintensidad_Ii_nm_3")
      .setProperty("x", "12")
      .setProperty("y", "1.8")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "RED")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_Ii_V_3")
      .setProperty("x", "12")
      .setProperty("y", "1.5")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "RED")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("trace_Ii_4")
      .setProperty("maxpoints", "100")
      .setProperty("clearAtInput", "false")
      .setProperty("active", "true")
      .setProperty("norepeat", "true")
      .setProperty("connected", "true")
      .setProperty("color", "GREEN")
      .setProperty("stroke", "2")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]")
      .setProperty("style", "ELLIPSE")
      .setProperty("markersize", "5")
      .setProperty("secondaryColor", "GREEN");
    getElement("cartelintensidad_Ii_nm_4")
      .setProperty("x", "12")
      .setProperty("y", "1.8")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "GREEN")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("cartelintensidad_Ii_V_4")
      .setProperty("x", "12")
      .setProperty("y", "1.5")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,20")
      .setProperty("lineColor", "GREEN")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("linea0_Ii")
      .setProperty("points", "2")
      .setProperty("variable", "s")
      .setProperty("functionx", "s")
      .setProperty("functiony", "0")
      .setProperty("x", "0")
      .setProperty("y", "0")
      .setProperty("color", "red")
      .setProperty("stroke", "-2")
      .setProperty("visible", "true")
      .setProperty("enabled", "false");
    getElement("puntero_Ii")
      .setProperty("sizeX", "10")
      .setProperty("sizeY", "10")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "true")
      .setProperty("measured", "true")
      .setProperty("enabledPosition", "false")
      .setProperty("style", "ELLIPSE");
    getElement("etiqueta_Ii")
      .setProperty("sizeX", "0.05")
      .setProperty("sizeY", "0.05")
      .setProperty("pixelSize", "true")
      .setProperty("visible", "false")
      .setProperty("enabledPosition", "false")
      .setProperty("font", "Monospaced,BOLD,14")
      .setProperty("lineColor", "BLACK")
      .setProperty("drawingLines", "true")
      .setProperty("drawingFill", "true");
    getElement("medidanumero_Ii")
      .setProperty("size", "400,20")
      .setProperty("border", "1,0,1,0")
      .setProperty("borderType", "ROUNDED_LINE")
      .setProperty("borderColor", "BLACK");
    getElement("data_Ii")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("visible", "true")
      .setProperty("background", "192,192,255,255")
      .setProperty("foreground", "BLACK")
      .setProperty("font", "Verdana,BOLD,15");
    getElement("med1_Ii")
      .setProperty("selected", "true")
      .setProperty("text", "1")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med2_Ii")
      .setProperty("text", "2")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med3_Ii")
      .setProperty("text", "3")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("med4_Ii")
      .setProperty("text", "4")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif")
      .setProperty("alignment", "CENTER")
      .setProperty("font", "Monospaced,BOLD,16");
    getElement("tablas_Ii")
      .setProperty("size", "380,250");
    getElement("dataTable_Ii_1")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,175");
    getElement("dataTable_Ii_2")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    getElement("dataTable_Ii_3")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    getElement("dataTable_Ii_4")
      .setProperty("norepeat", "true")
      .setProperty("showRowNumber", "true")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    getElement("tooldata")
      .setProperty("size", "400,40");
    getElement("borrarMedida")
      .setProperty("text", "Clear Data")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("enabled", "true")
      .setProperty("tooltip", "Clear Data");
    getElement("borrarTodo")
      .setProperty("text", "Clear All")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/clear.gif")
      .setProperty("tooltip", "Clear All Data");
    getElement("DataTool")
      .setProperty("text", "DataTool")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/wrench.gif")
      .setProperty("tooltip", "Data Analysis Tool");
    getElement("datosPrograma")
      .setProperty("title", "Variables del Programa (PRUEBAS)")
      .setProperty("visible", "false");
    getElement("DatosProgram")
      .setProperty("visible", "true");
    getElement("DatosSalida2");
    getElement("I2")
      .setProperty("format", "Intensidad = 0.000");
    getElement("Voltaje2")
      .setProperty("format", "Voltaje = 0.000");
    getElement("i2")
      .setProperty("format", "indicef = 0");
    getElement("FrecuenciaReal2")
      .setProperty("format", "frecuenciareal = 000.#E0");
    getElement("OtrosDatos2");
    getElement("nf2")
      .setProperty("format", "nf = 0");
    getElement("ne3")
      .setProperty("format", "ne = 0");
    getElement("ne12")
      .setProperty("format", "ne1 = 0");
    getElement("ne22")
      .setProperty("format", "ne2 = 0");
    getElement("temporales2");
    getElement("intensity2")
      .setProperty("format", "corriente = 000.#E0");
    getElement("amperes2")
      .setProperty("format", "amperios = 000.#E0");
    getElement("t2")
      .setProperty("format", "t = 0.000");
    getElement("nmed2")
      .setProperty("format", "med = 0");
    getElement("I1")
      .setProperty("format", "I1 = 0.00");
    getElement("I22")
      .setProperty("format", "I2 = 0.00");
    getElement("abajo3")
      .setProperty("format", "indicefinal = 0");
    getElement("abajo")
      .setProperty("format", "x_indicef = 000.#E0");
    getElement("temporales222");
    getElement("intensity222")
      .setProperty("format", "corriente = 000.#E0");
    getElement("amperes222")
      .setProperty("format", "amperios = 000.#E0");
    getElement("t222")
      .setProperty("format", "t = 0.000");
    getElement("nmed222")
      .setProperty("format", "fsfsd= ");
    getElement("lambda22")
      .setProperty("format", "a = 0");
    getElement("textField_Graph22");
    getElement("textField_Graph23");
    getElement("textField_Graph2");
    getElement("textField_Graph32");
    getElement("textField_Graph3");
    getElement("textField_Graph");
    __n_canBeChanged__ = true;
    __nf_canBeChanged__ = true;
    __indicef_canBeChanged__ = true;
    __indicefinal_canBeChanged__ = true;
    __ne1_canBeChanged__ = true;
    __ne2_canBeChanged__ = true;
    __ne_canBeChanged__ = true;
    __t_canBeChanged__ = true;
    __dt_canBeChanged__ = true;
    __totaltime_canBeChanged__ = true;
    __corriente_canBeChanged__ = true;
    __amperios_canBeChanged__ = true;
    __amperios2_canBeChanged__ = true;
    __tpaso_canBeChanged__ = true;
    __med_canBeChanged__ = true;
    __lambda_canBeChanged__ = true;
    __x_canBeChanged__ = true;
    __y_canBeChanged__ = true;
    __v_canBeChanged__ = true;
    __yf_canBeChanged__ = true;
    __vf_canBeChanged__ = true;
    __xf_canBeChanged__ = true;
    __xlinterna_canBeChanged__ = true;
    __ylinterna_canBeChanged__ = true;
    __hxlinterna_canBeChanged__ = true;
    __hylinterna_canBeChanged__ = true;
    __sliderix_canBeChanged__ = true;
    __slideriy_canBeChanged__ = true;
    __aceleracion_canBeChanged__ = true;
    __frecuencia_canBeChanged__ = true;
    __frecuenciareal_canBeChanged__ = true;
    __frecdig1_canBeChanged__ = true;
    __frecdig2_canBeChanged__ = true;
    __frecdig3_canBeChanged__ = true;
    __frecd1_canBeChanged__ = true;
    __frecd2_canBeChanged__ = true;
    __frecd3_canBeChanged__ = true;
    __e14_canBeChanged__ = true;
    __e15_canBeChanged__ = true;
    __sliderfrecx_canBeChanged__ = true;
    __sliderfrecy_canBeChanged__ = true;
    __V_canBeChanged__ = true;
    __vdig1_canBeChanged__ = true;
    __vdig2_canBeChanged__ = true;
    __vdig3_canBeChanged__ = true;
    __vd1_canBeChanged__ = true;
    __vd2_canBeChanged__ = true;
    __vd3_canBeChanged__ = true;
    __menos_canBeChanged__ = true;
    __Ek_canBeChanged__ = true;
    __V0_canBeChanged__ = true;
    __slidervx_canBeChanged__ = true;
    __slidervy_canBeChanged__ = true;
    __currentdig1_canBeChanged__ = true;
    __currentdig2_canBeChanged__ = true;
    __currentdig3_canBeChanged__ = true;
    __currentdig4_canBeChanged__ = true;
    __currentd1_canBeChanged__ = true;
    __currentd2_canBeChanged__ = true;
    __currentd3_canBeChanged__ = true;
    __currentd4_canBeChanged__ = true;
    __I1_canBeChanged__ = true;
    __I2_canBeChanged__ = true;
    __I_canBeChanged__ = true;
    __cred_canBeChanged__ = true;
    __cgreen_canBeChanged__ = true;
    __cblue_canBeChanged__ = true;
    __csaturation_canBeChanged__ = true;
    __fgamma_canBeChanged__ = true;
    __colores_canBeChanged__ = true;
    __band_canBeChanged__ = true;
    __bandselec_canBeChanged__ = true;
    __lightcolor_canBeChanged__ = true;
    __indicecolor_canBeChanged__ = true;
    __element_canBeChanged__ = true;
    __elementoview_canBeChanged__ = true;
    __optionelement_canBeChanged__ = true;
    __elm_canBeChanged__ = true;
    __potencialcorte_canBeChanged__ = true;
    __xdetector_canBeChanged__ = true;
    __xelement_canBeChanged__ = true;
    __yelement_canBeChanged__ = true;
    __helement_canBeChanged__ = true;
    __mat_canBeChanged__ = true;
    __mat1_canBeChanged__ = true;
    __mat2_canBeChanged__ = true;
    __mat3_canBeChanged__ = true;
    __mat4_canBeChanged__ = true;
    __medir_canBeChanged__ = true;
    __medida1_canBeChanged__ = true;
    __medida2_canBeChanged__ = true;
    __medida3_canBeChanged__ = true;
    __medida4_canBeChanged__ = true;
    __tablavisible_canBeChanged__ = true;
    __datos1_canBeChanged__ = true;
    __datos2_canBeChanged__ = true;
    __datos3_canBeChanged__ = true;
    __datos4_canBeChanged__ = true;
    __optiongraph_canBeChanged__ = true;
    __graph_canBeChanged__ = true;
    __showPlot_I_V_canBeChanged__ = true;
    __showPlot_Ek_F_canBeChanged__ = true;
    __showPlot_I_i_canBeChanged__ = true;
    super.reset();
  }
}
