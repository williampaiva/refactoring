package com.william.mo631.generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;

public class Generation {

	public static void main(String[] args) throws IOException {
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);

		XMIResourceFactoryImpl xmiResourceFactoryImpl = new XMIResourceFactoryImpl() {
			public Resource createResource(URI uri) {
				XMIResource xmiResource = new XMIResourceImpl();
				return xmiResource;
			}
		};

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", xmiResourceFactoryImpl);

		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(
				URI.createFileURI("src/main/resources/refactoringTest_java.xmi"), new File("src/main/generated/"),
				new ArrayList<Object>());

		javaGenerator.doGenerate(null);
	}

}
