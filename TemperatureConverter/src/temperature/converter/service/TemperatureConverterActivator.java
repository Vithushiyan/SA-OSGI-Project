package temperature.converter.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import converter.displayer.service.ConverterUnitWindow;

/**
 * @author PraveenKumar
 *
 */
public class TemperatureConverterActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Temperature Converter Service Started !!!");
		TemperatureConverterService converterService = new TemperatureConverterServiceImpl();
		publishServiceRegistration = bundleContext.registerService(TemperatureConverterService.class.getName(), converterService,null);
		ConverterUnitWindow.convertersListBox.addItem("  Temperature");

	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Temperature Converter Service Stoped !!!");
		publishServiceRegistration.unregister();
		ConverterUnitWindow.convertersListBox.removeItem("  Temperature");

	}
}
