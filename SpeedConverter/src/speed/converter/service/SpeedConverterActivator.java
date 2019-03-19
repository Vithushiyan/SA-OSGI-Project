package speed.converter.service;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import converter.displayer.service.ConverterUnitWindow;

/**
 * @author PraveenKumar
 *
 */
public class SpeedConverterActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Speed Converter Service Started !!!");
		SpeedConverterService converterService = new SpeedConverterServiceImpl();
		publishServiceRegistration = bundleContext.registerService(SpeedConverterService.class.getName(), converterService,null);
		ConverterUnitWindow.convertersListBox.addItem("  Speed");

	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Speed Converter Service Stoped !!!");
		publishServiceRegistration.unregister();
		ConverterUnitWindow.convertersListBox.removeItem("  Speed");
	}
}
