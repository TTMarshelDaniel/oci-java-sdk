/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateTransferDeviceResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned NewTransferDevice instance.
     */
    private NewTransferDevice newTransferDevice;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateTransferDeviceResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            newTransferDevice(o.getNewTransferDevice());

            return this;
        }
    }
}
