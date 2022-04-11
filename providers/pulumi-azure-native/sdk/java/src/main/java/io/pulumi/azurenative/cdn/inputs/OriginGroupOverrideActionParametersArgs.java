// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the parameters for the origin group override action.
 * 
 */
public final class OriginGroupOverrideActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginGroupOverrideActionParametersArgs Empty = new OriginGroupOverrideActionParametersArgs();

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * defines the OriginGroup that would override the DefaultOriginGroup.
     * 
     */
    @Import(name="originGroup", required=true)
      private final Output<ResourceReferenceArgs> originGroup;

    public Output<ResourceReferenceArgs> getOriginGroup() {
        return this.originGroup;
    }

    public OriginGroupOverrideActionParametersArgs(
        Output<String> odataType,
        Output<ResourceReferenceArgs> originGroup) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.originGroup = Objects.requireNonNull(originGroup, "expected parameter 'originGroup' to be non-null");
    }

    private OriginGroupOverrideActionParametersArgs() {
        this.odataType = Codegen.empty();
        this.originGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginGroupOverrideActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private Output<ResourceReferenceArgs> originGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginGroupOverrideActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.originGroup = defaults.originGroup;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder originGroup(Output<ResourceReferenceArgs> originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }
        public Builder originGroup(ResourceReferenceArgs originGroup) {
            this.originGroup = Output.of(Objects.requireNonNull(originGroup));
            return this;
        }        public OriginGroupOverrideActionParametersArgs build() {
            return new OriginGroupOverrideActionParametersArgs(odataType, originGroup);
        }
    }
}
