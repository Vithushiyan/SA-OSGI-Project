package length.converter.service;

import converter.displayer.service.ConverterUnitWindow;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class LengthConverterActivator implements BundleActivator {


	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Length Converter Service Started !!!");
		LengthConverterService converterService = new LengthConverterServiceImpl();
		publishServiceRegistration = bundleContext.registerService(LengthConverterService.class.getName(), converterService,null);
		ConverterUnitWindow.convertersListBox.addItem("  Length");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Length Converter Service Stoped !!!");
		publishServiceRegistration.unregister();
		ConverterUnitWindow.convertersListBox.removeItem("  Length");
	}

}
