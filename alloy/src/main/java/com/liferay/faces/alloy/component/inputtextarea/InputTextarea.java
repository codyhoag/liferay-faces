/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.inputtextarea;

import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlInputTextarea;

import com.liferay.faces.util.lang.StringPool;


/**
 * @author  Neil Griffin
 */
@FacesComponent(value = InputTextarea.COMPONENT_TYPE)
public class InputTextarea extends HtmlInputTextarea {

	// Public Constants
	public static final String COMPONENT_TYPE = "com.liferay.faces.alloy.component.inputtextarea.InputTextarea";
	public static final String DELEGATE_COMPONENT_FAMILY = COMPONENT_FAMILY;
	public static final String DELEGATE_RENDERER_TYPE = "javax.faces.Textarea";
	public static final String RENDERER_TYPE = "com.liferay.faces.alloy.component.inputtextarea.InputTextareaRenderer";
	public static final String STYLE_CLASS_NAME = "input-textarea";

	public InputTextarea() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	@Override
	public String getStyleClass() {

		String styleClass = super.getStyleClass();

		if (styleClass == null) {
			styleClass = STYLE_CLASS_NAME;
		}
		else {
			styleClass = styleClass + StringPool.SPACE + STYLE_CLASS_NAME;
		}

		return styleClass;
	}
}
