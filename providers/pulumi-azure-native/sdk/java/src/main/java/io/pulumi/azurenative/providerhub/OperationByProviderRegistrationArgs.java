// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.providerhub.inputs.OperationsDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OperationByProviderRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OperationByProviderRegistrationArgs Empty = new OperationByProviderRegistrationArgs();

    @InputImport(name="contents", required=true)
      private final Input<List<OperationsDefinitionArgs>> contents;

    public Input<List<OperationsDefinitionArgs>> getContents() {
        return this.contents;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
      private final Input<String> providerNamespace;

    public Input<String> getProviderNamespace() {
        return this.providerNamespace;
    }

    public OperationByProviderRegistrationArgs(
        Input<List<OperationsDefinitionArgs>> contents,
        Input<String> providerNamespace) {
        this.contents = Objects.requireNonNull(contents, "expected parameter 'contents' to be non-null");
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
    }

    private OperationByProviderRegistrationArgs() {
        this.contents = Input.empty();
        this.providerNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationByProviderRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<OperationsDefinitionArgs>> contents;
        private Input<String> providerNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationByProviderRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contents = defaults.contents;
    	      this.providerNamespace = defaults.providerNamespace;
        }

        public Builder setContents(Input<List<OperationsDefinitionArgs>> contents) {
            this.contents = Objects.requireNonNull(contents);
            return this;
        }

        public Builder setContents(List<OperationsDefinitionArgs> contents) {
            this.contents = Input.of(Objects.requireNonNull(contents));
            return this;
        }

        public Builder setProviderNamespace(Input<String> providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Input.of(Objects.requireNonNull(providerNamespace));
            return this;
        }
        public OperationByProviderRegistrationArgs build() {
            return new OperationByProviderRegistrationArgs(contents, providerNamespace);
        }
    }
}
