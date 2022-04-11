// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FleetIdentityProviderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetIdentityProviderGetArgs Empty = new FleetIdentityProviderGetArgs();

    /**
     * The SAML metadata document provided by the customer’s identity provider.
     * 
     */
    @Import(name="samlMetadata", required=true)
      private final Output<String> samlMetadata;

    public Output<String> getSamlMetadata() {
        return this.samlMetadata;
    }

    /**
     * The type of identity provider.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FleetIdentityProviderGetArgs(
        Output<String> samlMetadata,
        Output<String> type) {
        this.samlMetadata = Objects.requireNonNull(samlMetadata, "expected parameter 'samlMetadata' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FleetIdentityProviderGetArgs() {
        this.samlMetadata = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIdentityProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> samlMetadata;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIdentityProviderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samlMetadata = defaults.samlMetadata;
    	      this.type = defaults.type;
        }

        public Builder samlMetadata(Output<String> samlMetadata) {
            this.samlMetadata = Objects.requireNonNull(samlMetadata);
            return this;
        }
        public Builder samlMetadata(String samlMetadata) {
            this.samlMetadata = Output.of(Objects.requireNonNull(samlMetadata));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FleetIdentityProviderGetArgs build() {
            return new FleetIdentityProviderGetArgs(samlMetadata, type);
        }
    }
}
