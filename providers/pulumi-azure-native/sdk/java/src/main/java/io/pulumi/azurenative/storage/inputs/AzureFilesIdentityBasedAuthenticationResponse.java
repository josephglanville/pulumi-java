// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ActiveDirectoryPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureFilesIdentityBasedAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFilesIdentityBasedAuthenticationResponse Empty = new AzureFilesIdentityBasedAuthenticationResponse();

    @InputImport(name="activeDirectoryProperties")
    private final @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;

    public Optional<ActiveDirectoryPropertiesResponse> getActiveDirectoryProperties() {
        return this.activeDirectoryProperties == null ? Optional.empty() : Optional.ofNullable(this.activeDirectoryProperties);
    }

    @InputImport(name="directoryServiceOptions", required=true)
    private final String directoryServiceOptions;

    public String getDirectoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public AzureFilesIdentityBasedAuthenticationResponse(
        @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties,
        String directoryServiceOptions) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions, "expected parameter 'directoryServiceOptions' to be non-null");
    }

    private AzureFilesIdentityBasedAuthenticationResponse() {
        this.activeDirectoryProperties = null;
        this.directoryServiceOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;
        private String directoryServiceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryProperties = defaults.activeDirectoryProperties;
    	      this.directoryServiceOptions = defaults.directoryServiceOptions;
        }

        public Builder setActiveDirectoryProperties(@Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties) {
            this.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }

        public Builder setDirectoryServiceOptions(String directoryServiceOptions) {
            this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions);
            return this;
        }

        public AzureFilesIdentityBasedAuthenticationResponse build() {
            return new AzureFilesIdentityBasedAuthenticationResponse(activeDirectoryProperties, directoryServiceOptions);
        }
    }
}