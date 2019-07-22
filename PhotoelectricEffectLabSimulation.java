package efTFG.TFG_fe.PhotoelectricEffectLab_pkg;

import java.awt.Frame;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.colos.ejs.library.ConfigurableElement;
import org.colos.ejs.library.LauncherApplet;
import org.colos.ejs.library.Simulation;
import org.colos.ejs.library.utils.LocaleItem;

class PhotoelectricEffectLabSimulation extends Simulation
{
  private PhotoelectricEffectLabView mMainView;
  
  public PhotoelectricEffectLabSimulation(PhotoelectricEffectLab paramPhotoelectricEffectLab, String paramString, Frame paramFrame, URL paramURL, boolean paramBoolean)
  {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs")));
    } catch (Exception localException) { setUnderEjs(false); }
    setCodebase(paramURL);
    setModel(paramPhotoelectricEffectLab);
    _simulation = this;
    mMainView = (paramPhotoelectricEffectLab._view = new PhotoelectricEffectLabView(this, paramString, paramFrame));
    setView(_view);
    if (paramPhotoelectricEffectLab._isApplet()) paramPhotoelectricEffectLab._getApplet().captureWindow(paramPhotoelectricEffectLab, "Ventana");
    setFPS(25);
    setStepsPerDisplay(paramPhotoelectricEffectLab._getPreferredStepsPerDisplay());
    if (paramBoolean) { setAutoplay(true);reset();
    } else { reset();setAutoplay(true); }
    addDescriptionPage("Description", 1278, 413, true);
    addDescriptionPage("Current vs Voltage", 1278, 413, true);
    addDescriptionPage("Energy vs Frequency", 1278, 413, true);
    addDescriptionPage("Current vs Intensity", 1278, 413, true);
    recreateDescriptionPanel();
    if ((paramPhotoelectricEffectLab._getApplet() != null) && (paramPhotoelectricEffectLab._getApplet().getParameter("locale") != null)) {
      setLocaleItem(LocaleItem.getLocaleItem(paramPhotoelectricEffectLab._getApplet().getParameter("locale")), false);
    } else
      setLocaleItem(getLocaleItem(), false);
  }
  
  public List<String> getWindowsList() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("Ventana");
    localArrayList.add("datosPrograma");
    return localArrayList;
  }
  
  public String getMainWindow() {
    return "Ventana";
  }
  

  protected void setViewLocale()
  {
    mMainView.getConfigurableElement("Ventana").setProperty("title", "Photoelectric Effect Lab").setProperty("size", "1209,615");
    mMainView.getConfigurableElement("PanelLab")
      .setProperty("size", "500,400");
    mMainView.getConfigurableElement("BackgroundLab");
    mMainView.getConfigurableElement("fondoLab")
      .setProperty("image", "./img/panel.jpg");
    mMainView.getConfigurableElement("Photoelectrons");
    mMainView.getConfigurableElement("Photons");
    mMainView.getConfigurableElement("Elemento");
    mMainView.getConfigurableElement("sliderSpectrum")
      .setProperty("image", "./img/sliderFrec.gif");
    mMainView.getConfigurableElement("nm_rectangulo");
    mMainView.getConfigurableElement("nm");
    mMainView.getConfigurableElement("e14")
      .setProperty("image", "./img/14.gif");
    mMainView.getConfigurableElement("e15")
      .setProperty("image", "./img/15.gif");
    mMainView.getConfigurableElement("frecDig1");
    mMainView.getConfigurableElement("frecDig2");
    mMainView.getConfigurableElement("frecDig3");
    mMainView.getConfigurableElement("vDig1");
    mMainView.getConfigurableElement("vDig2");
    mMainView.getConfigurableElement("vDig3");
    mMainView.getConfigurableElement("menos")
      .setProperty("image", "./img/menos.gif");
    mMainView.getConfigurableElement("measure")
      .setProperty("image", "./img/measure.gif");
    mMainView.getConfigurableElement("sliderVolt")
      .setProperty("image", "./img/sliderV.gif");
    mMainView.getConfigurableElement("currentDig1");
    mMainView.getConfigurableElement("currentDig2");
    mMainView.getConfigurableElement("currentDig3");
    mMainView.getConfigurableElement("currentDig4");
    mMainView.getConfigurableElement("linterna");
    mMainView.getConfigurableElement("salida");
    mMainView.getConfigurableElement("image")
      .setProperty("imageFile", "./img/linternabuena.gif");
    mMainView.getConfigurableElement("sliderIntensityLight")
      .setProperty("image", "./img/sliderF.gif");
    mMainView.getConfigurableElement("porcentaje_rectangulo2");
    mMainView.getConfigurableElement("porcentaje");
    mMainView.getConfigurableElement("buttons_panel")
      .setProperty("size", "60,40");
    mMainView.getConfigurableElement("Stop")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/power_off.png")
      .setProperty("mnemonic", "Power off")
      .setProperty("tooltip", "Stop Program");
    mMainView.getConfigurableElement("reload")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("mnemonic", "Reload")
      .setProperty("tooltip", "Reload");
    mMainView.getConfigurableElement("play")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("tooltip", "Play");
    mMainView.getConfigurableElement("Pause")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("tooltip", "Pause");
    mMainView.getConfigurableElement("tools")
      .setProperty("size", "400,400");
    mMainView.getConfigurableElement("desplegables");
    mMainView.getConfigurableElement("comboBox_Elementos")
      .setProperty("value", "Sodium");
    mMainView.getConfigurableElement("comboBox_Graph_Tables")
      .setProperty("value", "Current vs Voltage");
    mMainView.getConfigurableElement("I_V4")
      .setProperty("size", "400,700");
    mMainView.getConfigurableElement("graph_I_V")
      .setProperty("size", "400,300");
    mMainView.getConfigurableElement("I_V")
      .setProperty("titleX", "Voltage (V)")
      .setProperty("titleY", "Current (mA)")
      .setProperty("xFormat", "0.00 V ")
      .setProperty("yFormat", "0.00 mA")
      .setProperty("size", "400,100");
    mMainView.getConfigurableElement("trace_IV_1")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_IV_i_1");
    mMainView.getConfigurableElement("cartelintensidad_IV_nm_1");
    mMainView.getConfigurableElement("trace_IV_2")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_IV_i_2");
    mMainView.getConfigurableElement("cartelintensidad_IV_nm_2");
    mMainView.getConfigurableElement("trace_IV_3")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_IV_i_3");
    mMainView.getConfigurableElement("cartelintensidad_IV_nm_3");
    mMainView.getConfigurableElement("trace_IV_4")
      .setProperty("xLabel", "Voltage [V]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_IV_i_4");
    mMainView.getConfigurableElement("cartelintensidad_IV_nm_4");
    mMainView.getConfigurableElement("linea0_IV");
    mMainView.getConfigurableElement("puntero_IV");
    mMainView.getConfigurableElement("etiqueta_IV");
    mMainView.getConfigurableElement("medidanumero_IV")
      .setProperty("size", "400,20");
    mMainView.getConfigurableElement("data_IV")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif");
    mMainView.getConfigurableElement("med1_IV")
      .setProperty("text", "1")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif");
    mMainView.getConfigurableElement("med2_IV")
      .setProperty("text", "2")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif");
    mMainView.getConfigurableElement("med3_IV")
      .setProperty("text", "3")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif");
    mMainView.getConfigurableElement("med4_IV")
      .setProperty("text", "4")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif");
    mMainView.getConfigurableElement("tablas_IV")
      .setProperty("size", "380,250");
    mMainView.getConfigurableElement("dataTable_IV_1")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,175");
    mMainView.getConfigurableElement("dataTable_IV_2")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_IV_3")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_IV_4")
      .setProperty("columnFormat", "0,0.00,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("Ek_F")
      .setProperty("size", "400,700");
    mMainView.getConfigurableElement("graph_Ek_F")
      .setProperty("size", "400,300");
    mMainView.getConfigurableElement("Ek_F3")
      .setProperty("titleX", "Frequency (Hz)")
      .setProperty("titleY", "Energy Photoelectrons (eV)")
      .setProperty("xFormat", "0.#E0 Hz ")
      .setProperty("yFormat", "0.00 Ev")
      .setProperty("size", "400,100");
    mMainView.getConfigurableElement("trace_EkF_1")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]");
    mMainView.getConfigurableElement("cartelEk_EkF_1");
    mMainView.getConfigurableElement("trace_EkF_2")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]");
    mMainView.getConfigurableElement("cartelEk_EkF_2");
    mMainView.getConfigurableElement("trace_EkF_3")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]");
    mMainView.getConfigurableElement("cartelEk_EkF_3");
    mMainView.getConfigurableElement("trace_EkF_4")
      .setProperty("xLabel", "Frequency [Hz]")
      .setProperty("yLabel", "Ek [eV]");
    mMainView.getConfigurableElement("cartelEk_EkF_4");
    mMainView.getConfigurableElement("linea0_EkF");
    mMainView.getConfigurableElement("puntero_EkF");
    mMainView.getConfigurableElement("etiqueta_EkF");
    mMainView.getConfigurableElement("medidanumero_EkF")
      .setProperty("size", "400,20");
    mMainView.getConfigurableElement("data_EkF")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif");
    mMainView.getConfigurableElement("med1_EkF")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif");
    mMainView.getConfigurableElement("med2_EkF")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif");
    mMainView.getConfigurableElement("med3_EkF")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif");
    mMainView.getConfigurableElement("med4_EkF")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif");
    mMainView.getConfigurableElement("tablas_EkF")
      .setProperty("size", "380,250");
    mMainView.getConfigurableElement("dataTable_EkF_1")
      .setProperty("columnFormat", "0.00, 000.#E0,0.00")
      .setProperty("size", "350,175");
    mMainView.getConfigurableElement("dataTable_EkF_2")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_EkF_3")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_EkF_4")
      .setProperty("columnFormat", "0, 000.#E0,0.00")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("I_i")
      .setProperty("size", "400,700");
    mMainView.getConfigurableElement("graph_I_i")
      .setProperty("size", "400,300");
    mMainView.getConfigurableElement("I_i2")
      .setProperty("titleX", "Intensity of Light (%)")
      .setProperty("titleY", "Current (mA)")
      .setProperty("xFormat", "0 per cent ")
      .setProperty("yFormat", "0.00 mA")
      .setProperty("size", "400,100");
    mMainView.getConfigurableElement("trace_Ii_1")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_Ii_nm_1");
    mMainView.getConfigurableElement("cartelintensidad_Ii_V_1");
    mMainView.getConfigurableElement("trace_Ii_2")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_Ii_nm_2");
    mMainView.getConfigurableElement("cartelintensidad_Ii_V_2");
    mMainView.getConfigurableElement("trace_Ii_3")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_Ii_nm_3");
    mMainView.getConfigurableElement("cartelintensidad_Ii_V_3");
    mMainView.getConfigurableElement("trace_Ii_4")
      .setProperty("xLabel", "Intensity light [%]")
      .setProperty("yLabel", "Current [mA]");
    mMainView.getConfigurableElement("cartelintensidad_Ii_nm_4");
    mMainView.getConfigurableElement("cartelintensidad_Ii_V_4");
    mMainView.getConfigurableElement("linea0_Ii");
    mMainView.getConfigurableElement("puntero_Ii");
    mMainView.getConfigurableElement("etiqueta_Ii");
    mMainView.getConfigurableElement("medidanumero_Ii")
      .setProperty("size", "400,20");
    mMainView.getConfigurableElement("data_Ii")
      .setProperty("text", "Data:")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/value.gif");
    mMainView.getConfigurableElement("med1_Ii")
      .setProperty("text", "1")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_purple.gif");
    mMainView.getConfigurableElement("med2_Ii")
      .setProperty("text", "2")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_blue.gif");
    mMainView.getConfigurableElement("med3_Ii")
      .setProperty("text", "3")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_red.gif");
    mMainView.getConfigurableElement("med4_Ii")
      .setProperty("text", "4")
      .setProperty("image", "./img/b_off.gif")
      .setProperty("selectedimage", "./img/b_green.gif");
    mMainView.getConfigurableElement("tablas_Ii")
      .setProperty("size", "380,250");
    mMainView.getConfigurableElement("dataTable_Ii_1")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,175");
    mMainView.getConfigurableElement("dataTable_Ii_2")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_Ii_3")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("dataTable_Ii_4")
      .setProperty("columnFormat", "0,0.00,0")
      .setProperty("size", "350,210");
    mMainView.getConfigurableElement("tooldata")
      .setProperty("size", "400,40");
    mMainView.getConfigurableElement("borrarMedida")
      .setProperty("text", "Clear Data")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("tooltip", "Clear Data");
    mMainView.getConfigurableElement("borrarTodo")
      .setProperty("text", "Clear All")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/clear.gif")
      .setProperty("tooltip", "Clear All Data");
    mMainView.getConfigurableElement("DataTool")
      .setProperty("text", "DataTool")
      .setProperty("image", "/org/opensourcephysics/resources/controls/images/wrench.gif")
      .setProperty("tooltip", "Data Analysis Tool");
    mMainView.getConfigurableElement("datosPrograma")
      .setProperty("title", "Variables del Programa (PRUEBAS)")
      .setProperty("size", "795,281");
    mMainView.getConfigurableElement("DatosProgram");
    mMainView.getConfigurableElement("DatosSalida2");
    mMainView.getConfigurableElement("I2")
      .setProperty("format", "Intensidad = 0.000");
    mMainView.getConfigurableElement("Voltaje2")
      .setProperty("format", "Voltaje = 0.000");
    mMainView.getConfigurableElement("i2")
      .setProperty("format", "indicef = 0");
    mMainView.getConfigurableElement("FrecuenciaReal2")
      .setProperty("format", "frecuenciareal = 000.#E0");
    mMainView.getConfigurableElement("OtrosDatos2");
    mMainView.getConfigurableElement("nf2")
      .setProperty("format", "nf = 0");
    mMainView.getConfigurableElement("ne3")
      .setProperty("format", "ne = 0");
    mMainView.getConfigurableElement("ne12")
      .setProperty("format", "ne1 = 0");
    mMainView.getConfigurableElement("ne22")
      .setProperty("format", "ne2 = 0");
    mMainView.getConfigurableElement("temporales2");
    mMainView.getConfigurableElement("intensity2")
      .setProperty("format", "corriente = 000.#E0");
    mMainView.getConfigurableElement("amperes2")
      .setProperty("format", "amperios = 000.#E0");
    mMainView.getConfigurableElement("t2")
      .setProperty("format", "t = 0.000");
    mMainView.getConfigurableElement("nmed2")
      .setProperty("format", "med = 0");
    mMainView.getConfigurableElement("I1")
      .setProperty("format", "I1 = 0.00");
    mMainView.getConfigurableElement("I22")
      .setProperty("format", "I2 = 0.00");
    mMainView.getConfigurableElement("abajo3")
      .setProperty("format", "indicefinal = 0");
    mMainView.getConfigurableElement("abajo")
      .setProperty("format", "x_indicef = 000.#E0");
    mMainView.getConfigurableElement("temporales222");
    mMainView.getConfigurableElement("intensity222")
      .setProperty("format", "corriente = 000.#E0");
    mMainView.getConfigurableElement("amperes222")
      .setProperty("format", "amperios = 000.#E0");
    mMainView.getConfigurableElement("t222")
      .setProperty("format", "t = 0.000");
    mMainView.getConfigurableElement("nmed222")
      .setProperty("format", "fsfsd= ");
    mMainView.getConfigurableElement("lambda22")
      .setProperty("format", "a = 0");
    mMainView.getConfigurableElement("textField_Graph22");
    mMainView.getConfigurableElement("textField_Graph23");
    mMainView.getConfigurableElement("textField_Graph2");
    mMainView.getConfigurableElement("textField_Graph32");
    mMainView.getConfigurableElement("textField_Graph3");
    mMainView.getConfigurableElement("textField_Graph");
    super.setViewLocale();
  }
  
  public LauncherApplet initMoodle() {
    LauncherApplet localLauncherApplet = super.initMoodle();
    if ((localLauncherApplet != null) && (localLauncherApplet.getParameter("moodle_upload_file") != null) && 
      (localLauncherApplet.getParameter("ejsapp_id") != null) && (localLauncherApplet.getParameter("user_id") != null) && 
      (localLauncherApplet.getParameter("context_id") != null) && (localLauncherApplet.getParameter("language") != null) && 
      (localLauncherApplet.getParameter("username") != null))
      moodle = new org.colos.ejs.library.MoodleConnection(localLauncherApplet, this);
    return localLauncherApplet;
  }
}
