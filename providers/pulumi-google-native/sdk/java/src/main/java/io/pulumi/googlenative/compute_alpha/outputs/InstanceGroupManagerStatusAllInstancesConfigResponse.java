// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerStatusAllInstancesConfigResponse {
    /**
     * Current instances' config revision. This value is in RFC3339 text format.
     * 
     */
    private final String currentRevision;
    /**
     * A bit indicating whether instances' config has been applied to all managed instances in managed instance group.
     * 
     */
    private final Boolean effective;

    @CustomType.Constructor
    private InstanceGroupManagerStatusAllInstancesConfigResponse(
        @CustomType.Parameter("currentRevision") String currentRevision,
        @CustomType.Parameter("effective") Boolean effective) {
        this.currentRevision = currentRevision;
        this.effective = effective;
    }

    /**
     * Current instances' config revision. This value is in RFC3339 text format.
     * 
    */
    public String getCurrentRevision() {
        return this.currentRevision;
    }
    /**
     * A bit indicating whether instances' config has been applied to all managed instances in managed instance group.
     * 
    */
    public Boolean getEffective() {
        return this.effective;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusAllInstancesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentRevision;
        private Boolean effective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusAllInstancesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentRevision = defaults.currentRevision;
    	      this.effective = defaults.effective;
        }

        public Builder currentRevision(String currentRevision) {
            this.currentRevision = Objects.requireNonNull(currentRevision);
            return this;
        }
        public Builder effective(Boolean effective) {
            this.effective = Objects.requireNonNull(effective);
            return this;
        }        public InstanceGroupManagerStatusAllInstancesConfigResponse build() {
            return new InstanceGroupManagerStatusAllInstancesConfigResponse(currentRevision, effective);
        }
    }
}
