// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecPrivilegesCredentialSpec;
import io.pulumi.docker.outputs.ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecPrivileges {
    private final @Nullable ServiceTaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec;
    private final @Nullable ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext seLinuxContext;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecPrivileges(
        @CustomType.Parameter("credentialSpec") @Nullable ServiceTaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec,
        @CustomType.Parameter("seLinuxContext") @Nullable ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext seLinuxContext) {
        this.credentialSpec = credentialSpec;
        this.seLinuxContext = seLinuxContext;
    }

    public Optional<ServiceTaskSpecContainerSpecPrivilegesCredentialSpec> getCredentialSpec() {
        return Optional.ofNullable(this.credentialSpec);
    }
    public Optional<ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext> getSeLinuxContext() {
        return Optional.ofNullable(this.seLinuxContext);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecPrivileges defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceTaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec;
        private @Nullable ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext seLinuxContext;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecPrivileges defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialSpec = defaults.credentialSpec;
    	      this.seLinuxContext = defaults.seLinuxContext;
        }

        public Builder credentialSpec(@Nullable ServiceTaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
            this.credentialSpec = credentialSpec;
            return this;
        }
        public Builder seLinuxContext(@Nullable ServiceTaskSpecContainerSpecPrivilegesSeLinuxContext seLinuxContext) {
            this.seLinuxContext = seLinuxContext;
            return this;
        }        public ServiceTaskSpecContainerSpecPrivileges build() {
            return new ServiceTaskSpecContainerSpecPrivileges(credentialSpec, seLinuxContext);
        }
    }
}