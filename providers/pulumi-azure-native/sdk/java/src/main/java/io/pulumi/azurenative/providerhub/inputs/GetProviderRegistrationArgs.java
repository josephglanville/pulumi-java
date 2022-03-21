// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProviderRegistrationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProviderRegistrationArgs Empty = new GetProviderRegistrationArgs();

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
      private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    public GetProviderRegistrationArgs(String providerNamespace) {
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
    }

    private GetProviderRegistrationArgs() {
        this.providerNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProviderRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String providerNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProviderRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerNamespace = defaults.providerNamespace;
        }

        public Builder providerNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }        public GetProviderRegistrationArgs build() {
            return new GetProviderRegistrationArgs(providerNamespace);
        }
    }
}
