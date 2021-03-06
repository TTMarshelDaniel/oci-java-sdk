/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ImportKeyVersionResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned KeyVersion instance.
     */
    private KeyVersion keyVersion;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ImportKeyVersionResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            keyVersion(o.getKeyVersion());

            return this;
        }
    }
}
