// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedGroupConfigResponse {
    /**
     * The name of the Instance Group Manager for this group.
     * 
     */
    private final String instanceGroupManagerName;
    /**
     * The name of the Instance Template used for the Managed Instance Group.
     * 
     */
    private final String instanceTemplateName;

    @CustomType.Constructor
    private ManagedGroupConfigResponse(
        @CustomType.Parameter("instanceGroupManagerName") String instanceGroupManagerName,
        @CustomType.Parameter("instanceTemplateName") String instanceTemplateName) {
        this.instanceGroupManagerName = instanceGroupManagerName;
        this.instanceTemplateName = instanceTemplateName;
    }

    /**
     * The name of the Instance Group Manager for this group.
     * 
    */
    public String getInstanceGroupManagerName() {
        return this.instanceGroupManagerName;
    }
    /**
     * The name of the Instance Template used for the Managed Instance Group.
     * 
    */
    public String getInstanceTemplateName() {
        return this.instanceTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedGroupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceGroupManagerName;
        private String instanceTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        public Builder instanceGroupManagerName(String instanceGroupManagerName) {
            this.instanceGroupManagerName = Objects.requireNonNull(instanceGroupManagerName);
            return this;
        }
        public Builder instanceTemplateName(String instanceTemplateName) {
            this.instanceTemplateName = Objects.requireNonNull(instanceTemplateName);
            return this;
        }        public ManagedGroupConfigResponse build() {
            return new ManagedGroupConfigResponse(instanceGroupManagerName, instanceTemplateName);
        }
    }
}
