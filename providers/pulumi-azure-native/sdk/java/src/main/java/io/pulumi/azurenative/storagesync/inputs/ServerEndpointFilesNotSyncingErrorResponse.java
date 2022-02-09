// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class ServerEndpointFilesNotSyncingErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerEndpointFilesNotSyncingErrorResponse Empty = new ServerEndpointFilesNotSyncingErrorResponse();

    @InputImport(name="errorCode", required=true)
    private final Integer errorCode;

    public Integer getErrorCode() {
        return this.errorCode;
    }

    @InputImport(name="persistentCount", required=true)
    private final Double persistentCount;

    public Double getPersistentCount() {
        return this.persistentCount;
    }

    @InputImport(name="transientCount", required=true)
    private final Double transientCount;

    public Double getTransientCount() {
        return this.transientCount;
    }

    public ServerEndpointFilesNotSyncingErrorResponse(
        Integer errorCode,
        Double persistentCount,
        Double transientCount) {
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.persistentCount = Objects.requireNonNull(persistentCount, "expected parameter 'persistentCount' to be non-null");
        this.transientCount = Objects.requireNonNull(transientCount, "expected parameter 'transientCount' to be non-null");
    }

    private ServerEndpointFilesNotSyncingErrorResponse() {
        this.errorCode = null;
        this.persistentCount = null;
        this.transientCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointFilesNotSyncingErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer errorCode;
        private Double persistentCount;
        private Double transientCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointFilesNotSyncingErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.persistentCount = defaults.persistentCount;
    	      this.transientCount = defaults.transientCount;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setPersistentCount(Double persistentCount) {
            this.persistentCount = Objects.requireNonNull(persistentCount);
            return this;
        }

        public Builder setTransientCount(Double transientCount) {
            this.transientCount = Objects.requireNonNull(transientCount);
            return this;
        }

        public ServerEndpointFilesNotSyncingErrorResponse build() {
            return new ServerEndpointFilesNotSyncingErrorResponse(errorCode, persistentCount, transientCount);
        }
    }
}
