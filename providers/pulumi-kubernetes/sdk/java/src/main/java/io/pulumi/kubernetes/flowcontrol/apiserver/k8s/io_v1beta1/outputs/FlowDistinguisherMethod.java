// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlowDistinguisherMethod {
    /**
     * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FlowDistinguisherMethod(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDistinguisherMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDistinguisherMethod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FlowDistinguisherMethod build() {
            return new FlowDistinguisherMethod(type);
        }
    }
}
