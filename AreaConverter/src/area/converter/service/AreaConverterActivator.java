package area.converter.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import converter.displayer.service.ConverterUnitWindow;
import area.converter.service.AreaConverterService;
import area.converter.service.AreaConverterServiceImpl;

public class AreaConverterActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Area Converter Service Started !!!");
		AreaConverterService converterService = new AreaConverterServiceImpl();
		publishServiceRegistration = bundleContext.registerService(AreaConverterService.class.getName(), converterService,null);
		ConverterUnitWindow.convertersListBox.addItem("  Area");

	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Area Converter Service Stoped !!!");
		publishServiceRegistration.unregister();
		ConverterUnitWindow.convertersListBox.removeItem("  Area");

	}

}
