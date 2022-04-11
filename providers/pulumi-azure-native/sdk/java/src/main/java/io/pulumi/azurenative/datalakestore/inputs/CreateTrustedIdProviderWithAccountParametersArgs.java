// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new trusted identity provider while creating a new Data Lake Store account.
 * 
 */
public final class CreateTrustedIdProviderWithAccountParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateTrustedIdProviderWithAccountParametersArgs Empty = new CreateTrustedIdProviderWithAccountParametersArgs();

    /**
     * The URL of this trusted identity provider.
     * 
     */
    @Import(name="idProvider", required=true)
      private final Output<String> idProvider;

    public Output<String> getIdProvider() {
        return this.idProvider;
    }

    /**
     * The unique name of the trusted identity provider to create.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public CreateTrustedIdProviderWithAccountParametersArgs(
        Output<String> idProvider,
        Output<String> name) {
        this.idProvider = Objects.requireNonNull(idProvider, "expected parameter 'idProvider' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private CreateTrustedIdProviderWithAccountParametersArgs() {
        this.idProvider = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateTrustedIdProviderWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> idProvider;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateTrustedIdProviderWithAccountParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idProvider = defaults.idProvider;
    	      this.name = defaults.name;
        }

        public Builder idProvider(Output<String> idProvider) {
            this.idProvider = Objects.requireNonNull(idProvider);
            return this;
        }
        public Builder idProvider(String idProvider) {
            this.idProvider = Output.of(Objects.requireNonNull(idProvider));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public CreateTrustedIdProviderWithAccountParametersArgs build() {
            return new CreateTrustedIdProviderWithAccountParametersArgs(idProvider, name);
        }
    }
}
