// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse();

    @InputImport(name="acceleratorCount", required=true)
    private final String acceleratorCount;

    public String getAcceleratorCount() {
        return this.acceleratorCount;
    }

    @InputImport(name="acceleratorType", required=true)
    private final String acceleratorType;

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse(
        String acceleratorCount,
        String acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse() {
        this.acceleratorCount = null;
        this.acceleratorType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorCount;
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(String acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigResponse(acceleratorCount, acceleratorType);
        }
    }
}