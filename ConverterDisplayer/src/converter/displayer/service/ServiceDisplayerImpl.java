package converter.displayer.service;

/**
 * @author PraveenKumar
 *
 */
public class ServiceDisplayerImpl implements ServiceDisplayer {
	ConverterUnitWindow cw;
	
	@Override
	public void publishService() {
		cw = new ConverterUnitWindow();
		cw.setVisible(true);
	}

	@Override
	public void disposeService() {
		cw.dispose();		
	}
	
	

}
