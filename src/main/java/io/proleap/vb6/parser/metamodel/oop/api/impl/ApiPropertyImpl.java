/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel.oop.api.impl;

import java.util.ArrayList;
import java.util.List;

import io.proleap.vb6.parser.metamodel.call.ApiPropertyCall;
import io.proleap.vb6.parser.metamodel.oop.Type;
import io.proleap.vb6.parser.metamodel.oop.api.ApiProperty;

public class ApiPropertyImpl implements ApiProperty {

	protected final List<ApiPropertyCall> apiPropertyCalls = new ArrayList<ApiPropertyCall>();

	protected final String name;

	protected final Type type;

	public ApiPropertyImpl(final String name, final Type type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public void addApiPropertyCall(final ApiPropertyCall apiPropertyCall) {
		apiPropertyCalls.add(apiPropertyCall);
	}

	@Override
	public List<ApiPropertyCall> getApiPropertyCalls() {
		return apiPropertyCalls;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "name=[" + name + "]";
	}
}
