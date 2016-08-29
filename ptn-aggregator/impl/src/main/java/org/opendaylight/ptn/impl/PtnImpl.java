/*
 * Copyright © 2015 LGUplus, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.ptn.impl;

import java.util.concurrent.Future;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ptn.rev150105.HelloInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ptn.rev150105.HelloOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ptn.rev150105.HelloOutputBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ptn.rev150105.PtnService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PtnImpl implements PtnService {
	
    private static final Logger LOG = LoggerFactory.getLogger(PtnProvider.class);
    private DataBroker db = null;

	public PtnImpl(DataBroker adb) {
		db = adb;
		LOG.info("PtnImpl created with data broker "+db.toString());
	}

	@Override
	public Future<RpcResult<HelloOutput>> hello(HelloInput input) {

		LOG.info("PtnImpl:hello input message:"+input.getName());
		HelloOutput output = new HelloOutputBuilder()
				.setReply("Reply of hello:" + input.getName())
				.build();
		return RpcResultBuilder.success(output).buildFuture();
	}

}
